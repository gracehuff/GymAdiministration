import java.util.ArrayList;
import java.util.Scanner;

public class Instructor extends  PersonalCommonInformation{

    public ArrayList<String> clients;
    public String instructorAccessKey;

    public static void main(String[] args) {
        Instructor.setAndShowData();
    }

    public void registerInstructor(){
        Scanner readData = new Scanner(System.in);
        clients.add(readData.next());
        instructorAccessKey = readData.next();
    }

    public static void setAndShowData() {
        Instructor instructorMocker = new Instructor();
        Scanner readData = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        instructorMocker.clients.add(readData.next());
        System.out.println("Digite a chave de acesso fornecida:");
        instructorMocker.setInstructorAccessKey(readData.next());

        System.out.println("Os dados do instrutor são:");
        System.out.println("Clientes: " + instructorMocker.getClients().get(0));
        System.out.println("Chave de Acesso: " + instructorMocker.getInstructorAccessKey());

    }

    public String getInstructorAccessKey(){
        return instructorAccessKey;
    }

    public void setInstructorAccessKey(String instructorAccessKey) {
        this.instructorAccessKey = instructorAccessKey;
    }

    public ArrayList<String> getClients() {return clients;}

    public void setClients(ArrayList<String> clients) {this.clients = clients;}
}
