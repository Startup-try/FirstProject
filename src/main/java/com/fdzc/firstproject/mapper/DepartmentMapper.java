package com.fdzc.firstproject.mapper;

//import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.fdzc.firstproject.entity.Department;
import com.fdzc.firstproject.vo.DeptVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {
    /**
     * 查询当前部门信息，包括此部门对应的用户信息
     * @param id 部门编号
     * @return 部门信息+部门员工信息
     */
    DeptVo FindDeptUsers(Integer id);

    int BatchDeleteDept(List<Integer> ids);
}
