package io.privado.privadohealthapp.models;

public class PharmacyInformation {
    String drug;

    @Override
    public String toString() {
        return "PharmacyInformation{" +
                "drug='" + drug + '\'' +
                ", form='" + form + '\'' +
                ", pharmacyLocation='" + pharmacyLocation + '\'' +
                ", isCouponTaken='" + isCouponTaken + '\'' +
                '}';
    }

    String form;

    public String getDrug() {
        return drug;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getPharmacyLocation() {
        return pharmacyLocation;
    }

    public void setPharmacyLocation(String pharmacyLocation) {
        this.pharmacyLocation = pharmacyLocation;
    }

    public String getIsCouponTaken() {
        return isCouponTaken;
    }

    public void setIsCouponTaken(String isCouponTaken) {
        this.isCouponTaken = isCouponTaken;
    }

    String pharmacyLocation;

    public PharmacyInformation(String drug, String form, String pharmacyLocation, String isCouponTaken) {
        this.drug = drug;
        this.form = form;
        this.pharmacyLocation = pharmacyLocation;
        this.isCouponTaken = isCouponTaken;
    }

    String isCouponTaken;
}
