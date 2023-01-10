package Homework3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import Homework3.data.GroupStream;
import Homework3.data.GroupStreamComparator;
import Homework3.data.Student;
import Homework3.data.StudentGroup;
import Homework3.data.UserComparator;

public class App {
    public static void main(String[] args){
        List<Student> userList1 = Arrays.asList(new Student("Ivan", 22, 4545, 1)
                                                , new Student("Nikolai", 20, 445,1)
                                                , new Student("Stepan", 23, 4334, 1));
        System.out.println(userList1);
        Collections.sort(userList1, new UserComparator());
        System.out.println(userList1);

        StudentGroup studentGroup1 = new StudentGroup(userList1, 1); 

        List<Student> userList2 = Arrays.asList(new Student("Roman", 22, 4455, 2)
                                                , new Student("Petr", 20, 554,2)); 
        StudentGroup studentGroup2 = new StudentGroup(userList2, 2);

        List<Student> userList3 = Arrays.asList(new Student("Alexander", 23, 445, 3));
        StudentGroup studentGroup3 = new StudentGroup(userList3, 3);

        List<StudentGroup> studentGroupsList1= Arrays.asList(studentGroup1, studentGroup2);
        List<StudentGroup> studentGroupsList2= Arrays.asList(studentGroup3);

        List<GroupStream> groupStreams = Arrays.asList(new GroupStream(studentGroupsList1), new GroupStream(studentGroupsList2), new GroupStream(studentGroupsList2));
        System.out.println(groupStreams);
        Collections.sort(groupStreams, new GroupStreamComparator());
        System.out.println(groupStreams);

    }
}

