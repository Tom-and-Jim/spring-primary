package chapter02;

import org.springframework.stereotype.Component;

@Component
public class StgPepper implements CompactDisc {
    @Override
    public void play() {
        String title = "Sgt.Pepper's Lonely Hearts Club Band";
        String artists = "The Beatles";
        System.out.println("Playing " + title + " By " + artists);
    }
}
