import java.util.ArrayList;
import java.util.Scanner;

public class Estacionamento {
    ArrayList<Veiculo> estacionamento = new ArrayList<>();
    ArrayList<Carro> qntdCarro = new ArrayList<>();
    ArrayList<Moto> qntdMoto = new ArrayList<>();
    ArrayList<Caminhao> qntdCaminhao = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    String placa;
    String modelo;
    String nomeDono;
    Veiculo veiculo = null;


    public void cadastrarVeiculos() {
        byte opcao;
        System.out.println("""
                Qual o veículo:
                [1] - Carro
                [2] - Moto
                [3] - Caminhão
                """);
        opcao = scan.nextByte();

        System.out.print("\nInforme a placa do veículo:");
        placa = scan.next();
        scan.nextLine();

        System.out.print("\nInforme o modelo do veículo: ");
        modelo = scan.nextLine();


        System.out.print("\nInforme o nome do proprietário: ");
        nomeDono = scan.nextLine();


        switch (opcao) {
            case 1:
                Carro carro = new Carro(placa, modelo, nomeDono);
                veiculo = new Carro(placa, modelo, nomeDono);
                veiculo.tipoDoVeiculo();
                estacionamento.add(veiculo);
                qntdCarro.add(carro);
                break;
            case 2:
                Moto moto = new Moto(placa, modelo, nomeDono);
                veiculo = new Moto(placa, modelo, nomeDono);
                veiculo.tipoDoVeiculo();
                estacionamento.add(veiculo);
                qntdMoto.add(moto);
                break;
            case 3:
                Caminhao caminhao = new Caminhao(placa, modelo, nomeDono);
                veiculo = new Caminhao(placa, modelo, nomeDono);
                veiculo.tipoDoVeiculo();
                estacionamento.add(veiculo);
                qntdCaminhao.add(caminhao);
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    }

    public void verVeiculos() {
        System.out.println("Verificando veículos no estacionamento...\n");
        if (estacionamento.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado!");
        }

        for (Veiculo veiculo : estacionamento) {
            System.out.println(veiculo);
        }
    }

    public void atualizarVeiculo() {
        byte opcaoAtualizar;
        byte continuarAtualizar;
        if (estacionamento.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado");
            return;
        }

        System.out.println("Informe a placa do veículo em que deseja atualizar: ");
        String verificarPlaca = scan.nextLine();

        for (Veiculo veiculo : estacionamento) {
            if (estacionamento.toString().contains(verificarPlaca) && veiculo.getPlaca().equals(verificarPlaca)) {
                do {
                    System.out.println("""
                            \nO que deseja atualizar?
                            \n[1] - Modelo do veículo
                            [2] - Nome do proprietário
                            [3] - Placa do veículo
                            """);
                    opcaoAtualizar = scan.nextByte();
                    scan.nextLine();

                    switch (opcaoAtualizar) {
                        case 1:
                            System.out.println("Informe o modelo do veículo atualizado: ");
                            String novoModelo = scan.nextLine();
                            veiculo.setModelo(novoModelo);
                            System.out.println("Atualizado com sucesso!");
                            break;
                        case 2:
                            System.out.println("Informe o nome do proprietário atualizado: ");
                            String novoNomeDono = scan.nextLine();
                            veiculo.setNomeDono(novoNomeDono);
                            System.out.println("Atualizado com sucesso!");
                            break;
                        case 3:
                            System.out.println("Informe o nome do proprietário atualizado: ");
                            String novaPlaca = scan.nextLine();
                            veiculo.setPlaca(novaPlaca);
                            System.out.println("Atualizado com sucesso!");
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Opção Inválida!");

                    }
                    System.out.println("""
                            Continuar atualizando:
                            [1] - Sim
                            [2] - Não
                            """);
                    continuarAtualizar = scan.nextByte();
                    scan.nextLine();
                    if (continuarAtualizar != 1 && continuarAtualizar != 2) {
                        System.out.println("Opção Inválida");
                    }
                } while (continuarAtualizar != 2);
            }
        }
        System.out.println("Veículo não encontrado!");

    }

    public void deletarVeiculo() {
        if (estacionamento.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado");
            return;
        }

        System.out.println("Informe a placa do veículo em que deseja deletar: ");
        String verificarPlaca = scan.nextLine();

        Veiculo veiculoEncontrado = null;
        for (Veiculo veiculo : estacionamento) {
            if (veiculo.getPlaca().equals(verificarPlaca)) {
                veiculoEncontrado = veiculo;
                break;
            }
        }
        if (veiculoEncontrado != null) {
            qntdCarro.removeIf(carro -> carro.getPlaca().equals(verificarPlaca));
            qntdMoto.removeIf(moto -> moto.getPlaca().equals(verificarPlaca));
            qntdCaminhao.removeIf(caminhao -> caminhao.getPlaca().equals(verificarPlaca));

            estacionamento.remove(veiculoEncontrado);

            System.out.println("Exclusão feita com sucesso!");
        } else {
            System.out.println("Veículo com a placa informada não foi encontrado.");
        }

    }
    public void quantidadeVeiculos() {
        System.out.println("O estacionamento possui: " + estacionamento.size() + " veículos cadastrados!");
        System.out.println("O estacionamento possui: " + qntdCarro.size() + " carros cadastrados!");
        System.out.println("O estacionamento possui: " + qntdMoto.size() + " motos cadastrados!");
        System.out.println("O estacionamento possui: " + qntdCaminhao.size() + " caminhões cadastrados!");
    }
}
