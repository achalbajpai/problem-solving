class sol1732 {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] altitude = new int[n + 1]; // To store altitudes

        altitude[0] = 0; // Initial altitude

        // Calculate altitudes
        for (int i = 1; i <= n; i++) {
            altitude[i] = altitude[i - 1] + gain[i - 1];
        }

        // Find the largest altitude
        int maxAltitude = altitude[0];
        for (int i = 1; i <= n; i++) {
            if (altitude[i] > maxAltitude) {
                maxAltitude = altitude[i];
            }
        }

        return maxAltitude;
    }
}
