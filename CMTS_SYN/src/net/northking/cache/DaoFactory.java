package net.northking.cache;

public class DaoFactory {

	public  static UserDao getUserDao(){
		return new UserDaoImpl();
	}
}
