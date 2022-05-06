package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceApp {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceAppPU");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
//	Cliente cliente = new Cliente ("alberto", "morales",5522552);
//	Domicilio domicilio = new Domicilio("sarratea", 7053);
//	cliente.setDomicilio(domicilio);
//	domicilio.setCliente(cliente);
//	
//	em.persist(cliente);
//	 
//	Domicilio dom = em.find(Domicilio.class,1L);
//	Cliente cliente = em.find(Cliente.class, 1L);
//	
//	System.out.println("cliente desde domicilio"+dom.getCliente().getDni());
//	System.out.println("domicilio de cliente "+ cliente.getDomicilio().getNombreCalle());
//	 
			em.flush();
			em.getTransaction().commit();

		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
		}
		em.close();
		emf.close();

	}
}
