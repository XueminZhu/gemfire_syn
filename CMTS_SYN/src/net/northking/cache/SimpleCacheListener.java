package net.northking.cache;

import com.gemstone.gemfire.cache.Declarable;
import com.gemstone.gemfire.cache.EntryEvent;
import com.gemstone.gemfire.cache.Region;
import com.gemstone.gemfire.cache.RegionEvent;
import com.gemstone.gemfire.cache.util.CacheListenerAdapter;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleCacheListener<String, ProcessVO> extends
		CacheListenerAdapter<String, ProcessVO> implements Declarable {
	Logger logger=LoggerFactory.getLogger(SimpleCacheListener.class);

	@Override public void 
	afterCreate(EntryEvent<String,ProcessVO> event) {
		logger.info("afterCreate:"+event);

			Region region=event.getRegion().getRegionService().getRegion("CMTS_CEP_NODE_REGION");
		CepGroup cepGroup=(CepGroup) region.get(event.getKey());
		cepGroup.addNewNumber((net.northking.cache.ProcessVO) event.getNewValue());
		
	};
	@Override
	public void init(Properties properties) {
		logger.info("SimpleCacheListener init..");
	}

}
