import java.util.Scanner;

public class Address {
    public String street;
    public Integer number;
    public String city;
    public String state;
    public String postalCode;

    public static void main(String[] args) {
        Address.setAndShowData();
    }

    public static void setAndShowData() {
        Address addressMocker = new Address();
        Scanner readData = new Scanner(System.in);
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

        System.out.println("Seu endereço é:");
        System.out.println("Rua: " + addressMocker.getStreet());
        System.out.println("Número:" + addressMocker.getNumber());
        System.out.println("Cidade:" + addressMocker.getCity());
        System.out.println("Estado:" + addressMocker.getState());
        System.out.println("CEP:" + addressMocker.getPostalCode());
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
