package com.greatlearning.assignment;

public class HrDepartment extends SuperDepartment {
    public String departmentName() {
        String name = "HR Department";
        return name;
    }

    public String getTodaysWork() {
        String work = "Fill today’s worksheet and mark your attendance";
        return work;
    }

    public String getWorkDeadline() {
        String deadline = "Complete by EOD";
        return deadline;
    }

    public String doActivity() {
        String activity = "Team Lunch";
        return activity;
    }
}
