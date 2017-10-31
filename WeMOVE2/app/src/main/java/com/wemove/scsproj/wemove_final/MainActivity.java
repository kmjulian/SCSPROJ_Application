package com.wemove.scsproj.wemove_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner mFromSpinner;
    private Spinner mToSpinner;
    private ArrayAdapter<String> mFromSpinnerAdapter;
    private ArrayAdapter<String> mToSpinnerAdapter;

    private String mFromLocation;
    private String mToLocation;

    ImageButton imageButtonAccount;
    ImageButton imageButtonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFromSpinner = findViewById(R.id.from_spinner);
        mToSpinner = findViewById(R.id.to_spinner);

        mFromSpinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new ArrayList<String>());
        mFromSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mFromSpinner.setAdapter(mFromSpinnerAdapter);
        mFromSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
            mFromLocation = (String) adapterView.getItemAtPosition(i);
        }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView){
        }
        });

        mToSpinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, new ArrayList<String>());
        mToSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mToSpinner.setAdapter(mToSpinnerAdapter);
        mToSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                mToLocation = (String) adapterView.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

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
