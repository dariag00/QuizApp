package com.klosote.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Toast;

import com.example.android.quizapp.R;

import java.util.ArrayList;
import java.util.Random;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

/**
 * Created by Diego on 10/04/2017.
 */

public class EnterQuestions extends AppCompatActivity{


    ArrayList<Integer> list;
    ArrayList<Integer> selected;
    String categ;
    int corrAns;
    int nQ;
    String name;

    float maxH, maxS, maxVG, maxE, maxSpt, maxG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        categ = getIntent().getStringExtra("Category");
        nQ = getIntent().getIntExtra("nQuestions",0);
        name = getIntent().getStringExtra("Name");
        maxH = getIntent().getFloatExtra("hisP", 0);
        maxS = getIntent().getFloatExtra("sciP", 0);
        maxG = getIntent().getFloatExtra("geoP", 0);
        maxSpt = getIntent().getFloatExtra("spoP", 0);
        maxE = getIntent().getFloatExtra("entP", 0);
        maxVG = getIntent().getFloatExtra("vgP", 0);

        super.onCreate(savedInstanceState);

        setTheme(R.style.EntrButtonStyle);

        setContentView(R.layout.enter_questions);

        ScrollView scQ = (ScrollView) findViewById(R.id.scrollQuestions);
        scQ.setBackgroundColor(Color.parseColor("#e00daf"));

        Button cont = (Button) findViewById(R.id.continueAc);
        cont.setVisibility(GONE);

        //Entertainment Questions
        CardView e1  = (CardView) findViewById(R.id.e1);
        CardView e2  = (CardView) findViewById(R.id.e2);
        CardView e3  = (CardView) findViewById(R.id.e3);
        CardView e4  = (CardView) findViewById(R.id.e4);
        CardView e5  = (CardView) findViewById(R.id.e5);
        CardView e6  = (CardView) findViewById(R.id.e6);

        e1.setVisibility(GONE);
        e2.setVisibility(GONE);
        e3.setVisibility(GONE);
        e4.setVisibility(GONE);
        e5.setVisibility(GONE);
        e6.setVisibility(GONE);

        chooseRandomQuestions(nQ,6);

        for(int el : selected){
            switch (el){
                case 1:
                    e1.setVisibility(VISIBLE);
                    break;
                case 2:
                    e2.setVisibility(VISIBLE);
                    break;
                case 3:
                    e3.setVisibility(VISIBLE);
                    break;
                case 4:
                    e4.setVisibility(VISIBLE);
                    break;
                case 5:
                    e5.setVisibility(VISIBLE);
                    break;
                case 6:
                    e6.setVisibility(VISIBLE);
                    break;
            }
        }

    }

    public void submit(View view){


        Button cont = (Button) findViewById(R.id.continueAc);
        cont.setVisibility(View.VISIBLE);
        view.setVisibility(GONE);

        CardView e1  = (CardView) findViewById(R.id.e1);
        CardView e2  = (CardView) findViewById(R.id.e2);
        CardView e3  = (CardView) findViewById(R.id.e3);
        CardView e4  = (CardView) findViewById(R.id.e4);
        CardView e5  = (CardView) findViewById(R.id.e5);
        CardView e6  = (CardView) findViewById(R.id.e6);

        if(e1.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.e1a);
            RadioButton b = (RadioButton) findViewById(R.id.e1b);
            RadioButton c = (RadioButton) findViewById(R.id.e1c);
            RadioButton d = (RadioButton) findViewById(R.id.e1d);

            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                corrAns ++;
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(e2.getVisibility() == VISIBLE){
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e2a);
            RadioButton b = (RadioButton) findViewById(R.id.e2b);
            RadioButton c = (RadioButton) findViewById(R.id.e2c);
            RadioButton d = (RadioButton) findViewById(R.id.e2d);

            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(e3.getVisibility() == VISIBLE){
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e3a);
            RadioButton b = (RadioButton) findViewById(R.id.e3b);
            RadioButton c = (RadioButton) findViewById(R.id.e3c);
            RadioButton d = (RadioButton) findViewById(R.id.e3d);

            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(e4.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.e4a);
            RadioButton b = (RadioButton) findViewById(R.id.e4b);
            RadioButton c = (RadioButton) findViewById(R.id.e4c);
            RadioButton d = (RadioButton) findViewById(R.id.e4d);

            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                corrAns ++;
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(e5.getVisibility() == VISIBLE){
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e5a);
            RadioButton b = (RadioButton) findViewById(R.id.e5b);
            RadioButton c = (RadioButton) findViewById(R.id.e5c);
            RadioButton d = (RadioButton) findViewById(R.id.e5d);

            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(e6.getVisibility() == VISIBLE){
            //Solution is a
            RadioButton a = (RadioButton) findViewById(R.id.e6a);
            RadioButton b = (RadioButton) findViewById(R.id.e6b);
            RadioButton c = (RadioButton) findViewById(R.id.e6c);
            RadioButton d = (RadioButton) findViewById(R.id.e6d);

            a.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                corrAns ++;
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }


        Context context = getApplicationContext();
        Toast.makeText(context,"Has respondido a "+ corrAns + " correctamente.", Toast.LENGTH_LONG).show();
    }

    public void continueAc(View view){

        Intent intent = new Intent(this, FinalActivity.class);
        intent.putExtra("Category", categ);
        Log.v("nQ", String.valueOf(nQ));
        intent.putExtra("nQuestions", nQ);
        intent.putExtra("nCorrect", corrAns);
        intent.putExtra("Name", name);
        intent.putExtra("hisP", maxH);
        intent.putExtra("sciP", maxS);
        intent.putExtra("geoP", maxG);
        intent.putExtra("entP", maxE);
        intent.putExtra("spoP", maxSpt);
        intent.putExtra("vgP", maxVG);
        startActivity(intent);

    }

    public void chooseRandomQuestions(int size, int nQuestions){

        list = new ArrayList<Integer>(nQuestions); //ArrayList to store n of desired Questions
        selected = new ArrayList<Integer>(size); //ArrayList to store the number of the questions

        for(int i = 1; i <= nQuestions; i++) {
            list.add(i);
        }

        Random rand = new Random();
        while(list.size() > nQuestions-size) {
            int index = rand.nextInt(list.size()); //Remove one object of the list
            selected.add(list.remove(index)); //Thats the question that we´ve obtained
        }

    }
}
