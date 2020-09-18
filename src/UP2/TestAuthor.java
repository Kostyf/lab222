package UP2;

public class TestAuthor {
    public static void main(String args[]) {
        Author obj1 = new Author("Kostya", "kostimedev@gmail.com", 'm');
        System.out.println(obj1.toString());

        Author obj2 = new Author();
        System.out.println(obj2.toString());
        obj2.setEmail("kostimed.com");
        System.out.println(obj2.toString());
    }
}