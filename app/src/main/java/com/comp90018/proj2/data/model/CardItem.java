package com.comp90018.proj2.data.model;

import com.google.firebase.Timestamp;
import com.google.firebase.firestore.GeoPoint;
import com.google.firebase.storage.StorageReference;

public class CardItem {

    // TODO: userid contains all
    private String userId;
    private String postId;

    private StorageReference img;
    private String titles;
    private int headsIcon;
    private String usernames;
    private Timestamp postTime;
    private String postSpecies;
    private String postType;

    // set a default value which is unsolved
    private int postFlag;

    // TODO: need to read from db as Coordinates to do calculate or??
    private GeoPoint point;

    public Timestamp getPostTime() {
        return postTime;
    }

    public void setPostTime(Timestamp postTime) {
        this.postTime = postTime;
    }


    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public int getPostFlag() {
        return postFlag;
    }

    public void setPostFlag(int postFlag) {
        this.postFlag = postFlag;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public GeoPoint getPoint() {
        return point;
    }

    public void setPoint(GeoPoint point) {
        this.point = point;
    }

    public StorageReference getImg() {
        return img;
    }

    public void setImg(StorageReference img) {
        this.img = img;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public int getHeadsIcon() {
        return headsIcon;
    }

    public void setHeadsIcon(int headsIcon) {
        this.headsIcon = headsIcon;
    }

    public String getUsernames() {
        return usernames;
    }

    public void setUsernames(String usernames) {
        this.usernames = usernames;
    }


}
