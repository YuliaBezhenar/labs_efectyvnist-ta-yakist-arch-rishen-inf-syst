package singletone;
import storage.Storage;

public class StorageManager {
    private static StorageManager instance; //singletone object
    private Storage storage;

    private StorageManager() {}

    //singletone method
    public static StorageManager getInstance() {
        if (instance == null) {
            instance = new StorageManager();
        }
        return instance;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void upload(String fileName) {
        if (storage != null) {
            storage.connect();
            storage.upload(fileName);
            storage.disconnect();
        } else {
            System.out.println("Choose the storage first!");
        }
    }

    public void download(String fileName) {
        if (storage != null) {
            storage.connect();
            storage.download(fileName);
            storage.disconnect();
        } else {
            System.out.println("Choose the storage first!");
        }
    }
}
