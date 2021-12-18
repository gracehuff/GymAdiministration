import java.util.ArrayList;
import java.util.Scanner;

public class Address {
    public String street;
    public Integer number;
    public String city;
    public String state;
    public String postalCode;

    public static void main(String[] args) throws Exception {
        Address newAddress = new Address();
        newAddress.setStreet("rua José");
        newAddress.setNumber(12);
        newAddress.setCity("charqueadas");
        newAddress.setPostalCode("9770001");
        newAddress.setState("RS");
        ArrayList<Address> addresses = new ArrayList<Address>();
        addresses.add(newAddress);
        addresses.add(registryAddress("rua Josefina", 10, "Charqueadas",
                        "RS", "96770001"));
        searchAddressByStreetAndNumber(addresses,"rua José", 12);
        deleteAddressByStreetAndNumber(addresses,"rua Josefina", 10);
    }

    public static Address registryAddress(String street, Integer number, String city, String state, String postalCode) throws Exception {
        if (street.isBlank() || number == null || city.isBlank() || postalCode.isBlank() || state.isBlank()) {
            throw new Exception("All address information is required, please check and try again.");
        }
        Address newAddress = new Address();
        newAddress.street = street;
        newAddress.number = number;
        newAddress.city = city;
        newAddress.postalCode = postalCode;
        newAddress.state = state;
        return newAddress;
    }

    public static Address searchAddressByStreetAndNumber(ArrayList<Address> addressInformations, String street, Integer number) throws Exception {
        for (int i = 0; i < addressInformations.size(); i++) {
            if (addressInformations.get(i).street.equals(street) && addressInformations.get(i).number.equals(number)) {
                System.out.println("Address found: "
                        + addressInformations.get(i).street
                        + " "
                        + addressInformations.get(i).number
                        + " "
                        + addressInformations.get(i).city
                        + " "
                        + addressInformations.get(i).postalCode
                        + " "
                        + addressInformations.get(i).state);
                return addressInformations.get(i);
            }
        }
        throw new Exception("Information not found for this Street and Number.");
    }

    public static void deleteAddressByStreetAndNumber(ArrayList<Address> addressInformations, String street, Integer number) throws Exception {
        for (int i = 0; i < addressInformations.size(); i++) {
            if (addressInformations.get(i).street.equals(street) && addressInformations.get(i).number.equals(number)) {
                 addressInformations.remove(i);
                System.out.println("Address deleted successfully.");
            }
        }
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
