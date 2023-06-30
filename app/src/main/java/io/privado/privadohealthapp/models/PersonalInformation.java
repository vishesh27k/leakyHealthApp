package io.privado.privadohealthapp.models;

public class PersonalInformation {
    public String getTherapyTaken() {
        return therapyTaken;
    }

    public void setTherapyTaken(String therapyTaken) {
        this.therapyTaken = therapyTaken;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFinancialStatus() {
        return financialStatus;
    }

    public void setFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "therapyTaken='" + therapyTaken + '\'' +
                ", gender='" + gender + '\'' +
                ", financialStatus='" + financialStatus + '\'' +
                '}';
    }

    String therapyTaken;
    String gender;

    public PersonalInformation(String therapyTaken, String gender, String financialStatus) {
        this.therapyTaken = therapyTaken;
        this.gender = gender;
        this.financialStatus = financialStatus;
    }

    String financialStatus;
}
