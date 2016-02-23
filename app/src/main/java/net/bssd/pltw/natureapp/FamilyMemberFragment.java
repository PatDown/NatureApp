package net.bssd.pltw.natureapp;

import android.support.v4.app.Fragment;
import android.widget.EditText;
import android.widget.TextView;


public abstract class FamilyMemberFragment extends Fragment {

    private static final String TAG = "FamilyMemberFragment";

    protected TextView mFirstName;
    protected EditText mEnterFirstName;
    protected TextView mLastName;
    protected EditText mEnterLastName;

}
