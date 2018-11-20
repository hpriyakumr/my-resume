package com.example.hemapriyakumr.myresume;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    Button Bintro,Bacademic,Bproject,Bskill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bintro = (Button)findViewById(R.id.b_intro);
        Bintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Intro_Activity.class);
                startActivity(intent);
            }
        });
        Bacademic = (Button)findViewById(R.id.b_academic);
        Bacademic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Academic.class);
                startActivity(intent);
            }
        });
        Bproject = (Button)findViewById(R.id.b_project);
        Bproject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Project.class);
                startActivity(intent);
            }
        });
        Bskill = (Button)findViewById(R.id.b_skills);
        Bskill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Skill.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(getApplicationContext(),"Portraint mode",Toast.LENGTH_LONG);
        }else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(getApplicationContext(),"Landscape mode",Toast.LENGTH_LONG);
        }
    }
}
