package CreationalAbstractFactoryPattern.factories;

import CreationalAbstractFactoryPattern.products.AsusGpu;
import CreationalAbstractFactoryPattern.products.AsusMonitor;
import CreationalAbstractFactoryPattern.products.Gpu;
import CreationalAbstractFactoryPattern.products.Monitor;

public class AsusManufacturer extends Company{
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
