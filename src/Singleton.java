
public class Singleton {
	//(versteckte) Klassenvariable vom Klassentyp
	private static Singleton instace;
	
	//privater Konstruktor verhindert Instanziierung durch andere Methoden
	private Singleton() {
		
	}
	
	//Erzeugt EINMAL ein Objekt der Klasse und liefert dieses zurück
	//synchronized stellt sicher, dass die Methode nur von einem Thread zur
	//gleichen Zeit durchlaufen wird. Somit erhält der nächste Thread immer eine
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
