package test;

import java.util.UUID;

import org.junit.Test;

import com.gemstone.gemfire.cache.Region;

/**
 * Test a CacheWriter
 * @author Administrator
 *
 */
public class TestCacheWriter extends LocalCacheServer{

	@Test
	public void testWriter(){
		Region region=getRegion("CMTS_TEST_REGION");
		region.put(UUID.randomUUID().toString(), "卡卡神游");
		region.clear();
	}
}
