import java.awt.event.ActionListener;

public class KryptController {
        private GUIDesign view;

        public KryptController(GUIDesign view;) {
            this.view = view;

            view.addKryptListener(new KryptListener());
            view.addClearListener(new ClearListener());

        }
}
