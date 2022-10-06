package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger {

	@Override // bir interface'den geldiğini söyler, biyerden geldiğini yani, yazmasak da olur
	public void log(String data) {

		System.out.println("Dosyaya loglandi: " + data);

	}

}
