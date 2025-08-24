public class InMemoryFrameCache implements FrameCache {
    private Frame last;

    @Override
    public void cache(Frame frame) {
        last = frame;
        System.out.println("Cached last frame? " + (last != null));
    }
}