package factoryparts;

public class FactoryMethodPartsMain {

	public static void main(String[] args) {
		
		TvFactory tvFactory = new TvFactory();
		FinalProduct toshibaTV = tvFactory.manufactureProduct("TOSHIBA_TV");
		
        ElectronicsFactory electronicsFactory = new ElectronicsFactory();
        FinalProduct toshibaParts = electronicsFactory.manufactureProduct("TOSHIBA_PARTS");
        
        
	}

}
