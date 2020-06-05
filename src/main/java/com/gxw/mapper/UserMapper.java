package com.gxw.mapper;

import com.gxw.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * User映射接口
 * @author GXW工作室
 * @date 2020/6/5 0005 - 00:29
 */
public interface UserMapper {
    //查询所有
    @Select("select * from user")
    List<User> findUserAll();

    //根据id查询用户对象
    @Select("select * from user where id=#{id}")
    User findUserById(Integer id);

    //根据名称模糊查询
    @Select("select * from user where username like #{username}")
    List<User> findUserByName(String username);

    //分页查询用户信息
    @Select("select * from user limit #{pageStart},#{pageSize}")
    List<User> findUserPage(Map<String,Object> map);

    //查询总数
    @Select("select count(*) from user")
    int findTotal();

    //添加数据
    @Insert("insert into user(username,birthday,sex,address) values(#{username},#{birthday},#{sex},#{address})")
    int addUser(User user);

    //更新用户
    @Update("update user set username=#{username},birthday=#{birthday},sex=#{sex},address=#{address} where id=#{id}")
    int updateUser(User user);

    //根据id删除用户
    @Delete("delete from user where id=#{id}")
    int deleteUserById(Integer id);

}
