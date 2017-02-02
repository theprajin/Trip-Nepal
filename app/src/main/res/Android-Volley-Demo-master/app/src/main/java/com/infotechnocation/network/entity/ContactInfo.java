package com.infotechnocation.network.entity;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Prajin Bajracharya on 12/27/2016.
 */

public class ContactInfo {
    @SerializedName("contacts")
    ArrayList<Contact> contactList;

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }
}
