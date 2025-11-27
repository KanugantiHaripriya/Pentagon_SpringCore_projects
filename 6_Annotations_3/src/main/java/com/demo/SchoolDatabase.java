package com.demo;

import org.springframework.stereotype.Repository;

@Repository
public class SchoolDatabase implements Report {

    @Override
    public void getData() {
        System.out.println("Getting report from School DB");
    }
}
