package CollectionsExamples;

import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String[] args) {
        //program 1
//        ArrayList<String> students=new ArrayList<>();
//
//        //Adding 5 students
//        students.add("krishna");
//        students.add("Nishant");
//        students.add("Soham");
//        students.add("Nisha");
//        students.add("Anushka");
//
//        for(int i=0; i<students.size(); i++){
//            System.out.println("Student Name: "+students.get(i));
//        }
//
//        //display fist student
//        System.out.println(students.getFirst());
//        //added one more sudent
//        students.add("RamRov");
//        //display last student
//        System.out.println(students.getLast());
//        //remove one student
//         students.remove(0);
//         students.remove("RamRov");
//
//        System.out.println();
//
//        //second method of display students
//        for(String s: students){
//            System.out.println("Student name"+ s);
//        }
//        System.out.println(students.contains("Anushka"));
//
//        System.out.println("total student "+students.size());

        //program 2
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(75);
        marks.add(82);
        marks.add(65);
        marks.add(90);
        marks.add(55);


        for(int i=0;i<marks.size(); i++){
            System.out.println("students marks: "+marks.get(i));
        }

        marks.set(2,70);
        System.out.println("90 Exits or not: "+marks.contains(90));
        System.out.println("Total number of subjects: "+marks.size());

        //calculate marks
        double totalmarks=0;
        for(int i=0;i<marks.size(); i++){
         totalmarks= totalmarks+ marks.get(i);
        }
        System.out.println("Total marks: "+totalmarks);
        System.out.println("avarage marks: "+totalmarks/marks.size());

        System.out.println();

        //height marks
        int highest=0; int lowest= Integer.MAX_VALUE; int count=0;
        for(int i=0; i<marks.size(); i++){
            if(highest < marks.get(i)){
                highest=marks.get(i);
            }

            if(lowest > marks.get(i)){
                lowest=marks.get(i);
            }

            if(marks.get(i)>75){
                count++;
            }
        }
        System.out.println("highest marks: "+highest);
        System.out.println("lowest marks: "+lowest);
        System.out.println("number of marks above 75: "+count);


    }
}
