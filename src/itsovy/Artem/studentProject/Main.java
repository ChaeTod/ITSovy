package itsovy.Artem.studentProject;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        Student erik = new Student("Erik", "Orins", new Date(2001, Calendar.MARCH, 24));
        Student filip = new Student("Filip", "Storcky", new Date(1999, Calendar.DECEMBER, 20));
        Student dima = new Student("Dima", "Fisher", new Date());
        Student katia = new Student("Katia", "Lingova", new Date());

        Student thomas = new Student("Thomas", "Marten", new Date());
        Student nick = new Student("Nick", "Sanchez", new Date());
        Student darina = new Student("Darina", "Moznak", new Date());


        Group g1 = new Group("1N", 5);
        g1.addStudent(erik);
        g1.addStudent(filip);
        g1.addStudent(dima);
        g1.addStudent(katia);

        Group g2 = new Group("2N", 5);
        g2.addStudent(thomas);
        g2.addStudent(nick);
        g2.addStudent(darina);

        //g1.getStudMonth(5);

        filip.addSubject("GEO");
        filip.addSubject("MAT");
        filip.addSubject("PHY");
        dima.addSubject("GEO");
        dima.addSubject("MAT");
        dima.addSubject("PHY");
        katia.addSubject("MAT");
        katia.addSubject("PHY");
        filip.printfSUbjects();

        //g1.getStudMonth(5);

        g1.print();
        //g2.print();

        //g1.sort(true);
        System.out.println(" ");
        System.out.println("The student who has born in this month is: " + g1.getStudMonth(12));
        //System.out.println("The students by this subject: " + Arrays.toString(g1.getStudentBySubject("MAT")));


    }

}
