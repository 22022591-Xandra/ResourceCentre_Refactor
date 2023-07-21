
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	//teste
	public String toString(){
		// Write your codes heree
		String output = super.toString();
		output += String.format("%-20d\n", opticalZoom);
		return output;
	}
}

