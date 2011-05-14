package com.burtona.bl;

public class Content {
	private String referal;
	private String source;
	
	
	public Content(String ref, String src)
	{
		referal = ref;
		source = src;
	}
	
	public String getReferal() {
		return referal;
	}
	public void setReferal(String referal) {
		this.referal = referal;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	
}
