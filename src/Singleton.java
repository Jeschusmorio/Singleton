
public class Singleton {
	//(versteckte) Klassenvariable vom Klassentyp
	private static Singleton instace;
	
	//privater Konstruktor verhindert Instanziierung durch andere Methoden
	private Singleton() {
		
	}
	
	//Erzeugt EINMAL ein Objekt der Klasse und liefert dieses zur�ck
	//synchronized stellt sicher, dass die Methode nur von einem Thread zur
	//gleichen Zeit durchlaufen wird. Somit erh�lt der n�chste Thread immer eine
	//komplett initialisierte Instanz.
	public static synchronized Singleton getInstance() {
		if (Singleton.instace == null) {
			Singleton.instace = new Singleton();
			System.out.println("Created Singleton successfully!");
		}
		else {
			System.out.println("Singleton already exists!");
		}
		return Singleton.instace;
	}
}
