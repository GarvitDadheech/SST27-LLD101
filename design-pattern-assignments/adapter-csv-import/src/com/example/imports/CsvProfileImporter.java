package com.example.imports;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;

public class CsvProfileImporter implements ProfileImporter {
    private final NaiveCsvReader reader;
    private final ProfileService service;

    public CsvProfileImporter(NaiveCsvReader reader, ProfileService service) {
        this.reader = Objects.requireNonNull(reader);
        this.service = Objects.requireNonNull(service);
    }

    @Override
    public int importFrom(Path csvFile) {
        List<String[]> rows = reader.read(csvFile);
        int importedCount = 0;
        for (String[] row : rows) {
            if (row.length < 3) {
                System.err.println("Skipping invalid row (not enough columns): " + String.join(",", row));
                continue;
            }

            String id = row[0];
            String email = row[1];
            String displayName = row[2];

            if (id == null || id.isBlank() || email == null || email.isBlank() || !email.contains("@")) {
                System.err.println("Skipping invalid row (bad data): " + String.join(",", row));
                continue;
            }

            try {
                service.createProfile(id, email, displayName);
                importedCount++;
            } catch (IllegalArgumentException e) {
                System.err.println("Skipping invalid row (" + e.getMessage() + "): " + String.join(",", row));
            }
        }
        return importedCount;
    }
}
