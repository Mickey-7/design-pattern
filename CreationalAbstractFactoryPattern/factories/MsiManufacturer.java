package CreationalAbstractFactoryPattern.factories;

import CreationalAbstractFactoryPattern.products.Gpu;
import CreationalAbstractFactoryPattern.products.Monitor;
import CreationalAbstractFactoryPattern.products.MsiGpu;
import CreationalAbstractFactoryPattern.products.MsiMonitor;

public class MsiManufacturer extends Company{
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
