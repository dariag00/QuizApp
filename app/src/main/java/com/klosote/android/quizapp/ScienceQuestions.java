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

public class ScienceQuestions extends AppCompatActivity{

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

        setTheme(R.style.SciButtonStyle);

        setContentView(R.layout.sci_questions);

        ScrollView scQ = (ScrollView) findViewById(R.id.scrollQuestions);
        scQ.setBackgroundColor(Color.parseColor("#0de045"));

        Button cont = (Button) findViewById(R.id.continueAc);
        cont.setVisibility(GONE);

        CardView s1  = (CardView) findViewById(R.id.sci1);
        CardView s2  = (CardView) findViewById(R.id.sci2);
        CardView s3  = (CardView) findViewById(R.id.sci3);
        CardView s4  = (CardView) findViewById(R.id.sci4);
        CardView s5  = (CardView) findViewById(R.id.sci5);
        CardView s6  = (CardView) findViewById(R.id.sci6);
        CardView s7  = (CardView) findViewById(R.id.sci7);

        s1.setVisibility(GONE);
        s2.setVisibility(GONE);
        s3.setVisibility(GONE);
        s4.setVisibility(GONE);
        s5.setVisibility(GONE);
        s6.setVisibility(GONE);
        s7.setVisibility(GONE);

        chooseRandomQuestions(nQ,7);
        for(int el : selected){
            switch (el){
                case 1:
                    s1.setVisibility(VISIBLE);
                    break;
                case 2:
                    s2.setVisibility(VISIBLE);
                    break;
                case 3:
                    s3.setVisibility(VISIBLE);
                    break;
                case 4:
                    s4.setVisibility(VISIBLE);
                    break;
                case 5:
                    s5.setVisibility(VISIBLE);
                    break;
                case 6:
                    s6.setVisibility(VISIBLE);
                    break;
                case 7:
                    s7.setVisibility(VISIBLE);
                    break;
            }
        }



    }

    public void submit(View view){


        Button cont = (Button) findViewById(R.id.continueAc);
        cont.setVisibility(View.VISIBLE);
        view.setVisibility(GONE);

        CardView s1  = (CardView) findViewById(R.id.sci1);
        CardView s2  = (CardView) findViewById(R.id.sci2);
        CardView s3  = (CardView) findViewById(R.id.sci3);
        CardView s4  = (CardView) findViewById(R.id.sci4);
        CardView s5 = (CardView) findViewById(R.id.sci5);
        CardView s6  = (CardView) findViewById(R.id.sci6);
        CardView s7 = (CardView) findViewById(R.id.sci7);

        if(s1.getVisibility() == VISIBLE){
            //Solution is d
            RadioButton a = (RadioButton) findViewById(R.id.s1a);
            RadioButton b = (RadioButton) findViewById(R.id.s1b);
            RadioButton c = (RadioButton) findViewById(R.id.s1c);
            RadioButton d = (RadioButton) findViewById(R.id.s1d);

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

        if(s2.getVisibility() == VISIBLE){
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.s2a);
            RadioButton b = (RadioButton) findViewById(R.id.s2b);
            RadioButton c = (RadioButton) findViewById(R.id.s2c);
            RadioButton d = (RadioButton) findViewById(R.id.s2d);

            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                corrAns ++;
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }

        }

        if(s3.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s3a);
            RadioButton b = (RadioButton) findViewById(R.id.s3b);
            RadioButton c = (RadioButton) findViewById(R.id.s3c);
            RadioButton d = (RadioButton) findViewById(R.id.s3d);

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

        if(s4.getVisibility() == VISIBLE){
            //Solution is a c
            CheckBox a = (CheckBox) findViewById(R.id.sch1);
            CheckBox b = (CheckBox) findViewById(R.id.sch2);
            CheckBox c = (CheckBox) findViewById(R.id.sch3);
            CheckBox d = (CheckBox) findViewById(R.id.sch4);

            a.setBackgroundColor(Color.parseColor("#42f45c"));
            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(d.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked() && a.isChecked()){
                corrAns ++;
            }

        }

        if(s5.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s5a);
            RadioButton b = (RadioButton) findViewById(R.id.s5b);
            RadioButton c = (RadioButton) findViewById(R.id.s5c);
            RadioButton d = (RadioButton) findViewById(R.id.s5d);

            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }


        }

        if(s6.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s6a);
            RadioButton b = (RadioButton) findViewById(R.id.s6b);
            RadioButton c = (RadioButton) findViewById(R.id.s6c);
            RadioButton d = (RadioButton) findViewById(R.id.s6d);

            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }


        }

        if(s7.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s7a);
            RadioButton b = (RadioButton) findViewById(R.id.s7b);
            RadioButton c = (RadioButton) findViewById(R.id.s7c);
            RadioButton d = (RadioButton) findViewById(R.id.s7d);

            a.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
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
