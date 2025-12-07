package components;
import mediator.Mediator;

public class DatePicker extends Component {
    private String date;

    public DatePicker(Mediator mediator) { super(mediator); }

    public void selectDate(String date) {  //notify mediator
        this.date = date;
        System.out.println("Selected date: " + date);
        changed("dateSelected");
    }

    public String getDate() { return date; }


}
