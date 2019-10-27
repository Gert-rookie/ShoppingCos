package top.fotg.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import top.fotg.entity.Comment;
import top.fotg.service.serviceImpl.CommentServiceImpl;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RequestMapping("/comment")
@Controller
public class CommentController {

    @Resource
    private CommentServiceImpl commentService;

    @Autowired
    private RedisTemplate redisTemplate;

    //用户添加评论
    @PostMapping(value = "/addComment")
    @ResponseBody
    public Object insertComment(@RequestBody Comment comment){
        //设置日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // new Date()为获取当前系统时间
        comment.setTime(df.format(new Date()));
        int count=commentService.insertComment(comment);
        if(count!=0){
            redisTemplate.delete(String.valueOf(comment.getCosmetic_id())+String.valueOf(comment.getPro_id()));
            //更新缓存
            redisTemplate.opsForList().rightPushAll(String.valueOf(comment.getCosmetic_id())+String.valueOf(comment.getPro_id()),
                    commentService.getAllComment(comment.getCosmetic_id(),comment.getPro_id()));
            System.out.print("评论添加成功!");
        }
        return count;
    }

    //查询前台产品用户的评论
    @PostMapping(value = "/getComment")
    @ResponseBody
    public Object getAllComment(@RequestBody Comment comment){
        //从redis中取出某一个key下面的list列表， 0表示从列表的第0个元素开始取，-1表示直取到倒数第一个元素
        List<Comment> commentList=redisTemplate.opsForList().range(String.valueOf(comment.getCosmetic_id())+String.valueOf(comment.getPro_id()), 0, -1);
        if(commentList.size()==0){
           //如果缓存中的数据为空的时候进行重新获取数据
           commentList=commentService.getAllComment(comment.getCosmetic_id(),comment.getPro_id());
           redisTemplate.opsForValue().set(String.valueOf(comment.getCosmetic_id())+String.valueOf(comment.getPro_id()),commentList);
       }

       return commentList;
    }



}
