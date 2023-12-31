package com.amazon.ata.crm.service.models;

import com.amazon.ata.crm.service.dynamodb.models.LogNote;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

//TODO - Do I need to have List<LogNote> logNotes included in this builder?
public class ClientModel {

    private String id;
    private String firstName;
    private String lastName;
    private String company;
    private String phone;
    private String email;
    private String textBox;
    private LinkedList<LogNote> logNotes;

    public ClientModel() {}

    public ClientModel(Builder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.company = builder.company;
        this.phone = builder.phone;
        this.email = builder.email;
        this.textBox = builder.textBox;
        this.logNotes = builder.logNotes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTextBox() {
        return textBox;
    }

    public void setTextBox(String textBox) {
        this.textBox = textBox;
    }

    public LinkedList<LogNote> getLogNotes() {
        return logNotes;
    }

    public void setLogNotes(LinkedList<LogNote> logNotes) {
        this.logNotes = logNotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientModel)) return false;
        ClientModel that = (ClientModel) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getLastName(), that.getLastName()) && Objects.equals(getCompany(), that.getCompany()) && Objects.equals(getPhone(), that.getPhone()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getTextBox(), that.getTextBox());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getCompany(), getPhone(), getEmail(), getTextBox());
    }

    @Override
    public String toString() {
        return "ClientModel{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", textBox='" + textBox + '\'' +
                '}';
    }

    public static Builder builder() {return new Builder();}

    public static final class Builder {

        private String id;
        private String firstName;
        private String lastName;
        private String company;
        private String phone;
        private String email;
        private String textBox;
        private LinkedList<LogNote> logNotes;

        public Builder withId (String idToUse) {
            this.id = idToUse;
            return this;
        }

        public Builder withFirstName (String firstNameToUse) {
            this.firstName = firstNameToUse;
            return this;
        }

        public Builder withLastName (String lastNameToUse) {
            this.lastName = lastNameToUse;
            return this;
        }

        public Builder withCompany (String companyToUse) {
            this.company = companyToUse;
            return this;
        }

        public Builder withPhone (String phoneToUse) {
            this.phone = phoneToUse;
            return this;
        }

        public Builder withEmail (String emailToUse) {
            this.email = emailToUse;
            return this;
        }

        public Builder withTextBox (String textBoxToUse) {
            this.textBox = textBoxToUse;
            return this;
        }

        public Builder withLogNotes (LinkedList<LogNote> logNotesToUse) {
            this.logNotes = logNotesToUse;
            return this;
        }

        public ClientModel build() {return new ClientModel(this);}

    }
}
