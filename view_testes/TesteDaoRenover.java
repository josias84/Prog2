package view_testes;


import regrasdenegocio_dao.ContatoDao;

public class TesteDaoRenover {
	public static void main(String[]args) {
		
		try {
				ContatoDao contatoDao;
				contatoDao = new ContatoDao();
				contatoDao.remover(1L);
				System.out.println("Removido");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
