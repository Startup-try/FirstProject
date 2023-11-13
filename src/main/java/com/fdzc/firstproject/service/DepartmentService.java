package com.fdzc.firstproject.service;

import com.fdzc.firstproject.entity.Department;
import com.fdzc.firstproject.vo.DeptVo;

import java.util.List;

public interface DepartmentService {

    List<Department> SelectAll();

    Department SelectById(Integer id);

    Integer Update(Department department);

    Integer Insert(Department department);

    int BatchDelete(List<Integer> ids);


    DeptVo FindDeptUsers(Integer id);

    DeptVo FindDeptUsers2(Integer id);
}
