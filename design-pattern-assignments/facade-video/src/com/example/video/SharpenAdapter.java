package com.example.video;

import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public class SharpenAdapter {
    private final LegacySharpen legacySharpen = new LegacySharpen();

    public Frame[] sharpen(Frame[] frames, int strength) {
        Objects.requireNonNull(frames);
        String handle = "HANDLE:" + UUID.randomUUID();
        // In a real scenario, we might serialize frames to a temp location
        // and pass the path as the handle.
        System.out.println("Adapting frames to legacy sharpen filter with handle: " + handle);
        String newHandle = legacySharpen.applySharpen(handle, strength);
        System.out.println("Legacy filter returned new handle: " + newHandle);
        // Pretend we load frames from the new handle.
        return Arrays.copyOf(frames, frames.length);
    }
}
