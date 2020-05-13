package com.suryoatmojo.goexbi;

import android.os.Parcel;
import android.os.Parcelable;

public class UserItem implements Parcelable{

    private String no_pendaftaran, username;

    public UserItem(String no_pendaftaran, String username ) {
        this.no_pendaftaran = no_pendaftaran;
        this.username = username;
    }


    public String getNo() {
        return no_pendaftaran;
    }

    public String getName() {
        return username;
    }

    public void setNo(String no_pendaftaran) {
        this.no_pendaftaran = no_pendaftaran;
    }

    public void setName(String username) {
        this.username = username;
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.no_pendaftaran);
        parcel.writeString(this.username);
    }

    public UserItem(){
    }

    protected UserItem(Parcel in ){
        this.no_pendaftaran = in.readString();
        this.username = in.readString();
    }

    public static final Parcelable.Creator<UserItem> CREATOR = new Parcelable.Creator<UserItem>(){

        @Override
        public UserItem createFromParcel(Parcel source) {
            return new UserItem(source);
        }

        @Override
        public UserItem[] newArray(int size) {
            return new UserItem[size];
        }
    };
}
