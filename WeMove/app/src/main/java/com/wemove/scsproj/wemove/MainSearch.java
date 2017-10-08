package com.wemove.scsproj.wemove;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by rheaayungon on 05/10/2017.
 */

public class MainSearch extends AppCompatActivity {

    public static final String TAG = "MainSearch";

    private Button btntoCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        btntoCalendar = (Button) findViewById(R.id.btntoCalendar);

        btntoCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainSearch.this, CalendarActivity.class);
                startActivity(intent);
            }
        });
    }
}
