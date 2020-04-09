package factoryparts;

public class TvFactory extends PartsFactory {

	@Override
	public FinalProduct createProduct(String name) {
		
		FinalProduct product = null;
		
		if(name.equals("SAMSUNG_TV")) {
			product = new SamsungTV();
		}
		if(name.equals("SONY_TV")) {
			product = new SonyTV();
			
		}
		if(name.equals("TOSHIBA_TV")) {
			product = new ToshibaTV();
		}
		return product;
		
	}

}
