package Par;

public class Par <A,B>{
    //Atributos
    private A atributo1;
    private B atributo2;
    //Constructor
    public Par(A atributo1, B atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }
    //Metodos
    public Par<B,A> invertir(){
        return new Par<B,A>(atributo2, atributo1);
    }

    public void mostrar(){
        System.out.println("Atributo 1: " + atributo1 + " | Atributo 2: " + atributo2);
    }
}
