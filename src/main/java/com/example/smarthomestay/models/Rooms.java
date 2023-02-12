package com.example.smarthomestay.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "rooms")
public class Rooms implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String room_number;
    private int room_type_id;
    private String information;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rooms id(int id) {
        setId(id);
        return this;
    }

    public String getRoom_number() {
        return this.room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public Rooms room_number(String room_number) {
        setRoom_number(room_number);
        return this;
    }

    public int getRoom_type_id() {
        return this.room_type_id;
    }

    public void setRoom_type_id(int room_type_id) {
        this.room_type_id = room_type_id;
    }

    public Rooms room_type_id(int room_type_id) {
        setRoom_type_id(room_type_id);
        return this;
    }

    public String getInformation() {
        return this.information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Rooms information(String information) {
        setInformation(information);
        return this;
    }

    @Override
    public String toString() {
        return "UsersVO  [id=" + id + ", room_number=" + room_number + ", room_type_id=" + room_type_id + ", information=" + information + "]";
    }
}
