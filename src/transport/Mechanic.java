package transport;

public class Mechanic {
    final String  name;
    String company;
    String classOfService;

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getClassOfService() {
        return classOfService;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setClassOfService(String classOfService) {
        this.classOfService = classOfService;
    }

    public Mechanic(String name, String company, String classOfService) {
        this.name = name;
        this.company = company;
        this.classOfService = classOfService;
    }
    public void carryOutMaintenance() {
            System.out.println("Техническое обслуживание авто проведено");
    }

    public void autoRepair() {
        System.out.println("Ремонт авто проведен");
    }

}
