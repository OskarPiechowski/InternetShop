package com.shop.sklepinternetowy.request;

public class AuctionCreationRequest {

    private String name;

    private String type;

    private int time;

    public AuctionCreationRequest(String name, String type, int time) {
        this.name = name;
        this.type = type;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "AuctionCreationRequest{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", time=" + time +
                '}';
    }
}
