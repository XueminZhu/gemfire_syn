package net.northking.cache;

public class CepGroup {

	private String sn;//业务流水 	
	private Integer newNumber;//当日新增业务量
	
	public void addNewNumber(ProcessVO event){
		//如果是今天的数据
		newNumber++;
	}
	
}
