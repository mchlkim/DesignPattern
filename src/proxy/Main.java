package proxy;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
//        Browser browser = new Browser("www.naver.com");


//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );


        aopBrowser.show();
        System.out.println("Loading Time : " +end.get());


        aopBrowser.show();
        System.out.println("Loading Time : " +end.get());


        aopBrowser.show();
        System.out.println("Loading Time : " +end.get());
    }
}
