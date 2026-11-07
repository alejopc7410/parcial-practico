public class Vehiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadActual;

    public Vehiculo (String marca, String modelo, int ano) {
        this.velocidadActual = 0;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar () {
        velocidadActual = velocidadActual + 10;
        System.out.println("Acelerando... velocidad actual: " + velocidadActual + " km/h");
    }
    
    public void acelerar (double velocidadObjetivo) {
        if (velocidadObjetivo >  velocidadActual) {
            velocidadActual = velocidadObjetivo;
            System.out.println("Velocidad establecida en: " + velocidadActual + " km/h");
            
        } else {
            System.out.println("La velocidad objetivo debe ser mayor a la actual.");
        }
    }

    public double calcularConsumo (double km) {
        double consumo = (km / 100) * 10;
        System.out.println("Consumo estimado para " + km + " km: " + consumo + " litros");
        return consumo;
    }
    
    public void frenar () {
        velocidadActual = 0;
        System.out.println("Vehiculo detenido");        
    }

    public void mostrarInfo () {
        System.out.println("---Informacion del vehiculo---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + ano);
        System.out.println("Velocidad Actual: " + velocidadActual + "km/h");
    }
}