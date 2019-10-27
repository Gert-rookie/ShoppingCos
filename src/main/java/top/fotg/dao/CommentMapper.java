package top.fotg.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.fotg.entity.Comment;

import java.util.List;

@Repository
public interface CommentMapper {
    //查询前台产品用户的评论
    List<Comment> getCommentById(@Param("cosmetic_id") Integer cosmetic_id,
                                 @Param("pro_id") Integer pro_id);

    //用户添加评论
    int insertComment(Comment comment);


}
