package com.example.report;

import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;

public class ReportBundleFacade {
    private final JsonWriter jsonWriter = new JsonWriter();
    private final Zipper zipper = new Zipper();
    private final AuditLog auditLog = new AuditLog();

    public Path export(Map<String, Object> data, Path outDir, String baseName) {
        Objects.requireNonNull(data, "data");
        Objects.requireNonNull(outDir, "outDir");
        Objects.requireNonNull(baseName, "baseName");

        try {
            Path jsonPath = jsonWriter.write(data, outDir, baseName);
            Path zipPath = outDir.resolve(baseName + ".zip");
            Path resultPath = zipper.zip(jsonPath, zipPath);
            auditLog.log("exported " + resultPath);
            return resultPath;
        } catch (UncheckedIOException e) {
            // In a real app, we might log this or handle it differently
            throw e;
        }
    }
}
