package com.example.myapplication;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Categories {


        @PrimaryKey(autoGenerate = true)
        private int id;

        private String name;
        private String image;

    public Categories(String name,String image) {
        this.name = name;
        this.image = image;
    }


        public int getId() {
        return id;
    }

        public void setId(int id) {
        this.id = id;
    }

        public String getName() {
        return name;
    }

        public void setName(String name) {
        this.name = name;
    }

        public String getImage() {
        return image;
    }

        public void setImage(String image) {
        this.image = image;
    }
    }

