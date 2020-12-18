package com.example.c02603122018;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText user_name, user_age,user_gender,user_id,user_course,user_county,user_university;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user_name = findViewById(R.id.user_name);
        user_age = findViewById(R.id.user_age);
        user_gender = findViewById(R.id.user_gender);
        user_id = findViewById(R.id.user_id);
        user_course = findViewById(R.id.user_course);
        user_county = findViewById(R.id.user_county);
        user_university = findViewById(R.id.user_university);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = user_name.getText().toString().trim();
                String age = user_age.getText().toString().trim();
                String gender = user_gender.getText().toString().trim();
                String id = user_id.getText().toString().trim();
                String course = user_course.getText().toString().trim();
                String county = user_county.getText().toString().trim();
                String university = user_university.getText().toString().trim();
                Bundle bundle = new Bundle();
                bundle.putString("name",name);
                bundle.putString("age",age);
                bundle.putString("gender",gender);
                bundle.putString("id",id);
                bundle.putString("course",course);
                bundle.putString("county",county);
                bundle.putString("university",university);
                Intent intent = new Intent(MainActivity.this, activity2.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }});
    }

}


