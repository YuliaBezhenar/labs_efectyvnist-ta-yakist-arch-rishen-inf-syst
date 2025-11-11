package downloader;

import java.util.HashMap;
import java.util.Map;

public class CachedDownloader implements Downloader {
    private SimpleDownloader downloader;
    private Map<String, String> cache = new HashMap<>();

    public CachedDownloader(SimpleDownloader downloader) {
        this.downloader = downloader;
    }

    @Override
    public String download(String file) {
        if (cache.containsKey(file)) {
            System.out.println("Got from cache for " + file);
            return cache.get(file);
        }else{
            System.out.println("Cache empty. Downloading " + file + "...");
            String result = downloader.download(file);
            cache.put(file, result);
            return result;
        }
    }
}
