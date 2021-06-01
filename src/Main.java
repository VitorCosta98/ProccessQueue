import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Process> processes = new ArrayList<Process>();
        processes.add(new Process(0, 2.3, 7.8));
        processes.add(new Process(5, 4.1, 5.3));
        processes.add(new Process(3, 2.7, 2.9));
        processes.add(new Process(2, 5.6, 4.0));
        processes.add(new Process(1, 8.3, 1.6));
        processes.add(new Process(1, 8.1, 1.5));
        processes.add(new Process(1, 8.3, 1.4));
        processes.add(new Process(1, 8.3, 1.6));

        Scheduler scheduler = new Scheduler();
        scheduler.setProcesses(processes);

        System.out.println("PROCESSOS ORDENADOS POR PRIORIDADE:");
        scheduler.setByPriority();
        scheduler.printProcesses();
        System.out.println("\n");

        scheduler.setProcesses(processes);

        System.out.println("PROCESSOS ORDENADOS POR ORDEM DE CHEGADA:");
        scheduler.setByOrder();
        scheduler.printProcesses();
        System.out.println("\n");

        scheduler.setProcesses(processes);

        System.out.println("PROCESSOS ORDENADOS POR TAMANHO:");
        scheduler.setBySize();
        scheduler.printProcesses();
    }
}
