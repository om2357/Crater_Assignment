package com.ok.crater_assignment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class splashActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> {
             Intent intent  = new Intent(splashActivity.this, MainActivity.class);
             splashActivity.this.startActivity(intent);
             splashActivity.this.finish();
        },1200);

    }
}
