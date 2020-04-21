package chapter03;

public class Phone {

    private Charger charger;
    public Phone(Charger charger) {
        this.charger = charger;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "charger=" + charger +
                '}';
    }
}
