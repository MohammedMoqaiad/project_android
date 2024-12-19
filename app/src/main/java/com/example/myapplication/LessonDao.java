package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface LessonDao {

    @Insert
    void insert(Lesson lesson);

    @Update
    void update(Lesson lesson);

    @Delete
    void delete(Lesson lesson);

    @Query("SELECT * FROM lessons WHERE courseId = :courseId")
    List<Lesson> getLessonsByCourseId(int courseId);
}
