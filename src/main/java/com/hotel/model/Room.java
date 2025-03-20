package com.hotel.model;

import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String roomType;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private boolean available = true;

    private String description;
} 