public final class CarroElectrico extends Carro {
    private double capacidadBateria;
    private double autonomiaKm;

    public CarroElectrico (String marca, String modelo, int ano, double capacidadBateria, double autonomiaKm) {
        super (marca, modelo, ano, 0, "electrico");
        this.autonomiaKm = autonomiaKm;
        this.capacidadBateria = capacidadBateria;
    }

    @Override 
    public double calcularConsumo (double km) {
        double kWh = (km / autonomiaKm) * capacidadBateria;
        System.out.println("Consumo para " + km + "km: " + kWh + "kWh (electrico)");
        return kWh;
    }

    public void cargarBateria () {
        System.out.println("Bateria cargada al 100%");
        System.out.println("Autonomia disponible: " + autonomiaKm + "km");
    }

    @Override
    public void mostrarInfo () {
        super.mostrarInfo();
        System.out.println("Tipo: Carro Electrico");
        System.out.println("Capacidad bateria: " + capacidadBateria + "kWh");
        System.out.println("Autonomia :" + autonomiaKm + "km");
    }
}