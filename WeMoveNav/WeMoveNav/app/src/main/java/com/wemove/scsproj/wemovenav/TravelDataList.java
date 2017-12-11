package com.wemove.scsproj.wemovenav;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rheaayungon on 04/12/2017.
 */

public class TravelDataList extends ArrayAdapter<TravelData> {
    private Activity context;
    List<TravelData> travelDatas;

    public TravelDataList(Activity context, List<TravelData> travelDatas) {
        super(context, R.layout.activity_datalist, travelDatas);
        this.context = context;
        this.travelDatas = travelDatas;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.activity_datalist, null, true);

        TextView textViewTravelTime = (TextView) listViewItem.findViewById(R.id.textViewTravelTime);

        TravelData travelData = travelDatas.get(position);
        textViewTravelTime.setText(travelData.getTravelTime());

        return listViewItem;
    }
}