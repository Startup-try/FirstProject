package com.fdzc.firstproject.controller;

import com.fdzc.firstproject.entity.User;
import com.fdzc.firstproject.service.UserService;
import com.fdzc.firstproject.vo.UserVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userServiceImpl;
    Logger logger = Logger.getLogger(UserController.class);

    @GetMapping("/{id}")
    public User GetByID(@PathVariable Integer id){
        return userServiceImpl.SelectById(id);
    }

    @GetMapping
    public List<User> GetAll(){
        return userServiceImpl.SelectAll();
    }

    @PostMapping
    public String Register(@RequestBody User user){
        logger.info("前端传来的参数为：" + user.toString());
        if(userServiceImpl.Insert(user) == 1){
            return "插入成功";
        }else{
            return "插入失败";
        }
    }

    @PutMapping
    public String ModifyUser(@RequestBody User user){
        userServiceImpl.Update(user);
        return "修改成功";
    }


    @DeleteMapping()
    public String DeleteUsers(@RequestBody List<Integer> ids){
        userServiceImpl.BatchDeleteUser(ids);
        return "批量删除成功";
    }

    @GetMapping("/findUserDept")
    public List<UserVo> FindUserDept(){
        return userServiceImpl.FindUserDept2();
    }

    

}



