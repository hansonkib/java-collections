import java.util.EnumMap;
import java.util.Map;

public class BookEnum {
    static class Book{
        int id;
        String name;
        String author;
        String publisher;

        public Book(int id, String name, String author, String publisher) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
        }

        @Override
        public String toString() {
            return "" +id+
                    ", " +name+
                    ", " +author+
                    ", " +publisher;
        }
    }
    public enum Key{
        One,Two,Three
    }

    public static void main(String[] args) {
        EnumMap<Key,Book> bookMap = new EnumMap<Key, Book>(Key.class);
//        adding books to map
        bookMap.put(Key.One,new Book(1,"Dare be you","hanson","oxford"));
        bookMap.put(Key.Two,new Book(2,"Scarlet song","kibet","macmillan"));
        bookMap.put(Key.Three,new Book(3,"dunia mashaka","sang","kicd"));
        for (Map.Entry<Key,Book> n : bookMap.entrySet()){
            Book b = n.getValue();
            System.out.println(b);
//            System.out.println(b.id+""+b.name+""+b.author+""+b.publisher);
        }

    }
}
