package com.example.tp3_exercice4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class Planning extends AppCompatActivity {
    private TextView p1,p2,p3,p4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planning_activity);

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);
        p4 = findViewById(R.id.p4);
        PlanningModel model = new ViewModelProvider(this).get(PlanningModel.class);
        p1.setText(model.getPremier());
        p2.setText(model.getDeuxieme());
        p3.setText(model.getTroisieme());
        p4.setText(model.getQuatrieme());
    }
}
