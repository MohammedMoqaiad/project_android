package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface EnrollmentDao {

    @Insert
    void insert(Enrollment enrollment);

    @Update
    void update(Enrollment enrollment);

    @Delete
    void delete(Enrollment enrollment);

    @Query("SELECT * FROM enrollments WHERE userId = :userId")
    List<Enrollment> getEnrollmentsByUserId(int userId);

    @Query("SELECT * FROM enrollments WHERE courseId = :courseId")
    List<Enrollment> getEnrollmentsByCourseId(int courseId);
}