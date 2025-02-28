package com.luv2code.springmvc.validationdemo.model;

import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @NotNull(message = "Last Name is required.")
    @Size(min = 1, message = "Last Name must be at least 1 character long.")
    private String lastName;

    @NotNull(message = "Free Passes is required.")
    @Min(value = 0, message = "Free Passes must be between 0 and 10.")
    @Max(value = 10, message = "Free Passes must be between 0 and 10.")
    private Integer freePasses;

    @NotNull(message = "Postal Code is required.")
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Postal Code must be 5 characters or digits.")
    private String postalCode;

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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
