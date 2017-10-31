package com.wemove.scsproj.wemove_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by rheaayungon on 25/10/2017.
 */

public class AccountActivity extends AppCompatActivity {

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
                Intent intentLoadViewActivity = new Intent(AccountActivity.this, AccountActivity.class);
                startActivity(intentLoadViewActivity);
            }
        });

        imageButtonHome = (ImageButton) findViewById(R.id.imageButtonHome);

        imageButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadViewActivity = new Intent(AccountActivity.this, MainActivity.class);
                startActivity(intentLoadViewActivity);
            }
        });
    }
}