package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

/**
 * @author MisakaMikoto
 * @create 2022-03-22-15:50
 */
@Configuration//配置类
public class AlphaConfig {
    /**
     * 创建Bean 放入IOC容器中
     * @return
     */
    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
