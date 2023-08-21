package sigleton;

public class AClazz {

    private final SocketClient socketClient;

    public AClazz() {
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
