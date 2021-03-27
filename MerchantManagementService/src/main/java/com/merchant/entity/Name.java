package com.merchant.entity;

import com.merchant.dto.NameDTO;

import javax.persistence.Embeddable;

@Embeddable
public class Name {

    private String firstName;
    private String lastName;

    public static Name valueOf(NameDTO nameDTO) {
        Name name = new Name();
        name.setFirstName(nameDTO.getFirstName());
        name.setLastName(nameDTO.getLastName());
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
