import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view2) {
        this.model = model;
        this.view = view2;

        // Ajouter un écouteur d'événements au bouton
        view2.getButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.sayHello();
            }
        });
    }
}