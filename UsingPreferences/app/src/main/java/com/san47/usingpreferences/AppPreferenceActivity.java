package com.san47.usingpreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import java.util.List;
public class AppPreferenceActivity extends PreferenceActivity{
    @Override
    public void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
    }
    @Override
    public void onBuildHeaders(List<Header>target){
        loadHeadersFromResource(R.xml.prefheaders,target);
    }
    @Override
    protected boolean isValidFragment(String fragmentName) {
        return true;
    }
    public static class PrefFragment extends PreferenceFragment{
    @Override
        public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        PreferenceManager.setDefaultValues(getActivity(),R.xml.myapppreferences,false);
        addPreferencesFromResource(R.xml.myapppreferences);
    }
    }


}