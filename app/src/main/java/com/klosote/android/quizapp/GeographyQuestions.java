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
import android.widget.CheckBox;
import android.widget.EditText;
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

public class GeographyQuestions extends AppCompatActivity{

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

        setTheme(R.style.GeoButtonStyle);

        setContentView(R.layout.geography_questions);

        ScrollView scQ = (ScrollView) findViewById(R.id.scrollQuestions);
        scQ.setBackgroundColor(Color.parseColor("#81FFDF"));

        Button cont = (Button) findViewById(R.id.continueAc);
        cont.setVisibility(GONE);

        CardView g1  = (CardView) findViewById(R.id.geo1);
        CardView g2  = (CardView) findViewById(R.id.geo2);
        CardView g3  = (CardView) findViewById(R.id.geo3);
        CardView g4  = (CardView) findViewById(R.id.geo4);
        CardView g5  = (CardView) findViewById(R.id.geo5);
        CardView g6  = (CardView) findViewById(R.id.geo6);
        CardView g7  = (CardView) findViewById(R.id.geo7);
        CardView g8  = (CardView) findViewById(R.id.geo8);

        g1.setVisibility(GONE);
        g2.setVisibility(GONE);
        g3.setVisibility(GONE);
        g4.setVisibility(GONE);
        g5.setVisibility(GONE);
        g6.setVisibility(GONE);
        g7.setVisibility(GONE);
        g8.setVisibility(GONE);

        chooseRandomQuestions(nQ,8);
        for(int el : selected) {
            switch (el) {
                case 1:
                    g1.setVisibility(VISIBLE);
                    break;
                case 2:
                    g2.setVisibility(VISIBLE);
                    break;
                case 3:
                    g3.setVisibility(VISIBLE);
                    break;
                case 4:
                    g4.setVisibility(VISIBLE);
                    break;
                case 5:
                    g5.setVisibility(VISIBLE);
                    break;
                case 6:
                    g6.setVisibility(VISIBLE);
                    break;
                case 7:
                    g7.setVisibility(VISIBLE);
                    break;
                case 8:
                    g8.setVisibility(VISIBLE);
                    break;

            }
        }

    }

    public void submit(View view){


        Button cont = (Button) findViewById(R.id.continueAc);
        cont.setVisibility(View.VISIBLE);
        view.setVisibility(GONE);

        CardView g1  = (CardView) findViewById(R.id.geo1);
        CardView g2  = (CardView) findViewById(R.id.geo2);
        CardView g3  = (CardView) findViewById(R.id.geo3);
        CardView g4  = (CardView) findViewById(R.id.geo4);
        CardView g5  = (CardView) findViewById(R.id.geo5);
        CardView g6  = (CardView) findViewById(R.id.geo6);
        CardView g7  = (CardView) findViewById(R.id.geo7);
        CardView g8  = (CardView) findViewById(R.id.geo8);

        if(g1.getVisibility() == VISIBLE){
            //Solution is d
            RadioButton a = (RadioButton) findViewById(R.id.g1a);
            RadioButton b = (RadioButton) findViewById(R.id.g1b);
            RadioButton c = (RadioButton) findViewById(R.id.g1c);
            RadioButton d = (RadioButton) findViewById(R.id.g1d);

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

        if(g2.getVisibility() == VISIBLE){
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.g2a);
            RadioButton b = (RadioButton) findViewById(R.id.g2b);
            RadioButton c = (RadioButton) findViewById(R.id.g2c);
            RadioButton d = (RadioButton) findViewById(R.id.g2d);

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

        if(g3.getVisibility() == VISIBLE){
            //Solution is c
            EditText a = (EditText) findViewById(R.id.editTextGeo1);
            String x = a.getText().toString();

            x = x.toLowerCase();

            if(x.matches("everest")){
                corrAns ++;
            }else{
                a.setText("Everest");
                a.setEnabled(false);
            }


        }

        if(g4.getVisibility() == VISIBLE){
            //Solution is a a
            RadioButton a = (RadioButton) findViewById(R.id.g4a);
            RadioButton b = (RadioButton) findViewById(R.id.g4b);
            RadioButton c = (RadioButton) findViewById(R.id.g4c);
            RadioButton d = (RadioButton) findViewById(R.id.g4d);

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

        if(g5.getVisibility() == VISIBLE){
            //Solution is a
            RadioButton a = (RadioButton) findViewById(R.id.g5a);
            RadioButton b = (RadioButton) findViewById(R.id.g5b);
            RadioButton c = (RadioButton) findViewById(R.id.g5c);
            RadioButton d = (RadioButton) findViewById(R.id.g5d);

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

        if(g6.getVisibility() == VISIBLE){
            //Solution is a
            RadioButton a = (RadioButton) findViewById(R.id.g6a);
            RadioButton b = (RadioButton) findViewById(R.id.g6b);
            RadioButton c = (RadioButton) findViewById(R.id.g6c);
            RadioButton d = (RadioButton) findViewById(R.id.g6d);

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

        if(g7.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.g7a);
            RadioButton b = (RadioButton) findViewById(R.id.g7b);
            RadioButton c = (RadioButton) findViewById(R.id.g7c);
            RadioButton d = (RadioButton) findViewById(R.id.g7d);

            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(c.isChecked()){
                corrAns ++;
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }

        }

        if(g8.getVisibility() == VISIBLE){
            //Solution is a and d
            CheckBox a = (CheckBox) findViewById(R.id.gch1);
            CheckBox b = (CheckBox) findViewById(R.id.gch2);
            CheckBox c = (CheckBox) findViewById(R.id.gch3);
            CheckBox d = (CheckBox) findViewById(R.id.gch4);

            a.setBackgroundColor(Color.parseColor("#42f45c"));
            d.setBackgroundColor(Color.parseColor("#42f45c"));

            if(c.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked() && a.isChecked()){
                corrAns ++;
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
