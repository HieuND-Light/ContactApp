package com.hieund.contactapp;

public class ItemModel {
    private String textThumb;
    private String textTitle;
    private String phone;
    private String mail;
    private String address;

    public ItemModel(String textThumb, String textTitle, String phone, String mail, String address) {
        this.textThumb = textThumb;
        this.textTitle = textTitle;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
    }

    public String getTextThumb() {
        return String.valueOf(getTextTitle().toUpperCase().charAt(0));
    }

    public void setTextThumb(String textThumb) {
        this.textThumb = textThumb;
    }

    public String getTextTitle() {
        return textTitle;
    }

    public void setTextTitle(String textTitle) {
        this.textTitle = textTitle;
    }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public String getMail() { return mail; }

    public void setMail(String mail) { this.mail = mail; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }
}