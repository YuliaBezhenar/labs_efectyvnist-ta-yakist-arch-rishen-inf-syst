package components;
import mediator.Mediator;

public class TextField extends Component {
    private boolean active;
    private String text;

    public TextField(Mediator mediator, String text) {
        super(mediator);
        this.text = text;
    }

    public void setActive(boolean active) {
        this.active = active;
        System.out.println("Setting text field to " + active);
    }
}
