package SafarjiProj;
import java.io.Serializable;
import java.util.Scanner;
public class Map implements Comparable<Map> , Serializable {
	private int buldingNo;
	private String stNa;
        private String cityNa;
	private int zipCode;

    public Map(int buldingNo, String stNa, String cityNa, int zipCode) {
      
        this.buldingNo = buldingNo;
        this.stNa = stNa;
        this.cityNa = cityNa;
        this.zipCode = zipCode;
    }

    public int getBuldingNo() {
        return buldingNo;
    }

    public String getStNa() {
        return stNa;
    }

    public String getCityNa() {
        return cityNa;
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Map Info:-\n" + " Buliding/Store/Unit Number:" + buldingNo + "\n St/Area/Store Name:"+ stNa + "\n City,Country:" + cityNa + "\n ZipCode/AreaCode:" + zipCode ;
    }
	
         
	public boolean equals(Object other) {
		return this.buldingNo == ((Map)other) .getBuldingNo();
	}
	@Override
	public int compareTo(Map o) {
		if(this.buldingNo == o.buldingNo &&this.zipCode == o.zipCode){
                    return 0;
                }
            return -1;
                
           
		
        
          
          
	}
	public static Map getLocation() {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.err.println("Enter Your Road Map Information :: ");
		System.out.print("Bulding|Store|unit|St #Number: ");
		int buldingNo = input.nextInt();
		input.nextLine();
		System.out.print("Bulding|Store|Area|St| *Name: ");
		String stNa = input.nextLine();
                System.out.print("City , Country Name: ");
		String cityNa = input.nextLine();
		System.out.print("Zip/Area Code: ");
		int zipCode = input.nextInt();
		System.out.println();
		return new Map(buldingNo, stNa, cityNa, zipCode);
	}
}