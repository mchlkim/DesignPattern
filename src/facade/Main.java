package facade;

public class Main {
    public static void main(String[] args) {
        Ftp ftpClient = new Ftp("10.10.0.76", 22, "/home/ec2-user");
        ftpClient.connect();
        ftpClient.moveDirectory();


        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.write();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disConnect();


        // facade pattern 사용 코드

        SftpClient sftpClient = new SftpClient("10.10.0.77", 22, "/home/etc", "text.tmp");

        sftpClient.connect();
        sftpClient.writer();
        sftpClient.read();
        sftpClient.disConnect();
    }
}
