package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        return List.of(new Bulldozer("Bull1", "blue", 125, 50, 1000),
                new Bulldozer("Bull2", "black", 130, 60, 2000),
                new Bulldozer("Bull3", "red", 120, 40, 1500));
    }
}
