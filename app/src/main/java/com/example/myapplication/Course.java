package com.example.myapplication;


import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "courses",
            foreignKeys = @ForeignKey(entity = Categories.class,
                    parentColumns = "id",
                    childColumns = "categoryId",
                    onDelete = ForeignKey.CASCADE))
    public class Course {

        @PrimaryKey(autoGenerate = true)
        private int id;

        private String title;
        private String description;
        private String instructor;
        private double price;
        private int categoryId;


        public Course(String title, String description, String instructor, double price, int categoryId) {
            this.title = title;
            this.description = description;
            this.instructor = instructor;
            this.price = price;
            this.categoryId = categoryId;
        }

        // Getter and Setter methods
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getInstructor() {
            return instructor;
        }

        public void setInstructor(String instructor) {
            this.instructor = instructor;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getCategoryId() {
            return categoryId;
        }

        public void setCategoryId(int categoryId) {
            this.categoryId = categoryId;
        }
    }

