package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;

/**
 * Created by Diego on 05/04/2017.
 */

public class FinalActivity extends AppCompatActivity {

    String name;
    int nQ;
    float maxH = 0, maxS = 0, maxVG = 0, maxE = 0, maxSpt = 0, maxG = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String category = getIntent().getStringExtra("Category");
        nQ = getIntent().getIntExtra("nQuestions",0);
        int nA = getIntent().getIntExtra("nCorrect",0);
        name = getIntent().getStringExtra("Name");

        maxH = getIntent().getFloatExtra("hisP", 0);
        maxS = getIntent().getFloatExtra("sciP", 0);
        maxG = getIntent().getFloatExtra("geoP", 0);
        maxSpt = getIntent().getFloatExtra("spoP", 0);
        maxE = getIntent().getFloatExtra("entP", 0);
        maxVG = getIntent().getFloatExtra("vgP", 0);

        RatingBar br;




        super.onCreate(savedInstanceState);

        setContentView(R.layout.final_activity);

        RatingBar brS = (RatingBar) findViewById(R.id.sciRatingBar);
        RatingBar brH = (RatingBar) findViewById(R.id.histRatingBar);
        RatingBar brV = (RatingBar) findViewById(R.id.vGRatingBar);
        RatingBar brG = (RatingBar) findViewById(R.id.geoRatingBar);
        RatingBar brSp = (RatingBar) findViewById(R.id.sportsRatingBar);
        RatingBar brE = (RatingBar) findViewById(R.id.entRatingBar);

        brS.setRating(maxS);
        brH.setRating(maxH);
        brV.setRating(maxVG);
        brG.setRating(maxG);
        brSp.setRating(maxSpt);
        brE.setRating(maxE);

        TextView mess = (TextView) findViewById(R.id.finalMsg);

        if(!name.matches("")){
            mess.setText(name + getString(R.string.finalMesgWN));
        }else{
            mess.setText(getString(R.string.finalMesg));
        }
        float pr;

        Log.v("sciA", String.valueOf(maxS));
        Log.v("histA", String.valueOf(maxH));

        switch(category){

            case "geo":

                pr = ((float)nA/(float)nQ) * 5;
                br = (RatingBar) findViewById(R.id.geoRatingBar);

                if(maxG < pr)
                {
                    maxG = pr;
                    br.setRating(pr);
                }

                break;
            case "hist":

                pr = ((float)nA/(float)nQ) * 5;
                br = (RatingBar) findViewById(R.id.histRatingBar);

                if(maxH < pr)
                {
                    Log.v("entro y cambio", name);
                    maxH = pr;
                    br.setRating(pr);
                }

                break;
            case "enter":

                pr = ((float)nA/(float)nQ) * 5;
                br = (RatingBar) findViewById(R.id.entRatingBar);
                if(nA != 0)
                    if(maxE < pr)
                    {
                        maxE = pr;
                        br.setRating(pr);
                    }

                break;
            case "spt":

                pr = ((float)nA/(float)nQ) * 5;
                br = (RatingBar) findViewById(R.id.sportsRatingBar);
                if(maxSpt < pr)
                {
                    maxSpt = pr;
                    br.setRating(pr);
                }

                break;
            case "sci":

                pr = ((float)nA/(float)nQ) * 5;
                br = (RatingBar) findViewById(R.id.sciRatingBar);
                if(nA != 0)
                    if(maxS < pr)
                    {
                        maxS = pr;
                        br.setRating(pr);
                    }

                break;
            case "vgames":

                pr = ((float)nA/(float)nQ) * 5;
                br = (RatingBar) findViewById(R.id.vGRatingBar);
                if(nA != 0)
                    if(maxVG < pr)
                    {
                        maxVG = pr;
                        br.setRating(pr);
                    }

                break;
        }

    }

    public void selected(View view){
        Intent intent;
        String category;
        intent = new Intent("com.example.android.quizapp.questions");
        intent.putExtra("hisP", maxH);
        intent.putExtra("sciP", maxS);
        intent.putExtra("geoP", maxG);
        intent.putExtra("entP", maxE);
        intent.putExtra("spoP", maxSpt);
        intent.putExtra("vgP", maxVG);

        switch (view.getId()){

            case R.id.geography:
                category = "geography";
                intent.putExtra("Category", category);
                intent.putExtra("Name", name);
                intent.putExtra("nQuestions", nQ);
                startActivity(intent);
                break;
            case R.id.history:
                category = "history";
                intent.putExtra("Category", category);
                intent.putExtra("Name", name);
                intent.putExtra("nQuestions", nQ);
                startActivity(intent);
                break;
            case R.id.entert:
                category = "entertainment";
                intent.putExtra("Category", category);
                intent.putExtra("Name", name);
                intent.putExtra("nQuestions", nQ);
                startActivity(intent);
                break;
            case R.id.sports:
                category = "sports";
                intent.putExtra("Category", category);
                intent.putExtra("Name", name);
                intent.putExtra("nQuestions", nQ);
                startActivity(intent);
                break;
            case R.id.science:
                category = "science";
                intent.putExtra("Category", category);
                intent.putExtra("Name", name);
                intent.putExtra("nQuestions", nQ);
                startActivity(intent);
                break;
            case R.id.videogames:
                category = "videogames";
                intent.putExtra("Category", category);
                intent.putExtra("Name", name);
                intent.putExtra("nQuestions", nQ);
                startActivity(intent);
                break;

            default:
                Context context = getApplicationContext();
                Toast.makeText(context,"Error al elegir la categoría", Toast.LENGTH_LONG).show();
                break;

        }
    }

    public void link(){

        Intent intent = null;
        try {
            // get the Twitter app if possible
            this.getPackageManager().getPackageInfo("com.twitter.android", 0);
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?user_id=IAmKlose_"));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        } catch (Exception e) {
            // no Twitter app, revert to browser
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/IAmKlose_"));
        }
        this.startActivity(intent);

    }

    public void mainP(){
        Intent i = new Intent(FinalActivity.this, MainActivity.class);
        i.setFlags(FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

}
