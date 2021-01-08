package com.example.lokinsafparty;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<survey> surveyList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surveyList = new ArrayList<>();
        surveyList.add(new survey("Hi, Are you agreed",3,2));
        RecyclerView myrv =  findViewById(R.id.recycler_survey);
        surveyAdapter myAdapter = new surveyAdapter(this,surveyList);
        myrv.setLayoutManager(new LinearLayoutManager(this));
        myrv.setAdapter(myAdapter);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {

            // User is signed in
        } else {
            Intent i = new Intent(MainActivity.this, login.class);
            startActivity(i);
            // No user is signed in
        }
    }
}