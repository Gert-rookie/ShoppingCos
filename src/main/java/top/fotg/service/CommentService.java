package top.fotg.service;


import org.apache.ibatis.annotations.Param;
import top.fotg.entity.Comment;

import java.util.List;

public interface CommentService {

    //用户添加评论
    int insertComment(Comment comment);

    //查询单商品全部评论
    List<Comment> getAllComment(@Param("cosmetic_id") Integer cosmetic_id,
                                @Param("pro_id") Integer pro_id);

}
