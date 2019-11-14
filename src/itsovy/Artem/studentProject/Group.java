package itsovy.Artem.studentProject;

import java.util.Random;

public class Group {
    private int size;
    private String name;
    private int capacity;
    private Student[] arr;

    public Group(String name, int capacity) {
        this.name = name;
        this.size = 0;
        this.capacity = capacity;
        this.arr = new Student[capacity];
    }

    public int getSize() {
        return size;
    }

    public boolean addStudent(Student student) {
        if (student == null || size == capacity)
            return false;

        arr[size] = student;
        size++;
        return true;
    }

    public Student getStudent(String firstName, String LastName){
        return null;
    }

    public boolean deleteStudent(Student student) {
        if (student == null || size == capacity)
            return false;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == student) { // to do delete
                temp = i;
            }
        }

        for (int i = temp; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return true;
    }

    public void sort() {

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < arr.length; i++) {
                if (arr[i].getLastName().compareToIgnoreCase(arr[j].getLastName()) > 0) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if (arr[i].getLastName().compareToIgnoreCase(arr[i].getLastName()) == 0) {
                    if (arr[i].getLastName().compareToIgnoreCase(arr[j].getLastName()) > 0) {
                        Student temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

    public Student randomStud() {
        int n = 0;
        if (size > 0) {
            Random rnd = new Random();
            //for (int i = 0; i < size; i++){
            n = rnd.nextInt(size);
            //}
        }
        return arr[n];
    }

/*
    public Student getBySubName(String subName){
        for (int i = 0; i < size; i++){
            if (arr[i].getSubject() == subName){
                return arr[i];
            }
        }
        return null;
    }

 */


// !Temporary decision - need to be remade:

    public Student getStudMonth(int month) {
        for (int i = 0; i < size; i++) {
            if (arr[i].getMonth() == month) {
                return arr[i];
            }
        }
        return null;
    }

    /* // Example of method with returning an Student[] array. Looks like
    public Student[] getStudByMonth(int month){
        if (size == 0 || month == 0 || month > 13){
            System.out.println("Error in inputs!");
            System.exit(1);
        }
        int temp = 0;
        for (int i = 0; i < size; i++){
            if (month == arr[i].getMonth())
                temp++;
        }
        Student[] students = new Student[temp];
        temp = 0;
        for (int i = 0; i < size; i++){
            if (month == arr[i].getMonth()){
                students[temp] = arr[i];
                temp++;
            }
        }
        return students;
    }
     */

    public void print() {
        System.out.println(" ");
        System.out.println("List of students: " + name + " ");
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " | ");
    }

    public Student[] getStudentBySubject(String subject){
        return null;
    }

    public int getCapacity() {
        return capacity;
    }
}
