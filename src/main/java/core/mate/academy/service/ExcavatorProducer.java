package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("excavator1", "blue",
                200, "Model-1254"), new Excavator("excavator2", "black",
                300, "Model-1278"), new Excavator("excavator3", "grey",
                100, "Model-1274"));
    }
}
