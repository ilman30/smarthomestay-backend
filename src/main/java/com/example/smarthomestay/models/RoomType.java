package com.example.smarthomestay.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "room_type")
public class RoomType implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type_name;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoomType id(int id) {
        setId(id);
        return this;
    }

    public String getType_name() {
        return this.type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public RoomType type_name(String type_name) {
        setType_name(type_name);
        return this;
    }

    @Override
    public String toString() {
        return "UsersVO  [id=" + id + ", type_name=" + type_name + "]";
    }

}
