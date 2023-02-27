package util;

import common.Common;
import dao.DaoImpl;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.League;
import model.User;

public class FileCreator implements FileCreatorInterface {

    DaoImpl dao = new DaoImpl();
    File file = null;
    FileWriter writer;
    BufferedWriter bufferedWriter = null;
    PrintWriter printWriter = null;
    List<League> leagues = new ArrayList();

    @Override
    public boolean createFile(User user) {
        boolean wasCreated = false;
        try {
            leagues = dao.getLeaguesByOwner(Common.userID);
            file = new File("C:\\Users\\banos\\Documents\\ALF usuarios\\" + "Mi informacion-" + user.getApellidos() +".txt");
            writer = new FileWriter(file);
            bufferedWriter = new BufferedWriter(writer);
            printWriter = new PrintWriter(bufferedWriter);
            
            // Comenzamos la escritura en el documento '.txt'
            printWriter.println("***************  A D M I N I S T R A C I Ó N  D E  L I G A S  D E   F Ú T B O L  ***************");
            printWriter.println();
            printWriter.println();
            printWriter.println("Nombre del usuario: " + user.getNombre() + " " + user.getApellidos());
            printWriter.println("Correo electronico: " + user.getEmail());
            printWriter.println("Direccion: " + user.getDireccion());
            printWriter.println("Numero de celular: " + user.getN_celular());
            printWriter.println("Fecha de nacimiento: " + user.getF_nacimiento());
            printWriter.println("Tipo de sangre: " + user.getTipo_sangre());
            printWriter.println(" * * * * * *   M I S   L I G A S   * * * * * *");
            for(League league:leagues){
                printWriter.println("Liga: " + league.getNombre()); 
                printWriter.println("\t Cupo: " + league.getCupo());
                printWriter.println("--------------------------------------");
            }
            wasCreated = true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                printWriter.close();
                bufferedWriter.close();
            } catch (IOException ex) {
                Logger.getLogger(FileCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return wasCreated;
    }

    @Override
    public void openDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
