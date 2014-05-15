package com.firebase.androidchat;

/**
 * User: nick
 * Date: 
 * Time: 
 */
public class Place {

    private String name;
    private String description;


    // Required default constructor for Firebase object mapping
    @SuppressWarnings("unused")
    private Place() { }

    Place(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


}
