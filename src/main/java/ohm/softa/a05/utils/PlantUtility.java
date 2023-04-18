package ohm.softa.a05.utils;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantBed;
import ohm.softa.a05.model.PlantColor;

import java.util.HashMap;
import java.util.Map;

public abstract class PlantUtility {

    private PlantUtility(){}
    public static <T extends Plant> Map<PlantColor, SimpleList<T>> splitBedByColor(PlantBed<T> bed) {
        Map<PlantColor, SimpleList<T>> result = new HashMap<>();
        for (PlantColor p : PlantColor.values()) {
            SimpleList<T> plantByColor = bed.getPlantsByColor(p);
            if (plantByColor.size() > 0) {
                result.put(p, plantByColor);
            }
        }
        return result;
    }
}
