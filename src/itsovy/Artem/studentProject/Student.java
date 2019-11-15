package itsovy.Artem.studentProject;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private String[] subjects;
    private Date dateOfBirth;
    private int countOfSubjects;

    public Student(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        subjects = new String[10];
        countOfSubjects = 0;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public String getResign() {

        return lastName;
    }

    public int getMonth() {
        LocalDate localDate = dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        return month;
    }

    public static Date setTimeToMidnight(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public void error() {
        System.out.println("The error has been accrued! Program will be terminate!");
        System.exit(1);
    }

    public boolean addSubject(String subject) {
        //String[] temp = new String[subjects.length + 1];
        if (subject == null || subject == "") {
            return false;
        }
        boolean fine = false;
        for (int i = 0; i < countOfSubjects; i++) {
            if (subjects[i].compareToIgnoreCase(subject) == 0) {
                fine = true;
                break;
                //System.out.println("This student is already have such subject!");
            }
        }
        if (fine == false && countOfSubjects < 10) {
            subjects[countOfSubjects] = subject.toUpperCase();
            countOfSubjects++;
            return true;
        } else {
            return false;
        }
    }

    public void printfSUbjects(){
        System.out.println("Student " +firstName+ " " +lastName+ " has this subjects: ");
        for (int i = 0; i < countOfSubjects; i++){
            System.out.print(subjects[i]+ " - ");
        }
    }

    /*
    public Calendar getAge(){
        return dateOfBirth;
    }

 */

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
/*
    public int getDayOfBirth(){
        Calendar date = new CalendarData(dateOfBirth);
        return Calendar.DAY_OF_MONTH;
    }

 */

    public int getMonthOfBirth() {
        return Calendar.MONTH;
    }

    public int getYearOfBirth() {
        return Calendar.YEAR;
    }


}
