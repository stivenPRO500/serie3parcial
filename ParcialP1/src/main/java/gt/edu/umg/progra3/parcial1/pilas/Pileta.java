package gt.edu.umg.progra3.parcial1.pilas;

import java.util.ArrayList;
import java.util.List;

public class Pileta implements Pila{

    private List<String> caldero = new ArrayList<>();

    @Override
    public void push(String item) {
        caldero.add(item);
    }

    @Override
    public String pop() {
        return caldero.remove(caldero.size()-1);

    }

    @Override
    public String peek() {
        return caldero.get(caldero.size()-1);
    }

    @Override
    public int size() {
        return caldero.size();
    }

    @Override
    public boolean isEmpty() {
        return caldero.isEmpty();
    }
}
