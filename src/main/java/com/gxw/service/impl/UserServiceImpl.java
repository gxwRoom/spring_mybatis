package com.gxw.service.impl;

import com.gxw.mapper.UserMapper;
import com.gxw.pojo.User;
import com.gxw.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * @author GXW工作室
 * @date 2020/6/5 0005 - 00:57
 */
public class UserServiceImpl implements UserService{
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    //查询所有
    @Override
    public List<User> findAll() {
        return userMapper.findUserAll();
    }

    //根据id查询
    @Override
    public User findUserById(Integer id) {
        return userMapper.findUserById(id);
    }

    //根据名称模糊查询
    @Override
    public List<User> findUserByName(String username) {
        return userMapper.findUserByName(username);
    }

    //分页查询
    @Override
    public List<User> findUserPage(Map<String, Object> map) {
        return userMapper.findUserPage(map);
    }

    //查询总数
    @Override
    public int findTotal() {
        return userMapper.findTotal();
    }

    //添加数据
    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    //更新数据
    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    //根据id删除
    @Override
    public int deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }
}
