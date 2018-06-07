package com.mgs.service;

import com.mgs.model.Car;
import com.mgs.repository.CarRepository;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CarServiceTest {
    private final List<Car> cars = new ArrayList<>();

    @Before
    public void initCars(){
        Car car = new Car();
        car.setId(11L);
        car.setLicensePlate("11_plate");
        car.setManufacturer("11_man");
        DateTime date = DateTime.parse("1980-07-30");
        car.setManufactureDate(date);
        cars.add(car);
    }

    @Test
    public void findAll(){
        CarRepository carRepository = mock(CarRepository.class);
        when(carRepository.findAll()).thenReturn(cars);
        CarService carService = new CarServiceImpl();
        ReflectionTestUtils.setField(carService, "carRepository", carRepository);
        assertEquals(1, carService.findAll().size());
    }
}
