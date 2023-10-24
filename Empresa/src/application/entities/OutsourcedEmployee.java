package application.entities;

/*
 * Funcionários Terceirizados
 */

public class OutsourcedEmployee extends Employee {

	//Depesa adicional
	private Double additionalCharge;
	
	
	
	public OutsourcedEmployee() {
		super();
	}



	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}



	public Double getAdditionalCharge() {
		return additionalCharge;
	}



	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public void payment(Double pg) {
		 super.payment(pg);
		 
	}
}
