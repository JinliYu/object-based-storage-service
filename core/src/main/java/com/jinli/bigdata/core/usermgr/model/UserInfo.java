package com.jinli.bigdata.core.usermgr.model;

import com.jinli.bigdata.core.CoreUtil;

import java.util.Date;

public class UserInfo {
    private String userId;
    private String userName;
    private String password;
    private String detail;
    private SystemRole systemRole;
    private Date createTime;

    public UserInfo(){}

    public UserInfo(String userName, String password, String detail, SystemRole systemRole){
        this.userId = CoreUtil.getUUIDStr();
        this.userName = userName;
        this.password = CoreUtil.getMd5PassWord(password);
        this.detail = detail;
        this.systemRole = systemRole;
        this.createTime = new Date();
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }


    public String getDetail() {
        return detail;
    }


    public SystemRole getSystemRole() {
        return systemRole;
    }


    public Date getCreateTime() {
        return createTime;
    }
}
