package itsovy.Artem.studentProject;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Student {
    private String firstName;
    private String lastName;
    private String[] subjects = new String[10];
    private Date dateOfBirth;

    public Student(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
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

    public void addSubject(String subject) {
        //String[] temp = new String[subjects.length + 1];
        for (int i = 0; i < subjects.length; i++){
            subjects[i] = subjects[i] + subject;
        }

/*
        //for (int i = 0; i < subjects.length; i++) {
            String[] temp = new String[subjects.length + 1];
            temp[subjects.length] = subject;
            subjects = temp;
        //}

 */


    }

    public void printSubjects(){
        for (int i=0; i< subjects.length; i++){
            System.out.print(subjects[i]+ " ");
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
