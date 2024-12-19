package com.example.myapplication;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Delete;
import androidx.room.Update;

import java.util.List;

public class MyViewModel extends AndroidViewModel {
    AllRepository repository;
    public MyViewModel(@NonNull Application application) {
        super(application);
        repository=new AllRepository(application);
    }
    public void insertuser(User user){
        repository.insertuser(user);

    }

    public void updateuser(User user){
        repository.updateuser(user);


    }


    public void deleteuser(User user){
        repository.deleteuser(user);

    }

    LiveData<List<User>> getAllUser(int id){
        return repository.getAllUser(id);

    }

    public void insertAdmin(Admin admin){
        repository.insertAdmin(admin);

    }

    public void updateAdmin(Admin admin){
        repository.updateAdmin(admin);

    }

    public void deleteAdmin(Admin admin){
        repository.deleteAdmin(admin);

    }


    LiveData <List<Admin>>getAdminByEmail(String email){
        return repository.getAdminByEmail(email);

    }

    public void insertCourse(Course course){
        repository.insertCourse(course);

    }

    public void updateCourse(Course course){
        repository.updateCourse(course);
     ;
    }

    public void deleteCourse(Course course){
        repository.deleteCourse(course);

    }


    LiveData <List<Course>> getCoursesByCategory(int categoryId){
        return repository.getCoursesByCategory(categoryId);
    }

    public void insertCategories(Categories category){
        repository.insertCategories(category);

    }

    @Update
    public void updateCategories(Categories category){
        repository.updateCategories(category);

    }

    @Delete
    public void deleteCategories(Categories category){
        repository.deleteCategories(category);

    }

    LiveData <List<Categories>> getAllCategories(){
        return repository.getAllCategories(categoryDao);

    }

    public void insertLesson(Lesson lesson){
        repository.insertLesson(lesson);

    }

    public void updateLesson(Lesson lesson){
        repository.updateLesson(lesson);

    }

    public void deleteLesson(Lesson lesson){
        repository.deleteLesson(lesson);

    }

    LiveData <List<Lesson>> getLessonsByCourseId(int courseId){
        return repository.getLessonsByCourseId(courseId);

    }

    public void insertBookmark(Bookmark bookmark){
        repository.insertBookmark(bookmark);

    }


    public void deleteBookmark(Bookmark bookmark){
        repository.deleteBookmark(bookmark);

    }


    LiveData <List<Bookmark>> getBookmarksByUserId(int userId,int courseId){
        return   repository.getBookmarksByUserId(userId);

    }

    public void insertEnrollment(Enrollment enrollment){
        repository.insertEnrollment(enrollment);

    }


    public void updateEnrollment(Enrollment enrollment){
        repository.updateEnrollment(enrollment);

    }


    public void deleteEnrollment(Enrollment enrollment){
        repository.deleteEnrollment(enrollment);

    }

    LiveData <List<Enrollment>> getEnrollmentsByUserId(int userId,int courseId){
        return repository.getEnrollmentsByUserId(userId);

    }
}
