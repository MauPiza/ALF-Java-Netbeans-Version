package dao;

import common.Common;
import javax.swing.JOptionPane;
import model.League;
import model.User;
import util.DBHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements DaoInterface {

    DBHelper db = new DBHelper();
    League league = new League();
    List<League> leagues = new ArrayList();
    User user = new User();

    @Override
    public void createLeague(League league) {
        try {
            db.connect();
            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO ligas VALUES (")
                    .append(0).append(",'")
                    .append(league.getNombre()).append("',")
                    .append(league.getCupo()).append(",")
                    .append(league.getId_user()).append(");");
            if ((boolean) db.execute(query.toString(), true)) {
                JOptionPane.showMessageDialog(null, "Registro creado");
            } else {
                JOptionPane.showMessageDialog(null, "No se completó la operación");
            }
        } catch (Exception e) {
            System.out.println(db.getError());
        } finally {
            db.disconnect();
        }
    }

    @Override
    public boolean createUser(User user) {
        boolean completed = false;
        try {
            db.connect();
            StringBuilder query = new StringBuilder();
            query.append("INSERT INTO users VALUES (")
                    .append(0).append(",")
                    .append(user.getIdRol()).append(",'")
                    .append(user.getNombre()).append("','")
                    .append(user.getApellidos()).append("','")
                    .append(user.getEmail()).append("','")
                    .append(user.getPassword()).append("','")
                    .append(user.getDireccion()).append("','")
                    .append(user.getN_celular()).append("','")
                    .append(user.getF_nacimiento()).append("','")
                    .append(user.getTipo_sangre()).append("');");
            if ((boolean) db.execute(query.toString(), true)) {
                JOptionPane.showMessageDialog(null, "Registro creado");
                completed = true;
            } else {
                JOptionPane.showMessageDialog(null, "No se completó la operación");
            }
        } catch (Exception e) {
            System.out.println(db.getError());
        } finally {
            db.disconnect();
        }
        return completed;
    }

    @Override
    public League getLeagueByName(String leagueName) {
        try {
            db.connect();
            StringBuilder query = new StringBuilder();
            query.append("SELECT * FROM ligas WHERE nombre LIKE '%")
                    .append(leagueName).append("%'");
            ResultSet rs = (ResultSet) db.execute(query.toString(), false);
            /*
            * Comprueba si ResultSet tiene un siguiente (si tiene un registro) y de ser asi, setea
            * los valores de la base de datos al objeto que se esté usando para representarlos
             */
            if (rs.next()) {
                league.setId(rs.getInt("id"));
                league.setNombre(rs.getString("nombre"));
                league.setCupo(rs.getInt("cupo"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron coincidencias");
            }
        } catch (SQLException e) {
            System.out.println(db.getError());
        } finally {
            db.disconnect();
        }
        return league;
    }

    @Override
    public List<League> getLeaguesByOwner(int current_userId) {
        try {
            db.connect();
            String query = "SELECT * FROM ligas WHERE id_user = " + current_userId;
            ResultSet rs = (ResultSet) db.execute(query, false);
            while (rs.next()) {
                League league = new League();
                league.setId(rs.getInt("id"));
                league.setNombre(rs.getString("nombre"));
                league.setCupo(rs.getInt("cupo"));
                leagues.add(league);
            }
        } catch (SQLException e) {
            System.out.println(db.getError());
            System.out.println(e.getSQLState());
        } finally {
            db.disconnect();
        }
        return leagues;
    }

    @Override
    public User getUserById(int id) {
        try {
            db.connect();
            StringBuilder query = new StringBuilder();
            query.append("SELECT rol, nombre, apellidos, correo_electronico, password, direccion, numero_celular, f_nacimiento, tipo_sangre FROM users WHERE id = ")
                    .append(id)
                    .append(";");
            ResultSet rs = (ResultSet) db.execute(query.toString(), false);
            if (rs.next()) {
                user.setIdRol(rs.getInt("rol"));
                user.setNombre(rs.getString("nombre"));
                user.setApellidos(rs.getString("apellidos"));
                user.setEmail(rs.getString("correo_electronico"));
                user.setPassword(rs.getString("password"));
                user.setDireccion(rs.getString("direccion"));
                user.setN_celular(rs.getString("numero_celular"));
                user.setF_nacimiento(rs.getString("f_nacimiento"));
                user.setTipo_sangre(rs.getString("tipo_sangre"));
            }
        } catch (Exception e) {
            System.out.println(db.getError());
        } finally {
            db.disconnect();
        }
        return user;
    }

    @Override
    public void updateLeague(String nombreLiga, League league) {
        try {
            db.connect();
            StringBuilder query = new StringBuilder();
            query.append("UPDATE ligas SET ")
                    .append("nombre = '").append(league.getNombre()).append("',")
                    .append("cupo = ").append(league.getCupo())
                    .append(" WHERE nombre = '").append(nombreLiga).append("';");
            if ((boolean) db.execute(query.toString(), true)) {
                JOptionPane.showMessageDialog(null, "Liga actualizada");
            } else {
                JOptionPane.showMessageDialog(null, "No se hizo ningún cambio");
            }
        } catch (Exception e) {
            System.out.println(db.getError());
        } finally {
            db.disconnect();
        }

    }

    @Override
    public void updateUser(int userId, User user) {
        try {
            db.connect();
            StringBuilder query = new StringBuilder();
            query.append("UPDATE users SET ")
                    .append("nombre = '").append(user.getNombre()).append("',")
                    .append("apellidos = '").append(user.getApellidos()).append("',")
                    .append("correo_electronico = '").append(user.getEmail()).append("',")
                    .append("password = '").append(user.getPassword()).append("',")
                    .append("direccion = '").append(user.getDireccion()).append("',")
                    .append("numero_celular = '").append(user.getN_celular()).append("',")
                    .append("f_nacimiento = '").append(user.getF_nacimiento()).append("',")
                    .append("tipo_sangre = '").append(user.getTipo_sangre()).append("'")
                    .append(" WHERE id = ").append(userId).append(";");
            if ((boolean) db.execute(query.toString(), true)) {
                JOptionPane.showMessageDialog(null, "Usuario actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "No se hizo ningún cambio");
            }
        } catch (Exception e) {
            System.out.println(db.getError());
        } finally {
            db.disconnect();
        }
    }

    @Override
    public void deleteLeague(String leagueName) {
        try {
            db.connect();
            String query = "DELETE FROM ligas WHERE nombre = '" + leagueName + "';";
            int confirmarEliminar = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar esta liga?");
            if (confirmarEliminar == JOptionPane.YES_OPTION) {
                if ((boolean) db.execute(query, true)) {
                    JOptionPane.showMessageDialog(null, "Liga eliminada");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al eliminar la liga");
                }
            }

        } catch (Exception e) {
            System.out.println(db.getError());
        } finally {
            db.disconnect();
        }
    }

    @Override
    public void deleteUser(int id) {
        try {
            db.connect();
            String query = "DELETE FROM users WHERE id = " + id;

            int confirmarEliminar = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar tu cuenta?");
            if (confirmarEliminar == JOptionPane.YES_OPTION) {
                if ((boolean) db.execute(query, true)) {
                    // Se asigna -1 para indicar que la sesión se ha cerrado y el ID (-1) no existe
                    Common.userID = -1;
                    JOptionPane.showMessageDialog(null, "Liga eliminada");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al eliminar la liga");
                }
            }

        } catch (Exception e) {
            System.out.println(db.getError());
        } finally {
            db.disconnect();
        }
    }

    @Override
    public int login(String email, String password) {
        // -1 para evaluar si el id en la base de datos no existe
        Common.userID = -1;
        try {
            db.connect();
            StringBuilder query = new StringBuilder();
            query.append("SELECT id FROM users WHERE correo_electronico = '")
                    .append(email)
                    .append("' AND password = '")
                    .append(password)
                    .append("';");
            ResultSet rs = (ResultSet) db.execute(query.toString(), false);
            if (rs.next()) {
                Common.userID = rs.getInt("id");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
        } catch (Exception e) {
            System.out.println(db.getError());
        } finally {
            db.disconnect();
        }
        return Common.userID;
    }

}
