package com.shop.sklepinternetowy.request;

import java.util.Objects;

public class AuctionFilterRequest {

    private String auctionType;

    public String getAuctionType() {
        return auctionType;
    }

    public void setAuctionType(String auctionType) {
        this.auctionType = auctionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuctionFilterRequest that = (AuctionFilterRequest) o;
        return Objects.equals(auctionType, that.auctionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auctionType);
    }

    @Override
    public String toString() {
        return "AuctionFilterRequest{" +
                "auctionType='" + auctionType + '\'' +
                '}';
    }
}
