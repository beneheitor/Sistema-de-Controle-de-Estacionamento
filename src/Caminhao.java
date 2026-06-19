public class Caminhao extends Veiculo{

    public Caminhao(String placa, String modelo, String nomeDono){
        super(placa,modelo,nomeDono);
    }

    @Override
    public void tipoDoVeiculo() {
        System.out.println("\nCaminhão cadastrado com sucesso!");
    }
}
