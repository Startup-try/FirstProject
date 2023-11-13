package com.fdzc.firstproject.service;

import com.fdzc.firstproject.entity.Department;
import com.fdzc.firstproject.entity.User;
import com.fdzc.firstproject.mapper.DepartmentMapper;
import com.fdzc.firstproject.mapper.UserMapper;
import com.fdzc.firstproject.service.DepartmentService;
import com.fdzc.firstproject.vo.DeptVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Department> SelectAll() {
        return departmentMapper.selectList(null);
    }

    @Override
    public Department SelectById(Integer id) {
        return departmentMapper.selectById(id);
    }

    @Override
    public Integer Update(Department department) {
        return departmentMapper.updateById(department);
    }

    @Override
    public Integer Insert(Department department) {
        return departmentMapper.insert(department);
    }

    @Override
    public int BatchDelete(List<Integer> ids) {
        return departmentMapper.BatchDeleteDept(ids);
    }

    @Override
    public DeptVo FindDeptUsers(Integer id) {
        return departmentMapper.FindDeptUsers(id);
    }


    @Override
    public DeptVo FindDeptUsers2(Integer id) {
        DeptVo deptVo = new DeptVo();
        Department department = departmentMapper.selectById(id);
        List<User> users = userMapper.SelectAll();
        Deptusers = users.where(u => u.deptId == id)
        deptVo.setId(department.getId());
        deptVo.setDeptName(department.getDeptName());
        deptVo.setAddress(department.getAddress());
        deptVo.setDescription(department.getDescription());
        deptVo.setUsers(Deptusers);
        return deptVo;
    }
}
