package com.greatlearning.assignment;

public class AdminDepartment extends SuperDepartment {

    public String departmentName() {
        String name = "Admin Department";
        return name;
    }

    public String getTodaysWork() {
        String work = "Complete your documents Submission";
        return work;
    }

    public String getWorkDeadline() {
        String deadline = "Complete by EOD";
        return deadline;
    }
}

