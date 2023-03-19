package com.shop.sklepinternetowy.request;

public class AuctionRemoveRequest {

    private String name;

    private String type;

    private int time;

    public AuctionRemoveRequest(String name, String type, int time) {
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
        return "AuctionRemoveRequest{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", time=" + time +
                '}';
    }
}
