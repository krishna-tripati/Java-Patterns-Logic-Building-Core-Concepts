package CollectionsExamples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        //program 7
        HashMap<Integer, String> students=new HashMap<>();
        students.put(101,"krishna");
        students.put(102,"Nishant");
        students.put(103,"soham");
        students.put(104,"Anushka");

        System.out.println(students);
        System.out.println(students.get(103));
        students.put(105, "Nisha");
        students.remove(102);
        System.out.println( students.containsKey(105));
        System.out.println(students.containsValue("Nishant"));
        System.out.println(students);
        System.out.println(students.size());

        System.out.println();

        //program 8
        LinkedHashMap<Integer, String> emp=new LinkedHashMap<>();
        emp.put(101,"Java Developer");
        emp.put(102,"Tester");
        emp.put(103,"Manager");
        emp.put(null,"HR");
        emp.put(104,null);
        System.out.println(emp);

        System.out.println(emp.get(null));

        System.out.println();

        //program 9
        TreeMap<Integer , String> emp1=new TreeMap<>();
        emp1.put(105,"Amit");
        emp1.put(105,"taj");
        emp1.put(101,"raj");
        emp1.put(1,null);

        System.out.println(emp1);

        System.out.println();
        //program 10
        PriorityQueue<Integer> q=new PriorityQueue<>();
        q.add(50);
        q.add(10);
        q.add(30);
        q.add(20);
        q.poll(); //first place object deleted
        System.out.println(q.contains(10));
        System.out.println(q);
    }
}
