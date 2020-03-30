package Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import util.Podam;
import org.springframework.stereotype.Component;

@Component
public class CreateData {
    private final Podam podam;
    private ObjectMapper mapper;
    @Autowired
    public CreateData(Podam podam) {
        this.podam = podam;
        this.mapper = new ObjectMapper();
    }
    public Car generateDefaultCar(){
        return podam.generateDefaultCar();
    }
    public Car generateCustomCar(){
        return podam.generateCustom();
    }
    public void printCar(Car car) throws JsonProcessingException {
        String result = mapper.writeValueAsString(car);
        System.out.println(result);
    }
}
