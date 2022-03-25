package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 用户表映射接口
 * @author MisakaMikoto
 * @create 2022-03-23-17:57
 */
//@Repository
@Mapper
public interface UserMapper {
    /**
     * 根据id查用户
     * @param id
     * @return
     */
    User selectById(int id);

    /**
     *根据name查询
     * @param username
     * @return
     */
    User selectByName(String username);

    /**
     *根据邮箱查询
     * @param email
     * @return
     */
    User selectByEmail(String email);

    /**
     *添加用户
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     *修改用户状态
     * @param id
     * @param status
     * @return
     */
    int updateStatus(int id,int status);

    /**
     *修改用户头像
     * @param id
     * @param headerUrl
     * @return
     */
    int updateHeader(int id,String headerUrl);

    /**
     * 修改密码
     * @param id
     * @param password
     * @return
     */
    int updatePassword(int id,String password);
}
