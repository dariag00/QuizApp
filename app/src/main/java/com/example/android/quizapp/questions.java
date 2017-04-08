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
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

/**
 * Created by Diego on 03/04/2017.
 */


public class questions extends AppCompatActivity {

    ArrayList<Integer> list;
    ArrayList<Integer> selected;
    String categ;
    int corrAns;
    int nQ;
    String name;

    float maxH, maxS, maxVG, maxE, maxSpt, maxG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String category = getIntent().getStringExtra("Category");
        nQ = getIntent().getIntExtra("nQuestions",0);
        name = getIntent().getStringExtra("Name");
        maxH = getIntent().getFloatExtra("hisP", 0);
        maxS = getIntent().getFloatExtra("sciP", 0);
        maxG = getIntent().getFloatExtra("geoP", 0);
        maxSpt = getIntent().getFloatExtra("spoP", 0);
        maxE = getIntent().getFloatExtra("entP", 0);
        maxVG = getIntent().getFloatExtra("vgP", 0);

        super.onCreate(savedInstanceState);

        switch(category){

            case "geography":
                setTheme(R.style.GeoButtonStyle);
                categ = "geo";
                break;
            case "history":
                setTheme(R.style.HistButtonStyle);
                categ = "hist";
                break;
            case "entertainment":
                setTheme(R.style.EntrButtonStyle);
                categ = "enter";
                break;
            case "sports":
                Log.v("Entro", category);
                setTheme(R.style.SportsButtonStyle);
                categ = "spt";
                break;
            case "science":
                setTheme(R.style.SciButtonStyle);
                categ = "sci";
                break;
            case "videogames":
                setTheme(R.style.VGamesButtonStyle);
                categ = "vgames";
                break;

            default:
                setTheme(R.style.GeoButtonStyle);
                break;
        }


        setContentView(R.layout.questions);


        ScrollView scQ = (ScrollView) findViewById(R.id.scrollQuestions);
        TextView CatName = (TextView) findViewById(R.id.CatName);

        //Setting every cardview to not visible, then in the switch the app sets the questions of each category as visibles

        Button cont = (Button) findViewById(R.id.continueAc);
        cont.setVisibility(GONE);

        //History Questions
        CardView h1  = (CardView) findViewById(R.id.hist1);
        CardView h2  = (CardView) findViewById(R.id.hist2);
        CardView h3  = (CardView) findViewById(R.id.hist3);
        CardView h4  = (CardView) findViewById(R.id.hist4);
        CardView h5  = (CardView) findViewById(R.id.hist5);
        CardView h6  = (CardView) findViewById(R.id.hist6);
        CardView h7  = (CardView) findViewById(R.id.hist7);

        h1.setVisibility(GONE);
        h2.setVisibility(GONE);
        h3.setVisibility(GONE);
        h4.setVisibility(GONE);
        h5.setVisibility(GONE);
        h6.setVisibility(GONE);
        h7.setVisibility(GONE);

        //Geography Questions
        CardView g1  = (CardView) findViewById(R.id.geo1);
        CardView g2  = (CardView) findViewById(R.id.geo2);
        CardView g3  = (CardView) findViewById(R.id.geo3);
        CardView g4  = (CardView) findViewById(R.id.geo4);
        CardView g5  = (CardView) findViewById(R.id.geo5);

        g1.setVisibility(GONE);
        g2.setVisibility(GONE);
        g3.setVisibility(GONE);
        g4.setVisibility(GONE);
        g5.setVisibility(GONE);

        //Science Questions
        CardView s1  = (CardView) findViewById(R.id.sci1);
        CardView s2  = (CardView) findViewById(R.id.sci2);
        CardView s3  = (CardView) findViewById(R.id.sci3);
        CardView s4  = (CardView) findViewById(R.id.sci4);
        CardView s5  = (CardView) findViewById(R.id.sci5);

        s1.setVisibility(GONE);
        s2.setVisibility(GONE);
        s3.setVisibility(GONE);
        s4.setVisibility(GONE);
        s5.setVisibility(GONE);

        //Videogames Questions
        CardView vg1  = (CardView) findViewById(R.id.vga1);
        CardView vg2  = (CardView) findViewById(R.id.vga2);
        CardView vg3  = (CardView) findViewById(R.id.vga3);
        CardView vg4  = (CardView) findViewById(R.id.vga4);

        vg1.setVisibility(GONE);
        vg2.setVisibility(GONE);
        vg3.setVisibility(GONE);
        vg4.setVisibility(GONE);

        //Sports questions
        CardView sp1  = (CardView) findViewById(R.id.sp1);
        CardView sp2  = (CardView) findViewById(R.id.sp2);
        CardView sp3  = (CardView) findViewById(R.id.sp3);
        CardView sp4  = (CardView) findViewById(R.id.sp4);
        CardView sp5  = (CardView) findViewById(R.id.sp5);
        CardView sp6  = (CardView) findViewById(R.id.sp6);
        CardView sp7  = (CardView) findViewById(R.id.sp7);

        sp1.setVisibility(GONE);
        sp2.setVisibility(GONE);
        sp3.setVisibility(GONE);
        sp4.setVisibility(GONE);
        sp5.setVisibility(GONE);
        sp6.setVisibility(GONE);
        sp7.setVisibility(GONE);

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


        switch(category){

            case "geography":
                scQ.setBackgroundColor(Color.parseColor("#81FFDF"));
                CatName.setText(R.string.geo);

                //Setting visibility to the questions
               // chooseRandomQuestions(nQ);

                g1.setVisibility(VISIBLE);
                g2.setVisibility(VISIBLE);
                g3.setVisibility(VISIBLE);
                g4.setVisibility(VISIBLE);
                g5.setVisibility(VISIBLE);

                break;
            case "history":
                scQ.setBackgroundColor(Color.parseColor("#4286f4"));
                CatName.setText(R.string.hist);
                //Setting visibility to the questions
                chooseRandomQuestions(nQ,7);
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

                    }
                }
                break;
            case "entertainment":
                scQ.setBackgroundColor(Color.parseColor("#e00daf"));
                CatName.setText(R.string.entr);
                CatName.setTextSize(20);

                //Setting vis to questions

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



                break;
            case "sports":
                scQ.setBackgroundColor(Color.parseColor("#f44144"));
                CatName.setText(R.string.sports);

                //Setting visibility to the questions

                chooseRandomQuestions(nQ,7);
                for(int el : selected){
                    switch (el){
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

                    }
                }

                break;
            case "science":
                scQ.setBackgroundColor(Color.parseColor("#0de045"));
                CatName.setText(R.string.science);

                //Setting visibility to the questions
                chooseRandomQuestions(nQ,5);
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
                    }
                }

                break;
            case "videogames":
                scQ.setBackgroundColor(Color.parseColor("#8f0de0"));
                CatName.setText(R.string.vgames);

                //Setting visibility to the questions

                vg1.setVisibility(VISIBLE);
                vg2.setVisibility(VISIBLE);
                vg3.setVisibility(VISIBLE);
                vg4.setVisibility(VISIBLE);

                break;
        }
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
 /*
     * Method that marks the correct answers in the screen
     *
     */

    public void submit(View view){

        corrAns = 0;

        switch(categ){

            case "geo":

                //Geography Questions
                CardView g1  = (CardView) findViewById(R.id.geo1);
                CardView g2  = (CardView) findViewById(R.id.geo2);
                CardView g3  = (CardView) findViewById(R.id.geo3);
                CardView g4  = (CardView) findViewById(R.id.geo4);
                CardView g5  = (CardView) findViewById(R.id.geo5);

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
                    //Solution is a c
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
                    //Solution is b
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

                break;
            case "hist":

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

                break;
            case "spt":

                CardView sp1  = (CardView) findViewById(R.id.sp1);
                CardView sp2  = (CardView) findViewById(R.id.sp2);
                CardView sp3  = (CardView) findViewById(R.id.sp3);
                CardView sp4  = (CardView) findViewById(R.id.sp4);
                CardView sp5  = (CardView) findViewById(R.id.sp5);
                CardView sp6  = (CardView) findViewById(R.id.sp6);
                CardView sp7  = (CardView) findViewById(R.id.sp7);

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



                break;
            case "vgames":

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
                if(vg4.getVisibility() == VISIBLE){
                    //Solution is b c d
                    CheckBox a = (CheckBox) findViewById(R.id.vch1);
                    CheckBox b = (CheckBox) findViewById(R.id.vch2);
                    CheckBox c = (CheckBox) findViewById(R.id.vch3);
                    CheckBox d = (CheckBox) findViewById(R.id.vch4);

                    d.setBackgroundColor(Color.parseColor("#42f45c"));
                    b.setBackgroundColor(Color.parseColor("#42f45c"));

                    if(a.isChecked()){
                        a.setBackgroundColor(Color.parseColor("#f44141"));
                    }
                    if(c.isChecked()){
                        c.setBackgroundColor(Color.parseColor("#f44141"));
                    }
                    if(b.isChecked() && d.isChecked()){
                        corrAns ++;
                    }

                }

                break;
            case "sci":

                CardView s1  = (CardView) findViewById(R.id.sci1);
                CardView s2  = (CardView) findViewById(R.id.sci2);
                CardView s3  = (CardView) findViewById(R.id.sci3);
                CardView s4  = (CardView) findViewById(R.id.sci4);
                CardView s5 = (CardView) findViewById(R.id.sci5);

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
                break;
            case "enter":

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
                break;
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


}

