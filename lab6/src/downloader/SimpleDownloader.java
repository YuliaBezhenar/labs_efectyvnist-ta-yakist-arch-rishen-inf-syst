package downloader;

public class SimpleDownloader implements Downloader {
    @Override
    public String download(String file) {
        System.out.println("Downloading " + file + "...");
        //simulating long downloading process
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "File " + file + " downloaded.";
    }
}
