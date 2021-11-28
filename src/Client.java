import java.util.Scanner;

public class Client extends PersonalCommonInformation{
    public String selectedPlan;
    public Long dueDay;
    public String workoutPlan;
    public Long selectedDaysPerWeek;
    public String selectedInstructor;

    public static void main(String[] args) {
        Client.setAndShowData();
    }

    public static void setAndShowData() {
        Client clientMocker = new Client();
        Scanner readData = new Scanner(System.in);
        System.out.println("Digite o plano escolhido:");
        clientMocker.setSelectedPlan(readData.next());
        System.out.println("Digite o dia de vencimento escolhido:");
        clientMocker.setDueDay(readData.nextLong());
        System.out.println("Digite o plano de treino (musculação/funcional/crossfit):");
        clientMocker.setWorkoutPlan(readData.next());
        System.out.println("Digite o nome do instrutor escolhido:");
        clientMocker.setSelectedInstructor(readData.next());
        System.out.println("Digite a quantidade de dias que o aluno gostaria de treinar na semana:");
        clientMocker.setSelectedDaysPerWeek(readData.nextLong());

        System.out.println("Os dados do aluno são:");
        System.out.println("Plano: " + clientMocker.getSelectedPlan());
        System.out.println("Vencimento:" + clientMocker.getDueDay());
        System.out.println("Plano de treino:" + clientMocker.getWorkoutPlan());
        System.out.println("Instrutor:" + clientMocker.getSelectedInstructor());
        System.out.println("Dias:" + clientMocker.getSelectedDaysPerWeek());
    }

    public String getSelectedPlan() {return selectedPlan;}

    public Long getDueDay() {return dueDay;}

    public String getWorkoutPlan() {return workoutPlan;}

    public Long getSelectedDaysPerWeek() {return selectedDaysPerWeek;}

    public String getSelectedInstructor() {return selectedInstructor;}

    public void setSelectedPlan(String selectedPlan){this.selectedPlan = selectedPlan;}

    public void setDueDay(Long dueDay){this.dueDay = dueDay;}

    public void setWorkoutPlan(String workoutPlan){this.workoutPlan = workoutPlan;}

    public void setSelectedDaysPerWeek(Long selectedDaysPerWeek){this.selectedDaysPerWeek = selectedDaysPerWeek;}

    public void setSelectedInstructor(String selectedInstructor){this.selectedInstructor = selectedInstructor;}
}
