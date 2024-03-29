package com.example.monicamamdouh.rxjavaparellerrequesttask.common.models.contacts;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Entity(tableName = "contact")
public class Contact {

    public int getIdTable() {
        return idTable;
    }

    public void setIdTable(int idTable) {
        this.idTable = idTable;
    }

    @PrimaryKey(autoGenerate = true)
    private int idTable;

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("gender")
    @Expose
    private String gender;
//    @SerializedName("phone")
//    @Expose
//    private Phone phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

//    public Phone getPhone() {
//        return phone;
//    }
//
//    public void setPhone(Phone phone) {
//        this.phone = phone;
//    }

}
