import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.alishev.springcourse.ClassicalMusic;
import ru.alishev.springcourse.Music;
import ru.alishev.springcourse.MusicPlayer;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        System.out.println(comparison);
//
//        boolean comparisonEquals = firstMusicPlayer.equals(secondMusicPlayer);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//        System.out.println(comparisonEquals);
//
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());

        context.close();
    }

}
