package org.example;

import org.example.dao.UserDao;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final UserDao userDao = new UserDao();

    static void main(String[] args) {

        System.out.println("\n=============================");
        System.out.println(" EMPLOYEE PAYROLL RECORD SYSTEM");
        System.out.println("\n=============================");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print("Select an Option: ");
        String choice = sc.nextLine();

        switch (choice) {
            case "1":
                break;
            case "2":
                System.out.print("Enter new Username: ");
                String user = sc.nextLine();
                System.out.print("Enter Password: ");
                String pass = sc.nextLine();

                System.out.print("select Role [1] Admin [2] Accountant [3] Payroll Supervisor [4] Employee: ");
                int roleChoice = sc.nextInt();
                String role;
                switch (roleChoice) {
                    case 1:
                        role = "Admin";
                        break;
                    case 2:
                        role = "Accountant";
                        break;
                    case 3:
                        role = "Payroll Supervisor";
                        break;
                    case 4:
                        role = "Employee";
                        break;
                    default:
                        role = null;
                }

                if (role != null) {
                    userDao.registerUser(user, pass, role);
                } else {
                    System.out.println("Invalid Role Selection!");
                }
                break;
        }

    }
}
