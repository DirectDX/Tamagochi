public class Aburrido implements State{
    private Tamagotchi tamagotchi;
    @Override
    public void jugar() {
        System.out.println("jueguemos");
        tamagotchi.setState(new Cansado());
    }

    @Override
    public void alimentar() {
        System.out.println("No quiero comer, estoy aburrido");
    }

    @Override
    public void dormir() {
        System.out.println("No quiero dormir, estoy aburrido");
    }

    @Override
    public void comoEstas() {
        System.out.println("Estoy aburrido");
    }

    @Override
    public void setTamagochi(Tamagotchi tamagotchi) {
    this.tamagotchi = tamagotchi;
    }
}
