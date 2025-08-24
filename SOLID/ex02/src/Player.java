public class Player {
    private final Decoder decoder;
    private final Renderer renderer;
    private final FrameCache frameCache;

    public Player(Decoder decoder, Renderer renderer, FrameCache frameCache) {
        this.decoder = decoder;
        this.renderer = renderer;
        this.frameCache = frameCache;
    }

    void play(byte[] fileBytes) {
        Frame frame = decoder.decode(fileBytes);
        renderer.render(frame);
        frameCache.cache(frame);
    }
}