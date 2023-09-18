package com.example.librarymanagementsystem.transformer;

import com.example.librarymanagementsystem.DTO.requestDTO.StudentRequest;
import com.example.librarymanagementsystem.DTO.responseDTO.StudentResponse;
import com.example.librarymanagementsystem.model.Student;

public class StudentTransformer {
    public static Student StudentRequestToStudent(StudentRequest studentRequest){
        return Student.builder()
                .name(studentRequest.getName())
                .age(studentRequest.getAge())
                .email(studentRequest.getEmail())
                .gender(studentRequest.getGender())
                .build();
    }

    public static StudentResponse StudentToStudentResponse(Student student){
        return StudentResponse.builder()
                .name(student.getName())
                .email(student.getEmail())
                .libraryCardNo(student.getLibraryCard().getCardNo())
                .build();
    }

}
