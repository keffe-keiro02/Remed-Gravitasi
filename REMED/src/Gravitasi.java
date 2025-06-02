public class Gravitasi {
    private double massa1; // dalam kg
    private double massa2; // dalam kg
    private double jarak;  // dalam meter
    private final double G = 6.674e-11; // konstanta gravitasi

    public Gravitasi(double massa1, double massa2, double jarak) {
        this.massa1 = massa1;
        this.massa2 = massa2;
        this.jarak = jarak;
    }

    public double hitungGaya() {
        if (jarak == 0) {
            throw new ArithmeticException("Jarak tidak boleh 0.");
        }
        return G * ((massa1 * massa2) / (jarak * jarak));
    }
}
