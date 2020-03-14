/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypoli;

/**
 *
 * @author LUIS AVILA
 */
public class MisExcepciones extends Exception {
    public MisExcepciones(String msg){
        super(msg);
    }
    public static void ValidarNumero (int n) throws MisExcepciones{
        if(n >100){
            throw new MisExcepciones("Eres inmortal mongol?" + "\nComo chucha vas a tener "+ n +" años v:");
        }
    }
}
