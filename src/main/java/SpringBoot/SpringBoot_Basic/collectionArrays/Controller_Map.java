package SpringBoot.SpringBoot_Basic.collectionArrays;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_Map {

	@GetMapping("/mapData")
	public Map<String, Object> dataMap(){
		
//		Map is can duplicate value but can't duplication key
		Map<String, Object> getDataMap = new HashMap<String, Object>();
		getDataMap.put("Teng", "Sokphorn");
		getDataMap.put("Teg", "Vuthe");
		getDataMap.put("Ten", "Soklin");
		getDataMap.put("Tens", "ChanPheap");
		getDataMap.put("Change", "Sokphorn");
		getDataMap.put("ss", "Sokphorn");
		
//		for(Map.Entry<String, Object> newData : getDataMap.entrySet()) {
//		   return newData.getKey() + newData.getValue();
//		}
		
		return getDataMap;
	}
}
