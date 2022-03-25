package com.nowcoder.community.service;

import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务逻辑层接口
 * @author MisakaMikoto
 * @create 2022-03-24-13:10
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    public User findUserById(int id){
        return userMapper.selectById(id);
    }
}
