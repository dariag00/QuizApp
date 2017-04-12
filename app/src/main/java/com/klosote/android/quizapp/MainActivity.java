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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void begin(View view){

        EditText edittext = (EditText) findViewById(R.id.name);
        RadioButton four = (RadioButton)  findViewById(R.id.Q4Quest);
        RadioButton five = (RadioButton)  findViewById(R.id.Q5Quest);
        RadioButton six = (RadioButton)  findViewById(R.id.Q6Quest);

        int nQuestions = 0;

        if(four.isChecked()){
            nQuestions = 4;
        }else if(five.isChecked()){
            nQuestions = 5;
        }else if(six.isChecked()){
            nQuestions = 6;
        }else{
            //Sends a warning to select the number of Questions
            Context context = getApplicationContext();
            Toast.makeText(context,R.string.chooseQ, Toast.LENGTH_LONG).show();

        }

        if(nQuestions != 0){
            String name = edittext.getText().toString();
            name = name.trim();
            Intent intent = new Intent(this, CategorySelection.class);
            intent.putExtra("Name", name);
            intent.putExtra("nQuestions", nQuestions);
            startActivity(intent);
        }

    }
}
