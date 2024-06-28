//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        static Employee[] employees = new Employee[10];

        public static void main (String[]args){

            employees[0] = createPeople("Заруцкий Алексей Семенович", 25000, 2);
            employees[1] = createPeople("Авдеев Иосиф Александрович", 66000, 1);
            employees[2] = createPeople("Фадеев Семен Сергеевич", 88800, 3);
            employees[3] = createPeople("Захаров Роберт Александрович", 111100, 5);
            employees[4] = createPeople("Варламова Анастасия Сергеевна", 34500, 4);
            employees[5] = createPeople("Бузова Ольга Петровна", 99000, 2);
            employees[6] = createPeople("Галустян Михаил Игоревич", 65740, 1);
            employees[7] = createPeople("Пугачева Светлана Олеговна", 96430, 2);
            employees[8] = createPeople("Медведев Лев Иннокентьевич", 34300, 5);
            employees[9] = createPeople("Лососев Джек Воробеевич", 86230, 4);

            printEmployees();
        }

        public static void printEmployees () {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
}