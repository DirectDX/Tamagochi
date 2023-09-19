public class Hambriento implements State {
    private Tamagotchi tamagotchi;
  @Override
    public void jugar() {
      System.out.println("dame de comer locooooo");
    }

    @Override
    public void alimentar() {
        System.out.println("que ricoooo");
        tamagotchi.setState(new Aburrido() );
    }

    @Override
    public void dormir() {
        System.out.println("no quiero dormir");
    }

    @Override
    public void comoEstas() {
        System.out.println("dame de comer");

    }

    @Override
    public void setTamagochi(Tamagotchi tamagotchi) {
    this.tamagotchi = tamagotchi;
    }

}
