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

public class VGamesQuestions extends AppCompatActivity{

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
        CardView vg7  = (CardView) findViewById(R.id.vga7);
        CardView vg8  = (CardView) findViewById(R.id.vga8);
        CardView vg9  = (CardView) findViewById(R.id.vga9);
        CardView vg10  = (CardView) findViewById(R.id.vga10);
        CardView vg11  = (CardView) findViewById(R.id.vga11);
        CardView vg12  = (CardView) findViewById(R.id.vga12);
        CardView vg13  = (CardView) findViewById(R.id.vga13);
        CardView vg14  = (CardView) findViewById(R.id.vga14);
        CardView vg15  = (CardView) findViewById(R.id.vga15);
        CardView vg16  = (CardView) findViewById(R.id.vga16);
        CardView vg17  = (CardView) findViewById(R.id.vga17);
        CardView vg18  = (CardView) findViewById(R.id.vga18);
        CardView vg19  = (CardView) findViewById(R.id.vga19);
        CardView vg20  = (CardView) findViewById(R.id.vga20);
        CardView vg21  = (CardView) findViewById(R.id.vga21);
        CardView vg22  = (CardView) findViewById(R.id.vga22);
        CardView vg23  = (CardView) findViewById(R.id.vga23);
        CardView vg24  = (CardView) findViewById(R.id.vga24);
        CardView vg25  = (CardView) findViewById(R.id.vga25);

        if(beta != 1) {


            vg1.setVisibility(GONE);
            vg2.setVisibility(GONE);
            vg3.setVisibility(GONE);
            vg4.setVisibility(GONE);
            vg5.setVisibility(GONE);
            vg6.setVisibility(GONE);
            vg7.setVisibility(GONE);
            vg8.setVisibility(GONE);
            vg9.setVisibility(GONE);
            vg10.setVisibility(GONE);
            vg11.setVisibility(GONE);
            vg12.setVisibility(GONE);
            vg13.setVisibility(GONE);
            vg14.setVisibility(GONE);
            vg15.setVisibility(GONE);
            vg16.setVisibility(GONE);
            vg17.setVisibility(GONE);
            vg18.setVisibility(GONE);
            vg19.setVisibility(GONE);
            vg20.setVisibility(GONE);
            vg21.setVisibility(GONE);
            vg22.setVisibility(GONE);
            vg23.setVisibility(GONE);
            vg24.setVisibility(GONE);
            vg25.setVisibility(GONE);

            chooseRandomQuestions(nQ, 25);
            for (int el : selected) {
                switch (el) {
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
                    case 7:
                        vg7.setVisibility(VISIBLE);
                        break;
                    case 8:
                        vg8.setVisibility(VISIBLE);
                        break;
                    case 9:
                        vg9.setVisibility(VISIBLE);
                        break;
                    case 10:
                        vg10.setVisibility(VISIBLE);
                        break;
                    case 11:
                        vg11.setVisibility(VISIBLE);
                        break;
                    case 12:
                        vg12.setVisibility(VISIBLE);
                        break;
                    case 13:
                        vg13.setVisibility(VISIBLE);
                        break;
                    case 14:
                        vg14.setVisibility(VISIBLE);
                        break;
                    case 15:
                        vg15.setVisibility(VISIBLE);
                        break;
                    case 16:
                        vg16.setVisibility(VISIBLE);
                        break;
                    case 17:
                        vg17.setVisibility(VISIBLE);
                        break;
                    case 18:
                        vg18.setVisibility(VISIBLE);
                        break;
                    case 19:
                        vg19.setVisibility(VISIBLE);
                        break;
                    case 20:
                        vg20.setVisibility(VISIBLE);
                        break;
                    case 21:
                        vg21.setVisibility(VISIBLE);
                        break;
                    case 22:
                        vg22.setVisibility(VISIBLE);
                        break;
                    case 23:
                        vg23.setVisibility(VISIBLE);
                        break;
                    case 24:
                        vg24.setVisibility(VISIBLE);
                        break;
                    case 25:
                        vg25.setVisibility(VISIBLE);
                        break;
                }
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
        CardView vg5  = (CardView) findViewById(R.id.vga5);
        CardView vg6  = (CardView) findViewById(R.id.vga6);
        CardView vg7  = (CardView) findViewById(R.id.vga7);
        CardView vg8  = (CardView) findViewById(R.id.vga8);
        CardView vg9  = (CardView) findViewById(R.id.vga9);
        CardView vg10  = (CardView) findViewById(R.id.vga10);
        CardView vg11  = (CardView) findViewById(R.id.vga11);
        CardView vg12  = (CardView) findViewById(R.id.vga12);
        CardView vg13  = (CardView) findViewById(R.id.vga13);
        CardView vg14  = (CardView) findViewById(R.id.vga14);
        CardView vg15  = (CardView) findViewById(R.id.vga15);
        CardView vg16  = (CardView) findViewById(R.id.vga16);
        CardView vg17  = (CardView) findViewById(R.id.vga17);
        CardView vg18  = (CardView) findViewById(R.id.vga18);
        CardView vg19  = (CardView) findViewById(R.id.vga19);
        CardView vg20  = (CardView) findViewById(R.id.vga20);
        CardView vg21  = (CardView) findViewById(R.id.vga21);
        CardView vg22  = (CardView) findViewById(R.id.vga22);
        CardView vg23  = (CardView) findViewById(R.id.vga23);
        CardView vg24  = (CardView) findViewById(R.id.vga24);
        CardView vg25  = (CardView) findViewById(R.id.vga25);

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

            c.setBackgroundColor(Color.parseColor("#42f45c"));
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

        if(vg5.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v5a);
            RadioButton b = (RadioButton) findViewById(R.id.v5b);
            RadioButton c = (RadioButton) findViewById(R.id.v5c);
            RadioButton d = (RadioButton) findViewById(R.id.v5d);

            c.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                corrAns ++;
            }
            if(b.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }

        }

        if(vg6.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v6a);
            RadioButton b = (RadioButton) findViewById(R.id.v6b);
            RadioButton c = (RadioButton) findViewById(R.id.v6c);
            RadioButton d = (RadioButton) findViewById(R.id.v6d);

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

        if(vg7.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v7a);
            RadioButton b = (RadioButton) findViewById(R.id.v7b);
            RadioButton c = (RadioButton) findViewById(R.id.v7c);
            RadioButton d = (RadioButton) findViewById(R.id.v7d);

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

        if(vg8.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v8a);
            RadioButton b = (RadioButton) findViewById(R.id.v8b);
            RadioButton c = (RadioButton) findViewById(R.id.v8c);
            RadioButton d = (RadioButton) findViewById(R.id.v8d);

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

        if(vg9.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v9a);
            RadioButton b = (RadioButton) findViewById(R.id.v9b);
            RadioButton c = (RadioButton) findViewById(R.id.v9c);
            RadioButton d = (RadioButton) findViewById(R.id.v9d);

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

        if(vg10.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v10a);
            RadioButton b = (RadioButton) findViewById(R.id.v10b);
            RadioButton c = (RadioButton) findViewById(R.id.v10c);
            RadioButton d = (RadioButton) findViewById(R.id.v10d);

            a.setBackgroundColor(Color.parseColor("#42f45c"));

            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                corrAns ++;
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }

        }

        if(vg11.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v11a);
            RadioButton b = (RadioButton) findViewById(R.id.v11b);
            RadioButton c = (RadioButton) findViewById(R.id.v11c);
            RadioButton d = (RadioButton) findViewById(R.id.v11d);

            a.setBackgroundColor(Color.parseColor("#42f45c"));

            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                corrAns ++;
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }

        }
        if(vg12.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v12a);
            RadioButton b = (RadioButton) findViewById(R.id.v12b);
            RadioButton c = (RadioButton) findViewById(R.id.v12c);
            RadioButton d = (RadioButton) findViewById(R.id.v12d);

            d.setBackgroundColor(Color.parseColor("#42f45c"));

            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                corrAns ++;
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }

        }
        if(vg13.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v13a);
            RadioButton b = (RadioButton) findViewById(R.id.v13b);
            RadioButton c = (RadioButton) findViewById(R.id.v13c);
            RadioButton d = (RadioButton) findViewById(R.id.v13d);

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
        if(vg14.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v14a);
            RadioButton b = (RadioButton) findViewById(R.id.v14b);
            RadioButton c = (RadioButton) findViewById(R.id.v14c);
            RadioButton d = (RadioButton) findViewById(R.id.v14d);

            a.setBackgroundColor(Color.parseColor("#42f45c"));

            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                corrAns ++;
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }

        }
        if(vg15.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v15a);
            RadioButton b = (RadioButton) findViewById(R.id.v15b);
            RadioButton c = (RadioButton) findViewById(R.id.v15c);
            RadioButton d = (RadioButton) findViewById(R.id.v15d);

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
        if(vg16.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v16a);
            RadioButton b = (RadioButton) findViewById(R.id.v16b);
            RadioButton c = (RadioButton) findViewById(R.id.v16c);
            RadioButton d = (RadioButton) findViewById(R.id.v16d);

            a.setBackgroundColor(Color.parseColor("#42f45c"));

            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                corrAns ++;
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }

        }
        if(vg17.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v17a);
            RadioButton b = (RadioButton) findViewById(R.id.v17b);
            RadioButton c = (RadioButton) findViewById(R.id.v17c);
            RadioButton d = (RadioButton) findViewById(R.id.v17d);

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
        if(vg18.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v18a);
            RadioButton b = (RadioButton) findViewById(R.id.v18b);
            RadioButton c = (RadioButton) findViewById(R.id.v18c);
            RadioButton d = (RadioButton) findViewById(R.id.v18d);

            a.setBackgroundColor(Color.parseColor("#42f45c"));

            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                corrAns ++;
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }

        }
        if(vg19.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v19a);
            RadioButton b = (RadioButton) findViewById(R.id.v19b);
            RadioButton c = (RadioButton) findViewById(R.id.v19c);
            RadioButton d = (RadioButton) findViewById(R.id.v19d);

            a.setBackgroundColor(Color.parseColor("#42f45c"));

            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                corrAns ++;
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }

        }
        if(vg20.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v20a);
            RadioButton b = (RadioButton) findViewById(R.id.v20b);
            RadioButton c = (RadioButton) findViewById(R.id.v20c);
            RadioButton d = (RadioButton) findViewById(R.id.v20d);

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
        if(vg21.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v21a);
            RadioButton b = (RadioButton) findViewById(R.id.v21b);
            RadioButton c = (RadioButton) findViewById(R.id.v21c);
            RadioButton d = (RadioButton) findViewById(R.id.v21d);

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
        if(vg22.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v22a);
            RadioButton b = (RadioButton) findViewById(R.id.v22b);
            RadioButton c = (RadioButton) findViewById(R.id.v22c);
            RadioButton d = (RadioButton) findViewById(R.id.v22d);

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
        if(vg23.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v23a);
            RadioButton b = (RadioButton) findViewById(R.id.v23b);
            RadioButton c = (RadioButton) findViewById(R.id.v23c);
            RadioButton d = (RadioButton) findViewById(R.id.v23d);
            d.setBackgroundColor(Color.parseColor("#42f45c"));

            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(d.isChecked()){
                corrAns ++;
            }
            if(b.isChecked()){
                b.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }

        }
        if(vg24.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v24a);
            RadioButton b = (RadioButton) findViewById(R.id.v24b);
            RadioButton c = (RadioButton) findViewById(R.id.v24c);
            RadioButton d = (RadioButton) findViewById(R.id.v24d);

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
        if(vg25.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v25a);
            RadioButton b = (RadioButton) findViewById(R.id.v25b);
            RadioButton c = (RadioButton) findViewById(R.id.v25c);
            RadioButton d = (RadioButton) findViewById(R.id.v25d);

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
