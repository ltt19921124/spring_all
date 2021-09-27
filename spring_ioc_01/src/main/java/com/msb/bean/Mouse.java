package com.msb.bean;

import java.util.Date;

public class Mouse {
    private String name;
    private Date birthDate;

    public Mouse() {
    }

    public Mouse(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
