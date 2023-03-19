package com.shop.sklepinternetowy.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Auctions")
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Enumerated(value = EnumType.STRING)
    private AuctionType type;
    private int time;

    public Auction() {
    }

    public Auction(String name, AuctionType type, int time) {
        this.name = name;
        this.type = type;
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auction auction = (Auction) o;
        return id == auction.id && time == auction.time && Objects.equals(name, auction.name) && type == auction.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, time);
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
    public String toString() {
        return "Auction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", time=" + time +
                '}';
    }
}
