package com.stackroute.pe2;


class Member {

    private String name;
    private int age , salary;

    //Getter and setter for name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //Getter and setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Getter and setter for salary
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

        //Set the values of variables
        object.setAge(21);
        object.setName("Sandeep Grover");
        object.setSalary(4);

        //get the values of variables
        System.out.println("Member Name: " + object.getName());
        System.out.println("Member Age: " + object.getAge());
        System.out.println("Member Salary: " + object.getSalary());
    }
}
