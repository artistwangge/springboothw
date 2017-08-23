package org.springboothw.demo.po.user;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by wangzheng on 17-8-23.
 */
public class User {

    //用户名
    @NotNull
    @NotEmpty(message = "用户名不能为空")
    private String username;

    //密码
    @NotNull
    @NotEmpty()
    private String password;

    //姓名
    private String name;

    //邮箱
    @Email(message = "邮箱格式错误")
    private String email;

    //联系电话
    private String phone;

    //状态
    private int status;

    //创建日期
    private java.util.Date createDate;

    //修改日期
    private java.util.Date updateDate;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
