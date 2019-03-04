package com.company;

import java.util.ArrayList;

class Person
{
    String name;
    int age;
    char gender;
    public Person(String name,int age,char gender)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public char getGender() {
        return gender;
    }

    @Override
    public String toString()
    {
        return("Name= "+this.getName()+" Age= "+this.getAge()+" Gender= "+this.getGender());
    }
}



public class Task7 {
    public static void main(String [] args)
    {
        String sumStr="";
        long l1=0;
        Person p = new Person("Eugen",18,'M');
        Person p1 = new Person("Xenia",19,'F');
        Person p2 = new Person("Andrei",45,'M');
        Person p3 = new Person("Alinara",19,'F');
        ArrayList<Object> objpers= new ArrayList<Object>();
        Object[] obj = new Object[12];
        obj[0]="Today";obj[1]=25000;obj[2]=p;obj[3]=" is ";obj[4]=p1;obj[5]=p3;obj[6]=p2;obj[7]="day!";obj[8]='C';obj[9]=2200;
        obj[10]=252525L;obj[11]=363636L;
        for (int i=0; i<obj.length; i++)
        {
            System.out.println(obj[i]);
        }
        for (int i=0; i<obj.length; i++) {
            if (obj[i] instanceof String) {
                sumStr += obj[i];
            } else if (obj[i] instanceof Character) {
                sumStr += obj[i];
            } else if (obj[i] instanceof Long || obj[i] instanceof Integer) {
                l1 += Long.parseLong(obj[i].toString());
            } else if (obj[i] instanceof Person) {
                objpers.add(obj[i]);
            }
        }

        System.out.println("============================Results=============================================");
        System.out.println("String= "+sumStr);
        System.out.println("Numbers= "+l1);
        System.out.println("================================================================================");
        System.out.println("New Array with Person Obj");
        for (Object per:objpers ) {
            System.out.println(per);
        }
        System.out.println("================================================================================");

    }
}
