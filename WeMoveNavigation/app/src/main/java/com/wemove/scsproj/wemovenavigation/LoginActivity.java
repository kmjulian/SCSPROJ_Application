package com.wemove.scsproj.wemovenavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Handler;

/**
 * Created by rheaayungon on 18/10/2017.
 */

public class LoginActivity extends AppCompatActivity {
    public static final String TAG = "LoginActivity";

    private Button buttonMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        buttonMain = (Button) findViewById(R.id.buttonMain);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buttonMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        TextView textViewRegisterUser;

        textViewRegisterUser = (TextView) findViewById(R.id.textViewRegisterUser);

        textViewRegisterUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}