package adapter;

public class Cleaner implements Electronic220V {
    @Override
    public void connect() {
        System.out.println("Cleaner 220V on");
    }
}
