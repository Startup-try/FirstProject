package com.fdzc.firstproject.mapper;

import com.fdzc.firstproject.entity.User;
import com.fdzc.firstproject.vo.UserVo;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    /**
     * 查询全部数据
     * @return list集合表示所有的user数据
     */
    @Select("select * from user")
    List<User> SelectAll();
    /**
     * 通过用户传递的id来查询用户信息
     * @param id 用户传递的id
     * @return 返回具体用户数据
     */
    @Select("select * from user where id = #{id}")
    User SelectById(Integer id);

    /**
     * 修改数据方法
     * @return 影响行数
     */
    @Update("update user set user_name=#{userName},password=#{password},gender=#{gender},birthday=#{birthday},dept_id=#{deptId} where id = #{id}")
    Integer Update(User user);

    /**
     * 通过User实体类 来新增数据
     * @param user 实体类
     * @return 影响行数
     */
    @Insert("insert into user(user_name,password,gender,birthday,dept_id) values(#{userName},#{password},#{gender},#{birthday},#{deptId})")
    Integer Insert(User user);

    Integer BatchDeleteUser(List<Integer> ids);


    List<UserVo> FindUserDept();


}
