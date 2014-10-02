package net.northking.cache;


public class UserDaoImpl extends DaoSupport implements UserDao{
	
	@Override
	public void addUser(String userCode,String userName) {
		String sql="insert into sys_user values(?,?) ";
		simpleJdbcTemplate.update(sql, userCode,userName);
		
	}

}
