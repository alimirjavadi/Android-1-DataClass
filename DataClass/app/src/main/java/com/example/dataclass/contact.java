package com.example.dataclass;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class contact implements Parcelable{

    private String name;
    private String family;

    public contact(String name, String family) {
        this.name = name;
        this.family = family;
    }

    protected contact(Parcel in) {
        name = in.readString();
        family = in.readString();
    }

    public static final Creator<contact> CREATOR = new Creator<contact>() {
        @Override
        public contact createFromParcel(Parcel in) {
            return new contact(in);
        }

        @Override
        public contact[] newArray(int size) {
            return new contact[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(family);
    }
}

