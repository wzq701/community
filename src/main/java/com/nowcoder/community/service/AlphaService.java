package com.nowcoder.community.service;

import com.nowcoder.community.dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author MisakaMikoto
 * @create 2022-03-22-13:38
 */
@Service
@Scope("singleton")//单例模式
//@Scope("prototype")//多实例
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService() {
        System.out.println("实例化AlphaService");
    }

    /**
     * 在构造器之后调用
     */
    @PostConstruct
    public void init(){
        System.out.println("初始化AlphaService");
    }

    /**
     * 在销毁之前调用
     */
    @PreDestroy
    public void destory(){
        System.out.println("销毁AlphaService");
    }



    public String find(){
        return alphaDao.select();
    }
}
