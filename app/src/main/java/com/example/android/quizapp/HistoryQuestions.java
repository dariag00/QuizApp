package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

/**
 * Created by Diego on 10/04/2017.
 */

public class HistoryQuestions extends AppCompatActivity{

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

        setTheme(R.style.HistButtonStyle);

        setContentView(R.layout.history_questions);

        ScrollView scQ = (ScrollView) findViewById(R.id.scrollQuestions);
        scQ.setBackgroundColor(Color.parseColor("#4286f4"));

        Button cont = (Button) findViewById(R.id.continueAc);
        cont.setVisibility(GONE);

        CardView h1  = (CardView) findViewById(R.id.hist1);
        CardView h2  = (CardView) findViewById(R.id.hist2);
        CardView h3  = (CardView) findViewById(R.id.hist3);
        CardView h4  = (CardView) findViewById(R.id.hist4);
        CardView h5  = (CardView) findViewById(R.id.hist5);
        CardView h6  = (CardView) findViewById(R.id.hist6);
        CardView h7  = (CardView) findViewById(R.id.hist7);
        CardView h8  = (CardView) findViewById(R.id.hist8);

        h1.setVisibility(GONE);
        h2.setVisibility(GONE);
        h3.setVisibility(GONE);
        h4.setVisibility(GONE);
        h5.setVisibility(GONE);
        h6.setVisibility(GONE);
        h7.setVisibility(GONE);
        h8.setVisibility(GONE);


        chooseRandomQuestions(nQ,8);
        for(int el : selected){
            switch (el){
                case 1:
                    h1.setVisibility(VISIBLE);
                    break;
                case 2:
                    h2.setVisibility(VISIBLE);
                    break;
                case 3:
                    h3.setVisibility(VISIBLE);
                    break;
                case 4:
                    h4.setVisibility(VISIBLE);
                    break;
                case 5:
                    h5.setVisibility(VISIBLE);
                    break;
                case 6:
                    h6.setVisibility(VISIBLE);
                    break;
                case 7:
                    h7.setVisibility(VISIBLE);
                    break;
                case 8:
                    h8.setVisibility(VISIBLE);
                    break;

            }
        }

    }

    public void submit(View view) {

        corrAns = 0;

        CardView h1  = (CardView) findViewById(R.id.hist1);
        CardView h2  = (CardView) findViewById(R.id.hist2);
        CardView h3  = (CardView) findViewById(R.id.hist3);
        CardView h4  = (CardView) findViewById(R.id.hist4);
        CardView h5  = (CardView) findViewById(R.id.hist5);
        CardView h6  = (CardView) findViewById(R.id.hist6);
        CardView h7  = (CardView) findViewById(R.id.hist7);

        if(h1.getVisibility() == VISIBLE){
            //Solution is d
            RadioButton a = (RadioButton) findViewById(R.id.h1a);
            RadioButton b = (RadioButton) findViewById(R.id.h1b);
            RadioButton c = (RadioButton) findViewById(R.id.h1c);
            RadioButton d = (RadioButton) findViewById(R.id.h1d);

            d.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                corrAns ++;
            }
        }

        if(h2.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.h2a);
            RadioButton b = (RadioButton) findViewById(R.id.h2b);
            RadioButton c = (RadioButton) findViewById(R.id.h2c);
            RadioButton d = (RadioButton) findViewById(R.id.h2d);

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

        if(h3.getVisibility() == VISIBLE){
            //Solution is a
            RadioButton a = (RadioButton) findViewById(R.id.h3a);
            RadioButton b = (RadioButton) findViewById(R.id.h3b);
            RadioButton c = (RadioButton) findViewById(R.id.h3c);
            RadioButton d = (RadioButton) findViewById(R.id.h3d);

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

        if(h4.getVisibility() == VISIBLE){
            //Solution is b c d
            CheckBox a = (CheckBox) findViewById(R.id.hch1);
            CheckBox b = (CheckBox) findViewById(R.id.hch2);
            CheckBox c = (CheckBox) findViewById(R.id.hch3);
            CheckBox d = (CheckBox) findViewById(R.id.hch4);

            d.setBackgroundColor(Color.parseColor("#42f45c"));
            b.setBackgroundColor(Color.parseColor("#42f45c"));
            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked() && b.isChecked() && d.isChecked()){
                corrAns ++;
            }

        }

        if(h5.getVisibility() == VISIBLE){
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.h5a);
            RadioButton b = (RadioButton) findViewById(R.id.h5b);
            RadioButton c = (RadioButton) findViewById(R.id.h5c);
            RadioButton d = (RadioButton) findViewById(R.id.h5d);

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

        if(h6.getVisibility() == VISIBLE){
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.h6a);
            RadioButton b = (RadioButton) findViewById(R.id.h6b);
            RadioButton c = (RadioButton) findViewById(R.id.h6c);
            RadioButton d = (RadioButton) findViewById(R.id.h6d);

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

        if(h7.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.h7a);
            RadioButton b = (RadioButton) findViewById(R.id.h7b);
            RadioButton c = (RadioButton) findViewById(R.id.h7c);
            RadioButton d = (RadioButton) findViewById(R.id.h7d);
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

        Button cont = (Button) findViewById(R.id.continueAc);
        cont.setVisibility(View.VISIBLE);
        view.setVisibility(GONE);


        Context context = getApplicationContext();
        Toast.makeText(context,"Has respondido a "+ corrAns + " correctamente.", Toast.LENGTH_LONG).show();
    }

    public void continueAc(View view){

        Intent intent = new Intent("com.example.android.quizapp.FinalActivity");
        intent.putExtra("Category", categ);
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
