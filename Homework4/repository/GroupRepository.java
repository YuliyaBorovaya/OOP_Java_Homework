package Homework4.repository;

import Homework4.data.StudentGroup;

public class GroupRepository implements Repository<StudentGroup, Integer>{

    @Override
    public StudentGroup save(StudentGroup entity) {
        return entity;
    }

    @Override
    public StudentGroup findById(Integer id) {
        return null;
    }


}
