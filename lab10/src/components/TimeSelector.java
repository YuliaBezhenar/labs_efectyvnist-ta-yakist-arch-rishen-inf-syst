package components;

import mediator.Mediator;

public class TimeSelector extends Component {
    private boolean active = true;

    public TimeSelector(Mediator mediator) {
        super(mediator);
    }

    public void updateSlots(String date) {
        System.out.println("Showing available slots for date " + date);
    }

    public void setActive(boolean active) {
        this.active = active;
        System.out.println("Setting time to " + active);
    }
}
