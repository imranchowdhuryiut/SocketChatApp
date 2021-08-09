package com.imran.demo.movie.socketchatapp;

import io.realm.RealmObject;

/**
 * Created by Nitish Kumar on 14-12-2017.
 */

public class Message extends RealmObject {

    private int mType;
    private String mUsername;
    private String mMessage;
    
    public Message() {
    }

    public Message(int type,String message){
        this.mType=type;
        this.mMessage=message;
        this.mUsername=null;
    }
    public Message(int type,String username,String message){
        this.mType=type;
        this.mMessage=message;
        this.mUsername=username;
    }

    public int getmType() {
        return mType;
    }

    public String getmMessage() {
        return mMessage;
    }

    public String getmUsername() {
        return mUsername;
    }

    public void setmType(int mType) {
        this.mType = mType;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage;
    }

    public void setmUsername(String mUsername) {
        this.mUsername = mUsername;
    }
}
