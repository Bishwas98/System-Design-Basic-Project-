import java.nio.file.FileSystem;

public class VideoConsumingSerivce {
    private Database database;

    public in seekTime(String userId, String videoId) {
        WatchedVideo watchedVideo = database.getWatchedVideo(userId, videoId);
        return watchVideo.getSeekTime();
    }

}

class VideoService {

    private FileSystem fileSystem;

    public frame getFrame(String videoId, int timestamp) {
        Video video = fileSystem.getVideo(videoId);
        return video.getFrame(timestamp);
    }
}

class Database {

    public WatchedVideo getWatchedVideo(String userId, String videoId) {
        return null;
    }
}

class Video {
    String id;
    Frame[] frames;
    String jsonMetaData;

    public frame getFrame(int timestamp) {
        for (int i = 0; i < frames.length; i++) {
            if (frame[i].startTimestamp <= timestamp &&
                    frames[i].endTimestamp > timestamp) {
                return frames[i];
            }
        }
        throw new IndexOutOfBoundsException();
    }
}

class Frame {
    public static int frameTime = 10;
    byte[] bytes;
    int startTimestamp;
    int endTimestamp;
}

class User {
    String id;
    String name;
    String email;

}

class WatchVideo {
    String id;
    String videoId;
    String userId;

    int seekTime;

    public int getSeekTime() {
        return seekTime;
    }
}