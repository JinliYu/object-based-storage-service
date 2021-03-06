package com.jinli.bigdata.core.authmgr.model;

import com.jinli.bigdata.core.CoreUtil;

import java.util.Date;

public class TokenInfo {
    private String token;
    private int expireTime;
    private Date refreshTime;
    private Date createTime;
    private boolean isActive;
    private String creator;

    public TokenInfo(){}

    public TokenInfo(String creator){
        this.token = CoreUtil.getUUIDStr();
        this.expireTime = 7;
        this.creator = creator;
        Date now = new Date();
        this.refreshTime = now;
        this.createTime = now;
        this.isActive = true;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }

    public Date getRefreshTime() {
        return refreshTime;
    }

    public void setRefreshTime(Date refreshTime) {
        this.refreshTime = refreshTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
