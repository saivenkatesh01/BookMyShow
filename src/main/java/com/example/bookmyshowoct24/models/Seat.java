package com.example.bookmyshowoct24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "seats")
public class Seat extends BaseModel {
    private String seatNumber;
    private int rowValue;
    private int colValue;

    @ManyToOne
    private SeatType seatType;
}


/*

 1           1
Seat ----- SeatType => M:1
 M           1

 */