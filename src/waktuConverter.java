/**
 * Kelas untuk mengonversi waktu dalam berbagai format.
 */
class WaktuConverter {

    /**
     * Mengonversi waktu dalam detik menjadi jam, menit, dan detik.
     *
     * @param detik Waktu dalam detik.
     * @return String yang berisi waktu dalam format "jam:menit:detik".
     */
    public String detikKeJamMenitDetik(int detik) {
        int jam = detik / 3600;
        int sisaDetik = detik % 3600;
        int menit = sisaDetik / 60;
        int detikSisa = sisaDetik % 60;
        return jam + ":" + menit + ":" + detikSisa;
    }

    /**
     * Mengonversi waktu dalam milidetik menjadi jam, menit, detik, dan milidetik.
     *
     * @param milidetik Waktu dalam milidetik.
     * @return String yang berisi waktu dalam format "jam:menit:detik:milidetik".
     */
    public String milidetikKeJamMenitDetikMilidetik(long milidetik) {
        long detik = milidetik / 1000;
        int milidetikSisa = (int) (milidetik % 1000);

        return detikKeJamMenitDetik((int) detik) + ":" + milidetikSisa;
    }

    public static void main(String[] args) {
        WaktuConverter converter = new WaktuConverter();

        int detik = 3661;
        System.out.println("Konversi detik ke jam:menit:detik: " + converter.detikKeJamMenitDetik(detik));

        long milidetik = 3661001;
        System.out.println("Konversi milidetik ke jam:menit:detik:milidetik: " + converter.milidetikKeJamMenitDetikMilidetik(milidetik));
    }
}
