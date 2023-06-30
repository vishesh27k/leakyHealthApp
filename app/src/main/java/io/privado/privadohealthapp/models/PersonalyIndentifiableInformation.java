package io.privado.privadohealthapp.models;

public class PersonalyIndentifiableInformation {
    public String getWlanMac() {
        return wlanMac;
    }

    public void setWlanMac(String wlanMac) {
        this.wlanMac = wlanMac;
    }

    public String getEthernetMac() {
        return ethernetMac;
    }

    public void setEthernetMac(String ethernetMac) {
        this.ethernetMac = ethernetMac;
    }

    public String getIpAddressv4() {
        return ipAddressv4;
    }

    public void setIpAddressv4(String ipAddressv4) {
        this.ipAddressv4 = ipAddressv4;
    }

    public String getIpAddressv6() {
        return ipAddressv6;
    }

    public void setIpAddressv6(String ipAddressv6) {
        this.ipAddressv6 = ipAddressv6;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "wlanMac='" + wlanMac + '\'' +
                ", ethernetMac='" + ethernetMac + '\'' +
                ", ipAddressv4='" + ipAddressv4 + '\'' +
                ", ipAddressv6='" + ipAddressv6 + '\'' +
                ", imei='" + imei + '\'' +
                ", adId='" + adId + '\'' +
                '}';
    }

    String wlanMac = "";
    String ethernetMac = "";
    String ipAddressv4 = ""; // IPv4
    String ipAddressv6 = ""; // IPv6
    String imei = "";
    String adId = "";

    public PersonalyIndentifiableInformation(String wlanMac, String ethernetMac, String ipAddressv4, String ipAddressv6, String imei, String adId) {
        this.wlanMac = wlanMac;
        this.ethernetMac = ethernetMac;
        this.ipAddressv4 = ipAddressv4;
        this.ipAddressv6 = ipAddressv6;
        this.imei = imei;
        this.adId = adId;
    }


}
