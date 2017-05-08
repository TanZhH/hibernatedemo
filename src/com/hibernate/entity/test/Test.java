package com.hibernate.entity.test;

import com.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by TANHUIHUI on 2017/5/8.
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Student student = new Student();
        student.setStuNo("5");
        student.setStuName("wangwu");
        student.setSex("M");
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(student);
        tx.commit();
        session.close();
        sessionFactory.close();
        System.out.println("成功一条记录添加了！");
    }
}
