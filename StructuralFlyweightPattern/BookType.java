package StructuralFlyweightPattern;

public class BookType {
    private String type;
    private String distributor;
    private String otherData;

    public String getType() {
        return type;
    }

    public String getDistributor() {
        return distributor;
    }

    public String getOtherData() {
        return otherData;
    }

    public BookType(String type, String distributor, String otherData) {
        this.type = type;
        this.distributor = distributor;
        this.otherData = otherData;
    }

//    @Override
//    public String toString() {
//        return "BookTytpe{" +
//                "type='" + type + '\'' +
//                ", distributor='" + distributor + '\'' +
//                ", otherData='" + otherData + '\'' +
//                '}';
//    }
}
