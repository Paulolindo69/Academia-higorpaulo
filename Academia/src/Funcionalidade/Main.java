	package Funcionalidade;
	
	import DAO.DBConnection;
	import usuario.Cliente;

	import java.time.LocalDate;

	import DAO.ClienteDAO;
	import DAO.ClienteDAOImpl;
	
	public class Main {
		public static void main(String[]args) {
		DBConnection.getInstance().getConnection();
		
		ClienteDAOImpl daoCliente = new ClienteDAOImpl();
		
		Cliente teste = daoCliente.buscarporId(1);
		System.out.println(teste.getCpf());
		System.out.println(teste.getNome());
		System.out.println(teste.getEmail());	
		System.out.println(teste.getTelefone());
		System.out.println(teste.getNascimento());
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setCpf("123123123");
		cliente1.setNascimento(LocalDate.now());
		daoCliente.salvar(cliente1);
		
		
		
		}
	}
