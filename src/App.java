import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<User> user = new ArrayList();
        boolean running = true;


        while (running) {

            System.out.println("\n\n\n\f %%%%%%%%%%%%% MICRO SISTEMA DE CADASTRO DE CLIENTE %%%%%%%%%%%%% ");
            System.out.println("\n\t[1] Cadastro de Clientes");
            System.out.println("\t[2] Listagem de Clientes cadastrados");
            System.out.println("\t[3] Buscar por Cliente");
            System.out.println("\t[4] Alterar Cliente(s)");
            System.out.println("\t[5] Excluir Cliente(s)");
            System.out.println("\t[6] Sair");
            System.out.print("\nDigite a opção desejada: ");
            String change = input.nextLine();

            switch (change) {
                case "1": {
                    System.out.println("\n ==== ==== Cadastro Simples de Cliente ==== ====\n");
                    System.out.print("\fDigite o nome do Cliente: ");
                    String name = input.nextLine();
                    System.out.print("\fDigite a idade do cliente " + name + ": ");
                    int age = input.nextInt();
                    input.nextLine();
                    User u = new User();
                    u.setName(name);
                    u.setAge(age);

                    user.add(u);
                    System.out.print("\nCliente cadastrado com sucesso!\n");
                    break;
                }
                case "2": {
                    System.out.println("\n ==== ====  Listagem de Dados  ==== ====\n");
                    System.out.println("\n\fAbaixo, todos os Clientes cadastrados\n");
                    boolean a = false;
                    for (int i = 0; i < user.size(); i++) {
                        User fTemp = user.get(i);
                        System.out.println("\t Cliente -> " + user.get(i).getName() + " <- na posicao -> " + i + " <- do banco de dados.");
                        System.out.println("\t Idade: " + user.get(i).getAge());
                        System.out.println("\n");
                        a = true;
                    }
                    if (a == false) {
                        System.out.println(" *--- Ops, nao ha nada aqui. ---* ");
                        break;
                    }
                    break;
                }
                case "3": {
                    System.out.println("\n ==== ==== Busca de Cliente ==== ====\n");
                    System.out.println("Digite o nome do Cliente: ");
                    String name = input.nextLine();

                    boolean found = false;
                    for (int i = 0; i < user.size(); i++) {
                        User fTemp = user.get(i);
                        if (name.equals(fTemp.getName())) {
                            System.out.println("\n\tCliente encontrado\n");
                            System.out.println("\t Nome: " + fTemp.getName());
                            System.out.println("\t Idade: " + fTemp.getAge());
                            System.out.println("\n");
                            found = true;
                        }
                        if (found == false) {
                            System.out.println("\t\n  Ops, nao encontrei o que voce esta procurando. ");
                            break;
                        }
                    }
                    break;
                }
                case "4": {
                    System.out.println("\t\n ==== ==== Atualizacao de Dados ==== ====\n");
                    for (int i = 0; i < user.size(); i++) {
                        User fTemp = user.get(i);
                        System.out.println("[" + i + "]" + fTemp.getName());
                    }
                    System.out.println("\nDigite a posicao pertecente ao Cliente na qual deseja alterar dados: ");
                    int position = input.nextInt();
                    input.nextLine();

                    System.out.println("\f\nVoce esta alterando o nome do Cliente que esta na posicao " + position + ", digite agora o novo nome:  ");
                    String newName = input.nextLine();
                    System.out.println("\fAgora, atualize a idade do Cliente " + newName + " : ");
                    int newAge = input.nextInt();
                    input.nextLine();


                    User u = user.get(position);
                    u.setName(newName);
                    u.setAge(newAge);
                    System.out.println("\fDados aterados com sucesso!\n");
                    break;
                }
                case "5": {
                    System.out.println("\t\n ==== ==== Exclusao de Dados ==== ====\n");
                    for (int i = 0; i < user.size(); i++) {
                        User fTemp = user.get(i);
                        System.out.println("[" + i + "]" + fTemp.getName());
                    }
                    System.out.println("\nDigite o numero pertencente a posicao do Cliente na qual deseja excluir dados: ");
                    int position = input.nextInt();
                    input.nextLine();

                    user.remove(position);

                    System.out.println("\fCliente removido com sucesso!");
                    break;
                }
                case "6": {
                    running = false;
                    System.out.println("\n\n [[[[ Agradeço a utilização ]]]] ");
                    System.out.println("              [[ Tchau Tchau ]]        ");
                    break;
                }
            }
        }
    }
}