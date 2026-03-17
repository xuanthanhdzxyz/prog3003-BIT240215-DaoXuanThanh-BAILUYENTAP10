import java.util.HashMap;

public class EmployeeManager {
    public static void main(String[] args) {

        HashMap<Integer, String> employees = new HashMap<>();
        
        
        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");
        
        
        String name102 = employees.get(102);
        System.out.println("Nhan vien co ID 102: " + name102);
        
        
        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
            System.out.println("Da them nhan vien co ID 105: Unknown");
        }
        
      
        System.out.println("\nDanh sach tat ca nhan vien:");
        for (Integer id : employees.keySet()) {
            System.out.println("ID: " + id + ", Ten: " + employees.get(id));
        }
    }
}