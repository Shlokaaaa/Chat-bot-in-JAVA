import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.util.*;
class music
{
   music()
    {
    playmusi("/Users/Samir/Desktop/Innovative assignment/song1fin.wav");
}
public static void playmusi(String filepath)
{
    Scanner s = new Scanner(System.in);
    InputStream music;
    try
    {
        music = new FileInputStream(new File(filepath));
        AudioStream audios = new AudioStream(music);
        AudioPlayer.player.start(audios);
    }   catch(Exception e)
    {
        System.out.println("Error");
    }
}
}