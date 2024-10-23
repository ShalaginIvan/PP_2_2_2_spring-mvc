package web.Dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDaoImp implements CarDao{

    @Override
    public List<Car> createCars() {
        return List.of(
                new Car("Toyota", "Corolla", 1999),
                new Car("Ford", "Focus", 2007),
                new Car("Honda", "Accord", 2010),
                new Car("Chery", "Tiggo4", 2019),
                new Car("Лада", "Калина", 2003)
        );
    }

    @Override
    public List<Car> getCars(int count) {
        return createCars().subList(0, count);
    }
}
