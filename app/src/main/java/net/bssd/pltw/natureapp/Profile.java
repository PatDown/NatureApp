package net.bssd.pltw.natureapp;



import android.content.Context;
import android.os.Environment;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.lang.String;import java.lang.System;import java.text.DateFormat;
import java.util.Date;


public class Profile implements ApplicantData{
    private static final String JSON_FIRST_NAME = "firstName";
    private static final String JSON_LAST_NAME = "lastName";
    private static final String JSON_DOB = "dob";


    private String mFirstName;
    private String mLastName;
    private Date mDateOfBirth;


    private String getPhotoFilename() {
        return "IMG_PROFILE.jpg";
    }
    private String getVideoFilename(){
        return "IMG_VIDEO.jpg";
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public Date getDateOfBirth() {
        return mDateOfBirth;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(JSON_FIRST_NAME, mFirstName);
        json.put(JSON_LAST_NAME, mLastName);
        json.put(JSON_DOB, mDateOfBirth.getTime());
        System.out.println("Date of Birth Saved: " + mDateOfBirth);
        return json;
    }

    public String dobToString() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        return df.format(mDateOfBirth.getTime());
    }

    public void setmDateOfBirth(Date mDateOfBirth) {
        this.mDateOfBirth = mDateOfBirth;
    }

    public Profile() {
        mFirstName = new String("Patrick");
        mLastName = new String("Downton");
        mDateOfBirth = new Date(99, 5, 20);
    }

    public Profile(JSONObject json) throws JSONException {
        mFirstName = json.getString(JSON_FIRST_NAME);
        mLastName = json.getString(JSON_LAST_NAME);
        mDateOfBirth = new Date(json.getLong(JSON_DOB));
    }
    public File getPhotoFile(Context context) {
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (externalFilesDir==null){
            return null;
        }
        return new File(externalFilesDir, getPhotoFilename());
    }
    public File getPackageManager(Context context) {
        File packageManager = context.getExternalFilesDir(Environment.DIRECTORY_DCIM) ;
        if (packageManager==null){
            return null;
        }
        return new File(packageManager, getVideoFilename());
    }
    public String toString() {
        return mFirstName + " " + mLastName + " " + mDateOfBirth.getTime();
    }

    //new in 1.4.1


}
