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
import static com.example.android.quizapp.R.id.sp16;
import static com.example.android.quizapp.R.id.sp17;
import static com.example.android.quizapp.R.id.sp18;
import static com.example.android.quizapp.R.id.sp19;
import static com.example.android.quizapp.R.id.sp20;

/**
 * Created by Diego on 10/04/2017.
 */

public class SportsQuestions extends AppCompatActivity{

    ArrayList<Integer> list;
    ArrayList<Integer> selected;
    String categ;
    int corrAns;
    int nQ;
    String name;
    int beta;

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
        beta= getIntent().getIntExtra("beta",0);

        super.onCreate(savedInstanceState);

        setTheme(R.style.SportsButtonStyle);

        setContentView(R.layout.sports_questions);

        ScrollView scQ = (ScrollView) findViewById(R.id.scrollQuestions);
        scQ.setBackgroundColor(Color.parseColor("#f44144"));

        Button cont = (Button) findViewById(R.id.continueAc);
        cont.setVisibility(GONE);

        //Sports questions
        CardView sp1  = (CardView) findViewById(R.id.sp1);
        CardView sp2  = (CardView) findViewById(R.id.sp2);
        CardView sp3  = (CardView) findViewById(R.id.sp3);
        CardView sp4  = (CardView) findViewById(R.id.sp4);
        CardView sp5  = (CardView) findViewById(R.id.sp5);
        CardView sp6  = (CardView) findViewById(R.id.sp6);
        CardView sp7  = (CardView) findViewById(R.id.sp7);
        CardView sp8  = (CardView) findViewById(R.id.sp8);
        CardView sp9  = (CardView) findViewById(R.id.sp9);
        CardView sp10  = (CardView) findViewById(R.id.sp10);
        CardView sp11  = (CardView) findViewById(R.id.sp11);
        CardView sp12  = (CardView) findViewById(R.id.sp12);
        CardView sp13  = (CardView) findViewById(R.id.sp13);
        CardView sp14  = (CardView) findViewById(R.id.sp14);
        CardView sp15  = (CardView) findViewById(R.id.sp15);
        CardView sp16  = (CardView) findViewById(R.id.sp16);
        CardView sp17  = (CardView) findViewById(R.id.sp17);
        CardView sp18  = (CardView) findViewById(R.id.sp18);
        CardView sp19  = (CardView) findViewById(R.id.sp19);
        CardView sp20  = (CardView) findViewById(R.id.sp20);

        if(beta != 1) {

            sp1.setVisibility(GONE);
            sp2.setVisibility(GONE);
            sp3.setVisibility(GONE);
            sp4.setVisibility(GONE);
            sp5.setVisibility(GONE);
            sp6.setVisibility(GONE);
            sp7.setVisibility(GONE);
            sp8.setVisibility(GONE);
            sp9.setVisibility(GONE);
            sp10.setVisibility(GONE);
            sp11.setVisibility(GONE);
            sp12.setVisibility(GONE);
            sp13.setVisibility(GONE);
            sp14.setVisibility(GONE);
            sp15.setVisibility(GONE);
            sp16.setVisibility(GONE);
            sp17.setVisibility(GONE);
            sp18.setVisibility(GONE);
            sp19.setVisibility(GONE);
            sp20.setVisibility(GONE);




            chooseRandomQuestions(nQ, 20);
            for (int el : selected) {
                switch (el) {
                    case 1:
                        sp1.setVisibility(VISIBLE);
                        break;
                    case 2:
                        sp2.setVisibility(VISIBLE);
                        break;
                    case 3:
                        sp3.setVisibility(VISIBLE);
                        break;
                    case 4:
                        sp4.setVisibility(VISIBLE);
                        break;
                    case 5:
                        sp5.setVisibility(VISIBLE);
                        break;
                    case 6:
                        sp6.setVisibility(VISIBLE);
                        break;
                    case 7:
                        sp7.setVisibility(VISIBLE);
                        break;
                    case 8:
                        sp8.setVisibility(VISIBLE);
                        break;
                    case 9:
                        sp9.setVisibility(VISIBLE);
                        break;
                    case 10:
                        sp10.setVisibility(VISIBLE);
                        break;
                    case 11:
                        sp11.setVisibility(VISIBLE);
                        break;
                    case 12:
                        sp12.setVisibility(VISIBLE);
                        break;
                    case 13:
                        sp13.setVisibility(VISIBLE);
                        break;
                    case 14:
                        sp14.setVisibility(VISIBLE);
                        break;
                    case 15:
                        sp15.setVisibility(VISIBLE);
                        break;
                    case 16:
                        sp16.setVisibility(VISIBLE);
                        break;
                    case 17:
                        sp17.setVisibility(VISIBLE);
                        break;
                    case 18:
                        sp18.setVisibility(VISIBLE);
                        break;
                    case 19:
                        sp19.setVisibility(VISIBLE);
                        break;
                    case 20:
                        sp15.setVisibility(VISIBLE);
                        break;

                }
            }
        }


    }

    public void submit(View view){


        Button cont = (Button) findViewById(R.id.continueAc);
        cont.setVisibility(View.VISIBLE);
        view.setVisibility(GONE);

        CardView sp1  = (CardView) findViewById(R.id.sp1);
        CardView sp2  = (CardView) findViewById(R.id.sp2);
        CardView sp3  = (CardView) findViewById(R.id.sp3);
        CardView sp4  = (CardView) findViewById(R.id.sp4);
        CardView sp5  = (CardView) findViewById(R.id.sp5);
        CardView sp6  = (CardView) findViewById(R.id.sp6);
        CardView sp7  = (CardView) findViewById(R.id.sp7);
        CardView sp8  = (CardView) findViewById(R.id.sp8);
        CardView sp9  = (CardView) findViewById(R.id.sp9);
        CardView sp10  = (CardView) findViewById(R.id.sp10);

        if(sp1.getVisibility() == VISIBLE){

            RadioButton a = (RadioButton) findViewById(R.id.sp1a);
            RadioButton b = (RadioButton) findViewById(R.id.sp1b);
            RadioButton c = (RadioButton) findViewById(R.id.sp1c);
            RadioButton d = (RadioButton) findViewById(R.id.sp1d);

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
        if(sp2.getVisibility() == VISIBLE){

            RadioButton a = (RadioButton) findViewById(R.id.sp2a);
            RadioButton b = (RadioButton) findViewById(R.id.sp2b);
            RadioButton c = (RadioButton) findViewById(R.id.sp2c);
            RadioButton d = (RadioButton) findViewById(R.id.sp2d);

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
        if(sp3.getVisibility() == VISIBLE){

            RadioButton a = (RadioButton) findViewById(R.id.sp3a);
            RadioButton b = (RadioButton) findViewById(R.id.sp3b);
            RadioButton c = (RadioButton) findViewById(R.id.sp3c);
            RadioButton d = (RadioButton) findViewById(R.id.sp3d);

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
        if(sp4.getVisibility() == VISIBLE){

            RadioButton a = (RadioButton) findViewById(R.id.sp4a);
            RadioButton b = (RadioButton) findViewById(R.id.sp4b);
            RadioButton c = (RadioButton) findViewById(R.id.sp4c);
            RadioButton d = (RadioButton) findViewById(R.id.sp4d);

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
        if(sp5.getVisibility() == VISIBLE){

            RadioButton a = (RadioButton) findViewById(R.id.sp5a);
            RadioButton b = (RadioButton) findViewById(R.id.sp5b);
            RadioButton c = (RadioButton) findViewById(R.id.sp5c);
            RadioButton d = (RadioButton) findViewById(R.id.sp5d);

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
        if(sp6.getVisibility() == VISIBLE){

            RadioButton a = (RadioButton) findViewById(R.id.sp6a);
            RadioButton b = (RadioButton) findViewById(R.id.sp6b);
            RadioButton c = (RadioButton) findViewById(R.id.sp6c);
            RadioButton d = (RadioButton) findViewById(R.id.sp6d);

            a.setBackgroundColor(Color.parseColor("#42f45c"));

            if(c.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                corrAns ++;
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }

        }
        if(sp7.getVisibility() == VISIBLE){

            RadioButton a = (RadioButton) findViewById(R.id.sp7a);
            RadioButton b = (RadioButton) findViewById(R.id.sp7b);
            RadioButton c = (RadioButton) findViewById(R.id.sp7c);
            RadioButton d = (RadioButton) findViewById(R.id.sp7d);

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

        if(sp8.getVisibility() == VISIBLE){

            RadioButton a = (RadioButton) findViewById(R.id.sp8a);
            RadioButton b = (RadioButton) findViewById(R.id.sp8b);
            RadioButton c = (RadioButton) findViewById(R.id.sp8c);
            RadioButton d = (RadioButton) findViewById(R.id.sp8d);

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

        if(sp9.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp9a);
            RadioButton b = (RadioButton) findViewById(R.id.sp9b);
            RadioButton c = (RadioButton) findViewById(R.id.sp9c);
            RadioButton d = (RadioButton) findViewById(R.id.sp9d);

            d.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                corrAns ++;
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }

        }

        if(sp10.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp10a);
            RadioButton b = (RadioButton) findViewById(R.id.sp10b);
            RadioButton c = (RadioButton) findViewById(R.id.sp10c);
            RadioButton d = (RadioButton) findViewById(R.id.sp10d);

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
