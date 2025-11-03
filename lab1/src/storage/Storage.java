package storage;

public interface Storage {
    void connect();
    void upload(String fileName);
    void download(String fileName);
    void disconnect();
}
