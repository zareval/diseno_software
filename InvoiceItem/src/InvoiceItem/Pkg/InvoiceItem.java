package InvoiceItem.Pkg;

public class InvoiceItem {
	private String ID;
	private String desc;
	private int qty;
	private double unitPrince;
	
	public InvoiceItem(String ID, String desc, int qty, double unitPrice) {
		this.ID=ID;
		this.desc=desc;
		this.qty=qty;
		this.unitPrince=unitPrice;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getUnitPrince() {
		return unitPrince;
	}

	public void setUnitPrince(double unitPrince) {
		this.unitPrince = unitPrince;
	}
	
	public double getTotal() {
		double unitPrice = 1;
		double getTotal = unitPrice *qty;
		return getTotal;
	}
	
	@Override
	public String toString() {
		double unitPrice = 5400.99;
		return "Product: ID:"+ID+
				", Descuento:"+desc+
				", Cantidad del producto:"+qty+
				", Precio:"+unitPrice;
	}

	
}
