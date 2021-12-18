import java.util.ArrayList;
import java.util.Scanner;

public class PersonalCommonInformation {
    private String cpf;
    private String nome;
    private String rg;
    public String birthdayDate;
    public String email;
    public String phoneNumber;
    public Address addressInformation;

    public static void main(String[] args) throws Exception {
        PersonalCommonInformation newPersonalInformation = new PersonalCommonInformation();
        newPersonalInformation.setCpf("04292165511");
        newPersonalInformation.setRg("123123124");
        newPersonalInformation.setNome("Grace");
        newPersonalInformation.setPhoneNumber("519999999");
        newPersonalInformation.setEmail("grace@grace.com");

        ArrayList<PersonalCommonInformation> information = new ArrayList<PersonalCommonInformation>();
        information.add(newPersonalInformation);

        information.add(registerPersonalInformation("03161176218", "11218278", "Pedro", "11/11/1111",
                "pedro@pedro.com", "5199999"));
        searchInformationByCPF(information, "03161176218");
        deletePersonalCommonInformationByCpf(information, "03161176218");

    }

    public static PersonalCommonInformation registerPersonalInformation(String cpf, String rg, String nome, String birthdayDate, String email, String phoneNumber) throws Exception {
        Scanner readData = new Scanner(System.in);
        PersonalCommonInformation newInformation = new PersonalCommonInformation();
        newInformation.cpf = readData.next();
        if (newInformation.cpf == null) {
            throw new Exception("The client needs a CPF.");
        }
        newInformation.nome = readData.next();
        newInformation.rg = readData.next();
        if (newInformation.rg == null) {
            throw new Exception("The client needs a RG.");
        }
        newInformation.cpf = readData.next();
        newInformation.nome = readData.next();
        newInformation.rg = readData.next();
        newInformation.addressInformation.street = readData.next();
        newInformation.addressInformation.number = readData.nextInt();
        newInformation.addressInformation.city = readData.next();
        newInformation.addressInformation.postalCode = readData.next();
        newInformation.addressInformation.state = readData.next();
        return newInformation;
    }

    public static PersonalCommonInformation searchInformationByCPF(ArrayList<PersonalCommonInformation> informations, String cpf) throws Exception {
        for (int i = 0; i < informations.size(); i++) {
            if (informations.get(i).cpf.equals(cpf)) {
                System.out.println("Address found: "
                        + informations.get(i).cpf
                        + " "
                        + informations.get(i).rg
                        + " "
                        + informations.get(i).nome
                        + " "
                        + informations.get(i).phoneNumber
                        + " "
                        + informations.get(i).birthdayDate
                        + " "
                        + informations.get(i).email);
                return informations.get(i);
            }
        }
            throw new Exception("Information not found for this CPF.");
    }

    public static void deletePersonalCommonInformationByCpf(ArrayList<PersonalCommonInformation> informations, String cpf)  {
        for (int i = 0; i < informations.size(); i++) {
            if (informations.get(i).cpf.equals(cpf)) {
                informations.remove(informations.remove(i));
                System.out.println("Information deleted successfully.");
            }
        }
    }


    public static void setAndShowData() {
        PersonalCommonInformation personalCommonInformationMocker = new PersonalCommonInformation();
        Scanner readData = new Scanner(System.in);
        System.out.println("Digite o seu CPF:");
        personalCommonInformationMocker.setCpf(readData.next());
        System.out.println("Digite o seu RG:");
        personalCommonInformationMocker.setRg(readData.next());
        System.out.println("Digite a sua data de nascimento no formato DD/MM/AAAA:");
        personalCommonInformationMocker.setBirthdayDate(readData.next());
        System.out.println("Digite o seu email:");
        personalCommonInformationMocker.setEmail(readData.next());
        System.out.println("Digite o seu número de telefone:");
        personalCommonInformationMocker.setPhoneNumber(readData.next());
        System.out.println("Abaixo, insira o seu endereçoo conforme solicitada:");
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

        System.out.println("Seus dados são:");
        System.out.println("CPF:" + personalCommonInformationMocker.getCpf());
        System.out.println("RG:" + personalCommonInformationMocker.getRg());
        System.out.println("Data de nascimento:" + personalCommonInformationMocker.getBirthdayDate());
        System.out.println("Email:" + personalCommonInformationMocker.getEmail());
        System.out.println("Telefone:" + personalCommonInformationMocker.getPhoneNumber());
        System.out.println("Rua: " + addressMocker.getStreet());
        System.out.println("Número:" + addressMocker.getNumber());
        System.out.println("Cidade:" + addressMocker.getCity());
        System.out.println("Estado:" + addressMocker.getState());
        System.out.println("CEP:" + addressMocker.getPostalCode());
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddressInformation() {
        return addressInformation;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddressInformation(Address addressInformation) {
        this.addressInformation = addressInformation;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
