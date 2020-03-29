package entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Car {
    private int id;
    private String brand;
    private String color;
    private String price;
}
