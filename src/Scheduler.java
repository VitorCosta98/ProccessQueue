import jdk.swing.interop.SwingInterOpUtils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Scheduler {
    private List<Process> processes;

    public void setProcesses(List<Process> processes) {
        this.processes = processes;
    }

    public void setByPriority() {
        Collections.sort(processes, new Comparator<Process>() {
            @Override
            public int compare(Process u1, Process u2) {
                if (u1.getPriority().equals(u2.getPriority())) {
                    if (u1.getId().equals(u2.getId())) {
                        return u1.getSize().compareTo(u2.getSize());
                    }
                    return u1.getId().compareTo(u2.getId());
                }
                return u1.getPriority().compareTo(u2.getPriority());
            }
        });
    }

    public void setByOrder() {
        Collections.sort(processes, new Comparator<Process>() {
            @Override
            public int compare(Process u1, Process u2) {
                return u1.getId().compareTo(u2.getId());
            }
        });
    }

    public void setBySize() {
        Collections.sort(processes, new Comparator<Process>() {
            @Override
            public int compare(Process u1, Process u2) {
                if (u1.getSize().equals(u2.getSize())) {
                    return u1.getId().compareTo(u2.getId());
                }
                return u1.getSize().compareTo(u2.getSize());
            }
        });
    }

    public void printProcesses() {
        for (Process process: processes) {
            System.out.println(process.toString());
        }
    }
}
