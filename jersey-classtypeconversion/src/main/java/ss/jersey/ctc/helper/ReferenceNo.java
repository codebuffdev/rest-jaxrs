package ss.jersey.ctc.helper;

public class ReferenceNo {
    private String Source;
    private String dest;
    private int day;
    private int month;
    private long uniqueNo;
    
    
    public ReferenceNo() {
		super();
	}

	@Override
    public String toString() {
        return "ReferenceNo{" +
                "Source='" + Source + '\'' +
                ", dest='" + dest + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", uniqueNo=" + uniqueNo +
                '}';
    }
    
    //approach - 1
    //single param String constructor 
	/*
	 * public ReferenceNo(String referenceNo) { //ref - HYDCNN241110001 this.Source=
	 * referenceNo.substring(0,3); this.dest=referenceNo.substring(3,6); this.day=
	 * Integer.parseInt(referenceNo.substring(6,8));
	 * this.month=Integer.parseInt(referenceNo.substring(8,10));
	 * this.uniqueNo=Long.parseLong(referenceNo.substring(10,referenceNo.length()));
	 * }
	 */
    
    //approach -2
    public static ReferenceNo valueOf(String refNo) {
    	ReferenceNo referenceNo = null;
    	 referenceNo = new ReferenceNo();
    	 referenceNo.Source= refNo.substring(0,3);
         referenceNo.dest=refNo.substring(3,6);
         referenceNo.day= Integer.parseInt(refNo.substring(6,8));
         referenceNo.month=Integer.parseInt(refNo.substring(8,10));
         referenceNo.uniqueNo=Long.parseLong(refNo.substring(10,refNo.length()));
         return referenceNo;
    }
}

//class TestLogic{
//    public static void main(String[] args) {
//        System.out.println(new ReferenceNo("HYDCNN241110001").toString());
//    }
//}