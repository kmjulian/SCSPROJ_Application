package com.wemove.scsproj.wemove_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButtonAccount;
    ImageButton imageButtonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtonAccount = (ImageButton) findViewById(R.id.imageButtonAccount);

        imageButtonAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadViewActivity = new Intent(MainActivity.this, AccountActivity.class);
                startActivity(intentLoadViewActivity);
            }
        });

        imageButtonHome = (ImageButton) findViewById(R.id.imageButtonHome);

        imageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadViewActivity = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intentLoadViewActivity);
            }
        });
    }
}
