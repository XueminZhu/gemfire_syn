package test;

import org.junit.Before;

import com.gemstone.gemfire.cache.Cache;
import com.gemstone.gemfire.cache.CacheFactory;
import com.gemstone.gemfire.cache.Region;

/**
 * 本地的CacheServer
 * @author Administrator
 *
 */
public class LocalCacheServer {
	protected Cache cache;
	
	@Before
	public void before(){
		   cache = new CacheFactory()
	      .set("locators", "127.0.0.1[53101]")
	      .set("mcast-address", "224.0.0.1")
	      .set("mcast-port", "8787")
	      .set("log-level", "error")
	      .set("cache-xml-file", "cache.xml")
	      .create();		  
	}
	
	
	/**
	 * 获取一个region
	 * @param regionName
	 * @return
	 */
	public Region getRegion(String regionName){
		return cache.getRegion(regionName);
	}
	
}


