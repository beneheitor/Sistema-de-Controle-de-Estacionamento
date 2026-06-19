import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        Scanner scan = new Scanner(System.in);
        byte opcao ;

        System.out.println(" |---------+BEM VINDO, AO ESTACIONAMENTO JAVAIGUARDANDO+----------|");

        do {
            System.out.println("""
                    \n[1] - Cadastrar veículo.
                    [2] - Verificar veículos.
                    [3] - Verificar quantidade de veículos presente.
                    [4] - Atualizar veículos.
                    [5] - Deletar veículos
                    [6] - Sair
                    """);

            opcao = scan.nextByte();

            switch (opcao) {
                case 1:
                    estacionamento.cadastrarVeiculos();
                    break;
                case 2:
                    estacionamento.verVeiculos();
                    break;
                case 3:
                    estacionamento.quantidadeVeiculos();
                    break;
                case 4:
                    estacionamento.atualizarVeiculo();
                    break;
                case 5:
                    estacionamento.deletarVeiculo();
                    break;
                case 6:
                    System.out.println("""
                            
                             _____________________________________
                            |                                     |
                            |       FECHANDO ESTACIONAMENTO       |
                            |                                     |
                            |_____________________________________|
                            
                                                                         ___..--'  .`.
                                                                ___...--'     -  .` `.`.
                                                       ___...--' _      -  _   .` -   `.`.
                                              ___...--'  -       _   -       .`  `. - _ `.`.
                                       __..--'_______________ -         _  .`  _   `.   - `.`.
                                    .`    _ /\\    -        .`      _     .`__________`. _  -`.`.
                                  .` -   _ /  \\_     -   .`  _         .` |ESTACIONAMENTO|`.   - `.`.
                                .`-    _  /   /\\   -   .`        _   .`   |______________|  `. _   `.`.
                              .`________ /__ /_ \\____.`____________.`     ___       ___  - `._____`|
                                |   -  __  -|    | - |  ____  |   | | _  |   |  _  |   |  _ |
                                | _   |  |  | -  |   | |.--.| |___| |    |___|     |___|    |
                                |     |--|  |    | _ | |'--'| |---| |   _|---|     |---|_   |
                                |   - |__| _|  - |   | |.--.| |   | |    |   |_  _ |   |    |
                             ---``--._      |    |   |=|'--'|=|___|=|====|___|=====|___|====|
                             -- . ''  ``--._| _  |  -|_|.--.|_______|_______________________|
                            `--._           '--- |_  |:|'--'|:::::::|:::::::::::::::::::::::|
                            _____`--._ ''      . '---'``--._|:::::::|:::::::::::::::::::::::|
                            ----------`--._          ''      ``--.._|:::::::::::::::::::::::|
                            `--._ _________`--._'        --     .   ''-----.................'
                                 `--._----------`--._.  _           -- . :''           -    ''
                                      `--._ _________`--._ :'              -- . :''      -- . ''
                             -- . ''       `--._ ---------`--._   -- . :''
                                      :'        `--._ _________`--._:'  -- . ''      -- . ''
                              -- . ''     -- . ''    `--._----------`--._      -- . ''     -- . ''
                                                          `--._ _________`--._
                             -- . ''           :'              `--._ ---------`--._-- . ''    -- . ''
                                      -- . ''       -- . ''         `--._ _________`--._   -- . ''
                            :'                 -- . ''          -- . ''  `--._----------`--._
                            """);
                    break;
                default:
                    System.out.println("Opção Inválida. Tente novamente!");
            }
        } while (opcao != 6);
    }
}