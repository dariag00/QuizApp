package com.klosote.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.example.android.quizapp.R;

import java.util.Random;

/**
 * Created by Diego on 03/04/2017.
 */


public class CategorySelection extends AppCompatActivity{



    int nQ;
    String name;
    int beta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_selection);

        TextView welcome = (TextView) findViewById(R.id.welcomeMessage);
        name = getIntent().getStringExtra("Name"); // obtener valores de otra actividad
        nQ = getIntent().getIntExtra("nQuestions",0);
        beta= getIntent().getIntExtra("beta",0);
        //welcome.setText(String.valueOf(nQ));

       if(!name.matches("")){
            welcome.setText(name + getString(R.string.chooseCategoryWName));
        }else{
            welcome.setText(getString(R.string.chooseCategory));
        }
    }

    public void selected(View view){
        Intent intent;
        String category;
        switch (view.getId()){

            case R.id.geography:
                intent = new Intent(this, GeographyQuestions.class);
                category = "geography";
                intent.putExtra("Category", category);
                intent.putExtra("Name", name);
                intent.putExtra("nQuestions", nQ);
                intent.putExtra("beta", beta);
                startActivity(intent);
                break;
            case R.id.history:
                intent = new Intent(this, HistoryQuestions.class);
                category = "history";
                intent.putExtra("Category", category);
                intent.putExtra("Name", name);
                intent.putExtra("nQuestions", nQ);
                intent.putExtra("beta", beta);
                startActivity(intent);
                break;
            case R.id.entertainment:
                intent = new Intent(this, EnterQuestions.class);
                category = "entertainment";
                intent.putExtra("Category", category);
                intent.putExtra("Name", name);
                intent.putExtra("nQuestions", nQ);
                intent.putExtra("beta", beta);
                startActivity(intent);
                break;
            case R.id.sports:
                intent = new Intent(this, SportsQuestions.class);
                category = "sports";
                intent.putExtra("Category", category);
                intent.putExtra("Name", name);
                intent.putExtra("nQuestions", nQ);
                intent.putExtra("beta", beta);
                startActivity(intent);
                break;
            case R.id.science:
                intent = new Intent(this, ScienceQuestions.class);
                category = "science";
                intent.putExtra("Category", category);
                intent.putExtra("Name", name);
                intent.putExtra("nQuestions", nQ);
                intent.putExtra("beta", beta);
                startActivity(intent);
                break;
            case R.id.videogames:
                intent = new Intent(this, VGamesQuestions.class);
                category = "videogames";
                intent.putExtra("Category", category);
                intent.putExtra("Name", name);
                intent.putExtra("nQuestions", nQ);
                intent.putExtra("beta", beta);
                startActivity(intent);
                break;
            case R.id.random:

                Random random = new Random();

                int randomInt = random.nextInt(6) + 1;


                switch(randomInt){

                    case 1:
                        intent = new Intent(this, GeographyQuestions.class);
                        category = "geography";
                        intent.putExtra("Category", category);
                        intent.putExtra("nQuestions", nQ);
                        intent.putExtra("Name", name);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(this, HistoryQuestions.class);
                        category = "history";
                        intent.putExtra("Category", category);
                        intent.putExtra("nQuestions", nQ);
                        intent.putExtra("Name", name);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(this, EnterQuestions.class);
                        category = "entertainment";
                        intent.putExtra("Category", category);
                        intent.putExtra("nQuestions", nQ);
                        intent.putExtra("Name", name);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(this, SportsQuestions.class);
                        category = "sports";
                        intent.putExtra("Category", category);
                        intent.putExtra("nQuestions", nQ);
                        intent.putExtra("Name", name);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(this, ScienceQuestions.class);
                        category = "science";
                        intent.putExtra("Category", category);
                        intent.putExtra("nQuestions", nQ);
                        intent.putExtra("Name", name);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(this, VGamesQuestions.class);
                        category = "videogames";
                        intent.putExtra("Category", category);
                        intent.putExtra("nQuestions", nQ);
                        intent.putExtra("Name", name);
                        startActivity(intent);
                        break;

                }
                break;

            default:
                Context context = getApplicationContext();
                Toast.makeText(context,R.string.errorCategory, Toast.LENGTH_LONG).show();
                break;

        }
    }

}
