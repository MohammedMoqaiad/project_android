package com.example.myapplication;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public class AllRepository {
     UserDao userDao;
    AdminDao adminDao;

   BookmarkDao bookmarkDao;
    CategoryDao categoryDao;
    CourseDao courseDao;
    EnrollmentDao enrollmentDao;
    LessonDao lessonDao;
    public AllRepository(Application application) {
        AppDataBase  dataBase= (AppDataBase) AppDataBase.roomDatabase(application);
        userDao= dataBase.userDao();
        adminDao=dataBase.adminDao();
        bookmarkDao=dataBase.bookmarkDao();
        categoryDao=dataBase.categoryDao();
        courseDao=dataBase.courseDao();
        enrollmentDao=dataBase.enrollmentDao();
        lessonDao=dataBase.lessonDao();

    }



    public void insertuser(User user){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
@Override
            public void run(){
userDao.insert(user);
}
});
    }

    public void updateuser(User user){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run(){
                userDao.update(user);
            }
        });

    }


    public void deleteuser(User user){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run(){
                userDao.delete(user);
            }
        });


    }

    LiveData <List<User>>getAllUser(int id){
       return userDao.getAllUser(id);

    }

   public void insertAdmin(Admin admin){
       AppDataBase.databaseWriteExecutor.execute(new Runnable(){
           @Override
           public void run(){
               adminDao.insert(admin);
           }
       });
   }

    public void updateAdmin(Admin admin){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run(){
                adminDao.update(admin);
            }
        });
    }

    public void deleteAdmin(Admin admin){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run(){
                adminDao.delete(admin);
            }
        });
    }


    LiveData <List<Admin>>getAdminByEmail(String email){
        return adminDao.getAdminByEmail(email);

    }

    public void insertCourse(Course course){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run(){
                courseDao.insert(course);
            }
        });
    }

    public void updateCourse(Course course){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run(){
                courseDao.update(course);
            }
        });
    }

    public void deleteCourse(Course course){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run(){
                courseDao.delete(course);
            }
        });
    }


    LiveData <List<Course>> getCoursesByCategory(int categoryId){
        return courseDao.getCoursesByCategory(categoryId);
    }

   public void insertCategories(Categories category){
       AppDataBase.databaseWriteExecutor.execute(new Runnable(){
           @Override
           public void run(){
               categoryDao.insert(category);
           }
       });
   }

    @Update
    public void updateCategories(Categories category){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run(){
                categoryDao.update(category);
            }
        });
    }

    @Delete
    public void deleteCategories(Categories category){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run(){
                categoryDao.delete(category);
            }
        });
    }


    LiveData <List<Categories>> getAllCategories(){
       return categoryDao.getAllCategories(categoryDao);

    }

   public void insertLesson(Lesson lesson){
       AppDataBase.databaseWriteExecutor.execute(new Runnable(){
           @Override
           public void run(){
               lessonDao.insert(lesson);
           }
       });
   }

    public void updateLesson(Lesson lesson){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run(){
                lessonDao.update(lesson);
            }
        });
    }

    public void deleteLesson(Lesson lesson){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run(){
                lessonDao.delete(lesson);
            }
        });
    }


    LiveData <List<Lesson>> getLessonsByCourseId(int courseId){
        return lessonDao.getLessonsByCourseId(courseId);

    }

    public void insertBookmark(Bookmark bookmark){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run(){
                bookmarkDao.insert(bookmark);
            }
        });
    }


    public void deleteBookmark(Bookmark bookmark){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run(){
                bookmarkDao.delete(bookmark);
            }
        });
    }


    LiveData <List<Bookmark>> getBookmarksByUserId(int userId,int courseId){
      return   bookmarkDao.getBookmarksByUserId(userId);
        return   bookmarkDao.getBookmarkByCourseId(courseId);
    }

    public void insertEnrollment(Enrollment enrollment){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run(){
                enrollmentDao.insert(enrollment);
            }
        });
    }


    public void updateEnrollment(Enrollment enrollment){
        AppDataBase.databaseWriteExecutor.execute(new Runnable(){
            @Override
            public void run(){
                enrollmentDao.update(enrollment);
            }
        });
    }


   public void deleteEnrollment(Enrollment enrollment){
       AppDataBase.databaseWriteExecutor.execute(new Runnable(){
           @Override
           public void run(){
               enrollmentDao.delete(enrollment);
           }
       });
   }


    LiveData <List<Enrollment>> getEnrollmentsByUserId(int userId,int courseId){
       return enrollmentDao.getEnrollmentsByUserId(userId);
        return enrollmentDao.getEnrollmentsByCourseId(courseId);

    }




}
