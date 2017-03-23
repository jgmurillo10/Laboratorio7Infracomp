
public class Main {
	public static void main(String[] args) {
		CifradoSimetrico cs = new CifradoSimetrico();
		CifradoSimetrico ct = new CifradoSimetrico();
		
		
		
		byte[] pwd=cs.cifrar();
		ct.setKey(cs.desKey);
		ct.descifrar(pwd);
	}
}
