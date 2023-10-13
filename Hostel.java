package Seção10.HostelArrays;

import java.util.Scanner;

public class Hostel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many rooms will be rented? ");
        int rooms = scan.nextInt();
        HostelMembers[] vect = new HostelMembers[rooms];
        for (int i = 0; i <vect.length; i++){
            scan.nextLine();
            System.out.println("Rent #" + i + ":");
            System.out.println("Name: ");
            String name = scan.nextLine();
            System.out.println("Email: ");
            String email = scan.nextLine();
            System.out.println("Room: ");
            int room = scan.nextInt();
            vect[i] = new HostelMembers(name, email, room);
        }
        System.out.println("Busy Rooms: ");
        for (HostelMembers member : vect) {
            System.out.println(member);

        }

    }
}
