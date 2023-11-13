package com.fdzc.firstproject;

import com.fdzc.firstproject.mapper.DepartmentMapper;
import com.fdzc.firstproject.mapper.UserMapper;
import com.fdzc.firstproject.vo.DeptVo;
import com.fdzc.firstproject.vo.UserVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class FirstProjectApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void UserTest1(){
        List<UserVo> users = userMapper.FindUserDept();
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void UserTest2(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        userMapper.BatchDeleteUser(list);
    }

    @Test
    public void DeptTest1(){
        DeptVo list = departmentMapper.FindDeptUsers(1);
        System.out.println(list);
    }

    @Test
    public void DeptTest2(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        int res = departmentMapper.BatchDeleteDept(list);
        System.out.println(res);
    }
}
