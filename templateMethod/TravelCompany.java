package templateMethod;

public class TravelCompany extends Company
{
	public TravelCompany(String name, String address, String phone, String fax)
	{
		super(name, address, phone, fax);
	}
	
	// Replacement Method
	@Override
	public String getServiceType() { return this.getClass().getSimpleName(); }

	// No need to override show() at this point. Later when Travel Company
	// is associated to Travel objects, it can ask them to show their attributes.
}
