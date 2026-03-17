package bai2_adapter;


interface MediaPlayer {
    void play(String audioType, String fileName);
}


interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}


class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Đang phat file VLC: " + fileName);
    }
    
   
    @Override
    public void playMp4(String fileName) {
   
        System.out.println("VLC Player khong ho tro MP4");
    }
}


class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMusicPlayer;
    
    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        }
    }
    
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        }
    }
}


class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;
    
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Dang phat file MP3: " + fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Dinh dang khong ho tro: " + audioType);
        }
    }
}

// Class chính
public class Bai2_Adapter {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("mp3", "bai-hat.mp3");
        audioPlayer.play("vlc", "phim.vlc");
        audioPlayer.play("mp4", "video.mp4");
    }
}