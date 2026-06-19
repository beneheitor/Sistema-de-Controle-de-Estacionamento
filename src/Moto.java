public class Moto extends Veiculo{

    public Moto(String placa, String modelo, String nomeDono){
        super(placa,modelo,nomeDono);
    }

    @Override
    public void tipoDoVeiculo() {
        System.out.println("\nMoto cadastrado com sucesso!");
    }
}
