package CreationalAbstractFactoryPattern.factories;

import CreationalAbstractFactoryPattern.products.Gpu;
import CreationalAbstractFactoryPattern.products.Monitor;

public abstract class Company {
    public abstract Gpu createGpu();
    public abstract Monitor createMonitor();
}
