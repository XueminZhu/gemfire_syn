package net.northking.cache;

import java.io.Serializable;

public class ProcessVO implements Serializable{
	private String sn;//业务流水
	ProcessState processState; //流程状态
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public ProcessState getProcessState() {
		return processState;
	}
	public void setProcessState(ProcessState processState) {
		this.processState = processState;
	}
	
}
