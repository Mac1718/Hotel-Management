# Hotel Booking Application

A full-stack hotel booking application built with Spring Boot and React.

## Features

- View available rooms
- Book rooms with customer details
- Room management
- Booking management
- Responsive design

## Tech Stack

### Backend
- Spring Boot 2.7.0
- Spring Data JPA
- Spring Security
- MySQL
- JWT Authentication

### Frontend
- React
- React Router
- Axios
- CSS3

## Prerequisites

- Java 11 or later
- Node.js 14 or later
- MySQL 8.0 or later
- Maven

## Setup Instructions

### Backend Setup

1. Clone the repository
2. Navigate to the project root directory
3. Update the database configuration in `src/main/resources/application.properties`
4. Run the application using Maven:
   ```bash
   mvn spring-boot:run
   ```
5. The backend will start on `http://localhost:8080`

### Frontend Setup

1. Navigate to the frontend directory:
   ```bash
   cd frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Start the development server:
   ```bash
   npm start
   ```
4. The frontend will start on `http://localhost:3000`

## API Endpoints

### Rooms
- GET `/api/rooms` - Get all rooms
- GET `/api/rooms/available` - Get available rooms
- GET `/api/rooms/{id}` - Get room by ID
- POST `/api/rooms` - Create a new room
- DELETE `/api/rooms/{id}` - Delete a room

### Bookings
- POST `/api/bookings` - Create a new booking
- GET `/api/bookings` - Get all bookings
- GET `/api/bookings/{id}` - Get booking by ID
- GET `/api/bookings/room/{roomId}` - Get bookings by room ID
- DELETE `/api/bookings/{id}` - Delete a booking

## Contributing

1. Fork the repository
2. Create your feature branch
3. Commit your changes
4. Push to the branch
5. Create a new Pull Request 