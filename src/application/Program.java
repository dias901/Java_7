package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Veiculo;
import entities.al_carro;
import service.aluguel_service;
import service.taxa_service;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com o modelo do carro");
		System.out.print("Modelo do carro:");
		String carro = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);
		al_carro al_car = new al_carro(start,finish,new Veiculo(carro));
		
		System.out.print("Entre com o preço por hora: ");
		Double preço_hora = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		Double preço_dia = sc.nextDouble();
		aluguel_service al_serv = new aluguel_service(preço_hora,preço_dia,new taxa_service());
		al_serv.processo(al_car);
		
		System.out.println("FATURA");
		System.out.println("Pagamento básico: "+al_car.getFp().getPg_basic());
		System.out.println("Imposto: "+al_car.getFp().getTaxa());
		System.out.println("Pagamento total: "+al_car.getFp().total());
		
	}

}
