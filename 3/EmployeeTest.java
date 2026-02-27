public class EmployeeTest {
    public static void main(String[] args) {

        Sortable[] staff = new Sortable[3];

        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        // Compare manual
        int hasil = staff[0].compare(staff[1]);

        if (hasil < 0) {
            System.out.println("Gaji staff[0] lebih kecil dari staff[1]");
        } else if (hasil > 0) {
            System.out.println("Gaji staff[0] lebih besar dari staff[1]");
        } else {
            System.out.println("Gaji sama");
        }

        // Sorting berdasarkan salary
        Sortable.shell_sort(staff);

        System.out.println("\nSetelah Sorting:");

        for (int i = 0; i < staff.length; i++) {
            ((Employee) staff[i]).print();  // casting balik ke Employee
        }
    }
}
    

