public class Porco extends Animal implements Pesado, Colorido {
    @Override
    public void fazerBarulho() {
        System.out.println("Oinc, Oinc Oinc oinc oincncncnc!!!!!");
    }

    // Implementação da interface Pesado
    @Override
    public double obterPeso() {
        return 53.1;
    }

    // Implementação da interface Colorido
    @Override
    public String obterCor() {
        return "Rosa";
    }

    // Uma propriedade só do porco
    public boolean enlameado() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("\nCor: %s \nPeso: %f \nEnlameado? %s", obterCor(), obterPeso(), enlameado());
    }
}


