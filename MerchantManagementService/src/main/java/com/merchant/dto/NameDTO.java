package com.merchant.dto;

import com.merchant.entity.Name;

import javax.validation.constraints.Pattern;

public class NameDTO {

    @Pattern(regexp = "^[a-zA-Z ]{1,25}$", message = "${merchant.name.firstName.invalid}")
    private String firstName;
    @Pattern(regexp = "^[a-zA-Z ]{1,25}$", message = "${merchant.name.lastName.invalid}")
    private String lastName;

    public static NameDTO valueOf(Name name) {
        NameDTO nameDTO = new NameDTO();
        nameDTO.setFirstName(name.getFirstName());
        nameDTO.setLastName(name.getLastName());

        return nameDTO;
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

    @Override
    public String toString() {
        return "NameDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
