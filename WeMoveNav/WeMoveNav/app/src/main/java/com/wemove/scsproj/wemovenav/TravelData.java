package com.wemove.scsproj.wemovenav;

/**
 * Created by rheaayungon on 04/12/2017.
 */

public class TravelData {

    private String travelTime;
    private String trafficRate;

    public TravelData() {

    }

    public TravelData(String travelTime, String trafficRate) {
        this.travelTime = travelTime;
        this.trafficRate = trafficRate;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public String getTrafficRate() {
        return trafficRate;
    }

}
