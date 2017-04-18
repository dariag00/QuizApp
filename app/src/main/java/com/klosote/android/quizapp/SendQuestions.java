package com.klosote.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.android.quizapp.R;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

/**
 * Created by Diego on 17/04/2017.
 */

public class SendQuestions extends AppCompatActivity implements AdapterView.OnItemSelectedListener{


    int posicion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_questions);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.selector_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);


    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        posicion = pos;

        EditText qT = (EditText) findViewById(R.id.qTitle);
        EditText q1 = (EditText) findViewById(R.id.qAns1);
        EditText q2 = (EditText) findViewById(R.id.qAns2);
        EditText q3 = (EditText) findViewById(R.id.qAns3);;
        EditText q4 = (EditText) findViewById(R.id.qAns4);
        EditText bP = (EditText) findViewById(R.id.BugPlace);
        EditText bE = (EditText) findViewById(R.id.BugExplan);
        EditText sugg = (EditText) findViewById(R.id.Suggestion);
        EditText gFeedback = (EditText) findViewById(R.id.generalFeedback);

        qT.setVisibility(GONE);
        q1.setVisibility(GONE);
        q2.setVisibility(GONE);
        q3.setVisibility(GONE);
        q4.setVisibility(GONE);
        bP.setVisibility(GONE);
        bE.setVisibility(GONE);
        sugg.setVisibility(GONE);
        gFeedback.setVisibility(GONE);


        if(pos == 0){

            qT.setVisibility(VISIBLE);
            q1.setVisibility(VISIBLE);
            q2.setVisibility(VISIBLE);
            q3.setVisibility(VISIBLE);
            q4.setVisibility(VISIBLE);

        }else if(pos == 1){
            gFeedback.setVisibility(VISIBLE);

        }else if(pos == 2){

            bP.setVisibility(VISIBLE);
            bE.setVisibility(VISIBLE);

        }else if(pos == 3){
            sugg.setVisibility(VISIBLE);
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

    public void send(View view){

        EditText qT = (EditText) findViewById(R.id.qTitle);
        EditText q1 = (EditText) findViewById(R.id.qAns1);
        EditText q2 = (EditText) findViewById(R.id.qAns2);
        EditText q3 = (EditText) findViewById(R.id.qAns3);;
        EditText q4 = (EditText) findViewById(R.id.qAns4);
        EditText bP = (EditText) findViewById(R.id.BugPlace);
        EditText bE = (EditText) findViewById(R.id.BugExplan);
        EditText sugg = (EditText) findViewById(R.id.Suggestion);
        EditText gFeedback = (EditText) findViewById(R.id.generalFeedback);

        String subject = null, message = null;
        boolean enviable = false;

        Intent intent = new Intent(Intent.ACTION_SENDTO);

        if(posicion == 0){

            String sUsername = qT.getText().toString();

            if(sUsername.matches("")){

                Context context = getApplicationContext();
                Toast.makeText(context, R.string.qTErr, Toast.LENGTH_LONG).show();

            }else{

                subject = "QuizzApp: Envío de Pregunta";
                message = "Título: " + qT.getText().toString();

                sUsername = q1.getText().toString();
                if(!sUsername.matches("")){
                    message = message + "\n" + "Respuesta Correcta: " + sUsername;
                }
                sUsername = q2.getText().toString();
                if(!sUsername.matches("")){
                    message = message + "\n" + "Respuesta 2: " + sUsername;
                }
                sUsername = q3.getText().toString();
                if(!sUsername.matches("")){
                    message = message + "\n" + "Respuesta 3: " + sUsername;
                }
                sUsername = q3.getText().toString();
                if(!sUsername.matches("")){
                    message = message + "\n" + "Respuesta 4: " + sUsername;
                }
                enviable = true;
            }

        }else if(posicion == 1){
            subject = "QuizzApp: Envío de Feedback";

            message = gFeedback.getText().toString();

            if(message.matches("")){
                Context context = getApplicationContext();
                Toast.makeText(context, R.string.gErr, Toast.LENGTH_LONG).show();
            }else{
                enviable = true;
            }



        }else if(posicion == 2){
            subject = "QuizzApp: Bug Encontrado";

            message = "Bug Encontrado en: " + bP.getText().toString();

            if(bP.getText().toString().matches("")){
                Context context = getApplicationContext();
                Toast.makeText(context, R.string.bPErr, Toast.LENGTH_LONG).show();
            }

            message = message + "\n" + "Explicación: "+ bE.getText().toString();

            if(bE.getText().toString().matches("")){
                Context context = getApplicationContext();
                Toast.makeText(context, R.string.bEErr, Toast.LENGTH_LONG).show();
            }else{
                enviable = true;
            }

        }else if(posicion == 3){
            subject = "QuizzApp: Envío de Sugerencia";

            message = sugg.getText().toString();

            if(message.matches("")){
                Context context = getApplicationContext();
                Toast.makeText(context, R.string.gErr, Toast.LENGTH_LONG).show();
            }else{
                enviable = true;
            }
        }

        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL  , new String[]{"klosedasponge@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);


        if (intent.resolveActivity(getPackageManager()) != null && enviable == true) {
            startActivity(intent);
        }
        Context context = getApplicationContext();
        Toast.makeText(context, R.string.ThankY, Toast.LENGTH_LONG).show();

    }


}
