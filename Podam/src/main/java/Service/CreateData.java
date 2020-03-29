package Service;

import entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import util.Podam;
import org.springframework.stereotype.Component;

@Component
public class CreateData {
    private final Podam podam;
    @Autowired
    public CreateData(Podam podam) {
        this.podam = podam;
    }
    public Car generateDefaultCar(){
        return podam.generateDefaultCar();
    }
}
