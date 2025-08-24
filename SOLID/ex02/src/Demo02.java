public class Demo02 {
    public static void main(String[] args) {
        Decoder decoder = new VideoDecoder();
        Renderer renderer = new ConsoleRenderer();
        FrameCache frameCache = new InMemoryFrameCache();
        Player player = new Player(decoder, renderer, frameCache);

        player.play(new byte[]{1, 2, 3, 4});
    }
}
