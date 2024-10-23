package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(int count) {
        // если count вне диапазона от 1 до 5, то выводим весь список
        // если count = 0, то выводим пустую таблицу
        return carDao.getCars((count >= 5)||(count < 0) ?  5 : count);
    }
}
