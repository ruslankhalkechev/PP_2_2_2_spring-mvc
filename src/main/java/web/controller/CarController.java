package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;

@Controller
public class CarController {
    private CarDAO carDAO;

    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping("/cars")
    public String show(@RequestParam(name = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("carList", carDAO.getCarList(count));
        return "/cars";
    }
}
