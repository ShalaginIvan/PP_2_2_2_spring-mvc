package web.Dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao{

    private List<Car> carList;

    public CarDaoImp() {
        this.carList = List.of(
                new Car("Toyota", "Corolla", 1999),
                new Car("Ford", "Focus", 2007),
                new Car("Honda", "Accord", 2010),
                new Car("Chery", "Tiggo4", 2019),
                new Car("Лада", "Калина", 2003)
        );
    }

    @Override
    public List<Car> getCars(int count) {
        if(count <= 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
