package transport;
import java.util.ArrayList;
public class Mechanic {
    final String  name;
    String company;


    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public Mechanic(String name, String company, String classOfService) {
        this.name = name;
        this.company = company;
    }
    public void carryOutMaintenance() {
            System.out.println("Техническое обслуживание авто проведено");
    }

    public void autoRepair() {
        System.out.println("Ремонт авто проведен");
    }
    /*добавление и удаление механиков, тестирую
    public void () {
        ArrayList<String> remAdd = new ArrayList<>();
        String m1 = "ivan";
        String m2 = "sergey";
        remAdd.add(m1);
        remAdd.add(m2);
        System.out.print(remAdd.size() + ":");
        remAdd.remove(m1);
        System.out.print(remAdd.m1, + " " + remAdd.m2());
    }
    ArrayList<String> fruits = new ArrayList<>(); // ArrayList() создание списка
fruits.add("banana"); // добавление элемента
fruits.add("apple"); // добавление элемента

for (var fruit: fruits) {
    System.out.println(fruit); // вывод элементов
}
   */
}
