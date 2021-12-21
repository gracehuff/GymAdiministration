import java.util.ArrayList;
import java.util.Scanner;

public class Instructor extends PersonalCommonInformation {

    public ArrayList<Client> clients;
    public String instructorAccessKey;
    public String crefRegistry;
    public PersonalCommonInformation personalData;


    public static void main(String[] args) throws Exception {
        ArrayList<Instructor> instructors = new ArrayList<>();
        Scanner readData = new Scanner(System.in);

        Integer optionSelected = menu();
        if ( optionSelected == 1) {
            registerInstructor();
        } else if (optionSelected == 2) {
            System.out.println("Para continuar digite o número do registro do CREF do professor que deseja visualizar:");
            String crefRegistry = readData.next();
            showInstructorByCref(instructors, crefRegistry);
        } else if (optionSelected == 3) {
            addClientToInstructor();
        } else if (optionSelected == 4) {
            System.out.println("Para continuar digite o número do registro do CREF do professor que deseja remover:");
            String crefRegistry = readData.next();
            deleteInstructorByCref(instructors, crefRegistry);
        }
    }

    public static Instructor registerInstructor() {
        Scanner readData = new Scanner(System.in);
        Instructor newInstructor = new Instructor();
        System.out.println("Para adicionar um novo instrutor, digite uma chave de acesso para ele:");
        newInstructor.instructorAccessKey = readData.next();
        System.out.println("Digite o número do registro do CREF:");
        newInstructor.crefRegistry = readData.next();
        System.out.println("Digite o nome:");
        newInstructor.personalData.nome = readData.next();
        System.out.println("Digite o CPF");
        newInstructor.personalData.cpf = readData.next();
        System.out.println("Digite o número do RG");
        newInstructor.personalData.rg = readData.next();
        System.out.println("Digite o endereço de email:");
        newInstructor.personalData.email = readData.next();
        System.out.println("Digite a data de nascimento no modelo dd/mm/aaaa:");
        newInstructor.personalData.birthdayDate = readData.next();
        System.out.println("Digite o número do telefone:");
        newInstructor.personalData.phoneNumber = readData.next();
        System.out.println("Por favor, adicione os dados do endereço conforme indicado:");
        System.out.println("Digite o nome da rua:");
        newInstructor.personalData.addressInformation.street = readData.next();
        System.out.println("Digite o número da casa:");
        newInstructor.personalData.addressInformation.number = readData.nextInt();
        System.out.println("Digite a cidade:");
        newInstructor.personalData.addressInformation.city = readData.next();
        System.out.println("Digite o CEP:");
        newInstructor.personalData.addressInformation.postalCode = readData.next();
        System.out.println("Digite o estado:");
        newInstructor.personalData.addressInformation.state = readData.next();
        return newInstructor;
    }

    public static Client addClientToInstructor() throws Exception {
        System.out.println("Para adicionar um novo cliente a um instrutor já existente, digite o número do CREF do instrutor incialmente:");
        System.out.println("Agora digite os dados do cliente conforme indicado");
        return Client.registerClient();
    }

    public static void deleteInstructorByCref(ArrayList<Instructor> instructors, String crefRegistry){
        for (int i=0; i<instructors.size(); i++) {
            if (instructors.get(i).crefRegistry.equals(crefRegistry)){
                instructors.remove(i);
                System.out.println("Instrutor removido com sucesso.");
            }
        }
    }

    public static void showInstructorByCref(ArrayList<Instructor> instructors, String crefRegistry) {
        for (int i=0; i<instructors.size(); i++) {
            if (instructors.get(i).crefRegistry.equals(crefRegistry)){
                System.out.println(instructors.get(i));
            }
        }
    }


    public static Integer menu() {
        Integer optionSelected;
        Scanner readData = new Scanner(System.in);
        System.out.println("Bem vindo ao GymAdministrator");
        System.out.println("Digite a opção que gostaria de executar:");
        System.out.println("1- Adicionar novo instrutor");
        System.out.println("2- Visualizar instrutores pelo registro do cref");
        System.out.println("3- Adicionar um novo cliente");
        System.out.println("4- Deletar um instrutor pelo numero do seu registro do cref");
        optionSelected = readData.nextInt();

        return optionSelected;
    }

    public String getInstructorAccessKey() {
        return instructorAccessKey;
    }

    public void setInstructorAccessKey(String instructorAccessKey) {
        this.instructorAccessKey = instructorAccessKey;
    }

}
