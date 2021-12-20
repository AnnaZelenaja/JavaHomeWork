package com.pb.zelenaja.hw12;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Contacts implements Serializable {
    private String name;
    private LocalDate dateOfBirth;
    ArrayList<String> phone = new ArrayList<>();
    private String address;
    private LocalDateTime dateOfModif;

    public Contacts() {
    }

    public Contacts(String name, LocalDate dateOfBirth, ArrayList<String> phoneList, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phone = phoneList;
        this.address = address;
        this.dateOfModif = LocalDateTime.now();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<String> getPhone() {
        return phone;
    }

    public void setPhone(ArrayList<String> phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getDateOfModif() {
        return dateOfModif;
    }

    public void setDateOfModif(LocalDateTime dateOfModif) {
        this.dateOfModif = dateOfModif;
    }


    @Override
    public String toString() {
        return  "Contacts{" +
                "ФИО='" + name + '\'' +
                ", День рождения=" + dateOfBirth +
                ", номер телефона='" + phone + '\'' +
                ", адресс='" + address + '\'' +
                ", дата/время редактирования=" + dateOfModif +
                '}'+'\n';
    }
}