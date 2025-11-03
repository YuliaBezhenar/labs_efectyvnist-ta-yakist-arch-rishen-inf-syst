import storage.localStorage;
import storage.AmazonS3Storage;
import singletone.StorageManager;

public class Main {
    public static void main(String[] args) {
        //get instance of singletone
        StorageManager manager = StorageManager.getInstance();

        //operations with local storage
        manager.setStorage(new localStorage());
        manager.upload("lab1.docx");
        manager.download("dataset.csv");

        System.out.println("--------------------------");

        // operations with Amazon S3
        manager.setStorage(new AmazonS3Storage());
        manager.upload("photo.png");
    }
}