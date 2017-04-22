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
        CardView e7  = (CardView) findViewById(R.id.e7);
        CardView e8  = (CardView) findViewById(R.id.e8);
        CardView e9  = (CardView) findViewById(R.id.e9);
        CardView e10  = (CardView) findViewById(R.id.e10);
        CardView e11  = (CardView) findViewById(R.id.e11);
        CardView e12  = (CardView) findViewById(R.id.e12);
        CardView e13  = (CardView) findViewById(R.id.e13);
        CardView e14  = (CardView) findViewById(R.id.e14);
        CardView e15  = (CardView) findViewById(R.id.e15);
        CardView e16  = (CardView) findViewById(R.id.e16);
        CardView e17  = (CardView) findViewById(R.id.e17);
        CardView e18  = (CardView) findViewById(R.id.e18);
        CardView e19  = (CardView) findViewById(R.id.e19);
        CardView e20  = (CardView) findViewById(R.id.e20);
        CardView e21  = (CardView) findViewById(R.id.e21);
        CardView e22  = (CardView) findViewById(R.id.e22);
        CardView e23  = (CardView) findViewById(R.id.e23);
        CardView e24  = (CardView) findViewById(R.id.e24);
        CardView e25  = (CardView) findViewById(R.id.e25);

        if(beta != 1) {

            e1.setVisibility(GONE);
            e2.setVisibility(GONE);
            e3.setVisibility(GONE);
            e4.setVisibility(GONE);
            e5.setVisibility(GONE);
            e6.setVisibility(GONE);
            e7.setVisibility(GONE);
            e8.setVisibility(GONE);
            e9.setVisibility(GONE);
            e10.setVisibility(GONE);
            e11.setVisibility(GONE);
            e12.setVisibility(GONE);
            e13.setVisibility(GONE);
            e14.setVisibility(GONE);
            e15.setVisibility(GONE);
            e16.setVisibility(GONE);
            e17.setVisibility(GONE);
            e18.setVisibility(GONE);
            e19.setVisibility(GONE);
            e20.setVisibility(GONE);
            e21.setVisibility(GONE);
            e22.setVisibility(GONE);
            e23.setVisibility(GONE);
            e24.setVisibility(GONE);
            e25.setVisibility(GONE);


            chooseRandomQuestions(nQ, 25);

            for (int el : selected) {
                switch (el) {
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
                    case 7:
                        e7.setVisibility(VISIBLE);
                        break;
                    case 8:
                        e8.setVisibility(VISIBLE);
                        break;
                    case 9:
                        e9.setVisibility(VISIBLE);
                        break;
                    case 10:
                        e10.setVisibility(VISIBLE);
                        break;
                    case 11:
                        e11.setVisibility(VISIBLE);
                        break;
                    case 12:
                        e12.setVisibility(VISIBLE);
                        break;
                    case 13:
                        e13.setVisibility(VISIBLE);
                        break;
                    case 14:
                        e14.setVisibility(VISIBLE);
                        break;
                    case 15:
                        e15.setVisibility(VISIBLE);
                        break;
                    case 16:
                        e16.setVisibility(VISIBLE);
                        break;
                    case 17:
                        e17.setVisibility(VISIBLE);
                        break;
                    case 18:
                        e18.setVisibility(VISIBLE);
                        break;
                    case 19:
                        e19.setVisibility(VISIBLE);
                        break;
                    case 20:
                        e20.setVisibility(VISIBLE);
                        break;
                    case 21:
                        e21.setVisibility(VISIBLE);
                        break;
                    case 22:
                        e22.setVisibility(VISIBLE);
                        break;
                    case 23:
                        e23.setVisibility(VISIBLE);
                        break;
                    case 24:
                        e24.setVisibility(VISIBLE);
                        break;
                    case 25:
                        e25.setVisibility(VISIBLE);
                        break;
                }
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
        CardView e7  = (CardView) findViewById(R.id.e7);
        CardView e8  = (CardView) findViewById(R.id.e8);
        CardView e9  = (CardView) findViewById(R.id.e9);
        CardView e10  = (CardView) findViewById(R.id.e10);
        CardView e11  = (CardView) findViewById(R.id.e11);
        CardView e12  = (CardView) findViewById(R.id.e12);
        CardView e13  = (CardView) findViewById(R.id.e13);
        CardView e14  = (CardView) findViewById(R.id.e14);
        CardView e15  = (CardView) findViewById(R.id.e15);
        CardView e16  = (CardView) findViewById(R.id.e16);
        CardView e17  = (CardView) findViewById(R.id.e17);
        CardView e18  = (CardView) findViewById(R.id.e18);
        CardView e19  = (CardView) findViewById(R.id.e19);
        CardView e20  = (CardView) findViewById(R.id.e20);
        CardView e21  = (CardView) findViewById(R.id.e21);
        CardView e22  = (CardView) findViewById(R.id.e22);
        CardView e23  = (CardView) findViewById(R.id.e23);
        CardView e24  = (CardView) findViewById(R.id.e24);
        CardView e25  = (CardView) findViewById(R.id.e25);

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

        if(e7.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e7a);
            RadioButton b = (RadioButton) findViewById(R.id.e7b);
            RadioButton c = (RadioButton) findViewById(R.id.e7c);
            RadioButton d = (RadioButton) findViewById(R.id.e7d);

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

        if(e8.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e8a);
            RadioButton b = (RadioButton) findViewById(R.id.e8b);
            RadioButton c = (RadioButton) findViewById(R.id.e8c);
            RadioButton d = (RadioButton) findViewById(R.id.e8d);

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

        if(e9.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e9a);
            RadioButton b = (RadioButton) findViewById(R.id.e9b);
            RadioButton c = (RadioButton) findViewById(R.id.e9c);
            RadioButton d = (RadioButton) findViewById(R.id.e9d);

            a.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }

        if(e10.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e10a);
            RadioButton b = (RadioButton) findViewById(R.id.e10b);
            RadioButton c = (RadioButton) findViewById(R.id.e10c);
            RadioButton d = (RadioButton) findViewById(R.id.e10d);

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

        if(e11.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e11a);
            RadioButton b = (RadioButton) findViewById(R.id.e11b);
            RadioButton c = (RadioButton) findViewById(R.id.e11c);
            RadioButton d = (RadioButton) findViewById(R.id.e11d);

            a.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(e12.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e12a);
            RadioButton b = (RadioButton) findViewById(R.id.e12b);
            RadioButton c = (RadioButton) findViewById(R.id.e12c);
            RadioButton d = (RadioButton) findViewById(R.id.e12d);

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
        if(e13.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e13a);
            RadioButton b = (RadioButton) findViewById(R.id.e13b);
            RadioButton c = (RadioButton) findViewById(R.id.e13c);
            RadioButton d = (RadioButton) findViewById(R.id.e13d);

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
        if(e14.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e14a);
            RadioButton b = (RadioButton) findViewById(R.id.e14b);
            RadioButton c = (RadioButton) findViewById(R.id.e14c);
            RadioButton d = (RadioButton) findViewById(R.id.e14d);

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
        if(e15.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e15a);
            RadioButton b = (RadioButton) findViewById(R.id.e15b);
            RadioButton c = (RadioButton) findViewById(R.id.e15c);
            RadioButton d = (RadioButton) findViewById(R.id.e15d);

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
        if(e16.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e16a);
            RadioButton b = (RadioButton) findViewById(R.id.e16b);
            RadioButton c = (RadioButton) findViewById(R.id.e16c);
            RadioButton d = (RadioButton) findViewById(R.id.e16d);

            a.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                corrAns ++;
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(e17.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e17a);
            RadioButton b = (RadioButton) findViewById(R.id.e17b);
            RadioButton c = (RadioButton) findViewById(R.id.e17c);
            RadioButton d = (RadioButton) findViewById(R.id.e17d);

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
        if(e18.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e18a);
            RadioButton b = (RadioButton) findViewById(R.id.e18b);
            RadioButton c = (RadioButton) findViewById(R.id.e18c);
            RadioButton d = (RadioButton) findViewById(R.id.e18d);

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
        if(e19.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e19a);
            RadioButton b = (RadioButton) findViewById(R.id.e19b);
            RadioButton c = (RadioButton) findViewById(R.id.e19c);
            RadioButton d = (RadioButton) findViewById(R.id.e19d);

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
        if(e20.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e20a);
            RadioButton b = (RadioButton) findViewById(R.id.e20b);
            RadioButton c = (RadioButton) findViewById(R.id.e20c);
            RadioButton d = (RadioButton) findViewById(R.id.e20d);

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
        if(e21.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e21a);
            RadioButton b = (RadioButton) findViewById(R.id.e21b);
            RadioButton c = (RadioButton) findViewById(R.id.e21c);
            RadioButton d = (RadioButton) findViewById(R.id.e21d);

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
        if(e22.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e22a);
            RadioButton b = (RadioButton) findViewById(R.id.e22b);
            RadioButton c = (RadioButton) findViewById(R.id.e22c);
            RadioButton d = (RadioButton) findViewById(R.id.e22d);

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
        if(e23.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e23a);
            RadioButton b = (RadioButton) findViewById(R.id.e23b);
            RadioButton c = (RadioButton) findViewById(R.id.e23c);
            RadioButton d = (RadioButton) findViewById(R.id.e23d);
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
            }  c.setBackgroundColor(Color.parseColor("#f44141"));
        }
        if(e24.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e24a);
            RadioButton b = (RadioButton) findViewById(R.id.e24b);
            RadioButton c = (RadioButton) findViewById(R.id.e24c);
            RadioButton d = (RadioButton) findViewById(R.id.e24d);

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
        if(e25.getVisibility() == VISIBLE) {
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.e25a);
            RadioButton b = (RadioButton) findViewById(R.id.e25b);
            RadioButton c = (RadioButton) findViewById(R.id.e25c);
            RadioButton d = (RadioButton) findViewById(R.id.e25d);

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
