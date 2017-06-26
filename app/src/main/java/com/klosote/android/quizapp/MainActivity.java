package com.klosote.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.android.quizapp.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        AdView mAdView = (AdView) findViewById(R.id.adViewMain);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }




    public void begin(View view) {

        EditText edittext = (EditText) findViewById(R.id.name);
        RadioButton five = (RadioButton) findViewById(R.id.Q4Quest);
        RadioButton eight = (RadioButton) findViewById(R.id.Q5Quest);
        RadioButton ten = (RadioButton) findViewById(R.id.Q6Quest);

        int nQuestions = 0;

        Context context = getApplicationContext();

        if (five.isChecked()) {
            nQuestions = 5;
            Toast.makeText(context, R.string.chooseEasy, Toast.LENGTH_LONG).show();
        } else if (eight.isChecked()) {
            nQuestions = 10;
            Toast.makeText(context, R.string.chooseMed, Toast.LENGTH_LONG).show();
        } else if (ten.isChecked()) {
            nQuestions = 20;
            Toast.makeText(context, R.string.chooseHard, Toast.LENGTH_LONG).show();
        } else {
            //Sends a warning to select the number of Questions
            Toast.makeText(context, R.string.chooseQ, Toast.LENGTH_LONG).show();

        }

        if (nQuestions != 0) {

            String name = edittext.getText().toString();
            name = name.trim();
            intent = new Intent(this, CategorySelection.class);
            intent.putExtra("Name", name);
            intent.putExtra("nQuestions", nQuestions);
            startActivity(intent);
        }

    }
}