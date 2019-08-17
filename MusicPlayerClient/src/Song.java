import sun.audio.AudioStream;

import java.util.ArrayList;

public class Song {
    private AudioStream audioStream;
    private String name;
    private String author;
    private ArrayList<String> feat;

    Song(AudioStream audioStream, String name){
        this.audioStream = audioStream;
        this.name = name;
        this.author = "unknown author";
        this.feat = new ArrayList<>();

    }

    public AudioStream getAudioStream() {
        return audioStream;
    }

    public void setAudioStream(AudioStream audioStream) {
        this.audioStream = audioStream;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ArrayList<String> getFeat() {
        return feat;
    }

    public void setFeat(ArrayList<String> feat) {
        this.feat = feat;
    }


}
