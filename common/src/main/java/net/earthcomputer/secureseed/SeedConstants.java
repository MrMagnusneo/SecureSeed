package net.earthcomputer.secureseed;

public final class SeedConstants {
    private SeedConstants() {
    }

    public static final int WORLD_SEED_LONGS = 16;
    public static final int WORLD_SEED_BITS = WORLD_SEED_LONGS * 64;
    public static final int REQUIRED_WORLD_SEED_BITS = 1024;

    static {
        if (WORLD_SEED_BITS != REQUIRED_WORLD_SEED_BITS) {
            throw new IllegalStateException("WORLD_SEED_BITS must be exactly " + REQUIRED_WORLD_SEED_BITS);
        }
    }
}
