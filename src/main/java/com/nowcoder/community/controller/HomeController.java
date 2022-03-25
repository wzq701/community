package com.nowcoder.community.controller;

import com.nowcoder.community.entity.DiscussPost;
import com.nowcoder.community.entity.Page;
import com.nowcoder.community.entity.User;
import com.nowcoder.community.service.DiscussPostService;
import com.nowcoder.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 首页控制层
 * @author MisakaMikoto
 * @create 2022-03-24-13:15
 */
@Controller
public class HomeController {
    @Autowired
    private DiscussPostService discussPostService;

    @Autowired
    private UserService userService;
    @RequestMapping(path = "/index",method = RequestMethod.GET)
    public String getIndexPage(Model model, Page page){
//        方法调用之前，SpringMVC会自动实例化Model和Page，并将Page注入Model
//        所有在thymeleaf中可以直接访问Page对象中的数据
//        设置总条数
        page.setRows(discussPostService.findDiscussPostRows(0));
//        设置路径
        page.setPath("/index");

        List<DiscussPost> list = discussPostService.findDiscussPosts(0, page.getOffset(), page.getLimit());


        List<Map<String,Object>> discussPosts=new ArrayList<>();

//        查询帖子不为空
        if(list!=null){
//            遍历帖子集合
            for (DiscussPost post : list) {
//                创建map集合
                Map<String,Object> map=new HashMap<>();
                map.put("post",post);

//                查询用户
                User user = userService.findUserById(post.getUserId());

                map.put("user",user);

                discussPosts.add(map);
            }
        }

        model.addAttribute("discussPosts",discussPosts);

        return "/index";
    }

}
