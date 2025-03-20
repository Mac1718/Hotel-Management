// Declares the package name for this repository class
package com.hotel.repository;

// Imports required classes
import com.hotel.model.Booking;                                    // Imports the Booking entity model
import org.springframework.data.jpa.repository.JpaRepository;      // Spring Data JPA base repository interface
import org.springframework.stereotype.Repository;                  // Repository annotation for Spring
import java.util.List;                                            // For returning List collections

// Marks this interface as a Spring Repository component
@Repository
// Repository interface that extends JpaRepository with Booking entity and Long ID type
// This provides basic CRUD operations and more out of the box
public interface BookingRepository extends JpaRepository<Booking, Long> {
    // Custom query method to find all bookings for a specific room ID
    // Spring Data JPA will automatically implement this based on the method name
    List<Booking> findByRoomId(Long roomId);
} 