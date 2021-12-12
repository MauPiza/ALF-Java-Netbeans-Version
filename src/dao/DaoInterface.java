package dao;

import java.util.List;
import model.League;
import model.User;

public interface DaoInterface {

//CRUD
    public void createLeague(League league);

    public boolean createUser(User user);

    public League getLeagueByName(String leagueName);

    public List<League> getLeaguesByOwner(int current_userId);

    public User getUserById(int id);

    public void updateLeague(String nombreLiga, League league);

    public void updateUser(int userId, User user);

    public void deleteLeague(String leagueName);

    public void deleteUser(int id);
    
    public int login(String email, String password);
}
