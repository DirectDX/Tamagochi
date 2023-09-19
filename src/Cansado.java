public class Cansado implements State{
    private Tamagotchi tamagotchi;
    @Override
    public void jugar() {
        System.out.println("No quiero jugar, estoy cansado");

    }

    @Override
    public void alimentar() {
        System.out.println("No quiero comer, estoy Cansado");
    }

    @Override
    public void dormir() {
        System.out.println("que bueno dormir papu");
        tamagotchi.setState(new Durmiendo());
    }

    @Override
    public void comoEstas() {
        System.out.println("Tengo sueño");
    }

    @Override
    public void setTamagochi(Tamagotchi tamagotchi) {
    this.tamagotchi = tamagotchi;
    }
}
