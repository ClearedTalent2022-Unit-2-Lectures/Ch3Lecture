package org.launchcode;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    // Let's create an ArrayList and loop through it
        // let students: string[] = ["Mayfield", "David", "John"];
//        ArrayList<String> students = new ArrayList<>();
//        students.add("John");
//        students.add("David");
//        students.add("Mayfield");
//
//        // Here we print the length of the students ArrayList
//        System.out.println(students.size());
//
//        // Let's print out each of the students in the ArrayList
//        // for (let item in collection)
//        for (String student : students) {
//            System.out.println(student);
//        }
//
//        System.out.println(students.contains("Yeseul"));

        //---------------------------------------------------------------

        // let's create an empty HashMap and add in some key/value pairs
        HashMap<String, String> staff = new HashMap<>();
        // staff["Pearce"] = "Instructor";
        staff.put("Pearce", "Instructor");
        staff.put("Amanda", "TA");
        staff.put("Steve", "TA");
        staff.put("Tom", "TA");

        System.out.println(staff.keySet());

        // let's print out all of the keys from the staff hashmap
        for (String key : staff.keySet()) {
            System.out.println(key + ": " + staff.get(key));
        }
    }
}
