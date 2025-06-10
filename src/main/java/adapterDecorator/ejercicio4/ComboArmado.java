package adapterDecorator.ejercicio4;

public class ComboArmado {
    Combo combo;
    Combo comboBuil;

    public ComboArmado(Combo combo) {
        this.combo = combo;
        comboBuil = combo;

    }

    public ComboArmado conCarne() {
        comboBuil = new ComboConCarne(comboBuil);
        return this;
    }

    public ComboArmado conPapas() {
        comboBuil = new ComboConPapas(comboBuil);
        return this;
    }

    public Combo buil() {
        return comboBuil;
    }
}
