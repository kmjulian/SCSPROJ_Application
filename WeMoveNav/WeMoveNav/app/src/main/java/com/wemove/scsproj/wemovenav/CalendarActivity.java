package com.wemove.scsproj.wemovenav;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * Created by rheaayungon on 31/10/2017.
 */

public class CalendarActivity extends AppCompatActivity {

    private TextView text;
    private CardView btntoDay;
    private CardView btntoTime;
    private CardView btntoEnter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        text = (TextView) findViewById(R.id.viewDateTime);
        btntoDay = (CardView) findViewById(R.id.btntoDay);
        btntoTime = (CardView) findViewById(R.id.btntoTime);
        btntoEnter = (CardView) findViewById(R.id.btntoEnter);

        btntoDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(CalendarActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.spinner_time, null);
                mBuilder.setTitle("Select day");
                final Spinner mSpinner = (Spinner) mView.findViewById(R.id.spinner);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(CalendarActivity.this,
                        android.R.layout.simple_spinner_item,
                        getResources().getStringArray(R.array.selectDay));
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                mSpinner.setAdapter(adapter);

                mBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (!mSpinner.getSelectedItem().toString().equalsIgnoreCase("Choose a day...")) {
                            Toast.makeText(CalendarActivity.this,
                                    mSpinner.getSelectedItem().toString(),
                                    Toast.LENGTH_SHORT)
                                    .show();
                        }
                    }
                });
                mBuilder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });

        btntoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(CalendarActivity.this);
                View mView = getLayoutInflater().inflate(R.layout.spinner_time, null);
                mBuilder.setTitle("Select time");
                final Spinner mSpinner = (Spinner) mView.findViewById(R.id.spinner);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(CalendarActivity.this,
                        android.R.layout.simple_spinner_item,
                        getResources().getStringArray(R.array.selectTime));
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                mSpinner.setAdapter(adapter);

                mBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (!mSpinner.getSelectedItem().toString().equalsIgnoreCase("Choose a time...")) {
                            Toast.makeText(CalendarActivity.this,
                                    mSpinner.getSelectedItem().toString(),
                                    Toast.LENGTH_SHORT)
                                    .show();
                        }
                    }
                });
                mBuilder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();
            }
        });

        btntoEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalendarActivity.this, OutputActivity.class);
            }
        });
    }
}

