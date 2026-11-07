public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro ("Toyota", "Corolla", 2022, 1600, "gasolina");
        CarroElectrico ecarro = new CarroElectrico("Tesla", "Model 3", 2023, 75.0, 500.0);
        Moto moto = new Moto ("Honda", "CB500", 2021, 500, true);

        carro.acelerar();
        carro.acelerar();
        carro.acelerar(120);
        ecarro.acelerar(80);
        moto.acelerar();
        moto.acelerar(150);

        carro.calcularConsumo(300);
        ecarro.calcularConsumo(300);
        moto.calcularConsumo(300);

        carro.frenar();
        ecarro.frenar();
        moto.frenar();

        ecarro.cargarBateria();

        carro.mostrarInfo();
        ecarro.mostrarInfo();
        moto.mostrarInfo();

        Vehiculo[] flota = new Vehiculo[3];
        flota[0] = carro;
        flota[1] = ecarro;
        flota[2] = moto;

        for (Vehiculo vehiculo : flota) {
            vehiculo.calcularConsumo(100);
        }
    }
}
