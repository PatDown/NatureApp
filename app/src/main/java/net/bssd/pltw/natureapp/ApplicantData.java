package net.bssd.pltw.natureapp;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by wdumas on 6/25/2015.
 */
public interface ApplicantData {

    public static final int PROFILE = 0;
    public static final int FAMILY = 1;

    public JSONObject toJSON() throws JSONException;
}
