import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.util.*;
class timer
{
    timer()
    {
    playmusi("/Users/Samir/Desktop/Innovative assignment/audio1fin.wav");
}
public static void playmusi(String filepath)
{
    Scanner s = new Scanner(System.in);
    int t;
    InputStream music;
    try
    {
        music = new FileInputStream(new File(filepath));
        AudioStream audios = new AudioStream(music);
        System.out.println("Enter time in seconds u want timer ringing");
        t=s.nextInt();
        Thread.sleep(t*1000);
        AudioPlayer.player.start(audios);
    }
    catch(Exception e)
    {
        System.out.println("Error");
    }
}
}