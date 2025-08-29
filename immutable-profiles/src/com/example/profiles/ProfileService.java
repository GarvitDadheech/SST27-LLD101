package com.example.profiles;

import java.util.Objects;

public class ProfileService {
    public UserProfile createMinimal(String id, String email) {
        return new UserProfile.Builder(id, email).build();
    }

    public UserProfile updateDisplayName(UserProfile p, String displayName) {
        Objects.requireNonNull(p, "profile");
        return new UserProfile.Builder(p.getId(), p.getEmail())
                .withPhone(p.getPhone())
                .withDisplayName(displayName)
                .withAddress(p.getAddress())
                .withMarketingOptIn(p.isMarketingOptIn())
                .withTwitter(p.getTwitter())
                .withGithub(p.getGithub())
                .build();
    }
}
