package com.example.android.tourguide;

public class Tour {
    private String description;
    private String head;
    private String photoUrl;
    private String location;
    private String contact;

    public Tour() {
    }

    public Tour(String head, String description, String photoUrl, String location, String contact) {
        this.description = description;
        this.head = head;
        this.contact = contact;
        this.location = location;
        switch (this.photoUrl = photoUrl) {
        }
    }

    public String getDescription() {
        return description;
    }


    public String getHead() {
        return head;
    }

     public String getLocation(){
         return location;
     }

     public String getContact(){
         return contact;
     }

    public Tour(String s, String head, String description) {
        this.description = description;
        this.head = head;
    }

    public Tour(String s, String toString, String string, String s1, String toString1, String string1) {

    }

    public String getPhotoUrl() {
        return photoUrl;
    }


}
