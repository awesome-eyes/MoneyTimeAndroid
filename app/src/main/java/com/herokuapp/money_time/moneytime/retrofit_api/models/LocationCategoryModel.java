package com.herokuapp.money_time.moneytime.retrofit_api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LocationCategoryModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     *
     */
    public LocationCategoryModel() {
    }

    /**
     *
     * @param id
     * @param name
     */
    public LocationCategoryModel(Integer id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
//        StringBuilder str = new StringBuilder("ID: " + this.id + "\nName: " +
//                this.name + "\n");
        StringBuilder str = new StringBuilder(this.name + "\n");
        return str.toString();
    }
}