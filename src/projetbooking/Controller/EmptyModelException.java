/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Controller;

/**
 * Exception levée par la classe Modele lorsque le modèle est vide et que l'on retire un bouton
 * @author Hervé Martinez
 */
public class EmptyModelException extends Exception

{
    public EmptyModelException(String message) {
        super(message);
    }
    
}
