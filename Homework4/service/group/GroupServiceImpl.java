package Homework4.service.group;

import java.util.Collections;
import java.util.Iterator;

import Homework4.data.Student;
import Homework4.data.StudentGroup;
import Homework4.repository.Repository;
import Homework4.util.ReaderFromTxt;
import Homework4.util.WriterToTxt;

public class GroupServiceImpl implements GroupService {

    private StudentGroup studentGroup;
    private final Repository<StudentGroup, Integer> studentGroupIntegerRepository;
    
    public GroupServiceImpl(Repository<StudentGroup, Integer> studentGroupIntegerRepository) {
        this.studentGroupIntegerRepository = studentGroupIntegerRepository;
    }
    
    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
    public Repository<StudentGroup, Integer> getStudentGroupIntegerRepository() {
        return studentGroupIntegerRepository;
    }

    @Override
    public StudentGroup readGroup(int groupNumber) {
        return ReaderFromTxt.readGroup(groupNumber);       
    }

    @Override
    public void createGroup(int groupNumber) {
        WriterToTxt.writeGroup(new StudentGroup(groupNumber));
    }

    public void removeStudent(String fio) {
        Iterator<Student> iterator = getStudentGroup().iterator();
        while(iterator.hasNext()){
            if(iterator.next().getFio().equals(fio)){
                iterator.remove();
            }
        }
    }    
    public void sortStudent(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList()); 
    }
    public StudentGroup saveGroup(StudentGroup group){ //можно сделать void
        return studentGroupIntegerRepository.save(group);
        
    }
    public StudentGroup findGroup(Integer number) {
        return studentGroupIntegerRepository.findById(number);
    }

}
