package aula2503;

public  class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Volvo", "picape");
        veiculo.ligar();
        System.out.println(veiculo.marca);

        Moto moto = new Moto("Chevrolet", "básico");
        Moto moto1 = new Moto("Chevrolet1", "básico", "laranja", 1999);

        moto.ligar();
        System.out.println(moto.marca);
        System.out.println(moto1.marca);
    }
}
