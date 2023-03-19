package com.shop.sklepinternetowy.response;

import com.shop.sklepinternetowy.entity.AuctionType;

import java.util.Objects;

public class AuctionResponse {
    private String name;
    private AuctionType type;
    private int time;

    public AuctionResponse(String name, AuctionType type, int time) {
        this.name = name;
        this.type = type;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public AuctionType getType() {
        return type;
    }

    public int getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuctionResponse that = (AuctionResponse) o;
        return time == that.time && Objects.equals(name, that.name) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, time);
    }


    @Override
    public String toString() {
        return "AuctionResponse{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", time=" + time +
                '}';
    }
}
