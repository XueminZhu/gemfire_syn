package net.northking.cache;

import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;


import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class DaoSupport {
	protected SimpleJdbcTemplate simpleJdbcTemplate;
	
	public DaoSupport(){
		initConnection();
	}
	public void initConnection(){
		Properties prop = new Properties();
		InputStream is = DaoSupport.class.getClassLoader().getResourceAsStream(
				"dbcpconfig.properties");		
		DataSource dataSource = null;
		try {
			prop.load(is);
			dataSource = BasicDataSourceFactory.createDataSource(prop);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
	
	}
}
