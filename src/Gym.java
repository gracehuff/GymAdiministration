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

    public static void main(String[] args) {
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
