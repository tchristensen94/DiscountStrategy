package pos;

/**
 * Created by Timothy on 10/2/2014.
 */
public class Main {

    public static void main(String[] args) {
        Register r = new Register();
        r.startTransaction("001C", new FakeDatabase());
        r.addItem("115A", 15);
        r.addItem("116A", 1);
        r.endTransaction();
    }
}
