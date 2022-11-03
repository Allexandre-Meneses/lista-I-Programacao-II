package models;

import java.util.ArrayList;

public class Supermercado {
    ArrayList<Prateleira> prateleiras = new ArrayList<>();

    public void novaPrateleira(Prateleira prateleira) {
        prateleiras.add(prateleira);
    }
}
