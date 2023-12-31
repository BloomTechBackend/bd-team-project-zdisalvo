package com.amazon.ata.crm.service.models.requests;

import com.amazon.ata.crm.service.dynamodb.models.LogNote;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class UpdateClientRequest {

    private String id;
    private String firstName;
    private String lastName;
    private String company;
    private String phone;
    private String email;
    private String textBox;
    private LinkedList<LogNote> logNotes;

    public UpdateClientRequest() {

    }

    public UpdateClientRequest(UpdateClientRequest.Builder builder) {

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
        if (!(o instanceof UpdateClientRequest)) return false;
        UpdateClientRequest that = (UpdateClientRequest) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getFirstName(), that.getFirstName()) && Objects.equals(getLastName(), that.getLastName()) && Objects.equals(getCompany(), that.getCompany()) && Objects.equals(getPhone(), that.getPhone()) && Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getCompany(), getPhone(), getEmail());
    }

    @Override
    public String toString() {
        return "UpdateClientRequest{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
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


        private Builder() {

        }

        public UpdateClientRequest.Builder withId(String idToUse) {
            this.id = idToUse;
            return this;
        }

        public UpdateClientRequest.Builder withFirstName(String firstNameToUse) {
            this.firstName = firstNameToUse;
            return this;
        }

        public UpdateClientRequest.Builder withLastName(String lastNameToUse) {
            this.lastName = lastNameToUse;
            return this;
        }

        public UpdateClientRequest.Builder withCompany(String companyToUse) {
            this.company = companyToUse;
            return this;
        }

        public UpdateClientRequest.Builder withPhone(String phoneToUse) {
            this.phone = phoneToUse;
            return this;
        }

        public UpdateClientRequest.Builder withEmail(String emailToUse) {
            this.email = emailToUse;
            return this;
        }

        public UpdateClientRequest.Builder withTextBox(String textBoxToUse) {
            this.textBox = textBoxToUse;
            return this;
        }

        public UpdateClientRequest.Builder withLogNotes(LinkedList<LogNote> logNotesToUse) {
            this.logNotes = logNotesToUse;
            return this;
        }

        public UpdateClientRequest build() {
            return new UpdateClientRequest(this);
        }
    }

}
