package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {

    public List<Car> createCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 1999));
        cars.add(new Car("Ford", "Focus", 2007));
        cars.add(new Car("Honda", "Accord", 2010));
        cars.add(new Car("Chery", "Tiggo4", 2019));
        cars.add(new Car("Lada", "Kalina", 2003));
        return cars;
    }

    @Override
    public List<Car> getCars(List<Car> cars, int numberOfCars) {
        return cars.subList(0, numberOfCars);
    }
}
