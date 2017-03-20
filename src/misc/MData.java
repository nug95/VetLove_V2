package misc;

import java.util.ArrayList;

import model.*;

public class MData {
	public static Vacina vac = new Vacina("200317", "rabiolis", 13.4);
	public static Consulta con = new Consulta("200317", "Validar Vacinas");
	
	public static ArrayList<Vacina> arVacs = new ArrayList<Vacina>();
	public static ArrayList<Consulta> arCons = new ArrayList<Consulta>();
 	
	public static Ficha fl = new Ficha(arVacs, arCons);
	
	public static Animal an = new Animal("Cao", "Pastor Alemao", "200117", fl);
	public static Cliente cl = new Cliente("Nuno", "Seixal", "nuno@email.com", "912345678");
	
	public static void fillData(){
		arVacs.add(vac);
		arCons.add(con);
		
		cl.getAnimais().add(an);
	}
	
}
