package net.earthcomputer.secureseed;

public final class PortStart {
    private PortStart() {
    }

    public static long[] createPortSeed() {
        return SeedUtils.createRandomWorldSeed();
    }

    public static int requiredSeedBits() {
        return SeedConstants.REQUIRED_WORLD_SEED_BITS;
    }
}
