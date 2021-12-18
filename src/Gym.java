import java.util.ArrayList;
import java.util.Scanner;

public class Gym {
    public String crefRegistry;
    public ArrayList<String> instructors = new ArrayList<String>();
    public ArrayList<String> clients = new ArrayList<String>();
    public Long cnpjInformation;
    public String gymName;
    public String phoneNumber;
    public Address gymLocation;
    public String email;

    public static void main(String[] args) {
        Gym.setAndShowData();
    }

    public void registerGym(String crefRegistry, Long cnpjInformation, String gymName, String phoneNumber, String email) throws Exception {
        if(crefRegistry.isBlank()){
            throw new Exception("The field Cref Registry is required");
        }
        if(gymName.isBlank()){
            throw new Exception("The field Gym Name is required");
        }
        if(cnpjInformation == null){
            throw new Exception("The field CNPJ information is required");
        }
        this.crefRegistry = crefRegistry;
        this.cnpjInformation = cnpjInformation;
        this.gymName = gymName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void registerGymLocation(Address gymLocation){
        this.gymLocation.street = gymLocation.street;
        this.gymLocation.number = gymLocation.number;
        this.gymLocation.city = gymLocation.city;
        this.gymLocation.postalCode = gymLocation.postalCode;
        this.gymLocation.state = gymLocation.state;
    }

    public void registerGymInstructors (String instructorName) {
        this.instructors.add(instructorName);
    }

    public void registerGymClients (String clientName) {
        this.clients.add(clientName);
    }

    public static void setAndShowData() {
        Gym gymMocker = new Gym();
        Scanner readData = new Scanner(System.in);
        System.out.println("Digite o nome da academia:");
        gymMocker.setGymName(readData.next());
        System.out.println("Digite a CNPJ da academia:");
        gymMocker.setCnpjInformation(readData.nextLong());
        System.out.println("Digite a telefone da academia:");
        gymMocker.setPhoneNumber(readData.next());
        System.out.println("Digite o email da academia:");
        gymMocker.setEmail(readData.next());
        System.out.println("Digite o nome  de um instrutor da academia:");
        Instructor instructorMocker = new Instructor();
        String instructorName = readData.next();
        gymMocker.instructors.add(instructorName);
        System.out.println("Digite endereco da academia conforme solicitado:");
        Address addressMocker = new Address();
        System.out.println("Digite o nome da sua rua:");
        addressMocker.setStreet(readData.next());
        System.out.println("Digite o número da sua casa:");
        addressMocker.setNumber(readData.nextInt());
        System.out.println("Digite o nome da sua cidade:");
        addressMocker.setCity(readData.next());
        System.out.println("Digite o nome do seu estado:");
        addressMocker.setState(readData.next());
        System.out.println("Digite o seu CEP:");
        addressMocker.setPostalCode(readData.next());

        System.out.println("Os dados do instrutor são:");
        System.out.println("Clientes: " + instructorMocker.getClients().get(0));
        System.out.println("Chave de Acesso: " + instructorMocker.getInstructorAccessKey());

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

    public void setClients(ArrayList<String> clients) {
        this.clients.add(clients.toString());
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
