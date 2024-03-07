package StructuralFacadePattern;

public class Main {
    public static void main(String[] args) {

        BuyCryptoFacade buyCrypto = new BuyCryptoFacade();
        buyCrypto.buyCryptocurrency(100,"BTC");
    }
}
