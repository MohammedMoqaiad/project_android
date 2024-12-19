package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface AdminDao {

    @Insert
    void insert(Admin admin);

    @Update
    void update(Admin admin);

    @Delete
    void delete(Admin admin);

    @Query("SELECT * FROM admins WHERE email = :email")
    List<Admin> getAdminByEmail(String email);
    @Query("SELECT * FROM admins WHERE id = :email")
    List<Admin> getCourseById(String email);

    @Query("SELECT * FROM admins WHERE id = :email")
    List<Admin> getLessonById(String email);
}

