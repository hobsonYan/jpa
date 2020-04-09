package com.hobson.api.model.mysql;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author yan hongbo
 * @date 2020/4/9 14:13
 * @description
 */
@Entity
public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private String salt;
    private String phone;
    private String email;
    private Date createtime;
    private Date updatetime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "salt")
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "createtime")
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "updatetime")
    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (username != null ? !username.equals(user.username) : user.username != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (salt != null ? !salt.equals(user.salt) : user.salt != null) return false;
        if (phone != null ? !phone.equals(user.phone) : user.phone != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (createtime != null ? !createtime.equals(user.createtime) : user.createtime != null) return false;
        if (updatetime != null ? !updatetime.equals(user.updatetime) : user.updatetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (salt != null ? salt.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (updatetime != null ? updatetime.hashCode() : 0);
        return result;
    }

    /**
     * @author yan hongbo
     * @date 2020/4/9 14:51
     * @description
     */
    @Entity
    public static class Role {
        private Integer id;
        private String role;
        private String roleName;
        private Timestamp createTime;

        @Id
        @Column(name = "id")
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        @Basic
        @Column(name = "role")
        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        @Basic
        @Column(name = "role_name")
        public String getRoleName() {
            return roleName;
        }

        public void setRoleName(String roleName) {
            this.roleName = roleName;
        }

        @Basic
        @Column(name = "create_time")
        public Timestamp getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Timestamp createTime) {
            this.createTime = createTime;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Role role1 = (Role) o;

            if (id != null ? !id.equals(role1.id) : role1.id != null) return false;
            if (role != null ? !role.equals(role1.role) : role1.role != null) return false;
            if (roleName != null ? !roleName.equals(role1.roleName) : role1.roleName != null) return false;
            if (createTime != null ? !createTime.equals(role1.createTime) : role1.createTime != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = id != null ? id.hashCode() : 0;
            result = 31 * result + (role != null ? role.hashCode() : 0);
            result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
            result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
            return result;
        }
    }
}
