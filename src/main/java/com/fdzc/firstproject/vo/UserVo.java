package com.fdzc.firstproject.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo implements Serializable {
    private String userName;
    private int gender;
    private Date birthday;
    private int deptId;
    private String deptName;
    private String description;
    private String address;
}
