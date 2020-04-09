package com.codeclan.example.CourseBookingSystem;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repositories.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class CourseBookingSystemApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canGetCoursesByRating(){
		List<Course> foundCourses = courseRepository.findByRating(5);
		assertEquals(2, foundCourses.size());
	}

//	@Test
//	public void canGetCustomersOnACourse(){
//		List<Customer> foundCustomers = bookingRepository.findByCourseName("Java");
//		assertEquals(2, foundCustomers.size());
//		assertEquals("Luke", foundCustomers.get(0).getName());
//	}

	@Test
	public void canGetCoursesByDate(){
		List<Booking> foudnBookings = bookingRepository.findByDate("13-03-2017");
		assertEquals(2, foudnBookings.size());
	}


}
