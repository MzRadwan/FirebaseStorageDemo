package com.example.firebasestoragedemo;

public class Upload {

    private String mName, mImageUrl;

    public Upload(){
        //empty constructor
    }

    public Upload(String name, String imageUrl){
        if(name.trim().equals("")) {
            name = "No name";
        }

        mName = name;
        mImageUrl = imageUrl;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
