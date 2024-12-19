package com.example.myapplication;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface BookmarkDao {

    @Insert
    void insert(Bookmark bookmark);

    @Delete
    void delete(Bookmark bookmark);

    @Query("SELECT * FROM bookmarks WHERE userId = :userId")
    List<Bookmark> getBookmarksByUserId(int userId);

    @Query("SELECT * FROM bookmarks WHERE courseId = :courseId")
    List<Bookmark> getBookmarkByCourseId(int courseId);
}
