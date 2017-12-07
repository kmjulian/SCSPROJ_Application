package com.wemove.scsproj.wemovenav;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;

public class SearchActivity extends AppCompatActivity {

    private CardView btnCalendar;
    private Button buttonLocation;
    private Button buttonDestination;
    private Spinner spinnerLocation;
    private Spinner spinnerDestination;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        spinnerLocation = (Spinner) findViewById(R.id.spinnerLocation);
        spinnerDestination = (Spinner) findViewById(R.id.spinnerDestination);
        btnCalendar = (CardView) findViewById(R.id.btnCalendar);
//        buttonLocation = (Button) findViewById(R.id.btnLocation);
//        buttonDestination = (Button) findViewById(R.id.btnDestination);



        final String message1 = "Asia Pacific College";
        final String message2 = "Taguig City";

        btnCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String location = spinnerLocation.getSelectedItem().toString().trim();
                String destination = spinnerDestination.getSelectedItem().toString().trim();

                Toast.makeText(SearchActivity.this, location + destination, Toast.LENGTH_SHORT).show();

                if (location.equals("Asia Pacific College") && destination.equals("Taguig City")) {
                    Intent intent = new Intent(SearchActivity.this, CalendarActivity.class);
                    startActivity(intent);
                }


            }
        });

//        buttonLocation.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AlertDialog.Builder mBuilder = new AlertDialog.Builder(SearchActivity.this);
//                View mView = getLayoutInflater().inflate(R.layout.spinner_time, null);
//                mBuilder.setTitle("Select Location");
//                final Spinner mSpinner = (Spinner) mView.findViewById(R.id.spinner);
//                ArrayAdapter<String> adapter = new ArrayAdapter<String>(SearchActivity.this,
//                        android.R.layout.simple_spinner_item,
//                        getResources().getStringArray(R.array.selectLocation));
//                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                mSpinner.setAdapter(adapter);
//
//                mBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        if (!mSpinner.getSelectedItem().toString().equalsIgnoreCase("Choose a current location...")) {
//
//                            location[1] = mSpinner.getSelectedItem().toString();
//                            Toast.makeText(SearchActivity.this,
//                                    mSpinner.getSelectedItem().toString(),
//                                    Toast.LENGTH_SHORT)
//                                    .show();
//                        }
//                    }
//                });
//                mBuilder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        dialogInterface.dismiss();
//                    }
//                });
//                mBuilder.setView(mView);
//                AlertDialog dialog = mBuilder.create();
//                dialog.show();
//            }
//        });
//
//        buttonDestination.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AlertDialog.Builder mBuilder = new AlertDialog.Builder(SearchActivity.this);
//                View mView = getLayoutInflater().inflate(R.layout.spinner_time, null);
//                mBuilder.setTitle("Select Destination");
//                final Spinner mSpinner = (Spinner) mView.findViewById(R.id.spinner);
//                ArrayAdapter<String> adapter = new ArrayAdapter<String>(SearchActivity.this,
//                        android.R.layout.simple_spinner_item,
//                        getResources().getStringArray(R.array.selectDestination));
//                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                mSpinner.setAdapter(adapter);
//
//                mBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        if (!mSpinner.getSelectedItem().toString().equalsIgnoreCase("Choose destination...")) {
//
//                            destination[1] = mSpinner.getSelectedItem().toString();
//                            Toast.makeText(SearchActivity.this,
//                                    mSpinner.getSelectedItem().toString(),
//                                    Toast.LENGTH_SHORT)
//                                    .show();
//                        }
//                    }
//                });
//                mBuilder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        dialogInterface.dismiss();
//                    }
//                });
//                mBuilder.setView(mView);
//                AlertDialog dialog = mBuilder.create();
//                dialog.show();
//            }
//        });

    }
}