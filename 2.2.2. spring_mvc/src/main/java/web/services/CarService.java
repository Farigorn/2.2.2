package web.services;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> addCars();

    List<Car> printCars(int count);
}