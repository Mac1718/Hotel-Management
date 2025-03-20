package com.hotel.service;

import com.hotel.model.Booking;
import com.hotel.model.Room;
import com.hotel.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private RoomService roomService;

    @Transactional
    public Booking createBooking(Booking booking) {
        Room room = roomService.getRoomById(booking.getRoom().getId());
        
        if (!room.isAvailable()) {
            throw new IllegalStateException("Room is not available");
        }

        booking.setRoom(room);
        booking.setBookingDate(LocalDateTime.now());
        
        // Update room availability
        roomService.updateRoomAvailability(room.getId(), false);
        
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Booking not found with id: " + id));
    }

    public List<Booking> getBookingsByRoomId(Long roomId) {
        return bookingRepository.findByRoomId(roomId);
    }

    @Transactional
    public void deleteBooking(Long id) {
        Booking booking = getBookingById(id);
        roomService.updateRoomAvailability(booking.getRoom().getId(), true);
        bookingRepository.delete(booking);
    }
} 