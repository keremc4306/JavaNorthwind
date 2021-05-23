package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {
	private T data;
	public DataResult(T data, boolean success, String message) {
		super(success, message); //Base sınıfın constructorlarını çalıştırmaya yarıyor.
		this.data = data;
	}
	
	public DataResult(T data, boolean success) {
		super(success); //Base sınıfın constructorlarını çalıştırmaya yarıyor.
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
}
