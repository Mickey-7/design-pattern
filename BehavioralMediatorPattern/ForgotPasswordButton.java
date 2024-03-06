package BehavioralMediatorPattern;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ForgotPasswordButton extends JButton implements Component {
    private Mediator mediator;

    public ForgotPasswordButton() {
        super("Forgot Password");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.forgotPass();
    }

    @Override
    public String getName() {
        return "ForgotPasswordButton";
    }
}
