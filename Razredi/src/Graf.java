import java.util.HashMap;
import java.util.Map;

public class Graf {
	private int stevec;
	protected Map<String, Tocka> tocke;
	public Graf() {
		stevec  = 0;
		tocke = new HashMap<String, Tocka>();
	}
	public Tocka tocka(String ime) {
			return tocke.get(ime);
	}
	public boolean povezava(Tocka t1, Tocka t2) {
		return t1.sosedi.contains(t2);
	}
	public Tocka dodajTocko(String ime) {
		if (this.tocka(ime) != null) return this.tocka(ime);
		Tocka ans = new Tocka(ime);
		tocke.put(ime, ans);
		if (ime == String.valueOf(stevec))stevec++;
		return ans;
	}
	public Tocka dodajTocko() {
		return dodajTocko(String.valueOf(stevec));
	}
	public void dodajPovezavo(Tocka t1, Tocka t2) {
		if (t1 != t2) {
			t1.sosedi.add(t2);
			t2.sosedi.add(t1);
		}
	}
	public void odstraniPovezavo(Tocka t1, Tocka t2) {
		if (t1.sosedi.contains(t2))t1.sosedi.remove(t2);
		if (t2.sosedi.contains(t1))t2.sosedi.remove(t1);
	}
	public void odstraniTocko(Tocka t) {
		t.sosedi.forEach(sosed -> {
			if(sosed.sosedi.contains(t)) sosed.sosedi.remove(t);
		});
		// a rabm še pošistt vse sosede od t?
		t.sosedi.clear();
		tocke.remove(t.ime, t);
	}
	private Tocka[] dodajTocke(int n) {
		Tocka[] ans = new Tocka[n];
		for(int i = 0; i< n; i++)ans[i] = dodajTocko();
		return ans;
	}
	
	static Graf prazen(int n) {
		Graf ans = new Graf();
		ans.dodajTocke(n);
		return ans;
	}
	static Graf cikel(int n) {
		Graf ans = new Graf();
		Tocka[] tab = new Tocka[n];
		for(int i = 0; i< n; i++) {
			if (i == n-1)tab[i].sosedi.add(tab[0]);
			else tab[i].sosedi.add(tab[i+1]);
		}
		for(int i = 0; i< n; i++)tab[i] = ans.dodajTocko();
		return ans;
	}
	static Graf poln(int n) {
		Graf ans = new Graf();
		Tocka[] tab = new tocka
		
	}
}
