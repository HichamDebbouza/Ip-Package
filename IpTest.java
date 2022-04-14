import IpPackage.*;
class IpTest {
		public static void main (String args[]) {

			IpPackage ip1 = IpPackage.getInstance(192,168,10,1);
			ip1.test();
			System.out.println("\nLa suite ...");
			int x = 257;

			IpPackage ip2 = IpPackage.getInstance(192,168,10,1);
			System.out.println("Valeur de l'octet 2 = " + ip2.getOctet2());

			// Classe de l'adresse
			System.out.println("Classe de l'adresse ip1  " + ip1.getClasse());
			System.out.println("Classe de l'adresse ip2  " + ip2.getClasse());
			System.out.println("\n\n");

			// affichage 
			System.out.println("Adresse reseau de l'adresse ip1  " + ip1.adresse().ToString());
			System.out.println("Adresse reseau de l'adresse ip2  " + ip2.adresse().ToString());
			System.out.println("\n\n");

			// verification même réseau
			System.out.println("ip1 et ip2 meme reseau ? " + ip1.samereseau(ip2));
			System.out.println("ip1 et ip1 meme reseau ? " + ip1.samereseau(ip1));
			System.out.println("ip2 et ip2 meme reseau ? " + ip2.samereseau(ip2));
			}

}
