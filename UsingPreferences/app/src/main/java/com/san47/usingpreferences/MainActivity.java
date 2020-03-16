package com.san47.usingpreferences;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickLoad(View view){
        Intent i = new Intent("com.san47.usingpreferences.AppPreferenceActivity");
        startActivity(i);
    }
    public void onClickDisplay(View view)
    {
        SharedPreferences appPrefs=
                getSharedPreferences(
                        "com.san47.usingpreferences_preferences", MODE_PRIVATE);
                DisplayText(appPrefs.getString("editTextPref",""));


    }
    public void onClickModify(View view){
        SharedPreferences appPrefs=
                getSharedPreferences(
                        "com.san47.usingpreferences_preferences", MODE_PRIVATE);
                SharedPreferences.Editor prefsEditor = appPrefs.edit();
                prefsEditor.putString("editTextPref",((EditText) findViewById(R.id.editText)).getText().toString());
                prefsEditor.commit();

    }
    private void DisplayText(String str){
        Toast.makeText(getBaseContext(),str,Toast.LENGTH_LONG).show();
    }
}
