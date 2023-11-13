package com.fdzc.firstproject.service;

import com.fdzc.firstproject.entity.User;
import com.fdzc.firstproject.vo.UserVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserService {

    List<User> SelectAll();

    User SelectById(Integer id);

    Integer Update(User user);

    Integer Insert(User user);

    Integer BatchDeleteUser(List<Integer> ids);

    List<UserVo> FindUserDept();

    List<UserVo> FindUserDept2();
}
