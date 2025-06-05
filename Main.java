public class Main {
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAno(2020);
        carro.setNumeroDePortas(4);

        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("CB 500");
        moto.setAno(2022);
        moto.setTipoDeGuidao("esportivo");

        System.out.println("=== Detalhes do Carro ===");
        carro.exibirDetalhes();

        System.out.println("\n=== Detalhes da Moto ===");
        moto.exibirDetalhes();
    }
}
