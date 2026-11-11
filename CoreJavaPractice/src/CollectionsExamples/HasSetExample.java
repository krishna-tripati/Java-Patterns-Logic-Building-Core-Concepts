package CollectionsExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HasSetExample {
    public static void main(String[] args) {
        //program 4
        HashSet<Integer> number=new HashSet<>();

         number.add(123456789);
         number.add(23456789);
         number.add(3456789);
         number.add(3456789);
         number.add(null);

        System.out.println(number);
        System.out.println(number.contains(23456789));

        System.out.println();
        //program 5
        LinkedHashSet<String> students=new LinkedHashSet<>();
        students.add("krishna");
        students.add("Nishant");
        students.add("Soham");
        students.add("mane");
        students.add(null);

        System.out.println(students);

        System.out.println();
        //program 6
        TreeSet<Integer> marks= new TreeSet<>();
        marks.add(70);
        marks.add(85);
        marks.add(60);
        marks.add(90);
        marks.add(85);
        marks.add(75);

        System.out.println(marks);
    }
}

