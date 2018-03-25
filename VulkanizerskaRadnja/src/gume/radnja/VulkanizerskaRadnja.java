package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;
/**
 * Klasa koja predstavlja Vulkanizersku radnju sa nekim osnovnim funkcionalnostima.
 * @author Jovana Drobnjakovic
 * @version 1.0
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista guma dostupnih u radnji
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Dodaje gumu u ponudu radnje
	 * @param a nova guma koja se dodaje u radnju
	 * @throws java.lang.RuntimeException ako se uneta guma vec nalazi u listi
	 * @throws java.lang.NullPointerException ako je uneta guma null
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Pronalazi i vraca listu sa svim gumama iz radnje koje odgovaraju upitu
	 * @param markaModel marka i model gume
	 * @return null ako je parametar markaModel null vrednost
	 * @return lista sa gumama koje odgovaraju upitu
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}

}
