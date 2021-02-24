package com.codewithdj.foodspice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IntentSign extends AppCompatActivity {

    Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_);

        signin.findViewById(R.id.btnreg);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(IntentSign.this, "Sign In has been clicked", Toast.LENGTH_SHORT).show();
                Intent intent3 = new Intent(IntentSign.this, ViewRecycler_Activity.class);
                startActivity(intent3);
            }
        });

    }
}