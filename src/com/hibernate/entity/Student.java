package com.hibernate.entity;

import javassist.SerialVersionUID;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by TANHUIHUI on 2017/5/8.
 * 学生持久化类
 */
@Entity
@Table(name = "student", schema = "hibernate")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String stuNo;
    private String stuName;
    private String sex;
    private String cource;
    private Float grade;

    @Id
    @Column(name = "stuNo", nullable = false, length = 32)
    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    @Basic
    @Column(name = "stuName", nullable = false, length = 50)
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 1)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "cource", nullable = true, length = 50)
    public String getCource() {
        return cource;
    }

    public void setCource(String cource) {
        this.cource = cource;
    }

    @Basic
    @Column(name = "grade", nullable = true, precision = 0)
    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student that = (Student) o;

        if (stuNo != null ? !stuNo.equals(that.stuNo) : that.stuNo != null) return false;
        if (stuName != null ? !stuName.equals(that.stuName) : that.stuName != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (cource != null ? !cource.equals(that.cource) : that.cource != null) return false;
        if (grade != null ? !grade.equals(that.grade) : that.grade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stuNo != null ? stuNo.hashCode() : 0;
        result = 31 * result + (stuName != null ? stuName.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (cource != null ? cource.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        return result;
    }
}
