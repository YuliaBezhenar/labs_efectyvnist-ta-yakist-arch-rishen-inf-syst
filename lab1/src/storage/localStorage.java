package storage;

public class localStorage implements Storage{
    public void connect(){
        System.out.println("Connected to local storage");
    }

    public void upload(String fileName){
        System.out.println(fileName + " uploaded to local storage");
    }

    public void download(String fileName){
        System.out.println(fileName + " downloaded from local storage");
    }

    public void disconnect(){
        System.out.println("Disconnected from local storage");
    }
}
