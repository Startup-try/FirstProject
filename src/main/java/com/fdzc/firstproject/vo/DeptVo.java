package com.fdzc.firstproject.vo;

import com.fdzc.firstproject.entity.Department;
import com.fdzc.firstproject.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeptVo implements Serializable {
    private int id;
    private String deptName;
    private String description;
    private String address;
    private List<User> users;
}
