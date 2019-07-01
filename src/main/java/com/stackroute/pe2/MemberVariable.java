package com.stackroute.pe2;


class Member {

    private String name;
    private int age , salary;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class MemberVariable {

    public static void main(String[] args){
        Member object = new Member();

        object.setAge(21);
        object.setName("Sandeep Grover");
        object.setSalary(4);

        System.out.println("Member Name: " + object.getName());
        System.out.println("Member Age: " + object.getAge());
        System.out.println("Member Salary: " + object.getSalary());
    }
}
