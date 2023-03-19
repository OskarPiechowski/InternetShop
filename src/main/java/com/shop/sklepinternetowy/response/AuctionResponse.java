package com.shop.sklepinternetowy.response;

import com.shop.sklepinternetowy.entity.AuctionType;

import java.util.Objects;

public class AuctionResponse {

    private String name;
    private AuctionType type;
    private int size;

    public AuctionResponse(String name, AuctionType type, int size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuctionResponse that = (AuctionResponse) o;
        return size == that.size && Objects.equals(name, that.name) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, size);
    }

    public String getName() {
        return name;
    }

    public AuctionType getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "AuctionResponse{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", size=" + size +
                '}';
    }
}
