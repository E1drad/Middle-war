package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface d�crivant le comportement d'un acheteur.
 * @author L�o CASSIAU, Geoffrey DESBROSSES, Jean-Christophe GUERIN, Ugo MAHEY
 * 
 */
public interface Acheteur extends Remote {

	/**
	 * Vend l'objet au gagnant de l'ench�re.
	 * 
	 * @param gagnant
	 *            Client qui a gagne l'enchere
	 * @throws RemoteException
	 */
	public void objetVendu(String gagnant) throws RemoteException;

	/**
	 * Attribut un nouveau prix � un objet pendant une ench�re. Met aussi � jours la personne ayant 
	 * la plus grosse ench�re sur l'objet.
	 * 
	 * @param prix = Nouveau prix de l'objet
	 * @param gagnant = Acheteur ayant mis le nouveau prix. Donc le gagnant si personne rench�rit.
	 * @throws RemoteException
	 */
	public void nouveauPrix(int prix, Acheteur gagnant) throws RemoteException;
	
	/**
	 * Met fin � une ench�re
	 * @throws RemoteException
	 */
	public void finEnchere() throws RemoteException;
	
	/**
	 * R�cup�re le pseudo de l'acheteur.
	 * 
	 * @return String : le pseudo de l'acheteur
	 * @throws RemoteException
	 */
	public String getPseudo() throws RemoteException;

	/**
	 * R�cup�re le chronom�tre de l'ench�re � la quelle participe l'acheteur
	 * @return long : la dur�e du chrono
	 * @throws RemoteException
	 */
	public long getChrono() throws RemoteException;


}
