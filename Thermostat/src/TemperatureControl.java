import java.util.Scanner;

class TemperatureControl {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Podaj temperaturę aktualną");
    double currentTemperature = input.nextInt();
    System.out.println("Podaj temperaturę docelową");
    int targetTemperature = input.nextInt();
    
    Thermostat thermostat = new Thermostat(currentTemperature, targetTemperature);
    
    while (!thermostat.targetTemperatureReached()) {
        System.out.println("Aktualna temperatura" + thermostat.getCurrentTemperature());
        thermostat.adjustTemperature();
    }
    System.out.println("Osiągnięto temperaturę docelową " + thermostat.getCurrentTemperature() + " stopni");
    
}
}

