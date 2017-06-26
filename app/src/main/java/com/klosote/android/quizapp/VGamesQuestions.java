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
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

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
    private InterstitialAd mInterstitialAd;
    Button contin;

    CardView vg1,vg2,vg3,vg4,vg5,vg6,vg7,vg8,vg9,vg10, vg11,vg12,vg13,vg14,vg15,vg16,vg17,vg18,vg19,vg20,vg21,vg22,vg23,vg24,vg25,vg26,vg27,vg28,vg29,vg30;

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

        AdView mAdView = (AdView) findViewById(R.id.adViewVGames);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        contin = (Button) findViewById(R.id.continueAc);

        contin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInterstitial();
            }
        });

        mInterstitialAd = new InterstitialAd(this);
        // Defined in res/values/strings.xml
        mInterstitialAd.setAdUnitId(getString(R.string.inter_ad_unit_id));

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                continueAc();
            }
        });

        AdRequest adRequest1 = new AdRequest.Builder().build();
        mInterstitialAd.loadAd(adRequest1);


        ScrollView scQ = (ScrollView) findViewById(R.id.scrollQuestions);
        scQ.setBackgroundColor(Color.parseColor("#8f0de0"));

        contin.setVisibility(GONE);

        vg1  = (CardView) findViewById(R.id.vga1);
        vg2  = (CardView) findViewById(R.id.vga2);
        vg3  = (CardView) findViewById(R.id.vga3);
        vg4  = (CardView) findViewById(R.id.vga4);
        vg5  = (CardView) findViewById(R.id.vga5);
        vg6  = (CardView) findViewById(R.id.vga6);
        vg7  = (CardView) findViewById(R.id.vga7);
        vg8  = (CardView) findViewById(R.id.vga8);
        vg9  = (CardView) findViewById(R.id.vga9);
        vg10  = (CardView) findViewById(R.id.vga10);
        vg11  = (CardView) findViewById(R.id.vga11);
        vg12  = (CardView) findViewById(R.id.vga12);
        vg13  = (CardView) findViewById(R.id.vga13);
        vg14  = (CardView) findViewById(R.id.vga14);
        vg15  = (CardView) findViewById(R.id.vga15);
        vg16  = (CardView) findViewById(R.id.vga16);
        vg17  = (CardView) findViewById(R.id.vga17);
        vg18  = (CardView) findViewById(R.id.vga18);
        vg19  = (CardView) findViewById(R.id.vga19);
        vg20  = (CardView) findViewById(R.id.vga20);
        vg21  = (CardView) findViewById(R.id.vga21);
        vg22  = (CardView) findViewById(R.id.vga22);
        vg23  = (CardView) findViewById(R.id.vga23);
        vg24  = (CardView) findViewById(R.id.vga24);
        vg25  = (CardView) findViewById(R.id.vga25);
        vg26  = (CardView) findViewById(R.id.vga26);
        vg27  = (CardView) findViewById(R.id.vga27);
        vg28  = (CardView) findViewById(R.id.vga28);
        vg29  = (CardView) findViewById(R.id.vga29);
        vg30  = (CardView) findViewById(R.id.vga30);

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
        vg26.setVisibility(GONE);
        vg27.setVisibility(GONE);
        vg28.setVisibility(GONE);
        vg29.setVisibility(GONE);
        vg30.setVisibility(GONE);

        chooseRandomQuestions(nQ, 30);
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
                case 26:
                    vg26.setVisibility(VISIBLE);
                    break;
                case 27:
                    vg27.setVisibility(VISIBLE);
                    break;
                case 28:
                    vg28.setVisibility(VISIBLE);
                    break;
                case 29:
                    vg29.setVisibility(VISIBLE);
                    break;
                case 30:
                    vg30.setVisibility(VISIBLE);
                    break;
            }

        }


    }

    private void showInterstitial() {
        // Show the ad if it's ready. Otherwise toast and restart the game.
        if (mInterstitialAd != null && mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Toast.makeText(this, "Ad did not load", Toast.LENGTH_SHORT).show();
            continueAc();
        }
    }

    public void submit(View view){


        Button cont = (Button) findViewById(R.id.continueAc);
        cont.setVisibility(View.VISIBLE);
        view.setVisibility(GONE);


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
                d.setBackgroundColor(Color.parseColor("#f44141"));
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
                b.setBackgroundColor(Color.parseColor("#f44141"));
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
        if(vg26.getVisibility() == VISIBLE){
            //Solution is a
            RadioButton a = (RadioButton) findViewById(R.id.v26a);
            RadioButton b = (RadioButton) findViewById(R.id.v26b);
            RadioButton c = (RadioButton) findViewById(R.id.v26c);
            RadioButton d = (RadioButton) findViewById(R.id.v26d);
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
        if(vg27.getVisibility() == VISIBLE){
            //Solution is b
            RadioButton a = (RadioButton) findViewById(R.id.v27a);
            RadioButton b = (RadioButton) findViewById(R.id.v27b);
            RadioButton c = (RadioButton) findViewById(R.id.v27c);
            RadioButton d = (RadioButton) findViewById(R.id.v27d);

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
        if(vg28.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v28a);
            RadioButton b = (RadioButton) findViewById(R.id.v28b);
            RadioButton c = (RadioButton) findViewById(R.id.v28c);
            RadioButton d = (RadioButton) findViewById(R.id.v28d);
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
        if(vg29.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v29a);
            RadioButton b = (RadioButton) findViewById(R.id.v29b);
            RadioButton c = (RadioButton) findViewById(R.id.v29c);
            RadioButton d = (RadioButton) findViewById(R.id.v29d);
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
        if(vg30.getVisibility() == VISIBLE){
            //Solution is c
            RadioButton a = (RadioButton) findViewById(R.id.v30a);
            RadioButton b = (RadioButton) findViewById(R.id.v30b);
            RadioButton c = (RadioButton) findViewById(R.id.v30c);
            RadioButton d = (RadioButton) findViewById(R.id.v30d);
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

    public void continueAc(){

        if (!mInterstitialAd.isLoading() && !mInterstitialAd.isLoaded()) {
            AdRequest adRequest = new AdRequest.Builder().build();
            mInterstitialAd.loadAd(adRequest);
        }

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
