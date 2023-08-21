package adapter;

public class HairDryer implements Electronic110V {
    @Override
    public void powerOn() {
        System.out.println("Hairdryer 110v on");
    }
}
