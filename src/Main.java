public class Main {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        System.out.println("Список всех сотрудников со всеми имеющимися полями: ");
        employees[0] = new Employee(1, "Сергеев", "Иван", "Едорович", 1, 32_000);
        employees[1] = new Employee(2, "Еремин", "Андрей", "Васильевич", 1, 10_000);
        employees[2] = new Employee(3, "Кривобоков", "Роман", "Юрьевич", 2, 12_000);
        employees[3] = new Employee(4, "Шевякова", "Анастасия", "Андреевна", 2, 14_000);
        employees[4] = new Employee(5, "Камратов", "Андрей", "Валерьевич", 3, 122_000);
        employees[5] = new Employee(6, "Евченко", "Андрей", "Вячеславович", 3, 22_000);
        employees[6] = new Employee(7, "Лихачев", "Алексей", "Васильевич", 4, 21_000);
        employees[7] = new Employee(8, "Бушмакина", "Ирина", "Александровна", 4, 40_000);
        employees[8] = new Employee(9, "Иванова", "Наталья", "Викторовна", 5, 2_000);
        employees[9] = new Employee(10, "Халявин", "Виктор", "Иванович", 5, 3_000);

        //печатаю список всех сотрудников со всеми полями
        Employee.printAll(employees);

        //печатаю cумму затрат в месяц на ЗП всех сотрудников
        Employee.summaAllOnMonth(employees);

        //Нахожу самую Максимальную ЗП
        Employee.maxSummaOnMonthForEmployee(employees);

        //Нахожу самую минимальную ЗП
        Employee.minSummaOnMonthForEmployee(employees);

        //Нахожу среднюю ЗП
        Employee.averageSalary(employees);

        //Печатаю ФИО всех сотрудников компании
        Employee.printName(employees);

        //Печатаем для каждого объекта Хэш код
        Employee.checkHash(employees);

        //Сравнение через иквэлс
        Employee.equalsEmployee(employees);
    }
}