package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        return List.of(new Truck("truck1", "blue", 150, 144, 45),
                new Truck("truck2", "black", 200, 150, 78),
                new Truck("truck3", "red", 250, 200, 50));
    }
}
