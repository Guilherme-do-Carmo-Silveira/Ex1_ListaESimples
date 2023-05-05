package view;

import docarmo.listaEncadeadaInt.Lista;
import docarmo.quicksort.Ordenacao;

public class main {

	public static void main(String[] args) {

		Ordenacao ord = new Ordenacao();

		Lista l = new Lista();

		l.addFirst(10);
		try {
			l.addLast(5);
			l.addLast(8);
			l.addLast(1);
			l.addLast(9);
			l.addLast(2);
			l.addLast(4);
			l.addLast(7);
			l.addLast(3);
			l.addLast(6);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int tamanho = l.size();
		int[] vt = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			try {
				vt[i] = l.get(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		ord.QuickSort(vt, 0, tamanho - 1);
		
		System.out.print("Lista: ");
		for (int i = 0; i < tamanho; i++) {
			try {
				l.add(vt[i], i);
				System.out.print(l.get(i) + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}