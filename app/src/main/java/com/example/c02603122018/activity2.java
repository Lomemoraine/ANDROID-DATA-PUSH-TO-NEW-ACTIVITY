package com.example.c02603122018;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);
        Bundle bundle = getIntent().getExtras();
        if (bundle !=null){
            String name = bundle.getString("name");
            String age = bundle.getString("age");
            String gender = bundle.getString("gender");
            String id = bundle.getString("id");
            String course = bundle.getString("course");
            String county = bundle.getString("county");
            String university = bundle.getString("university");
            TextView text1 = findViewById(R.id.text1);
            TextView text22 = findViewById(R.id.text22);
            TextView text33 = findViewById(R.id.text33);
            TextView text44 = findViewById(R.id.text44);
            TextView text55 = findViewById(R.id.text55);
            TextView text66 = findViewById(R.id.text66);
            TextView text77 = findViewById(R.id.text77);
            text1.setText(name);
            text22.setText(age);
            text33.setText(gender);
            text44.setText(id);
            text55.setText(course);
            text66.setText(county);
            text77.setText(university);

        }
    }
    public void viewMessage(View view)
    {
        Intent intent= new Intent(activity2.this,activity3.class);
        startActivity(intent);
    }
}



