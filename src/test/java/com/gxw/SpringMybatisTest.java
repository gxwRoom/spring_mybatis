package com.gxw;

import com.gxw.pojo.User;
import com.gxw.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author GXW工作室
 * @date 2020/6/4 0004 - 21:50
 */
public class SpringMybatisTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        String[] names = ac.getBeanDefinitionNames();
//        for (String s:names){
//            System.out.println(s);
//        }

        UserServiceImpl userService = ac.getBean("userService", UserServiceImpl.class);
        //1.查询所有
        List<User> findAll = userService.findAll();
        for (User user:findAll){
            System.out.println("查询所有："+user);
        }

        //2.根据id查询
        User userById = userService.findUserById(43);
        System.out.println("根据id查询："+userById);

        //3.根据名称模糊查询
        List<User> userByName = userService.findUserByName("%张%");
        System.out.println("根据名称模糊查询："+userByName);

        //4.分页查询
        int pageNumber=2;//取值从1开始
        int pageSize=2;
        Map<String,Object> map = new HashMap<>();
        map.put("pageSize",pageSize);
        map.put("pageStart",pageSize*(pageNumber-1));
        List<User> userPage = userService.findUserPage(map);
        System.out.println("分页查询："+userPage);

        //5.查询总数
        int total = userService.findTotal();
        System.out.println("查询总数："+total);

        //6.添加数据
//        User user = new User();
//        user.setUsername("小红");
//        user.setBirthday(new Date());
//        user.setSex("女");
//        user.setAddress("杭州西湖");
//        int addUser = userService.addUser(user);
//        System.out.println("添加数据："+addUser);

        //7.更新数据
//        User user = userService.findUserById(56);
//        user.setUsername("店小二");
//        user.setAddress("广东深圳");
//        int updateUser = userService.updateUser(user);
//        System.out.println("更新数据："+updateUser);

        //8.根据id删除
//        int deleteUserById = userService.deleteUserById(56);
//        System.out.println("根据id删除："+deleteUserById);
    }
}
