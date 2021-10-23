package ss.ch.jsonparsing.streaming.parser.jsongenerator.bean;

public class Bill {
	private String consumer;
	private int serviceNo;
	private String category;
	private double billAmt;

	public Bill(String consumer, int serviceNo, String category, double billAmt) {
		super();
		this.consumer = consumer;
		this.serviceNo = serviceNo;
		this.category = category;
		this.billAmt = billAmt;
	}

	public String getConsumer() {
		return consumer;
	}

	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}

	public int getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(int serviceNo) {
		this.serviceNo = serviceNo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}

}
