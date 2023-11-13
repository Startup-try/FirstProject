package com.fdzc.firstproject.controller;

import com.fdzc.firstproject.entity.Department;
import com.fdzc.firstproject.entity.User;
import com.fdzc.firstproject.service.DepartmentService;
import com.fdzc.firstproject.vo.DeptVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService DepartmentServiceImpl;


    @GetMapping("/{id}")
    public Department GetByID(@PathVariable Integer id){
        return DepartmentServiceImpl.SelectById(id);
    }

    @GetMapping
    public List<Department> GetAll(){
        return DepartmentServiceImpl.SelectAll();
    }

    @PostMapping
    public String Register(@RequestBody Department department){
        if(DepartmentServiceImpl.Insert(department) == 1){
            return "添加部门成功";
        }else{
            return "添加部门失败";
        }
    }

    @PutMapping
    public String ModifyUser(@RequestBody Department department){
        DepartmentServiceImpl.Update(department);
        return "修改成功";
    }


    @DeleteMapping
    public String DeleteUsers(@RequestBody List<Integer> ids){
        DepartmentServiceImpl.BatchDelete(ids);
        return "批量删除成功";
    }

    @GetMapping("/findDeptUsers/{id}")
    public DeptVo FindDeptUsers(@PathVariable Integer id){
        return DepartmentServiceImpl.FindDeptUsers2(id);
    }

}
