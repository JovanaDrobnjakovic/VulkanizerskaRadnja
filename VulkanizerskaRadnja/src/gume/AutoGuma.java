package gume;
/**
 * Klasa koja predstavlja gume za automobil.
 * 
 * @author Jovana Drobnjakovic
 * @version 1.0
 *
 */
public class AutoGuma {
	/**
	 * Marka modela gume
	 */
	private String markaModel = null;
	/**
	 * Precnik gume
	 */
	private int precnik = 0;
	/**
	 * Sirina gume
	 */
	private int sirina = 0;
	/**
	 * Visina gume
	 */
	private int visina = 0;

	/**
	 * Vraca vrednost atributa marka.
	 * @return marka gume kao String
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja novu vrednost za marku modela.
	 * 
	 * @param markaModel nova vrednost za marku modela
	 * 
	 * @throws java.lang.RuntimeException ako je 
	 * unet null ili String cija je duzina manja od 3
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca vrednost atributa precnik.
	 * @return precnik gume kao Integer
	 */
	public int getPrecnik() {
		return precnik;
	}
	/**
	 * Postavlja novu vrednost za precnik gume.
	 * 
	 * @param precnik nova vrednost za precnik gume
	 * 
	 * @throws java.lang.RuntimeException ako je 
	 * unet precnik manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	/**
	 * Vraca vrednost atributa sirina.
	 * @return sirina gume kao Integer
	 */
	public int getSirina() {
		return sirina;
	}
	/**
	 * Postavlja novu vrednost za sirinu gume.
	 * 
	 * @param sirina nova vrednost za sirinu gume
	 * 
	 * @throws java.lang.RuntimeException ako je 
	 * uneta sirina manja od 135 ili veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	/**
	 * Vraca vrednost atributa visina.
	 * @return visina gume kao Integer
	 */
	public int getVisina() {
		return visina;
	}
	/**
	 * Postavlja novu vrednost za visinu gume.
	 * 
	 * @param visina nova vrednost za visinu gume
	 * 
	 * @throws java.lang.RuntimeException ako je 
	 * uneta visina manja od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}
