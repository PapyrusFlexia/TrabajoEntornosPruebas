package funciones;

import java.nio.charset.StandardCharsets;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.List;

public class Funciones {
	public boolean PrimeraFuncion(int numero1) {
		int x = 13;
		if (numero1 % x == 0) {
			System.out.println("Es divisible");
			return true;
		} else {
			System.out.println("No es divisible");
			return false;
		}
	}

	public boolean SegundaFuncion(int numero) {
		if (numero >= 400 && numero <= 500) {
			System.out.print("El numero existe en el intervalo 400 - 500");
			return true;
		} else {
			System.out.println("El numero no existe en el intervalo 400 - 500");
			return false;
		}
	}

	public static int TerceraFuncion(int num, int div) {
		int x = 13;
		if (num % x == 0 && (div > 400 && div < 500)) {
			return num / div;
		} else {
			return 0;
		}
	}

	public static String CuartaFuncion(String prim, String seg, String terc) {

		byte[] bytesPrim = prim.getBytes();
		byte[] bytesSeg = seg.getBytes();
		byte[] bytesTerc = terc.getBytes();
		int contPrim = 0;
		int contSeg = 0;
		int contTerc = 0;

		ArrayList<Byte> PrimModif = new ArrayList<Byte>();
		ArrayList<Byte> SegModif = new ArrayList<Byte>();
		ArrayList<Byte> TercModif = new ArrayList<Byte>();

		for (int i = 0; i < bytesPrim.length; i++) {

			if ((bytesPrim[i] < 65 || bytesPrim[i] > 90) && (bytesPrim[i] != 97 && bytesPrim[i] != 101
					&& bytesPrim[i] != 105 && bytesPrim[i] != 111 && bytesPrim[i] != 117)) {
				PrimModif.add(contPrim, bytesPrim[i]);
				contPrim++;
			}
		}

		for (int i = 0; i < bytesSeg.length; i++) {

			if ((bytesSeg[i] < 65 || bytesSeg[i] > 90) && (bytesSeg[i] != 97 && bytesSeg[i] != 101 && bytesSeg[i] != 105
					&& bytesSeg[i] != 111 && bytesSeg[i] != 117)) {
				SegModif.add(contSeg, bytesSeg[i]);
				contSeg++;
			}
		}

		for (int i = 0; i < bytesTerc.length; i++) {

			if ((bytesTerc[i] < 65 || bytesTerc[i] > 90) && (bytesTerc[i] != 97 && bytesTerc[i] != 101
					&& bytesTerc[i] != 105 && bytesTerc[i] != 111 && bytesTerc[i] != 117)) {
				TercModif.add(contTerc, bytesTerc[i]);
				contTerc++;
			}
		}

		String PrimFinal = new String(ArrayListToArray(PrimModif));
		String SegFinal = new String(ArrayListToArray(SegModif));
		String TercFinal = new String(ArrayListToArray(TercModif));

		return PrimFinal + SegFinal + TercFinal;

	}

	public static byte[] ArrayListToArray(ArrayList<Byte> arrayList) {
		byte[] array = new byte[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			array[i] = arrayList.get(i).byteValue();
		}
		return array;

	}

	public int QuintaFuncion(String sum) {
		byte[] bytesSum = sum.getBytes();
		int contSum = 0;

		ArrayList<Byte> sumModif = new ArrayList<Byte>();

		for (int i = 0; i < bytesSum.length; i++) {
			if (!(bytesSum[i] < 48 || bytesSum[i] > 57)) {
				sumModif.add(contSum, bytesSum[i]);

				contSum++;
			}
		}

		return QuintaFuncionArray(sumModif);
	}

	public int QuintaFuncionArray(ArrayList<Byte> array) {
		int suma = 0;
		byte[] barray = new byte[array.size()];
		for (int i = 0; i < array.size(); i++) {
			barray[i] = array.get(i).byteValue();
		}
		String texto = new String(barray, StandardCharsets.US_ASCII);

		for (int i = 0; i < texto.length(); i++) {
			suma += Character.getNumericValue(texto.charAt(i));

		}
		System.out.println(suma);
		return suma;
	}

	public ArrayList<Double> SextaFuncion(List<Double> lista) {
		double variable = 0;
		int w = 6;
		double variable2 = 0;

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) % 2 == 0) {
				variable = lista.get(i) * (double) (w);
				lista.set(i, variable);

			}
		}
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) % 2 != 0) {
				variable2 = Math.pow(lista.get(i), w);
				lista.set(i, variable2);

			}
		}
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		return (ArrayList<Double>) lista;

	}

	public static String SeptimaFuncion(List<String> cadena) {
		int r = 6;
		int s = 10;
		String resultado = "";
		ArrayList<String> modificado = new ArrayList<String>();
		for (int i = 0; i < cadena.size(); i++) {
			String nuevo = "";
			nuevo += cadena.get(i).substring(r, s);
			modificado.add(nuevo);
		}

		for (String str : modificado) {
			resultado += str + "\t";
		}

		return resultado;
	}

	public static boolean OctavaFuncion(String[] alumnos, Integer[] minutos) {

		int t = 700;
		boolean verdad = true;
		for (int i = 0; i < minutos.length; i++) {
			if (minutos[i] < t) {
				verdad = false;
			}

		}
		return verdad;
	}
}
