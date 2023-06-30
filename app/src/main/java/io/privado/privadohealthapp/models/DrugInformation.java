package io.privado.privadohealthapp.models;

public class DrugInformation {
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugQuantity() {
        return drugQuantity;
    }

    public void setDrugQuantity(String drugQuantity) {
        this.drugQuantity = drugQuantity;
    }

    public String getDrugCategory() {
        return drugCategory;
    }

    public void setDrugCategory(String drugCategory) {
        this.drugCategory = drugCategory;
    }

    public String getPurchaseCoupon() {
        return purchaseCoupon;
    }

    public void setPurchaseCoupon(String purchaseCoupon) {
        this.purchaseCoupon = purchaseCoupon;
    }

    public String getPharmacyId() {
        return PharmacyId;
    }

    public void setPharmacyId(String pharmacyId) {
        PharmacyId = pharmacyId;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    @Override
    public String toString() {
        return "DrugInformation{" +
                "drugName='" + drugName + '\'' +
                ", drugQuantity='" + drugQuantity + '\'' +
                ", drugCategory='" + drugCategory + '\'' +
                ", purchaseCoupon='" + purchaseCoupon + '\'' +
                ", PharmacyId='" + PharmacyId + '\'' +
                ", healthCondition='" + healthCondition + '\'' +
                '}';
    }

    String drugName;
    String drugQuantity;
    String drugCategory;
    String purchaseCoupon;
    String PharmacyId;

    public DrugInformation(String drugName, String drugQuantity, String drugCategory, String purchaseCoupon, String pharmacyId, String healthCondition) {
        this.drugName = drugName;
        this.drugQuantity = drugQuantity;
        this.drugCategory = drugCategory;
        this.purchaseCoupon = purchaseCoupon;
        PharmacyId = pharmacyId;
        this.healthCondition = healthCondition;
    }

    String healthCondition;
}
