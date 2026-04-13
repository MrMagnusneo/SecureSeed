package net.earthcomputer.secureseed;

import java.math.BigInteger;
import java.security.SecureRandom;

public final class SeedUtils {
    private SeedUtils() {
    }

    public static long[] createRandomWorldSeed() {
        long[] seed = new long[SeedConstants.WORLD_SEED_LONGS];
        SecureRandom rand = new SecureRandom();
        for (int i = 0; i < SeedConstants.WORLD_SEED_LONGS; i++) {
            seed[i] = rand.nextLong();
        }
        return seed;
    }

    public static long[] parseSeed(String seedStr) {
        long[] seed = new long[SeedConstants.WORLD_SEED_LONGS];
        try {
            BigInteger seedBigInt = new BigInteger(seedStr);
            if (seedBigInt.signum() < 0) {
                seedBigInt = seedBigInt.and(BigInteger.ONE.shiftLeft(SeedConstants.WORLD_SEED_BITS).subtract(BigInteger.ONE));
            }
            for (int i = 0; i < SeedConstants.WORLD_SEED_LONGS; i++) {
                BigInteger[] divRem = seedBigInt.divideAndRemainder(BigInteger.ONE.shiftLeft(64));
                seed[i] = divRem[1].longValue();
                seedBigInt = divRem[0];
            }
        } catch (NumberFormatException e) {
            seed[0] = seedStr.hashCode();
        }
        return seed;
    }

    public static String seedToString(long[] seed) {
        BigInteger seedBigInt = BigInteger.ZERO;
        for (int i = SeedConstants.WORLD_SEED_LONGS - 1; i >= 0; i--) {
            BigInteger val = BigInteger.valueOf(seed[i]);
            if (val.signum() < 0) {
                val = val.add(BigInteger.ONE.shiftLeft(64));
            }
            seedBigInt = seedBigInt.shiftLeft(64).add(val);
        }
        return seedBigInt.toString();
    }
}
