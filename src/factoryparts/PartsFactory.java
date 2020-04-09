package factoryparts;

public abstract class PartsFactory {

	public abstract FinalProduct createProduct(String name);
	
	public FinalProduct manufactureProduct(String name) {
		FinalProduct product = createProduct(name);
		product.manufacture();
		return product;
	}
}
