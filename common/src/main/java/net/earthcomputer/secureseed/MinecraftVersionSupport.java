package net.earthcomputer.secureseed;

public final class MinecraftVersionSupport {
    private MinecraftVersionSupport() {
    }

    public static final String MIN_SUPPORTED = "1.16.5";
    public static final String MAX_SUPPORTED = "1.21.10";

    public static boolean isWithinSupportedRange(String version) {
        return compare(version, MIN_SUPPORTED) >= 0 && compare(version, MAX_SUPPORTED) <= 0;
    }

    private static int compare(String left, String right) {
        int[] l = parse(left);
        int[] r = parse(right);
        for (int i = 0; i < 3; i++) {
            if (l[i] != r[i]) {
                return Integer.compare(l[i], r[i]);
            }
        }
        return 0;
    }

    private static int[] parse(String version) {
        String[] parts = version.split("\\.");
        int[] parsed = new int[] {0, 0, 0};
        for (int i = 0; i < parsed.length && i < parts.length; i++) {
            parsed[i] = Integer.parseInt(parts[i]);
        }
        return parsed;
    }
}
