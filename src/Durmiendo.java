public class Durmiendo implements State{

    private Tamagotchi tamagotchi;
    @Override
    public void jugar() {

    }

    @Override
    public void alimentar() {
    }

    @Override
    public void dormir() {
    }

    @Override
    public void comoEstas() {
        System.out.println("shhh esta durmiendo");
        System.out.println("Lo despertatse, que sorete que sos");
        tamagotchi.setState(new Hambriento());
    }

    @Override
    public void setTamagochi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }
}

