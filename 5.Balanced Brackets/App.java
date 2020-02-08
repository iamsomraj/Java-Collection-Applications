import java.util.*;

class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList<String> linkedList = new LinkedList<String>();
    System.out.println("\nEnter the string you want to input : \n");
    String inp = sc.nextLine();
    String input[] = inp.split("");
    for (String str : input) {
      if (str.equals("(") || str.equals("[") || str.equals("{")) {
        linkedList.add(str);
      } else if (str.equals(")") || str.equals("}") || str.equals("]")) {
        if (linkedList.isEmpty()) {
          System.out.println("Not balanced!");
          break;
        } else if ((linkedList.getLast().equals("(") && str.equals(")"))
            || (linkedList.getLast().equals("{") && str.equals("}"))
            || (linkedList.getLast().equals("[") && str.equals("]"))) {
          linkedList.removeLast();
        } else {
          System.out.println("Not balanced!");
          break;
        }
      }
    }

    if (linkedList.isEmpty()) {
      System.out.println("Balanced");
    } else {
      System.out.println("Not balanced!");

    }

  }
}