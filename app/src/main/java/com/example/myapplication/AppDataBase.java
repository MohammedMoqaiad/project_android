package com.example.myapplication;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Database(entities = {Admin.class,User.class, Course.class, Categories.class, Lesson.class, Enrollment.class, Bookmark.class}, version = 1, exportSchema = false)
public abstract class AppDataBase extends RoomDatabase {

    public abstract AdminDao adminDao();

    public abstract UserDao userDao();
    public abstract CourseDao courseDao();
    public abstract CategoryDao categoryDao();
    public abstract LessonDao lessonDao();
    public abstract EnrollmentDao enrollmentDao();
    public abstract BookmarkDao bookmarkDao();
    private static  AppDataBase INSTANCE;
    private static final int NUMBER = 5;
  static final ExecutorService databaseWriteExecutor=Executor.newFixedThreadPool(NUMBER);
    static RoomDatabase roomDatabase(final Context context){

        if(INSTANCE==null){
            synchronized (AppDataBase.class){
                if(INSTANCE==null){
                    INSTANCE= Room.databaseBuilder(context.getApplicationContext(),
                            AppDataBase.class,"AppDataBase").allowMainThreadQueries().addCallback(sRoomDatabaseCallback) .build();
                }
            }
        }


        return INSTANCE;

    }
    private static RoomDatabase. Callback sRoomDatabaseCallback = new RoomDatabase.Callback(){
    @Override
    public void onCreate(@NonNull SupportSQLiteDatabase db){
     super.onCreate(db);
// If you want to keep data through app restarts,
// comment out the following block
  databaseWriteExecutor.execute(() ->{


// Populate the database in the background.
// If you want to start with more words, just add them.

    });

    }
    };
}
