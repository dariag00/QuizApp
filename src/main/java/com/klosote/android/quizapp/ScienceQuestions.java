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
        CardView s8  = (CardView) findViewById(R.id.sci8);
        CardView s9  = (CardView) findViewById(R.id.sci9);
        CardView s10  = (CardView) findViewById(R.id.sci10);
        CardView s11  = (CardView) findViewById(R.id.sci11);
        CardView s12  = (CardView) findViewById(R.id.sci12);
        CardView s13  = (CardView) findViewById(R.id.sci13);
        CardView s14  = (CardView) findViewById(R.id.sci14);
        CardView s15  = (CardView) findViewById(R.id.sci15);
        CardView s16  = (CardView) findViewById(R.id.sci16);
        CardView s17  = (CardView) findViewById(R.id.sci17);
        CardView s18  = (CardView) findViewById(R.id.sci18);
        CardView s19  = (CardView) findViewById(R.id.sci19);
        CardView s20  = (CardView) findViewById(R.id.sci20);
        CardView s21  = (CardView) findViewById(R.id.sci21);
        CardView s22  = (CardView) findViewById(R.id.sci22);
        CardView s23  = (CardView) findViewById(R.id.sci23);
        CardView s24  = (CardView) findViewById(R.id.sci24);
        CardView s25  = (CardView) findViewById(R.id.sci25);

        if(beta != 1) {
            s1.setVisibility(GONE);
            s2.setVisibility(GONE);
            s3.setVisibility(GONE);
            s4.setVisibility(GONE);
            s5.setVisibility(GONE);
            s6.setVisibility(GONE);
            s7.setVisibility(GONE);
            s8.setVisibility(GONE);
            s9.setVisibility(GONE);
            s10.setVisibility(GONE);
        s11.setVisibility(GONE);
        s12.setVisibility(GONE);
        s13.setVisibility(GONE);
        s14.setVisibility(GONE);
        s15.setVisibility(GONE);
        s16.setVisibility(GONE);
        s17.setVisibility(GONE);
        s18.setVisibility(GONE);
        s19.setVisibility(GONE);
        s20.setVisibility(GONE);
            s21.setVisibility(GONE);
            s22.setVisibility(GONE);
            s23.setVisibility(GONE);
            s24.setVisibility(GONE);
            s25.setVisibility(GONE);
            chooseRandomQuestions(nQ, 25);
            for (int el : selected) {
                switch (el) {
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
                    case 8:
                        s8.setVisibility(VISIBLE);
                        break;
                    case 9:
                        s9.setVisibility(VISIBLE);
                        break;
                    case 10:
                        s10.setVisibility(VISIBLE);
                        break;
                    case 11:
                        s11.setVisibility(VISIBLE);
                        break;
                    case 12:
                        s12.setVisibility(VISIBLE);
                        break;
                    case 13:
                        s13.setVisibility(VISIBLE);
                        break;
                    case 14:
                        s14.setVisibility(VISIBLE);
                        break;
                    case 15:
                        s15.setVisibility(VISIBLE);
                        break;
                    case 16:
                        s16.setVisibility(VISIBLE);
                        break;
                    case 17:
                        s17.setVisibility(VISIBLE);
                        break;
                    case 18:
                        s18.setVisibility(VISIBLE);
                        break;
                    case 19:
                        s19.setVisibility(VISIBLE);
                        break;
                    case 20:
                        s20.setVisibility(VISIBLE);
                        break;
                    case 21:
                        s21.setVisibility(VISIBLE);
                        break;
                    case 22:
                        s22.setVisibility(VISIBLE);
                        break;
                    case 23:
                        s23.setVisibility(VISIBLE);
                        break;
                    case 24:
                        s24.setVisibility(VISIBLE);
                        break;
                    case 25:
                        s25.setVisibility(VISIBLE);
                        break;
                }
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
        CardView s8 = (CardView) findViewById(R.id.sci8);
        CardView s9 = (CardView) findViewById(R.id.sci9);
        CardView s10 = (CardView) findViewById(R.id.sci10);
        CardView s11 = (CardView) findViewById(R.id.sci11);
        CardView s12 = (CardView) findViewById(R.id.sci12);
        CardView s13 = (CardView) findViewById(R.id.sci13);
        CardView s14 = (CardView) findViewById(R.id.sci14);
        CardView s15 = (CardView) findViewById(R.id.sci15);
        CardView s16 = (CardView) findViewById(R.id.sci16);
        CardView s17 = (CardView) findViewById(R.id.sci17);
        CardView s18 = (CardView) findViewById(R.id.sci18);
        CardView s19 = (CardView) findViewById(R.id.sci19);
        CardView s20 = (CardView) findViewById(R.id.sci20);
        CardView s21 = (CardView) findViewById(R.id.sci21);
        CardView s22 = (CardView) findViewById(R.id.sci22);
        CardView s23 = (CardView) findViewById(R.id.sci23);
        CardView s24 = (CardView) findViewById(R.id.sci24);
        CardView s25 = (CardView) findViewById(R.id.sci25);

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
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
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
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }


        }

        if(s8.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s8a);
            RadioButton b = (RadioButton) findViewById(R.id.s8b);
            RadioButton c = (RadioButton) findViewById(R.id.s8c);
            RadioButton d = (RadioButton) findViewById(R.id.s8d);

            a.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }


        }

        if(s9.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s9a);
            RadioButton b = (RadioButton) findViewById(R.id.s9b);
            RadioButton c = (RadioButton) findViewById(R.id.s9c);
            RadioButton d = (RadioButton) findViewById(R.id.s9d);

            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){

                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }


        }

        if(s10.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s10a);
            RadioButton b = (RadioButton) findViewById(R.id.s10b);
            RadioButton c = (RadioButton) findViewById(R.id.s10c);
            RadioButton d = (RadioButton) findViewById(R.id.s10d);

            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(s11.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s11a);
            RadioButton b = (RadioButton) findViewById(R.id.s11b);
            RadioButton c = (RadioButton) findViewById(R.id.s11c);
            RadioButton d = (RadioButton) findViewById(R.id.s11d);

            a.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(s12.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s12a);
            RadioButton b = (RadioButton) findViewById(R.id.s12b);
            RadioButton c = (RadioButton) findViewById(R.id.s12c);
            RadioButton d = (RadioButton) findViewById(R.id.s12d);

            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(s13.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s13a);
            RadioButton b = (RadioButton) findViewById(R.id.s13b);
            RadioButton c = (RadioButton) findViewById(R.id.s13c);
            RadioButton d = (RadioButton) findViewById(R.id.s13d);

            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(s14.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s14a);
            RadioButton b = (RadioButton) findViewById(R.id.s14b);
            RadioButton c = (RadioButton) findViewById(R.id.s14c);
            RadioButton d = (RadioButton) findViewById(R.id.s14d);

            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(s15.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s15a);
            RadioButton b = (RadioButton) findViewById(R.id.s15b);
            RadioButton c = (RadioButton) findViewById(R.id.s15c);
            RadioButton d = (RadioButton) findViewById(R.id.s15d);

            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                corrAns ++;
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(s16.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s16a);
            RadioButton b = (RadioButton) findViewById(R.id.s16b);
            RadioButton c = (RadioButton) findViewById(R.id.s16c);
            RadioButton d = (RadioButton) findViewById(R.id.s16d);

            d.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(s17.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s17a);
            RadioButton b = (RadioButton) findViewById(R.id.s17b);
            RadioButton c = (RadioButton) findViewById(R.id.s17c);
            RadioButton d = (RadioButton) findViewById(R.id.s17d);
            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){

                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(s18.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s18a);
            RadioButton b = (RadioButton) findViewById(R.id.s18b);
            RadioButton c = (RadioButton) findViewById(R.id.s18c);
            RadioButton d = (RadioButton) findViewById(R.id.s18d);
            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){

                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(s19.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s19a);
            RadioButton b = (RadioButton) findViewById(R.id.s19b);
            RadioButton c = (RadioButton) findViewById(R.id.s19c);
            RadioButton d = (RadioButton) findViewById(R.id.s19d);
            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){

                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(s20.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s20a);
            RadioButton b = (RadioButton) findViewById(R.id.s20b);
            RadioButton c = (RadioButton) findViewById(R.id.s20c);
            RadioButton d = (RadioButton) findViewById(R.id.s20d);

            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){

                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(s21.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s21a);
            RadioButton b = (RadioButton) findViewById(R.id.s21b);
            RadioButton c = (RadioButton) findViewById(R.id.s21c);
            RadioButton d = (RadioButton) findViewById(R.id.s21d);

            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){

                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(s22.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s22a);
            RadioButton b = (RadioButton) findViewById(R.id.s22b);
            RadioButton c = (RadioButton) findViewById(R.id.s22c);
            RadioButton d = (RadioButton) findViewById(R.id.s22d);

            d.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(s23.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s23a);
            RadioButton b = (RadioButton) findViewById(R.id.s23b);
            RadioButton c = (RadioButton) findViewById(R.id.s23c);
            RadioButton d = (RadioButton) findViewById(R.id.s23d);
            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(s24.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s24a);
            RadioButton b = (RadioButton) findViewById(R.id.s24b);
            RadioButton c = (RadioButton) findViewById(R.id.s24c);
            RadioButton d = (RadioButton) findViewById(R.id.s24d);

            a.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(s25.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.s25a);
            RadioButton b = (RadioButton) findViewById(R.id.s25b);
            RadioButton c = (RadioButton) findViewById(R.id.s25c);
            RadioButton d = (RadioButton) findViewById(R.id.s25d);
            d.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
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
