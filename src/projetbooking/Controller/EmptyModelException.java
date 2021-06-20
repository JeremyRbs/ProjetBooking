package projetbooking.Controller;

/**
 * Exception levée par la classe Modele lorsque le modèle est vide et que l'on retire un bouton
 * @author Jérémy RIBES
 */
public class EmptyModelException extends Exception
{
    public EmptyModelException(String message) {
        super(message);
    }
    
}
