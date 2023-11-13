package com.fdzc.firstproject.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private int id;
    @TableField("dept_name")
    private String deptName;
    private String description;
    private String address;
}
