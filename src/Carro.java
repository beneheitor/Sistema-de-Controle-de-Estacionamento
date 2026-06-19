public class Carro extends Veiculo{

    public Carro(String placa, String modelo, String nomeDono){
        super(placa,modelo,nomeDono);
    }

    @Override
    public void tipoDoVeiculo() {
        System.out.println("\nCarro cadastrado com sucesso!");
    }
}
