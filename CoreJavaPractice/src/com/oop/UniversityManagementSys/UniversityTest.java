package com.oop.UniversityManagementSys;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversityTest {
   static ArrayList<StudeEntrollData> studEnrollData=new ArrayList<>();

    // Check and return Student if exists
    public static Student findStudentById(List<Student> students, int newSid){
        for(Student s:students){
            if(s.getId()==newSid) {
                return s;
            }
        }
        return null;
    }

    // Check and return Course if exists
    public static Course findCourseById(List<Course> courses, int newCid){
        for(Course c:courses){
            if(c.getId()==newCid){
                return c;
            }
        }
        return null;
    }

    // Check and return Teacher if exists
    public static Teacher findTeacherById(List<Teacher> teachers, int newTid){
        for(Teacher t: teachers){
            if(t.getId()==newTid){
                return t;
            }
        }
        return null;
    }

    // enroll student
    public static void enrollstudent(int newSid, int newCid, int newTid,    List<Student> students, List<Teacher> teachers, List<Course> courses){

         //verify student
        Student student=findStudentById(students, newSid);
           if(student==null){
               System.out.println("Enrollment Failed: Student ID: "+newSid +" is not registered. Please register the student first");
               return;
           }
        //verify Teacher
        Teacher teacher=findTeacherById(teachers , newTid);
        if(teacher==null){
            System.out.println("Enrollment Failed: Teacher ID: "+newCid +" is not registered. does not exist");
            return;
        }

        //verify course exits
        Course course=findCourseById(courses,newCid );
        if(course ==null){
            System.out.println("Enrollment Failed: Course ID: "+newCid +" does not exist");
            return;
        }

        //Teacher subject match student subject
        if(!teacher.getSubject().equalsIgnoreCase(course.getName())){
            System.out.println("Enrollment Failed: Teacher "+teacher.getName()+
                    "teaches"+teacher.getSubject()+ "Which does not match "+course.getName());
            return;
        }

        studEnrollData.add(new StudeEntrollData(course,teacher,student));

        //all condition executes
        System.out.println("-- ENROLLMENT SUCCESSFUL! --");
        System.out.println("Student ID: "+ student.getId() +"Student Name: "+student.getName());
        System.out.println("Assign Teacher: "+teacher.getName()+"Subject: "+teacher.getSubject());
        System.out.println("Enrolled Course: "+course.getName());
        System.out.println("Course Fess"+course.getCourseFees());

    }

        //Display all Student Enrollment Data
     public static void displayStudentEnrollData(){

        if(studEnrollData.isEmpty()){
            System.out.println("Data Unavailable --> please Enroll student");
        }else {
            for(StudeEntrollData studData: studEnrollData){
                System.out.println("Student ID: "+studData.getS().getId());
                System.out.println("Student Name: "+studData.getS().getName());
                System.out.println("Course: "+studData.getC().getName());
                System.out.println("Teacher Name: "+studData.getT().getName());
                System.out.println("Course Fees: "+studData.getC().getCourseFees());
                System.out.println();
            }
        }
     }

    public static void main(String[] args) {
        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        int selectNO = 0;
        boolean istrue=true;
        while (istrue) {
            System.out.println();
            System.out.println("Welcome to KT university ");
            System.out.println("Enter 1 for Add Teacher data");
            System.out.println("Enter 2 for Add Student data");
            System.out.println("Enter 3 for Add course data");
            System.out.println("Enter 4 for Display all Teachers Data");
            System.out.println("Enter 5 for Display all Students Data");
            System.out.println("Enter 6 for Display all Course Data");
            System.out.println("Enter 7 for Enroll Student");
            System.out.println("Enter 8 for Display Enroll Student Data");
            System.out.println("Enter 9 for EXIT");
            System.out.println();


            selectNO = sc.nextInt();
            switch (selectNO) {
                case 1:
                    System.out.println("Enter a Teacher ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter a Teacher Name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter a Teacher Subject: ");
                    String sub = sc.nextLine();

                    //add Teacher Data
                    teachers.add(new Teacher(id, name, sub));
                    System.out.println("Successfully Added Teacher Data");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter a Student ID: ");
                    int Sid = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter a Student Name: ");
                    String Sname = sc.nextLine();

                    System.out.println("Enter a Student Course: ");
                    String Scourse = sc.nextLine();

                    //add Teacher Data
                    students.add(new Student(Sid, Sname, Scourse));
                    System.out.println("Successfully Added Student Data");
                    break;

                case 3:
                    System.out.println("Enter a Course ID: ");
                    int Cid = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter a Course Name: ");
                    String Cname = sc.nextLine();

                    System.out.println("Enter a Course Fess: ");
                    double fess = sc.nextDouble();

                    //add Teacher Data
                    courses.add(new Course(Cid, Cname, fess));
                    System.out.println("Successfully Added Course Data");
                    break;


                case 4:
                    if (teachers.isEmpty()) {
                        System.out.println("Teacher Data Unavailable --> please Add Teachers Data");
                    } else {
                        System.out.println("Teachers Data");
                        for (Teacher teach : teachers) {
                            System.out.println("Teacher ID: " + teach.getId());
                            System.out.println("Teacher Name: " + teach.getName());
                            System.out.println("Teacher Subject: " + teach.getSubject());
                            System.out.println();
                        }
                    }
                    break;

                case 5:
                    if (students.isEmpty()) {
                        System.out.println("Student Data Unavailable --> please Add Student Data");

                    } else {
                        System.out.println("Students Data");
                        for (Student stud : students) {
                            System.out.println("Student ID: " + stud.getId());
                            System.out.println("Student Name: " + stud.getName());
                            System.out.println("Student Course: " + stud.getCourse());
                            System.out.println();
                        }
                    }
                    break;
                case 6:
                    if (courses.isEmpty()) {
                        System.out.println("Course Data Unavailable --> please Add Course Data");
                    } else {
                        System.out.println("Course Data");
                        for (Course course : courses) {
                            System.out.println("Course ID: " + course.getId());
                            System.out.println("Course Name: " + course.getName());
                            System.out.println("Course Fees: " + course.getCourseFees());
                            System.out.println();
                        }
                    }
                    break;
                case 7:
                    System.out.println("Student Enrollment");
                    System.out.println("Enter a Student ID: ");
                    int enrollstuid = sc.nextInt();

                    System.out.println("Enter a Teacher ID");
                    int enrollteaid = sc.nextInt();

                    System.out.println("Enter a Course ID");
                    int enrollcoursid = sc.nextInt();

                    UniversityTest.enrollstudent(enrollstuid, enrollcoursid, enrollteaid, students, teachers, courses);
                    break;

                case 8:
                    System.out.println("--Student Enrollments--");
                     displayStudentEnrollData();
                     break;
                case 9:
                    System.out.println("Thank you for visiting");
                    istrue=false;
                    break;
                default:
                    System.out.println("Invalid numbe4r --> Enter 1 to 9 number");
                    istrue=false;
                    break;
            }

        }
    }

}
