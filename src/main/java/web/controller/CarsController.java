package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String getCarsList(@RequestParam(value = "count", defaultValue = "5") Integer count,
                                                       ModelMap model) {
        CarService carService = new CarServiceImp();
        List<Car> carsList = carService.getCars(carService.createCars(), count >= 5 ?  5 : count);
        List<String> carsTable = new ArrayList<>();
        for (Car e: carsList) {
            carsTable.add(e.toString());
        }
        model.addAttribute("carsTable", carsTable);

        return "cars";
    }


}
