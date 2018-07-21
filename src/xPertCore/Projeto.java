package xPertCore;

import java.util.ArrayList;
import java.lang.String;
//vai pfvr!!


public class Projeto {
	private int identificacao;
	private String nome;
	private double situacao;
	private int ETA;
        private int atraso;
	private ArrayList<Etapa> etapasVinculadas = new ArrayList<Etapa>(0);
	
	public Projeto(ArrayList<Etapa> etapasNecessarias,int idProjeto,String nomeProjeto)
	{
		etapasVinculadas = etapasNecessarias;
		setIdentificacao(idProjeto);
		setNome(nomeProjeto);
		setETA(-1);
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nomeProjeto)
	{
		nome =nomeProjeto;
	}
	public int getIdentificacao()
	{
		return identificacao;
	}
	public void setIdentificacao(int idProjeto)
	{	if(idProjeto >= 0)
			identificacao = idProjeto;
		else
			System.out.println("Id invalido");
	}
	public double getSituacao()
	{
		return situacao;
	}
	public void setSituacao(double p)
	{	if(p>=0)
			situacao = p;
		else
			System.out.println("Percentual invalido");
	}
        public int getAtraso() 
        {
            return atraso;
        }
        public void setAtraso(int atraso)
        {
            this.atraso = atraso;
        }
	public int getETA() {
		return ETA;
	}
	public void setETA(int eTA) {
		ETA = eTA;
	}
	public ArrayList<Etapa> getEtapasDisponiveis()
	{
		int n=etapasVinculadas.size();
		ArrayList<Etapa> etapasDisponiveis = new ArrayList<Etapa>(0);
		
		for(int c=0;c<n;c++)
		{
			if(etapasVinculadas.get(c).isDisponivel() && !etapasVinculadas.get(c).isRealizado())
			{
				etapasDisponiveis.add(etapasVinculadas.get(c));
			}
		}
		
		return etapasDisponiveis;
		
	}
	public ArrayList<Etapa> getEtapasConcluidas()
	{
		int n=etapasVinculadas.size();
		ArrayList<Etapa> etapasConculuidas = new ArrayList<Etapa>(0);
		
		for(int c=0;c<n;c++)
		{
			if(etapasVinculadas.get(c).isRealizado())
			{
				etapasConculuidas.add(etapasVinculadas.get(c));
			}
		}
		
		return etapasConculuidas;
	}
	public int getEtapasAFazer()
	{
		return etapasVinculadas.size() - getEtapasConcluidas().size();
	}
	public void simular()
	{
		if(getETA()==-1)
		{
			int time =0;
			ArrayList<Etapa> abertos = new ArrayList<Etapa>(0);
			
			while(getEtapasAFazer() > 0)
			{
				int maiorTempofinal = 0;
				abertos = getEtapasDisponiveis();
				
				int n=abertos.size();
				
				for(int c=0;c<n;c++)
				{
					abertos.get(c).setMenorTempoDeIncio(time);
					abertos.get(c).setMenorTempoDeFim(abertos.get(c).getMenorTempoDeIncio()+abertos.get(c).getTempoDeDuracaoPrevista());
					abertos.get(c).setRealizado(true);
					
					if(abertos.get(c).getMenorTempoDeFim() > maiorTempofinal)
						maiorTempofinal = abertos.get(c).getMenorTempoDeFim();
				}
				
				for(int c=0;c<n;c++)
					abertos.get(c).setMaiorTempoDeFolga(maiorTempofinal-abertos.get(c).getMenorTempoDeFim());
				
				time = maiorTempofinal;
				
			}
			
			int n =etapasVinculadas.size();
			
			for(int c=0;c<n;c++)
			{
				etapasVinculadas.get(c).setRealizado(false);
			}
			setETA(time);
		}
		else
			System.out.println("Projeto foi previamente simulado");
	}
	

}