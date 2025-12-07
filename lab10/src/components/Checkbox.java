package components;
import mediator.*;

public class Checkbox extends Component {
    private boolean checked = false;

    public Checkbox(Mediator mediator) { super(mediator); }

    public void toggle() {
        checked = !checked;
        changed("toggle");   //notify mediator
    }

    public boolean isChecked() { return checked; }
}
