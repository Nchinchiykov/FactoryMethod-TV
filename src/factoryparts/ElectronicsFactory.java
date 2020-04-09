package factoryparts;

public class ElectronicsFactory extends PartsFactory{

	@Override
	public FinalProduct createProduct(String name) {
		
		FinalProduct product = null;
		
		if(name.equals("SAMSUNG_PARTS")) {
			product = new SamsungParts();
		}
		
		if(name.equals("SONY_PARTS")) {
			product = new SonyParts();
		}
		if(name.equals("TOSHIBA_PARTS")) {
			product = new ToshibaParts();
		}
		return product;
	}

}
