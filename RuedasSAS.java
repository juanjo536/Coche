package ruedassas;

public class RuedasSAS {

    private String marca;
    private int modelo;
    private double motor;

    public enum TipodeCombustible {
        Gasolina, Bioetanol, Diésel, Biodiésel, Gas_natural
    }
    public TipodeCombustible tipocombustible;

    public enum TipodeAutomovil {
        Ciudad, Subcompacto, Compacto, Familiar, Ejecutivo, SUV
    }
    public TipodeAutomovil tipodeautomovil;

    public enum Color {
        Blanco, Negro, Rojo, Naranja, Amarillo, Verde, Azul, Violeta
    }
    public Color color;

    private int numAsientos;
    private int cantDoor;
    private double MaximVel;
    private double velActual;

    public RuedasSAS(String marca, int modelo, double motor,
            TipodeCombustible tipocombustible, TipodeAutomovil tipodeautomovil,
            Color color, int cantDoor, int numAsientos, double velmaxim,
            double velActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipocombustible = tipocombustible;
        this.tipodeautomovil = tipodeautomovil;
        this.color = color;
        this.cantDoor = cantDoor;
        this.numAsientos = numAsientos;
        this.MaximVel = MaximVel;
        this.velActual = velActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;

    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public TipodeCombustible getTipocombustible() {
        return tipocombustible;

    }

    public void setTipocombustible(TipodeCombustible tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    public TipodeAutomovil getTipodeautomovil() {
        return tipodeautomovil;
    }

    public void setTipodeautomovil(TipodeAutomovil tipodeautomovil) {
        this.tipodeautomovil = tipodeautomovil;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int getCantDoor() {
        return cantDoor;
    }

    public void setCantDoor(int cantDoor) {
        this.cantDoor = cantDoor;
    }

    public double getMaximVel() {
        return MaximVel;
    }

    public void setMaximVel(double MaximVel) {
        this.MaximVel = MaximVel;
    }

    public double getVelActual() {
        return velActual;
    }

    public void setVelActual(double velActual) {
        this.velActual = velActual;
    }

    public void acelerar(double incremento) {
        if (velActual + incremento < MaximVel) {
            velActual = velActual + incremento;
        } else {
            System.out.println("No se puedeincremento ir mas alla de la velocidad "
                    + "maxima");
        }
        System.out.println("Velocidad Actual:" + velActual + "km/h");
    }

    public void desAcelerar(double decremento) {
        if (velActual - decremento > 0) {
            velActual = velActual - decremento;
        } else {
            System.out.println("No se puede desacelerar a una velocidad"
                    + "Negativa");
            velActual = 0;
        }
        System.out.println("Velocidad Actual:" + velActual + "km/h");
    }

    public void frenar() {
        velActual = 0;
        System.out.println("El auto ha frenado. Velocidad Actual:"
                + velActual + "km/h");
    }

    public double TiempoAproxLlegada(double distancia) {
        return distancia / velActual;
    }

    public void darInformacion() {
        System.out.println("marca: " + marca);
        System.out.println("modelo:" + modelo);
        System.out.println("motor: " + motor);
        System.out.println("Tipo de combustible: " + tipocombustible);
        System.out.println("Tipo de automovil:" + tipodeautomovil);
        System.out.println("Numero de puertas:" + cantDoor);
        System.out.println("Numero de Asientos:" + numAsientos);
        System.out.println("Velocidad maxima:" + MaximVel + "km/h");
        System.out.println("Color:" + color);
        System.out.println("Velocidad Actual:" + velActual + "km/h");
    }
}
