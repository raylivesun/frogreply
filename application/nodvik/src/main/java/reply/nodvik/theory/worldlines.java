/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reply.nodvik.theory;

/**
 *
 * @author admin
 */
public interface worldlines {
      
      // current test world lines
    public static void XML(String[] matrix) {
        matrix.notifyAll();
    }
    
    // current of changes R2E
    public static void R2E(String[] changes) {
        changes.notifyAll();
    }
    
    // current of match to changes CMAM
    public static void CMAM(String[] action) {
        action.notifyAll();
    }
}
