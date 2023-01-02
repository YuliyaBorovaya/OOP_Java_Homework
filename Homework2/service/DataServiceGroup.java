package Homework2.service;

import Homework2.data.StudentGroup;

public interface DataServiceGroup {
    StudentGroup readGroup(int groupNumber);
    void createGroup(int groupNumber);
}
