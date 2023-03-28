package com.cabInvoiceGenerator;

public class PremiumRides {
    public final double distance;
    public final int time;
    public PremiumRides(double distance, int time){
        this.distance = distance;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Distance: "+ this.distance + " Time: " + this.time;
    }
}

