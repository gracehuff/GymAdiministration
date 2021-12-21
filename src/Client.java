import java.util.ArrayList;
import java.util.Scanner;

public class Client extends PersonalCommonInformation {
    public String selectedPlan;
    public Long dueDay;
    public String workoutPlan;
    public Long selectedDaysPerWeek;
    public Instructor selectedInstructor;
    public PersonalCommonInformation personalInformation;

    public static void main(String[] args) throws Exception {
        ArrayList<Client> clients = new ArrayList<>();
        Scanner readData = new Scanner(System.in);

        Integer optionSelected = menu();
        if (optionSelected == 1) {
            registerClient();
        } else if (optionSelected == 2) {
            System.out.println("Para continuar digite o número do registro do CPF do cliente que deseja visualizar:");
            String cpf = readData.next();
            searchClientByCpf(clients, cpf);
        } else if (optionSelected == 3) {
            System.out.println("Para continuar digite o número do registro do CPF do cliente que deseja visualizar:");
            String cpf = readData.next();
            deleteClientByCpf(clients, cpf);
        }
    }


    public static Client registerClient() throws Exception {
        Client newClient = new Client();
        Scanner readData = new Scanner(System.in);
        System.out.println("Primeiro, adicione os campos de informações pessoais do seu cliente:");
        newClient.personalInformation = PersonalCommonInformation.registerPersonalInformation();
        System.out.println("Agora digite o plano que seu cliente selecionou (livre, personal, assistido):");
        newClient.selectedPlan = readData.next();
        if (newClient.selectedPlan.isBlank()) {
            throw new Exception("The client needs a Plan.");
        }
        System.out.println("Agora escolha a data de vencimento:");
        newClient.dueDay = readData.nextLong();
        if (newClient.dueDay >= 32L || newClient.dueDay == null || newClient.dueDay <= 0) {
            throw new Exception(" Due date needs to be between 01 and 31.");
        }
        System.out.println("Agora indique o tipo de plano do seu cliente (Musculação, funcional, crossfit):");
        newClient.workoutPlan = readData.next();
        System.out.println("Agora selecione quantos dias na semana seu cliente irá treinar:");
        newClient.selectedDaysPerWeek = readData.nextLong();
        if (newClient.selectedDaysPerWeek >= 7 || newClient.selectedDaysPerWeek == null || newClient.selectedDaysPerWeek <= 0) {
            throw new Exception("The client needs to choose between 01 and 06 days.");
        }
        System.out.println("Agora digite o nome do instrutor responsável:");
        newClient.selectedInstructor.personalData.nome = readData.next();
        System.out.println("Agora digite o registro do CREF do instrutor:");
        newClient.selectedInstructor.crefRegistry = readData.next();
        if (newClient.selectedInstructor.crefRegistry.isBlank()) {
            throw new Exception("The client needs an Instructor with CrefRegistry.");
        }
        System.out.println("Client added successfully.");
        return newClient;
    }

    public static void deleteClientByCpf(ArrayList<Client> clients, String cpf) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).cpf == cpf) {
                clients.remove(i);
                System.out.println("Cliente removido com sucesso.");
            }
        }
    }

    public static void searchClientByCpf(ArrayList<Client> clients, String cpf) {
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).cpf == cpf) {
                System.out.println(clients.get(i));
            }
        }
    }

    public static Integer menu() {
        Integer optionSelected;
        Scanner readData = new Scanner(System.in);
        System.out.println("Bem vindo ao GymAdministrator");
        System.out.println("Digite a opção que gostaria de executar:");
        System.out.println("1- Adicionar novo cliente");
        System.out.println("2- Visualizar cliente pelo registro do cref");
        System.out.println("3- Deletar um cliente pelo numero do seu CPF");
        optionSelected = readData.nextInt();

        return optionSelected;
    }


    public String getSelectedPlan() {
        return selectedPlan;
    }

    public Long getDueDay() {
        return dueDay;
    }

    public String getWorkoutPlan() {
        return workoutPlan;
    }

    public Long getSelectedDaysPerWeek() {
        return selectedDaysPerWeek;
    }


    public void setSelectedPlan(String selectedPlan) {
        this.selectedPlan = selectedPlan;
    }

    public void setDueDay(Long dueDay) {
        this.dueDay = dueDay;
    }

    public void setWorkoutPlan(String workoutPlan) {
        this.workoutPlan = workoutPlan;
    }

    public void setSelectedDaysPerWeek(Long selectedDaysPerWeek) {
        this.selectedDaysPerWeek = selectedDaysPerWeek;
    }

}

