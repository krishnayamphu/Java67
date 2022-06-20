package com.mt.inheritance;
class School{
    public String schoolName;

    public void schoolName(){
        System.out.println("School: Aptech Computer Education");
    }
}
public class Student extends School{
    public String studentName;
    public void studentInfo(String studentName, String schoolName){
        super.schoolName=schoolName;
        this.studentName=studentName;
        System.out.println("Student name: "+this.studentName);
        System.out.println("School: "+super.schoolName);
    }
    public void defaultStudentAddress(){
        System.out.println("Address:Ktm");
    }

    public void getDefaultStudentInfo(){
        System.out.println("Name: Ram");
        defaultStudentAddress();
        super.schoolName();
    }
    public static void main(String[] args) {
        Student student=new Student();
        student.studentInfo("Ram","Aptech");

        System.out.println("--------------------");
        student.getDefaultStudentInfo();

    }
}
