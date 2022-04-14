package IpPackage;

public class IpPackage {
	//Le constructeur privé
	private IpPackage(final int octet1, final int octet2, final int octet3, final int octet4) {
		this.octet1 = octet1;
        	this.octet2 = octet2;
        	this.octet3 = octet3;
        	this.octet4 = octet4;
	}
	// Attributs
	private int octet1;
	private int octet2;
	private int octet3;
	private int octet4;

	//Test
	public void test() {
        	System.out.println("Test? ");
	}

// Méthode static
public static IpPackage getInstance(final int i, final int j, final int k, final int l) {
        try {
            	if (i < 0 || i > 255 || j < 0 || j > 255 || k < 0 || k > 255 || l < 0 || l > 255) {
                	throw new Exception();
            		}
        	}
        	catch (Exception e) {
            		System.out.println("Valeur impossible \n");
			//return null
        	}
        System.out.println("o1 = " + i);
        System.out.println("o2 = " + j);
        System.out.println("o3 = " + k);
        System.out.println("o4 = " + l);
        return new IpPackage(i, j, k, l);
}

	public String ToString() {
        	return "o1 = " + this.octet1 + " o2 = " + this.octet2 + " o3 = " + this.octet3 + " o4 = " + this.octet4;
	}

	//Ascesseur
	public int getOctet1() {
		return this.octet1;
	}

	public int getOctet2() {
        	return this.octet2;
	}

	public int getOctet3() {
        	return this.octet3;
	}

    	public int getOctet4() {
        	return this.octet4;
	}
	public char getClasse() {
        	char c = 'x';
        	if (this.octet1 <= 126) {
            		c = 'A';
        	}
        	if (this.octet1 >= 126 && this.octet1 <= 191) {
            		c = 'B';
        	}
        	if (this.octet1 >= 192 && this.octet1 <= 223) {
            		c = 'C';
        	}
        	return c;
    	}

    public IpPackage adresse() {
        final int octet1 = this.octet1;
        int n = 0;
        int octet2 = 0;
        final int n2 = 0;
        if (this.getClasse() == 'B') {
            n = this.octet2;
        }
        if (this.getClasse() == 'C') {
            n = this.octet2;
            octet2 = this.octet3;
        }
        return new IpPackage(octet1, n, octet2, n2);
    }

    public Boolean samereseau(final IpPackage ipPackage) {
return this.adresse().octet1 == ipPackage.adresse().octet1 && this.adresse().octet2 == ipPackage.adresse().octet2 && this.adresse().octet3 == ipPackage.adresse().octet3;
    }
}
