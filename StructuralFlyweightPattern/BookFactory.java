package StructuralFlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private static final Map<String, BookType> bookTypeMap = new HashMap<>();

    public static BookType getBookTypes(String type, String distributor, String otherData){
        bookTypeMap.computeIfAbsent(type, t -> new BookType(t, distributor, otherData));
        return bookTypeMap.get(type);
    }
}
