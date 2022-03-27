package com.greatlearning.assignment;

public class DepartmentMain {
    public static void main(String args[]) {
        AdminDepartment Ad = new AdminDepartment();
        HrDepartment HR = new HrDepartment();
        TechDepartment Tech = new TechDepartment();

        System.out.println("Welcome to " + Ad.departmentName());
        System.out.println(Ad.getTodaysWork());
        System.out.println(Ad.getWorkDeadline());
        System.out.println(Ad.isTodayaHoliday() + "\n");

        System.out.println("Welcome to " + HR.departmentName());
        System.out.println(HR.doActivity());
        System.out.println(HR.getTodaysWork());
        System.out.println(HR.getWorkDeadline());
        System.out.println(HR.isTodayaHoliday() + "\n");

        System.out.println("Welcome to " + Tech.departmentName());
        System.out.println(Tech.getTodaysWork());
        System.out.println(Tech.getWorkDeadline());
        System.out.println(Tech.getTechStackInformation());
        System.out.println(Tech.isTodayaHoliday() + "\n");
    }

}
