package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {
    private List<Car> carGlobalList;

    {
        carGlobalList = new ArrayList<>();
        carGlobalList.add(new Car(1, "ВАЗ", "2110"));
        carGlobalList.add(new Car(2, "ВАЗ", "2115"));
        carGlobalList.add(new Car(3, "BMW", "X5"));
        carGlobalList.add(new Car(4, "Mercedes", "CLS"));
        carGlobalList.add(new Car(5, "Mitsubishi", "L200"));
    }

    @Override
    public List<Car> getCarList(int count) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < Math.min(count, carGlobalList.size()); i++) {
            carList.add(carGlobalList.get(i));
        }
        return carList;
    }

}
