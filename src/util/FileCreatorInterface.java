package util;

import java.io.File;
import model.User;

public interface FileCreatorInterface {
    public boolean createFile(User user);
    public void openDirectory();
    public File createDirectory();
}
