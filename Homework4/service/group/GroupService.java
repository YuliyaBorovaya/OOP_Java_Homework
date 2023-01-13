package Homework4.service.group;

import Homework4.data.StudentGroup;

public interface GroupService {
    StudentGroup readGroup(int groupNumber);

    void createGroup(int groupNumber);
}
