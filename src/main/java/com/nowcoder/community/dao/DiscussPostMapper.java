package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 讨论表映射接口
 * @author MisakaMikoto
 * @create 2022-03-24-12:40
 */
@Mapper
public interface DiscussPostMapper {
    /**
     * 查询帖子
     * @param userId 有值查询我的贴子   动态SQL
     * @param offset
     * @param limit
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);


//    @Param注解用于给参数区别名
//    如果只有一个参数在《if》里使用，必须加别名

    /**
     * 查询总条数
     * @param userId
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);

}
