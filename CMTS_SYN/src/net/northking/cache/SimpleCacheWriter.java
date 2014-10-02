package net.northking.cache;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gemstone.gemfire.cache.CacheWriter;
import com.gemstone.gemfire.cache.CacheWriterException;
import com.gemstone.gemfire.cache.Declarable;
import com.gemstone.gemfire.cache.EntryEvent;
import com.gemstone.gemfire.cache.RegionEvent;

public class SimpleCacheWriter  implements CacheWriter,Declarable{
	Logger logger=LoggerFactory.getLogger(SimpleCacheWriter.class);
	private UserDao userDao=DaoFactory.getUserDao();
	@Override
	public void close() {
		logger.info("close");		
		
	}

	@Override
	public void beforeCreate(EntryEvent entryEvent) throws CacheWriterException {
		logger.info("beforeCreate");	
				String userCode=(String) entryEvent.getKey();
				String userName=(String) entryEvent.getNewValue();				
				userDao.addUser(userCode, userName);
	}

	@Override
	public void beforeDestroy(EntryEvent entryEvent) throws CacheWriterException {
		logger.info("beforeDestroy"+entryEvent.getKey());
		
		
	}

	@Override
	public void beforeRegionClear(RegionEvent entryEvent) throws CacheWriterException {
		logger.info("beforeRegionClear");		
		
	}

	@Override
	public void beforeRegionDestroy(RegionEvent entryEvent)
			throws CacheWriterException {
		logger.info("beforeRegionDestroy");		
		
	}

	@Override
	public void beforeUpdate(EntryEvent entryEvent) throws CacheWriterException {
		logger.info("beforeUpdate");		
		
	}

	@Override
	public void init(Properties properties) {
		
		logger.info("init");		
		
	}

}
