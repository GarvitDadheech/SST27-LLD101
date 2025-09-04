package com.example.video;

import java.nio.file.Path;
import java.util.Objects;

public class VideoPipelineFacade {
    private final Decoder decoder = new Decoder();
    private final FilterEngine filterEngine = new FilterEngine();
    private final SharpenAdapter sharpenAdapter = new SharpenAdapter();
    private final Encoder encoder = new Encoder();

    public Path process(Path src, Path out, boolean gray, Double scale, Integer sharpenStrength) {
        Objects.requireNonNull(src, "src");
        Objects.requireNonNull(out, "out");

        Frame[] frames = decoder.decode(src);

        if (gray) {
            frames = filterEngine.grayscale(frames);
        }

        if (scale != null) {
            frames = filterEngine.scale(frames, scale);
        }

        if (sharpenStrength != null) {
            frames = sharpenAdapter.sharpen(frames, sharpenStrength);
        }

        return encoder.encode(frames, out);
    }
}
