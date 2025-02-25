package ihmsimple.app;

import ihmsimple.ctrl.Controller;
import ihmsimple.services.ServiceDevine;
import ihmsimple.views.View;

public class IhmSimple {
    
    /**
     * Méthode principale de l'application qui instancie les objets MVC et les relie
     * entre eux.
     * Voir le diagramme de séquence pour l'implémentation e cette méthode.
     * 
     * @param args arguments de la ligne de commande
     */
    public static void main(String[] args) {
        // VOTRE CODE ICI...¨
        Controller ctrl = new Controller();
        ServiceDevine refServiceDevine = new ServiceDevine();
        ctrl.setRefServiceDevine(refServiceDevine);
        View refView = new View();
        ctrl.setRefView(refView);
        refView.setRefCtrl(ctrl);
        refServiceDevine.setRefCtrl(ctrl);
        ctrl.start();
    }

}
