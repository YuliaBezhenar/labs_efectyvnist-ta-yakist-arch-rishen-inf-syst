package mediator;
import components.*;

public class OrderForm implements Mediator {

    public DatePicker datePicker;
    public TimeSelector timeSelector;
    public Checkbox otherPerson;
    public TextField nameField;
    public TextField phoneField;
    public Checkbox pickup;

    @Override
    public void notify(Component sender, String event) {

        //when selecting date
        if (sender == datePicker && event.equals("dateSelected")) {
            System.out.println("Date selected, time slots updating...");
            timeSelector.updateSlots(datePicker.getDate());
        }

        //when selecting receiver is another person
        if (sender == otherPerson && event.equals("toggle")) {
            boolean active = otherPerson.isChecked();
            System.out.println("Receiver is other person: " + active);
            nameField.setActive(active);
            phoneField.setActive(active);
        }

        //when chose pickup
        if (sender == pickup && event.equals("toggle")) {
            boolean deliveryActive = !pickup.isChecked();
            System.out.println("Pickup is active, other fields will be inactive");

            datePicker.changed("setActive");
            timeSelector.setActive(deliveryActive);
            nameField.setActive(deliveryActive);
            phoneField.setActive(deliveryActive);
            otherPerson.changed("setActive");
            System.out.println("Other fields are inactive now");
        }
    }
}
