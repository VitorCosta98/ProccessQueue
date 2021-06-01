public class Process {
    public Integer id = 0;
    private Integer priority;
    private Double duration;
    private Double size;
    static Integer previousId = 0;

    public Process(Integer priority, Double duration, Double size) {
        this.priority = priority;
        this.duration = duration;
        this.size = size;

        this.generateId();
    }

    private void generateId() {
        Process.previousId += 1;
        this.id = Process.previousId;
    }

    public Integer getId() { return id; }

    public Integer getPriority() { return priority; }

    public Double getDuration() { return duration; }

    public Double getSize() { return size; }

    @Override
    public String toString() {
        return "Process{ " +
                "id= " + id +
                ", priority= " + priority +
                ", duration= " + duration +
                ", size= " + size + " " +
                '}';
    }
}
