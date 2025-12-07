package components;

import mediator.*;

public abstract class Component {
    protected Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }

    public void changed(String event) {   //funtion to notify mediator
        mediator.notify(this, event);
    }
}

