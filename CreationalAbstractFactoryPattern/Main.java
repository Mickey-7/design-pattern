package CreationalAbstractFactoryPattern;

import CreationalAbstractFactoryPattern.factories.AsusManufacturer;
import CreationalAbstractFactoryPattern.factories.Company;
import CreationalAbstractFactoryPattern.factories.MsiManufacturer;
import CreationalAbstractFactoryPattern.products.Gpu;
import CreationalAbstractFactoryPattern.products.Monitor;
import CreationalAbstractFactoryPattern.products.Product;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();

        List.of(
                msi.createGpu(),
                msi.createMonitor(),
                asus.createGpu(),
                asus.createMonitor()
        ).forEach(Product::assemble);
    }
}

/* Abstract Factory
    - allows you to produce families of related objects
      without specifying their concrete class
    - many design start by using factory method pattern and
      later evolve toward an abstract factory design

    - explicitly declare interfaces for each distinct product
    - create abstract factory class
*/



