package storage;

public class AmazonS3Storage implements Storage{
    public void connect(){
        System.out.println("Connected to AmazonS3 storage");
    }

    public void upload(String fileName){
        System.out.println(fileName + " uploaded to AmazonS3 storage");
    }

    public void download(String fileName){
        System.out.println(fileName + " downloaded from AmazonS3 storage");
    }

    public void disconnect(){
        System.out.println("Disconnected from AmazonS3 storage");
    }
}
