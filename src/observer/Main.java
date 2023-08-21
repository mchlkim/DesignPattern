package observer;

public class Main {
    public static void main(String[] args) {
        Button button = new Button("Button");

        button.addListener(System.out::println);

        button.click("메시지 전달1 : Click");
        button.click("메시지 전달2 : Click");
        button.click("메시지 전달3 : Click");
        button.click("메시지 전달4 : Click");
        button.click("메시지 전달5 : Click");

    }
}
