import java.util.ArrayList;
import java.util.Scanner;

public class Gym {
    public String crefRegistry;
    public ArrayList<Instructor> instructors = new ArrayList<>();
    public ArrayList<Client> clients = new ArrayList<>();
    public Long cnpjInformation;
    public String gymName;
    public String phoneNumber;
    public Address gymLocation;
    public String email;

    public void main(String[] args) throws Exception {
        ArrayList<Gym> gyms = new ArrayList<>();
        Scanner readData = new Scanner(System.in);

        Integer optionSelected = menu();
        if (optionSelected == 1) {
            registerGym();
        } else if (optionSelected == 2) {
            System.out.println("Para continuar digite o número do registro do cref do Academia que deseja visualizar:");
            String cref = readData.next();
            searchGymByCrefRegistry(gyms, cref);
        } else if (optionSelected == 3) {
            System.out.println("Para continuar digite o número do registro do CPF do cliente que deseja visualizar:");
            String cpf = readData.next();
            Client.searchClientByCpf(this.clients, cpf);
        } else if (optionSelected == 4) {
            System.out.println("Para continuar digite o número do registro do cref do instrutor que deseja visualizar:");
            String cref = readData.next();
            Instructor.showInstructorByCref(this.instructors, cref);
        }
    }

    public static Integer menu() {
        Integer optionSelected;
        Scanner readData = new Scanner(System.in);
        System.out.println("Bem vindo ao GymAdministrator");
        System.out.println("Digite a opção que gostaria de executar:");
        System.out.println("1- Adicionar academia");
        System.out.println("2- Visualizar academia pelo registro do CREF");
        System.out.println("3- Visualizar cliente pelo CPF");
        System.out.println("4- Visualizar instrutor pelo CREF");
        optionSelected = readData.nextInt();

        return optionSelected;
    }

    public static void registerGym() throws Exception {
        Gym newGym = new Gym();
        Scanner readData = new Scanner(System.in);
        System.out.println("Digite o número do registro do CREF:");
        newGym.crefRegistry = readData.next();
        if(newGym.crefRegistry.isBlank()){
            throw new Exception("The field Cref Registry is required");
        }
        System.out.println("Digite o número do CNPJ:");
        newGym.cnpjInformation = readData.nextLong();
        if(newGym.cnpjInformation == null){
            throw new Exception("The field CNPJ information is required");
        }
        System.out.println("Digite o nome da academia:");
        newGym.gymName = readData.next();
        if(newGym.gymName.isBlank()){
            throw new Exception("The field Gym Name is required");
        }
        System.out.println("Digite o número de telefone da academia:");
        newGym.phoneNumber = readData.next();
        System.out.println("Digite o email da academia:");
        newGym.email = readData.next();
    }

    public static void searchGymByCrefRegistry(ArrayList<Gym> gyms, String crefRegistry) {
        for (int i=0; i<gyms.size(); i++){
            if (gyms.get(i).getCrefRegistry().equals(crefRegistry)){
                System.out.println(gyms.get(i));
            }
        }
    }

    public Long getCnpjInformation() {
        return cnpjInformation;
    }

    public String getCrefRegistry() {
        return crefRegistry;
    }

    public String getGymName() {
        return gymName;
    }

    public String getEmail() {
        return email;
    }

    public Address getGymLocation() {
        return gymLocation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setCrefRegistry(String crefRegistry) {
        this.crefRegistry = crefRegistry;
    }


    public void setCnpjInformation(Long cnpjInformation) {
        this.cnpjInformation = cnpjInformation;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setGymLocation(Address gymLocation) {
        this.gymLocation = gymLocation;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
