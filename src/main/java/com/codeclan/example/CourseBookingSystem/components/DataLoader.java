package com.codeclan.example.CourseBookingSystem.components;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

//        CUSTOMERS
        Customer luke = new Customer("Luke", "Edinburgh", 28);
        customerRepository.save(luke);

        Customer luke2 = new Customer("Luke", "Glasgow", 29);
        customerRepository.save(luke2);

        Customer adam = new Customer("Adam", "Ramsey", 31);
        customerRepository.save(adam);

        Customer gg = new Customer("GG", "Edinburgh", 28);
        customerRepository.save(gg);


//        COURSES
        Course ruby = new Course("Ruby", "North Berwick", 5);
        courseRepository.save(ruby);

        Course JavaScript = new Course("JavaScript", "Inverness", 2);
        courseRepository.save(JavaScript);

        Course Java = new Course("Java", "Edinburgh", 5);
        courseRepository.save(Java);


//        BOOKINGS
        Booking JSBooking1 = new Booking("13-03-2017", luke, JavaScript);
        bookingRepository.save(JSBooking1);

        Booking JSBooking2 = new Booking("13-03-2017", adam, JavaScript);
        bookingRepository.save(JSBooking2);

        Booking RubyBooking1 = new Booking("16-04-2019", luke2, ruby);
        bookingRepository.save(RubyBooking1);

        Booking RubyBooking2 = new Booking("16-04-2019", gg, ruby);
        bookingRepository.save(RubyBooking2);

        Booking JavaBooking1 = new Booking("13-05-2018", luke, Java);
        bookingRepository.save(JavaBooking1);

        Booking JavaBooking2 = new Booking("13-05-2018", gg, Java);
        bookingRepository.save(JavaBooking2);

    }
}
