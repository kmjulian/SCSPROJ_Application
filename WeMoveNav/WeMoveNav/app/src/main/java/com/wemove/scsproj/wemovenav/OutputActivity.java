package com.wemove.scsproj.wemovenav;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rheaayungon on 07/12/2017.
 */

public class OutputActivity extends AppCompatActivity {

    List<TravelData> travelDatas;

    DatabaseReference databaseTravelData;
    DatabaseReference databaseView;
    ListView listViewTravelDatas;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        travelDatas = new ArrayList<>();
        databaseTravelData = FirebaseDatabase.getInstance().getReference("travel-data1");
        listViewTravelDatas = (ListView) findViewById(R.id.listViewTravelDatas);
        databaseView = FirebaseDatabase.getInstance().getReference("travel-data1");

    }

    @Override
    protected void onStart() {
        super.onStart();

        databaseView.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                travelDatas.clear();

                for(DataSnapshot postSnapshot : dataSnapshot.getChildren()){
                    TravelData travelData = postSnapshot.getValue(TravelData.class);
                    travelDatas.add(travelData);
                }

                TravelDataList travelDataAdapter = new TravelDataList(OutputActivity.this, travelDatas);
                listViewTravelDatas.setAdapter(travelDataAdapter);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
