package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.util.Log;
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

public class VGamesQuestions extends AppCompatActivity{

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

        setTheme(R.style.VGamesButtonStyle);

        setContentView(R.layout.videogames_questions);

        ScrollView scQ = (ScrollView) findViewById(R.id.scrollQuestions);
        scQ.setBackgroundColor(Color.parseColor("#8f0de0"));

        Button cont = (Button) findViewById(R.id.continueAc);
        cont.setVisibility(GONE);

        CardView vg1  = (CardView) findViewById(R.id.vga1);
        CardView vg2  = (CardView) findViewById(R.id.vga2);
        CardView vg3  = (CardView) findViewById(R.id.vga3);
        CardView vg4  = (CardView) findViewById(R.id.vga4);
        CardView vg5  = (CardView) findViewById(R.id.vga5);
        CardView vg6  = (CardView) findViewById(R.id.vga6);


        vg1.setVisibility(GONE);
        vg2.setVisibility(GONE);
        vg3.setVisibility(GONE);
        vg4.setVisibility(GONE);
        vg5.setVisibility(GONE);
        vg6.setVisibility(GONE);

        chooseRandomQuestions(nQ,6);
        for(int el : selected){
            switch (el){
                case 1:
                    vg1.setVisibility(VISIBLE);
                    break;
                case 2:
                    vg2.setVisibility(VISIBLE);
                    break;
                case 3:
                    vg3.setVisibility(VISIBLE);
                    break;
                case 4:
                    vg4.setVisibility(VISIBLE);
                    break;
                case 5:
                    vg5.setVisibility(VISIBLE);
                    break;
                case 6:
                    vg6.setVisibility(VISIBLE);
                    break;
            }
        }

    }

    public void submit(View view){


        Button cont = (Button) findViewById(R.id.continueAc);
        cont.setVisibility(View.VISIBLE);
        view.setVisibility(GONE);

        CardView vg1  = (CardView) findViewById(R.id.vga1);
        CardView vg2  = (CardView) findViewById(R.id.vga2);
        CardView vg3  = (CardView) findViewById(R.id.vga3);
        CardView vg4  = (CardView) findViewById(R.id.vga4);

        if(vg1.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v1a);
            RadioButton b = (RadioButton) findViewById(R.id.v1b);
            RadioButton c = (RadioButton) findViewById(R.id.v1c);
            RadioButton d = (RadioButton) findViewById(R.id.v1d);
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

        if(vg2.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v2a);
            RadioButton b = (RadioButton) findViewById(R.id.v2b);
            RadioButton c = (RadioButton) findViewById(R.id.v2c);
            RadioButton d = (RadioButton) findViewById(R.id.v2d);
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

        if(vg3.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v3a);
            RadioButton b = (RadioButton) findViewById(R.id.v3b);
            RadioButton c = (RadioButton) findViewById(R.id.v3c);
            RadioButton d = (RadioButton) findViewById(R.id.v3d);

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
        if(vg4.getVisibility() == VISIBLE) {
            //Solution is b and d
            CheckBox a = (CheckBox) findViewById(R.id.vch1);
            CheckBox b = (CheckBox) findViewById(R.id.vch2);
            CheckBox c = (CheckBox) findViewById(R.id.vch3);
            CheckBox d = (CheckBox) findViewById(R.id.vch4);

            d.setBackgroundColor(Color.parseColor("#42f45c"));
            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if (a.isChecked()) {
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if (d.isChecked()) {
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if (b.isChecked() && c.isChecked()) {
                corrAns++;
            }
        }



            Context context = getApplicationContext();
        Toast.makeText(context,"Has respondido a "+ corrAns + " correctamente.", Toast.LENGTH_LONG).show();
    }

    public void continueAc(View view){

        Intent intent = new Intent("com.example.android.quizapp.FinalActivity");
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
