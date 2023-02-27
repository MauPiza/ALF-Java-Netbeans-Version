package util;

import model.User;

public interface FileCreatorInterface {
    public boolean createFile(User user);
    public void openDirectory();
}
