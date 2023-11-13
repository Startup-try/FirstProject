package com.fdzc.firstproject.service;

import com.fdzc.firstproject.entity.Department;
import com.fdzc.firstproject.entity.User;
import com.fdzc.firstproject.mapper.DepartmentMapper;
import com.fdzc.firstproject.mapper.UserMapper;
import com.fdzc.firstproject.service.UserService;
import com.fdzc.firstproject.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DepartmentMapper departmentMapper;



    @Override
    public List<User> SelectAll() {
        return userMapper.SelectAll();
    }

    @Override
    public User SelectById(Integer id) {
        return userMapper.SelectById(id);
    }

    @Override
    public Integer Update(User user) {
        return userMapper.Update(user);
    }

    @Override
    public Integer Insert(User user) {
        return userMapper.Insert(user);
    }

    @Override
    public Integer BatchDeleteUser(List<Integer> ids) {
        return userMapper.BatchDeleteUser(ids);
    }

    @Override
    public List<UserVo> FindUserDept() {
        return userMapper.FindUserDept();
    }

    @Override
    public List<UserVo> FindUserDept2() {
        List<UserVo> res = new ArrayList<>();
        List<User> users = userMapper.SelectAll();
        for(User user : users){
            UserVo userVo = new UserVo();
            userVo.setUserName(user.getUserName());
            userVo.setGender(user.getGender());
            userVo.setBirthday(user.getBirthday());
            userVo.setDeptId(user.getDeptId());
            Department department = departmentMapper.selectById(user.getDeptId());
            userVo.setDeptName(department.getDeptName());
            userVo.setAddress(department.getAddress());
            userVo.setDescription(department.getDescription());
            res.add(userVo);
        }
        return res;
    }
}
