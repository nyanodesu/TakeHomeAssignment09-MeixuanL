package com.example.takehomeassignment09_meixuanl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference myRef = database.getReference("Opera");
    private DatabaseReference myOperaRef = database.getReference("Multiple Opera");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button set = (Button) findViewById(R.id.set);
        set.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                myRef.setValue(new opera("Aida","Verdi",1871));
            }

        });

        Button add = (Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                myOperaRef.push().setValue(new opera("Don Giovanni","Mozart",1787));
            }

        });


    }

}
