package gt.edu.umg.progra3.parcial1.pilas;

public class NotationParser {

    private Pila pila;

    public NotationParser(Pila pila) {
        this.pila = pila;
    }

    public String posFixToInfix(String expression){

        String[] operandosYOperadores = expression.split(" + ");

        for(String item: operandosYOperadores){

            if (!isOperador(item)){
                pila.push(item);
            }else {
                String operandoDerecho = pila.pop();
                String operandoIzquierdo = pila.pop();
                String resultado = operandoIzquierdo + " " + item + " " + operandoDerecho;
                pila.push(resultado);
            }

        }

        return pila.pop();

    }

    private boolean isOperador(String item){

        if ("+".equals(item)){
            return true;
        }
        if ("-".equals(item)){
            return true;
        }
        if ("*".equals(item)){
            return true;
        }
        if ("/".equals(item)){
            return true;
        }

        return false;
    }
}
