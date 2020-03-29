package util;

import entities.Car;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Podam {
    public Car generateDefaultCar(){
        PodamFactory factory = new PodamFactoryImpl();
        Car car = factory.manufacturePojo(Car.class);
        return car;
    }

}
