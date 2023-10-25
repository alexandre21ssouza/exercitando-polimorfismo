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
	
	
	/*
	 * Pagamento de terceirizado com adicional * 110%
	 * com sobreposição de método(@Override)
	 */
	@Override
	public Double payment() {
		 return super.payment() + additionalCharge * 1.1;
	}
		 		 
	
}
