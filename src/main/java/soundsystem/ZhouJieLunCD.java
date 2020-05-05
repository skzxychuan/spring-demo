package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class ZhouJieLunCD implements CompactDisc {
    private String title = "爱在西元前，青花瓷，告白气球";
    private String artist = "周杰伦";

    public ZhouJieLunCD() {
        System.out.println("ZhouJieLunCD()========");
        System.out.println("CD歌曲：" + title + "\n" + "演唱: " + artist);
    }

    @Override
    public void play() {
        System.out.println("播放：" + title + "\n" + "演唱: " + artist);
    }
}
