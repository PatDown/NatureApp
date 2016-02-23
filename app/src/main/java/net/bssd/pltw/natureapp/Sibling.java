package net.bssd.pltw.natureapp;

import org.json.JSONException;
import org.json.JSONObject;


public class Sibling extends FamilyMember {

    public int compareTo(FamilyMember familyMember) {
        if (this.mFirstName.equals(familyMember.getFirstName()) && this.mLastName.equals(familyMember.getLastName())) {
            return 0;
        }
        return 1;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject json = super.toJSON();
        return json;
    }

    public String toString() {
        return "Sibling: " + mFirstName + " " + mLastName;
    }

    public Sibling(){
        setRelation(super.SIBLING);
        setFirstName(" ");
        setLastName(" ");
    }

    public Sibling(String firstName, String lastName) {
        setRelation(super.SIBLING);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Sibling(JSONObject json) throws JSONException {
        setRelation(super.SIBLING);
        mFirstName = json.getString(JSON_FIRST_NAME);
        mLastName = json.getString(JSON_LAST_NAME);
    }
}
