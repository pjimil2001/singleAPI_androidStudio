package com.example.jsontojava;

public class recyclemodel {
        int id;
        String name;
        String title;


public String getName() {
        return name;
        }

public void setName(String name) {
        this.name = name;

        }

public recyclemodel(int id,String name,String title){
        this.id= id;
        this.name= name;
        this.title = title;

        }

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
}
