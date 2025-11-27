package com.demo;

import org.springframework.stereotype.Repository;

@Repository("report")
public class HospitalDatabase implements Report {

    @Override
    public void getData() {
        System.out.println("Getting report from Hospital DB");
    }
}
