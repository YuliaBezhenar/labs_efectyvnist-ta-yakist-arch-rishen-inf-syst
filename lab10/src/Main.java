
import mediator.*;
import components.*;

public class Main {
    public static void main(String[] args) {

        OrderForm mediator = new OrderForm();

        mediator.datePicker = new DatePicker(mediator);
        mediator.timeSelector = new TimeSelector(mediator);
        mediator.otherPerson = new Checkbox(mediator);
        mediator.nameField = new TextField(mediator, "Ivan");
        mediator.phoneField = new TextField(mediator, "1234567890");
        mediator.pickup = new Checkbox(mediator);

        System.out.println("--- Selecting date ---");
        mediator.datePicker.selectDate("2025-01-02");

        System.out.println("\n--- Selectin other person receiver ---");
        mediator.otherPerson.toggle();

        System.out.println("\n--- Selected pickup ---");
        mediator.pickup.toggle();
    }
}