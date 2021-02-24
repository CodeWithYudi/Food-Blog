package com.codewithdj.foodspice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login;
    Button register;
    Button skip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Transparent ActionBar

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS , WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getSupportActionBar().hide();

        //redirecting to that button after finding
        login = findViewById(R.id.btnlogin);
        register = findViewById(R.id.btnreg);
        skip = findViewById(R.id.skip);

        //checking login button for clicking
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this , SignIn_Activity.class);
                startActivity(intent);
            }
        });

        //checking register button for clicking
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Register has been clicked", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity.this , SignUp_Activity.class);
                startActivity(intent1);
            }
        });

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Skip has been clicked", Toast.LENGTH_SHORT).show();
                Intent skipped = new Intent(MainActivity.this , ViewRecycler_Activity.class);
                startActivity(skipped);
            }
        });



    }
}