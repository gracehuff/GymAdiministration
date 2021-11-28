import java.util.ArrayList;

public class Instructor extends  PersonalCommonInformation{

    public ArrayList<Client> clients;
    public String instructorAccessKey;



    public String getInstructorAccessKey(){
        return instructorAccessKey;
    }

    public void setInstructorAccessKey(String instructorAccessKey) {
        this.instructorAccessKey = instructorAccessKey;
    }

    public ArrayList<Client> getClients() {return clients;}

    public void setClients(ArrayList<Client> clients) {this.clients = clients;}
}
