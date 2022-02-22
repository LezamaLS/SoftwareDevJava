package com.mayab.desarrollo.parcial1.problema4;

public class DriverDataBase {
	public static void main(String[] args) {
		String sentenciaA = "('PlayerA MangA CortA', 'ZarA')";
		String sentenciaB = "('pLAYERa mANGa lARGa', 'aMERICAN eAGLe')";
		String sentenciaC = "('PlAyErA sIn MaNgAs', 'HoLlIsTeR')";
		
		
		
		
		System.out.println("***********Inicio De La Simulacion***********");
		
		DataBase dataBase = new DataBaseA(sentenciaA);
		dataBase.persistenciaDatos();
		
		dataBase = new DataBaseA(sentenciaB);
		dataBase.persistenciaDatos();
		
		dataBase = new DataBaseA(sentenciaC);
		dataBase.persistenciaDatos();
		
		System.out.println("*********************************************");

		dataBase = new DataBaseB(sentenciaA);
		dataBase.persistenciaDatos();
		
		dataBase = new DataBaseB(sentenciaB);
		dataBase.persistenciaDatos();
		
		dataBase = new DataBaseB(sentenciaC);
		dataBase.persistenciaDatos();
		
		System.out.println("*********************************************");
		
		dataBase = new DataBaseC(sentenciaA);
		dataBase.persistenciaDatos();
		
		dataBase = new DataBaseC(sentenciaB);
		dataBase.persistenciaDatos();
		
		dataBase = new DataBaseC(sentenciaC);
		dataBase.persistenciaDatos();
		
		
		System.out.println("************Fin De La Simulacion*************");
	}
}

