//ver 1
import java.util.Random;

public class Stipendi {
	public Dipendente[] dip;
	public int num;
	
	
	public Stipendi() {
		dip = new Dipendente[50];
		num = 0;
	}

	public void InsDip(Dipendente d) {
			if(num < 50) 
				dip[num++]=d;
	}
	
	public void setOreDip(Dipendente d, int o) {
			Random r= new Random();
			for(int i=0;i<num;i++)
					dip[i].setOre(r.nextInt(150)+50);
	}
	
	public float maxStip() {
		float max=dip[0].getStipO();
		for(int i=0;i<num;i++) 
			if(dip[i].getStipO()>max)
					max=dip[i].getStipO();
		return max;
	}
	
	public String stampaDipMaxStip() {
			String s="";
			float maxS=maxStip();
			for(int i=0;i<num;i++)
					if(dip[i].getStipO()==maxS)
						s+=dip[i].getCognome()+" "+dip[i].getNome()+"\n";
			return s;
	}
	
	public void ordina() {
		boolean scambi=true;
		int n=num;
		while(scambi) {
			scambi=false;
			for(int i=0;i<n-1;i++)
				if(dip[i].getCognome().compareToIgnoreCase(dip[i+1].getCognome())>0) {
					scambi =true;
					Dipendente temp=dip[i];
					dip[i]=dip[i+1];
					dip[i+1]=temp;
				}
			n--;
		}
	}
	
	public String toString() {
		String s="";
		ordina();
		for(int i=0;i<num;i++)
				s+=dip[i]+"\n";
		return s;
	}
}
