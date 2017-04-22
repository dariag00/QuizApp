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
        CardView g9  = (CardView) findViewById(R.id.geo9);
        CardView g10  = (CardView) findViewById(R.id.geo10);
        CardView g11  = (CardView) findViewById(R.id.geo11);
        CardView g12  = (CardView) findViewById(R.id.geo12);
        CardView g13  = (CardView) findViewById(R.id.geo13);
        CardView g14  = (CardView) findViewById(R.id.geo14);
        CardView g15  = (CardView) findViewById(R.id.geo15);
        CardView g16  = (CardView) findViewById(R.id.geo16);
        CardView g17  = (CardView) findViewById(R.id.geo17);
        CardView g18  = (CardView) findViewById(R.id.geo18);
        CardView g19  = (CardView) findViewById(R.id.geo19);
        CardView g20  = (CardView) findViewById(R.id.geo20);
        CardView g21  = (CardView) findViewById(R.id.geo21);
        CardView g22  = (CardView) findViewById(R.id.geo22);
        CardView g23  = (CardView) findViewById(R.id.geo23);
        CardView g24  = (CardView) findViewById(R.id.geo24);
        CardView g25  = (CardView) findViewById(R.id.geo25);

        if(beta != 1) {

            g1.setVisibility(GONE);
            g2.setVisibility(GONE);
            g3.setVisibility(GONE);
            g4.setVisibility(GONE);
            g5.setVisibility(GONE);
            g6.setVisibility(GONE);
            g7.setVisibility(GONE);
            g8.setVisibility(GONE);
            g9.setVisibility(GONE);
            g10.setVisibility(GONE);
            g11.setVisibility(GONE);
            g12.setVisibility(GONE);
            g13.setVisibility(GONE);
            g14.setVisibility(GONE);
            g15.setVisibility(GONE);
            g16.setVisibility(GONE);
            g17.setVisibility(GONE);
            g18.setVisibility(GONE);
            g19.setVisibility(GONE);
            g20.setVisibility(GONE);
            g21.setVisibility(GONE);
            g22.setVisibility(GONE);
            g23.setVisibility(GONE);
            g24.setVisibility(GONE);
            g25.setVisibility(GONE);

            chooseRandomQuestions(nQ, 25);
            for (int el : selected) {
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
                    case 9:
                        g9.setVisibility(VISIBLE);
                        break;
                    case 10:
                        g10.setVisibility(VISIBLE);
                        break;
                    case 11:
                        g11.setVisibility(VISIBLE);
                        break;
                    case 12:
                        g12.setVisibility(VISIBLE);
                        break;
                    case 13:
                        g13.setVisibility(VISIBLE);
                        break;
                    case 14:
                        g14.setVisibility(VISIBLE);
                        break;
                    case 15:
                        g15.setVisibility(VISIBLE);
                        break;
                    case 16:
                        g16.setVisibility(VISIBLE);
                        break;
                    case 17:
                        g17.setVisibility(VISIBLE);
                        break;
                    case 18:
                        g18.setVisibility(VISIBLE);
                        break;
                    case 19:
                        g19.setVisibility(VISIBLE);
                        break;
                    case 20:
                        g20.setVisibility(VISIBLE);
                        break;
                    case 21:
                        g21.setVisibility(VISIBLE);
                        break;
                    case 22:
                        g22.setVisibility(VISIBLE);
                        break;
                    case 23:
                        g23.setVisibility(VISIBLE);
                        break;
                    case 24:
                        g24.setVisibility(VISIBLE);
                        break;
                    case 25:
                        g25.setVisibility(VISIBLE);
                        break;

                }
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
        CardView g9  = (CardView) findViewById(R.id.geo9);
        CardView g10  = (CardView) findViewById(R.id.geo10);
        CardView g11  = (CardView) findViewById(R.id.geo11);
        CardView g12  = (CardView) findViewById(R.id.geo12);
        CardView g13  = (CardView) findViewById(R.id.geo13);
        CardView g14  = (CardView) findViewById(R.id.geo14);
        CardView g15  = (CardView) findViewById(R.id.geo15);
        CardView g16  = (CardView) findViewById(R.id.geo16);
        CardView g17  = (CardView) findViewById(R.id.geo17);
        CardView g18  = (CardView) findViewById(R.id.geo18);
        CardView g19  = (CardView) findViewById(R.id.geo19);
        CardView g20  = (CardView) findViewById(R.id.geo20);
        CardView g21  = (CardView) findViewById(R.id.geo21);
        CardView g22  = (CardView) findViewById(R.id.geo22);
        CardView g23  = (CardView) findViewById(R.id.geo23);
        CardView g24  = (CardView) findViewById(R.id.geo24);
        CardView g25  = (CardView) findViewById(R.id.geo25);

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

        if(g9.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g9a);
            RadioButton b = (RadioButton) findViewById(R.id.g9b);
            RadioButton c = (RadioButton) findViewById(R.id.g9c);
            RadioButton d = (RadioButton) findViewById(R.id.g9d);

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

        if(g10.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g10a);
            RadioButton b = (RadioButton) findViewById(R.id.g10b);
            RadioButton c = (RadioButton) findViewById(R.id.g10c);
            RadioButton d = (RadioButton) findViewById(R.id.g10d);

            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(g11.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g11a);
            RadioButton b = (RadioButton) findViewById(R.id.g11b);
            RadioButton c = (RadioButton) findViewById(R.id.g11c);
            RadioButton d = (RadioButton) findViewById(R.id.g11d);

            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(c.isChecked()){
                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(g12.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g12a);
            RadioButton b = (RadioButton) findViewById(R.id.g12b);
            RadioButton c = (RadioButton) findViewById(R.id.g12c);
            RadioButton d = (RadioButton) findViewById(R.id.g12d);

            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(g13.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g13a);
            RadioButton b = (RadioButton) findViewById(R.id.g13b);
            RadioButton c = (RadioButton) findViewById(R.id.g13c);
            RadioButton d = (RadioButton) findViewById(R.id.g13d);

            d.setBackgroundColor(Color.parseColor("#42f45c"));

            if(d.isChecked()){
                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(g14.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g14a);
            RadioButton b = (RadioButton) findViewById(R.id.g14b);
            RadioButton c = (RadioButton) findViewById(R.id.g14c);
            RadioButton d = (RadioButton) findViewById(R.id.g14d);

            d.setBackgroundColor(Color.parseColor("#42f45c"));

            if(d.isChecked()){
                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(g15.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g15a);
            RadioButton b = (RadioButton) findViewById(R.id.g15b);
            RadioButton c = (RadioButton) findViewById(R.id.g15c);
            RadioButton d = (RadioButton) findViewById(R.id.g15d);

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
        if(g16.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g16a);
            RadioButton b = (RadioButton) findViewById(R.id.g16b);
            RadioButton c = (RadioButton) findViewById(R.id.g16c);
            RadioButton d = (RadioButton) findViewById(R.id.g16d);

            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(g17.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g17a);
            RadioButton b = (RadioButton) findViewById(R.id.g17b);
            RadioButton c = (RadioButton) findViewById(R.id.g17c);
            RadioButton d = (RadioButton) findViewById(R.id.g17d);

            d.setBackgroundColor(Color.parseColor("#42f45c"));

            if(d.isChecked()){
                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(g18.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g18a);
            RadioButton b = (RadioButton) findViewById(R.id.g18b);
            RadioButton c = (RadioButton) findViewById(R.id.g18c);
            RadioButton d = (RadioButton) findViewById(R.id.g18d);

            d.setBackgroundColor(Color.parseColor("#42f45c"));

            if(d.isChecked()){
                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(g19.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g19a);
            RadioButton b = (RadioButton) findViewById(R.id.g19b);
            RadioButton c = (RadioButton) findViewById(R.id.g19c);
            RadioButton d = (RadioButton) findViewById(R.id.g19d);

            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(c.isChecked()){
                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(g20.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g20a);
            RadioButton b = (RadioButton) findViewById(R.id.g20b);
            RadioButton c = (RadioButton) findViewById(R.id.g20c);
            RadioButton d = (RadioButton) findViewById(R.id.g20d);

            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(c.isChecked()){
                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(g21.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g21a);
            RadioButton b = (RadioButton) findViewById(R.id.g21b);
            RadioButton c = (RadioButton) findViewById(R.id.g21c);
            RadioButton d = (RadioButton) findViewById(R.id.g21d);

            d.setBackgroundColor(Color.parseColor("#42f45c"));

            if(d.isChecked()){
                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(g22.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g22a);
            RadioButton b = (RadioButton) findViewById(R.id.g22b);
            RadioButton c = (RadioButton) findViewById(R.id.g22c);
            RadioButton d = (RadioButton) findViewById(R.id.g22d);

            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(c.isChecked()){
                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(g23.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g23a);
            RadioButton b = (RadioButton) findViewById(R.id.g23b);
            RadioButton c = (RadioButton) findViewById(R.id.g23c);
            RadioButton d = (RadioButton) findViewById(R.id.g23d);

            d.setBackgroundColor(Color.parseColor("#42f45c"));

            if(d.isChecked()){
                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(g24.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g24a);
            RadioButton b = (RadioButton) findViewById(R.id.g24b);
            RadioButton c = (RadioButton) findViewById(R.id.g24c);
            RadioButton d = (RadioButton) findViewById(R.id.g24d);

            d.setBackgroundColor(Color.parseColor("#42f45c"));

            if(d.isChecked()){
                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(g25.getVisibility() == VISIBLE) {
            //Solution is a and d
            RadioButton a = (RadioButton) findViewById(R.id.g25a);
            RadioButton b = (RadioButton) findViewById(R.id.g25b);
            RadioButton c = (RadioButton) findViewById(R.id.g25c);
            RadioButton d = (RadioButton) findViewById(R.id.g25d);

            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if(b.isChecked()){
                corrAns ++;
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
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
