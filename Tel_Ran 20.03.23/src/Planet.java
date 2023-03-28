public class Planet {
    public int numberOfMoons;
    public String name;
    public Planet(){

    }
    public Planet(int numberOfMoons,String name ){
        this.numberOfMoons = numberOfMoons;
        this.name = name;
        System.out.println(" Планета " + name);
    }


}
