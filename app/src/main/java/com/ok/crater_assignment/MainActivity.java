
package com.ok.crater_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    TextView talk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne = findViewById(R.id.button1);
        btnTwo = findViewById(R.id.button2);
        btnThree = findViewById(R.id.button3);
        talk = findViewById(R.id.TalkUs);

        btnOne.setOnClickListener(view -> gotoUrl());
        btnTwo.setOnClickListener(view -> openActivity2());
        btnThree.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Sorry app is not completed", Toast.LENGTH_SHORT).show());
    }
    public void openActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
        private void gotoUrl() {
        Uri uri = Uri.parse("https://wa.me/message/U3AQWIPMBB6QO1");
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}