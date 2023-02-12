package com.example.smarthomestay.models;

import java.io.Serializable;
import java.text.SimpleDateFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bills")
public class Bills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bill_number;
    private String date;
    private String room_number;
    private int room_type_id;
    private int check_in_status;
    private String date_checked_in;
    private String date_checked_out;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bills id(int id) {
        setId(id);
        return this;
    }

    public String getBill_number() {
        return this.bill_number;
    }

    public void setBill_number(String bill_number) {
        this.bill_number = bill_number;
    }

    public Bills bill_number(String bill_number) {
        setBill_number(bill_number);
        return this;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Bills date(String date) {
        setDate(date);
        return this;
    }

    public String getRoom_number() {
        return this.room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public Bills room_number(String room_number) {
        setRoom_number(room_number);
        return this;
    }

    public int getRoom_type_id() {
        return this.room_type_id;
    }

    public void setRoom_type_id(int room_type_id) {
        this.room_type_id = room_type_id;
    }

    public Bills room_type_id(int room_type_id) {
        setRoom_type_id(room_type_id);
        return this;
    }

    public int getCheck_in_status() {
        return this.check_in_status;
    }

    public void setCheck_in_status(int check_in_status) {
        this.check_in_status = check_in_status;
    }

    public Bills check_in_status(int check_in_status) {
        setCheck_in_status(check_in_status);
        return this;
    }

    public String getDate_checked_in() {
        return this.date_checked_in;
    }

    public void setDate_checked_in(String date_checked_in) {
        this.date_checked_in = date_checked_in;
    }

    public Bills date_checked_in(String date_checked_in) {
        setDate_checked_in(date_checked_in);
        return this;
    }

    public String getDate_checked_out() {
        return this.date_checked_out;
    }

    public void setDate_checked_out(String date_checked_out) {
        this.date_checked_out = date_checked_out;
    }

    public Bills date_checked_out(String date_checked_out) {
        setDate_checked_out(date_checked_out);
        return this;
    }
    
    @Override
    public String toString() {
        return "BillsVO  [id=" + id + ", bill_number=" + bill_number + ", date=" + date + ", room_number=" + room_number + 
        ", room_type_id=" + room_type_id + ", check_in_status=" + check_in_status + ", date_checked_in=" + date_checked_in + 
        ", date_checked_out=" + date_checked_out + "]";
    }

}
