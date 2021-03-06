package manager;

import Models.Villa;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

import static Controllers.MainController.displayMainMenu;

public class ServicesManager {

  public static void addNewServies() {

    Scanner scanner = new Scanner(System.in);
    boolean check = true;

    do {
      System.out.println("------Menu Service---------");
      System.out.println("1.Add New Villa\n" +
              "2.Add New House\n" +
              "3.Add New Room\n" +
              "4.Back to menu\n" +
              "5.Exit");
      System.out.print("Vui long chon chuc nang ban muon thuc hien: ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          VillaManager.addNewVilla();
          System.out.println("Thêm thành công Villa");
          scanner.nextLine();
          displayMainMenu();
          break;
        case 2:
          HouseManager.addNewHouse();
          System.out.println("Thêm thành công House");
          scanner.nextLine();
          displayMainMenu();
          break;
        case 3:
          RoomManager.addNewRoom();
          System.out.println("Thêm thành công Room");
          scanner.nextLine();
          displayMainMenu();
          break;
        case 4:
          displayMainMenu();
          break;
        case 5:
          check = false;
          break;
        default:
          System.out.println("Fail!!! Please choose again, Enter to continue");
          scanner.nextLine();
          addNewServies();
      }

    } while (check);
  }

  public static void showServices() {
    Scanner scanner = new Scanner(System.in);

    do {

      System.out.println("-----Menu------\n" +
              "1. Show all Villa\n" +
              "2. Show all House\n" +
              "3. Show all Room\n" +
              "4. Show All Name Villa Not Duplicate\n" +
              "5. Show All Name House Not Duplicate\n" +
              "6. Show All Name Name Not Duplicate\n" +
              "7. Back to menu\n" +
              "8. Exit");

      System.out.print("Vui long chon chuc nang ban muon thuc hien: ");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          VillaManager.showVilla();
          break;
        case 2:
          HouseManager.showHouse();
          break;
        case 3:
          RoomManager.showRoom();
          break;
        case 4:
          VillaManager.showNameVillaNotDuplicate();
          break;
        case 5:
          HouseManager.showNameHouseNotDup();
          break;
        case 6:
          RoomManager.showNameRoomNotDup();
          break;
        case 7:
          displayMainMenu();
          break;
        case 8:
          System.exit(0);
          break;
        default:
          System.out.println("Fail!!! Please choose again, Enter to continue");
          scanner.nextLine();
          showServices();
      }

    } while (true);

  }

  public static void search() {
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("-----Menu Services--------");
      System.out.println("1.Search Villa\n" +
              "2.Search House\n" +
              "3.Search Room\n" +
              "4.Back to menu\n" +
              "5.Exit");
      System.out.print("Chon chuc nang ban muon thuc hien: ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          VillaManager.searchVilla().showInfo();
          break;
        case 2:
          HouseManager.searchHouse().showInfo();
          break;
        case 3:
          RoomManager.searchRoom().showInfo();
          break;
        case 4:
          displayMainMenu();
          break;
        case 5:
          System.exit(0);
          break;
        default:
          System.out.println("Fail!!! Please choose again, Enter to continue");
          scanner.nextLine();
          search();

      }


    } while (true);
  }
  public static void deleteServices() {
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("--------Menu Services-------");

      System.out.println("1.Delete Villa\n" +
              "2.Delete House\n" +
              "3.Delete Room\n" +
              "4.Back to menu\n" +
              "5.Exit");
      System.out.print("Chon chu nang muon thuc hien: ");
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
VillaManager.deleteVilla();
          break;
        case 2:
HouseManager.deleteHouse();
          break;
        case 3:
          RoomManager.deleteRoom().showInfo();
          break;
        case 4:
displayMainMenu();
          break;
        case 5:
          System.exit(0);
          break;
        default:
          System.out.println("Fail!!! Please choose again, Enter to continue");
          scanner.nextLine();
        deleteServices();
      }
    } while (true);
  }


}
