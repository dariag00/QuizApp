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

public class SportsQuestions extends AppCompatActivity{

    ArrayList<Integer> list;
    ArrayList<Integer> selected;
    String categ;
    int corrAns;
    int nQ;
    String name;

    float maxH, maxS, maxVG, maxE, maxSpt, maxG;
    private InterstitialAd mInterstitialAd;
    Button contin;

    CardView sp1,sp2,sp3,sp4,sp5,sp6,sp7,sp8,sp9,sp10,sp11,sp12,sp13,sp14,sp15,sp16,sp17,sp18,sp19,sp20,sp21,sp22,sp23,sp24,sp25,sp26,sp27,sp28,sp29,sp30;

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

        setTheme(R.style.SportsButtonStyle);

        setContentView(R.layout.sports_questions);

        AdView mAdView = (AdView) findViewById(R.id.adViewSports);
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
        scQ.setBackgroundColor(Color.parseColor("#f44144"));

        contin.setVisibility(GONE);

        //Sports questions
        sp1  = (CardView) findViewById(R.id.sp1);
        sp2  = (CardView) findViewById(R.id.sp2);
        sp3  = (CardView) findViewById(R.id.sp3);
        sp4  = (CardView) findViewById(R.id.sp4);
        sp5  = (CardView) findViewById(R.id.sp5);
        sp6  = (CardView) findViewById(R.id.sp6);
        sp7  = (CardView) findViewById(R.id.sp7);
        sp8  = (CardView) findViewById(R.id.sp8);
        sp9  = (CardView) findViewById(R.id.sp9);
        sp10  = (CardView) findViewById(R.id.sp10);
        sp11  = (CardView) findViewById(R.id.sp11);
        sp12  = (CardView) findViewById(R.id.sp12);
        sp13  = (CardView) findViewById(R.id.sp13);
        sp14  = (CardView) findViewById(R.id.sp14);
        sp15  = (CardView) findViewById(R.id.sp15);
        sp16  = (CardView) findViewById(R.id.sp16);
        sp17  = (CardView) findViewById(R.id.sp17);
        sp18  = (CardView) findViewById(R.id.sp18);
        sp19  = (CardView) findViewById(R.id.sp19);
        sp20  = (CardView) findViewById(R.id.sp20);
        sp21  = (CardView) findViewById(R.id.sp21);
        sp22  = (CardView) findViewById(R.id.sp22);
        sp23  = (CardView) findViewById(R.id.sp23);
        sp24  = (CardView) findViewById(R.id.sp24);
        sp25  = (CardView) findViewById(R.id.sp25);
        sp26  = (CardView) findViewById(R.id.sp26);
        sp27  = (CardView) findViewById(R.id.sp27);
        sp28  = (CardView) findViewById(R.id.sp28);
        sp29  = (CardView) findViewById(R.id.sp29);
        sp30  = (CardView) findViewById(R.id.sp30);

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
        sp21.setVisibility(GONE);
        sp22.setVisibility(GONE);
        sp23.setVisibility(GONE);
        sp24.setVisibility(GONE);
        sp25.setVisibility(GONE);
        sp26.setVisibility(GONE);
        sp27.setVisibility(GONE);
        sp28.setVisibility(GONE);
        sp29.setVisibility(GONE);
        sp30.setVisibility(GONE);

        chooseRandomQuestions(nQ, 30);
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
                    sp20.setVisibility(VISIBLE);
                    break;
                case 21:
                    sp21.setVisibility(VISIBLE);
                    break;
                case 22:
                    sp22.setVisibility(VISIBLE);
                    break;
                case 23:
                    sp23.setVisibility(VISIBLE);
                    break;
                case 24:
                    sp24.setVisibility(VISIBLE);
                    break;
                case 25:
                    sp25.setVisibility(VISIBLE);
                    break;
                case 26:
                    sp26.setVisibility(VISIBLE);
                    break;
                case 27:
                    sp27.setVisibility(VISIBLE);
                    break;
                case 28:
                    sp28.setVisibility(VISIBLE);
                    break;
                case 29:
                    sp29.setVisibility(VISIBLE);
                    break;
                case 30:
                    sp30.setVisibility(VISIBLE);
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
                c.setBackgroundColor(Color.parseColor("#f44141"));
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

        if(sp11.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp11a);
            RadioButton b = (RadioButton) findViewById(R.id.sp11b);
            RadioButton c = (RadioButton) findViewById(R.id.sp11c);
            RadioButton d = (RadioButton) findViewById(R.id.sp11d);

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

        if(sp12.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp12a);
            RadioButton b = (RadioButton) findViewById(R.id.sp12b);
            RadioButton c = (RadioButton) findViewById(R.id.sp12c);
            RadioButton d = (RadioButton) findViewById(R.id.sp12d);

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

        if(sp13.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp13a);
            RadioButton b = (RadioButton) findViewById(R.id.sp13b);
            RadioButton c = (RadioButton) findViewById(R.id.sp13c);
            RadioButton d = (RadioButton) findViewById(R.id.sp13d);

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

        if(sp14.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp14a);
            RadioButton b = (RadioButton) findViewById(R.id.sp14b);
            RadioButton c = (RadioButton) findViewById(R.id.sp14c);
            RadioButton d = (RadioButton) findViewById(R.id.sp14d);

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

        if(sp15.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp15a);
            RadioButton b = (RadioButton) findViewById(R.id.sp15b);
            RadioButton c = (RadioButton) findViewById(R.id.sp15c);
            RadioButton d = (RadioButton) findViewById(R.id.sp15d);

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

        if(sp16.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp16a);
            RadioButton b = (RadioButton) findViewById(R.id.sp16b);
            RadioButton c = (RadioButton) findViewById(R.id.sp16c);
            RadioButton d = (RadioButton) findViewById(R.id.sp16d);

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

        if(sp17.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp17a);
            RadioButton b = (RadioButton) findViewById(R.id.sp17b);
            RadioButton c = (RadioButton) findViewById(R.id.sp17c);
            RadioButton d = (RadioButton) findViewById(R.id.sp17d);

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

        if(sp18.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp18a);
            RadioButton b = (RadioButton) findViewById(R.id.sp18b);
            RadioButton c = (RadioButton) findViewById(R.id.sp18c);
            RadioButton d = (RadioButton) findViewById(R.id.sp18d);

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

        if(sp19.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp19a);
            RadioButton b = (RadioButton) findViewById(R.id.sp19b);
            RadioButton c = (RadioButton) findViewById(R.id.sp19c);
            RadioButton d = (RadioButton) findViewById(R.id.sp19d);

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

        if(sp20.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp20a);
            RadioButton b = (RadioButton) findViewById(R.id.sp20b);
            RadioButton c = (RadioButton) findViewById(R.id.sp20c);
            RadioButton d = (RadioButton) findViewById(R.id.sp20d);

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
        if(sp21.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp21a);
            RadioButton b = (RadioButton) findViewById(R.id.sp21b);
            RadioButton c = (RadioButton) findViewById(R.id.sp21c);
            RadioButton d = (RadioButton) findViewById(R.id.sp21d);

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
        if(sp22.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp22a);
            RadioButton b = (RadioButton) findViewById(R.id.sp22b);
            RadioButton c = (RadioButton) findViewById(R.id.sp22c);
            RadioButton d = (RadioButton) findViewById(R.id.sp22d);

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
        if(sp23.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp23a);
            RadioButton b = (RadioButton) findViewById(R.id.sp23b);
            RadioButton c = (RadioButton) findViewById(R.id.sp23c);
            RadioButton d = (RadioButton) findViewById(R.id.sp23d);

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
        if(sp24.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp24a);
            RadioButton b = (RadioButton) findViewById(R.id.sp24b);
            RadioButton c = (RadioButton) findViewById(R.id.sp24c);
            RadioButton d = (RadioButton) findViewById(R.id.sp24d);

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
        if(sp25.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp25a);
            RadioButton b = (RadioButton) findViewById(R.id.sp25b);
            RadioButton c = (RadioButton) findViewById(R.id.sp25c);
            RadioButton d = (RadioButton) findViewById(R.id.sp25d);
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
        if(sp26.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp26a);
            RadioButton b = (RadioButton) findViewById(R.id.sp26b);
            RadioButton c = (RadioButton) findViewById(R.id.sp26c);
            RadioButton d = (RadioButton) findViewById(R.id.sp26d);
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
        if(sp27.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp27a);
            RadioButton b = (RadioButton) findViewById(R.id.sp27b);
            RadioButton c = (RadioButton) findViewById(R.id.sp27c);
            RadioButton d = (RadioButton) findViewById(R.id.sp27d);
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
        if(sp28.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp28a);
            RadioButton b = (RadioButton) findViewById(R.id.sp28b);
            RadioButton c = (RadioButton) findViewById(R.id.sp28c);
            RadioButton d = (RadioButton) findViewById(R.id.sp28d);
            b.setBackgroundColor(Color.parseColor("#42f45c"));

            if(a.isChecked()){
                a.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(b.isChecked()){
                corrAns ++;
            }
            if(d.isChecked()){
                d.setBackgroundColor(Color.parseColor("#f44141"));
            }
            if(c.isChecked()){
                c.setBackgroundColor(Color.parseColor("#f44141"));
            }
        }
        if(sp29.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp29a);
            RadioButton b = (RadioButton) findViewById(R.id.sp29b);
            RadioButton c = (RadioButton) findViewById(R.id.sp29c);
            RadioButton d = (RadioButton) findViewById(R.id.sp29d);
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
        if(sp30.getVisibility() == VISIBLE) {

            RadioButton a = (RadioButton) findViewById(R.id.sp30a);
            RadioButton b = (RadioButton) findViewById(R.id.sp30b);
            RadioButton c = (RadioButton) findViewById(R.id.sp30c);
            RadioButton d = (RadioButton) findViewById(R.id.sp30d);
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
