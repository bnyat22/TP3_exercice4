package com.example.tp3_exercice4;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.UUID;

public class Inscription extends AppCompatActivity {
    EditText nom, prenom, age, ntel;
    TextView id;
    Button affiche;
    private static int compte =0;
    private static final String PRENOM = "prenom";
    private static final String NOM = "nom";
    private static final String AGE = "age";
    private static final String NTEL = "tel";
    private static final String ID = "id";
    private static final String FILENAME = "fichier.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            nom = findViewById(R.id.nom);
            prenom = findViewById(R.id.prenom);
            age = findViewById(R.id.age);
            ntel = findViewById(R.id.nTel);
            id = findViewById(R.id.identite);
            affiche = findViewById(R.id.plan);
            if (savedInstanceState != null) {
                nom.setText(savedInstanceState.getString(NOM));
                prenom.setText(savedInstanceState.getString(PRENOM));
                age.setText(savedInstanceState.getString(AGE));
                ntel.setText(savedInstanceState.getString(NTEL));
                id.setText(savedInstanceState.getString(ID));

            }
            if (id.getText().toString().equals("")) {
                id.setText(generateId());
            }
            Intent intent = new Intent(this,Planning.class);
            affiche.setOnClickListener(v -> {
                startActivity(intent);
            });

        }

    public static int getCompte()
    {
        return compte++;
    }

    private String generateId()
    {
        // String secure = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);

        String secure = UUID.randomUUID().toString();
        return secure;
    }
}