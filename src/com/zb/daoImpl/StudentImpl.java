package com.zb.daoImpl;

import com.zb.dao.Student;

public class StudentImpl implements Student {

    @Override
    public void addStudent() {
        System.out.println("增加成功");
    }
    //张博宇 test
    @Override
    public boolean stuLogin(){
        return false;
    }
}
