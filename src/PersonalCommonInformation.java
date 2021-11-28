import java.util.Date;
import java.util.Scanner;

public class PersonalCommonInformation {
    private Long cpf;
    private Long rg;
    public String birthdayDate;
    public String email;
    public String phoneNumber;
    public Address addressInformation;

    public static void main(String[] args) {
        PersonalCommonInformation.setAndShowData();
    }


    public static void setAndShowData() {
        PersonalCommonInformation personalCommonInformationMocker = new PersonalCommonInformation();
        Scanner readData = new Scanner(System.in);
        System.out.println("Digite o seu CPF:");
        personalCommonInformationMocker.setCpf(readData.nextLong());
        System.out.println("Digite o seu RG:");
        personalCommonInformationMocker.setRg(readData.nextLong());
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

    public Long getCpf() {return cpf;}

    public Long getRg() {return rg;}

    public String getBirthdayDate() {return birthdayDate;}

    public String getEmail() {return email;}

    public String getPhoneNumber() {return phoneNumber;}

    public Address getAddressInformation() {return addressInformation;}

    public void setCpf(Long cpf) {this.cpf = cpf;}

    public void setRg(Long rg) {this.rg = rg;}

    public void setBirthdayDate(String birthdayDate) {this.birthdayDate = birthdayDate;}

    public void setEmail(String email) {this.email = email;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public void setAddressInformation(Address addressInformation) {this.addressInformation = addressInformation;}

}
