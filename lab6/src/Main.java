import downloader.*;

public class Main {
    public static void main(String[] args) {
        Downloader downloader = new CachedDownloader(new SimpleDownloader());

        String file1 = downloader.download("file1.txt");
        System.out.println(file1);

        //downloading file1 for the second time
        String file2 = downloader.download("file1.txt");
        System.out.println(file2);

        String file3 = downloader.download("file2.txt");
        System.out.println(file3);
    }
}