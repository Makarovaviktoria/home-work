public class moon {
    public static void main(String[] args){

        Planet planet1 = new Planet(6, "Земля");
        Planet planet2 = new Planet(11 ,"Плутон");
        Planet planet3 = new Planet(90, "Сатурн");
        Planet planet4 = new Planet(4,"Марс");
        Planet planet5 = new Planet (9,"Венера");
        System.out.println("Планета 1: numberOfMoons = " + planet1.numberOfMoons + ", name = " + planet1.name);
        System.out.println("Планета 2: numberOfMoons = " + planet2.numberOfMoons + ", name = " + planet2.name);
        System.out.println("Планета 3: numberOfMoons = " + planet3.numberOfMoons + ", name = " + planet3.name);
        System.out.println("Планета 4: numberOfMoons = " + planet4.numberOfMoons + ", name = " + planet4.name);
        System.out.println("Планета 5: numberOfMoons = " + planet5.numberOfMoons + ", name = " + planet5.name);

    }
}

