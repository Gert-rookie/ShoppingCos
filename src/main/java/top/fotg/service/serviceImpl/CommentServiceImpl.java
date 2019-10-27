package top.fotg.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import top.fotg.dao.CommentMapper;
import top.fotg.entity.Comment;
import top.fotg.service.CommentService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    CommentMapper commentMapper;

    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public int insertComment(Comment comment) {
        /*//清空缓存在插入
        while (redisTemplate.opsForList().size("comment") > 0){
            redisTemplate.opsForList().leftPop("comment");
        }*/
        return commentMapper.insertComment(comment);

    }

    @Override
    public List<Comment> getAllComment(Integer cosmetic_id, Integer pro_id) {
        // TODO 存入redis数据

         List<Comment> commentList=commentMapper.getCommentById(cosmetic_id,pro_id);
         /*redisTemplate.opsForValue().set(String.valueOf(cosmetic_id)+String.valueOf(pro_id),commentList);*/

        return commentList;
    }


}
