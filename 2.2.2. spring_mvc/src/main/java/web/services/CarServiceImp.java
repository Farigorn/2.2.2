package web.services;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {

    @Override
    public List<Car> addCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Gaz", 10, 120));
        cars.add(new Car("Yaz", 20, 110));
        cars.add(new Car("Mrs", 22, 150));
        cars.add(new Car("Porshe", 909, 180));
        cars.add(new Car("Niva", 33, 125));
        return cars;
    }

    @Override
    public List<Car> printCars(int count) {
        List<Car> printCars = new ArrayList<>();
        if (count < 6) {
            for (int i = 0; i < count; i++) {
                printCars.add(addCars().get(i));
            }
        } else {
            printCars.addAll(addCars());
        }
        return printCars;
    }
}
