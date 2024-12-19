package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface CategoryDao {

    @Insert
    void insert(Categories category);

    @Update
    void update(Categories category);

    @Delete
    void delete(Categories category);

    @Query("SELECT * FROM Categories")
    List<Categories> getAllCategories();
}