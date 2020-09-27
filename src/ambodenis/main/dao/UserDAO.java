package ambodenis.main.dao;

import java.util.List;

import ambodenis.main.entity.Role;
import ambodenis.main.entity.User;

public interface UserDAO {
	
	public List<User> getUserList();
	
	public User getUserByUserName(String username);
	
	public void saveUser(User user);
	
	public void deleteUser(String username);
	
	public void enableUser(String username); 
	
	public List<Role> getRoles();

}
