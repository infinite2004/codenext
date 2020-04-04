package com.example.myapplication20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Planets extends AppCompatActivity {
TextView tv1;
Button btn1;
TextView tv2;
Button btn2;
TextView tv3;
Button btn3;
TextView tv4;
Button btn4;
TextView tv5;
Button btn5;
TextView tv6;
Button btn6;
TextView tv7;
Button btn7;
TextView tv8;
Button btn8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planets);
        tv1= findViewById(R.id.tv1);// Our planets
        btn1= findViewById(R.id.btn1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToOurPlanets();
            }
        });

        tv2= findViewById(R.id.tv2);//Galaxies
        btn2= findViewById(R.id.btn2);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToGalaxy();
            }
        });

        tv3= findViewById(R.id.tv3);//Asteriods
        btn3= findViewById(R.id.btn3);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoAsteriods();
            }
        });

        tv4= findViewById(R.id.tv4);//Our Solar Syetem
        btn4= findViewById(R.id.btn4);
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoSolarSystem();
            }
        });

        tv5= findViewById(R.id.tv5);//Comets
        btn5= findViewById(R.id.btn5);
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoComets();
            }
        });
        tv6= findViewById(R.id.tv6);//Meteroids
        btn6= findViewById(R.id.btn6);
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoMeteroids();
            }
        });

        tv7= findViewById(R.id.tv7);//Stars
        btn7= findViewById(R.id.btn7);
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoStars();
            }
        });

        tv8= findViewById(R.id.tv8);//Black Holes
        btn8= findViewById(R.id.btn8);
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoBlackHoles();
            }
        });


    }

    public void goToOurPlanets() {

        Intent toOurPlanets = new Intent(this, OurPlanets.class);
        startActivity(toOurPlanets);

    }
    public void goToGalaxy() {

        Intent toGalaxy = new Intent(this, Galaxy.class);
        startActivity(toGalaxy);

    }

    public void gotoAsteriods() {

        Intent toAsteriods = new Intent(this, Asteriods.class);
        startActivity(toAsteriods);

    }
    public void gotoSolarSystem() {

        Intent toSolarSystem = new Intent(this, SolarSystem.class);
        startActivity(toSolarSystem);

    }
    public void gotoComets() {

        Intent toComets = new Intent(this, Comets.class);
        startActivity(toComets);

    }
    public void gotoMeteroids() {

        Intent toMeteroids = new Intent(this, Meteroids.class);
        startActivity(toMeteroids);

    }
    public void gotoStars() {

        Intent toStars = new Intent(this, Stars.class);
        startActivity(toStars);

    }
    public void gotoBlackHoles() {

        Intent toBlackHoles = new Intent(this, BlackHoles.class);
        startActivity(toBlackHoles);

    }
}
