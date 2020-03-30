package util;

import entities.Car;
import uk.co.jemos.podam.api.AttributeMetadata;
import uk.co.jemos.podam.api.DataProviderStrategy;
import uk.co.jemos.podam.typeManufacturers.StringTypeManufacturerImpl;

import java.lang.reflect.Type;
import java.util.Map;

public class CustomStringManufacturer extends StringTypeManufacturerImpl {
    @Override
    public String getType(DataProviderStrategy strategy,
                          AttributeMetadata attributeMetadata,
                          Map<String, Type> genericTypesArgumentsMap) {

        if (Car.class.isAssignableFrom(attributeMetadata.getPojoClass())) {

            if ("brand".equals(attributeMetadata.getAttributeName())) {
                return "chevrolet";
            } else if ("color".equals(attributeMetadata.getAttributeName())) {
                return "Red";
            }else if ("price".equals(attributeMetadata.getAttributeName())) {
                return "200000";
            }
        }
        return super.getType(strategy, attributeMetadata, genericTypesArgumentsMap);
    };

}
