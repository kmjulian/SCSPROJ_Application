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

    public static final String travelID = "";

    private CardView btnOutput;
    private Button buttonLocation;
    private Button buttonDestination;
    private Spinner spinnerLocation;
    private Spinner spinnerDestination;
    private CardView btntoDay;
    private CardView btntoTime;
    private Spinner spinnerDay;
    private Spinner spinnerTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        spinnerDay = (Spinner) findViewById(R.id.spinnerDay);
        spinnerTime = (Spinner) findViewById(R.id.spinnerTime);
        spinnerLocation = (Spinner) findViewById(R.id.spinnerLocation);
        spinnerDestination = (Spinner) findViewById(R.id.spinnerDestination);
        btnOutput = (CardView) findViewById(R.id.btnOutput);
//        btntoDay = (CardView) findViewById(R.id.btntoDay);
//        btntoTime = (CardView) findViewById(R.id.btntoTime);
//        buttonLocation = (Button) findViewById(R.id.btnLocation);
//        buttonDestination = (Button) findViewById(R.id.btnDestination);



        final String dest1 = "Asia Pacific College";
        final String dest2 = "McKinley Road, Makati";
        final String dest3 = "Ayala Triangle Walkways, Makati";
        final String dest4 = "Chino Roces Avenue, Makati";

        final String day1 = "Monday";
        final String day2 = "Tuesday";
        final String day3 = "Wednesday";
        final String day4 = "Thursday";
        final String day5 = "Friday";
        final String day6 = "Saturday";
        final String day7 = "Sunday";

        final String time1 = "AM";
        final String time2 = "PM";
        final String time3 = "Mid Day";
        final String time4 = "Whole Day";
        final String time5 = "Evening";
        final String time6 = "Early AM";


        btnOutput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String location = spinnerLocation.getSelectedItem().toString().trim();
                String destination = spinnerDestination.getSelectedItem().toString().trim();
                String time = spinnerTime.getSelectedItem().toString().trim();
                String day = spinnerDay.getSelectedItem().toString().trim();

                Toast.makeText(SearchActivity.this, location + destination, Toast.LENGTH_SHORT).show();

                if (location.equals("Asia Pacific College") && destination.equals("Mckinley Road, Makati") && day.equals(day1) && time.equals(time1)) {
                    Intent intent = new Intent(SearchActivity.this, OutputActivity.class);
                    intent.putExtra(travelID, "APC-McKinley(mon-am)");
                    startActivity(intent);
                }

                if (location.equals("Asia Pacific College") && destination.equals("Mckinley Road, Makati") && day.equals(day1) && time.equals(time2)) {
                    Intent intent = new Intent(SearchActivity.this, OutputActivity.class);
                    intent.putExtra(travelID, "APC-McKinley(mon-pm)");
                    startActivity(intent);
                }

                if (location.equals("Asia Pacific College") && destination.equals("Mckinley Road, Makati") && day.equals(day1) && time.equals(time3)) {
                    Intent intent = new Intent(SearchActivity.this, OutputActivity.class);
                    intent.putExtra(travelID, "APC-McKinley(mon-mid)");
                    startActivity(intent);
                }

                if (location.equals("Asia Pacific College") && destination.equals("Mckinley Road, Makati") && day.equals(day1) && time.equals(time4)) {
                    Intent intent = new Intent(SearchActivity.this, OutputActivity.class);
                    intent.putExtra(travelID, "APC-McKinley(mon-whole)");
                    startActivity(intent);
                }

                if (location.equals("Asia Pacific College") && destination.equals("Mckinley Road, Makati") && day.equals(day1) && time.equals(time5)) {
                    Intent intent = new Intent(SearchActivity.this, OutputActivity.class);
                    intent.putExtra(travelID, "APC-McKinley(mon-eve)");
                    startActivity(intent);
                }

                if (location.equals("Asia Pacific College") && destination.equals("Mckinley Road, Makati") && day.equals(day1) && time.equals(time6)) {
                    Intent intent = new Intent(SearchActivity.this, OutputActivity.class);
                    intent.putExtra(travelID, "APC-McKinley(mon-eam)");
                    startActivity(intent);
                }


            }
        });

//        btntoDay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialog.Builder mBuilder = new AlertDialog.Builder(SearchActivity.this);
//                View mView = getLayoutInflater().inflate(R.layout.spinner_time, null);
//                mBuilder.setTitle("Select day");
//                final Spinner mSpinner = (Spinner) mView.findViewById(R.id.spinner);
//                ArrayAdapter<String> adapter = new ArrayAdapter<String>(SearchActivity.this,
//                        android.R.layout.simple_spinner_item,
//                        getResources().getStringArray(R.array.selectDay));
//                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                mSpinner.setAdapter(adapter);
//
//                mBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        if (!mSpinner.getSelectedItem().toString().equalsIgnoreCase("Choose a day...")) {
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
//        btntoTime.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AlertDialog.Builder mBuilder = new AlertDialog.Builder(SearchActivity.this);
//                View mView = getLayoutInflater().inflate(R.layout.spinner_time, null);
//                mBuilder.setTitle("Select time");
//                final Spinner mSpinner = (Spinner) mView.findViewById(R.id.spinner);
//                ArrayAdapter<String> adapter = new ArrayAdapter<String>(SearchActivity.this,
//                        android.R.layout.simple_spinner_item,
//                        getResources().getStringArray(R.array.selectTime));
//                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                mSpinner.setAdapter(adapter);
//
//                mBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        if (!mSpinner.getSelectedItem().toString().equalsIgnoreCase("Choose a time...")) {
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