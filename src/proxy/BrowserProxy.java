package proxy;

public class BrowserProxy implements IBrowser {

    private String url;
    private Html html;

    public BrowserProxy(String url) {
        this.url = url;
    }

    @Override
    public Html show() {

        if (html == null) {
            this.html = new Html(url);
            System.out.println("BrowserProxy loading url : " + url);
        }
        System.out.println("BrowserProxy caching url : " + url);
        return html;
    }
}
