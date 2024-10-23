package web.Dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> createCars();
    public List<Car> getCars (int count);
}
