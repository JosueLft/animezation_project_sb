package com.reign.animezation.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.reign.animezation.entities.Category;
import com.reign.animezation.entities.Order;
import com.reign.animezation.entities.OrderItem;
import com.reign.animezation.entities.Payment;
import com.reign.animezation.entities.Product;
import com.reign.animezation.entities.User;
import com.reign.animezation.entities.enums.OrderStatus;
import com.reign.animezation.repositories.CategoryRepository;
import com.reign.animezation.repositories.OrderItemRepository;
import com.reign.animezation.repositories.OrderRepository;
import com.reign.animezation.repositories.ProductRepository;
import com.reign.animezation.repositories.UserRepository;

@Configuration
@Profile("test") // indicando que a configuração só será executada caso seja o profile test que esteja invocando
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(null, "Livros");
		Category cat2 = new Category(null, "Camisetas");
		Category cat3 = new Category(null, "Acessórios"); 
		
		Product p1 = new Product(null, "That Time I Got Reincarnated As A Slime! Vol. 01", "Satoru Mikani era um jovem trabalhador tímido e sem sorte no amor. Certo dia acaba sendo morto. Porém, para a sua surpresa, ele ressuscita como uma Slime em um mundo medieval repleto de magia, poderes sobre-humanos e seres fantásticos", 27.90, "");
		Product p2 = new Product(null, "Rukia Bankai & Ichigo Mugetsu", "Camiseta para os Fãs de bleach, com imagem de alta qualidade da bankai de rukia e ichigo em sua forma de getsuga final!.", 2190.0, "");
		Product p3 = new Product(null, "Almofada Anime Fullmetal Alchemist", "As nossas almofadas de anime são produzidas com tecido 100% helanca, para garantir uma estampa com cores vivas, conforto e qualidade prolongadas", 1250.0, "");
		Product p4 = new Product(null, "That Time I Got Reincarnated As A Slime! Vol. 01", "Depois de reencarnar como uma Slime em um mundo fantástico regido pela magia e repleto de seres míticos, Satoru se alia a Veldora, o lendário Dragão da Tempestade que estava selado em uma caverna.\\r\\n\\r\\nAgora rebatizado de Rimuru.", 27.90, "");
		Product p5 = new Product(null, "Kenpachi Zaraki Bankai", "Camiseta para os Fãs de bleach com imagem de alta qualidade da bankai de Kenpachi Zaraki!.", 10000.99, ""); 

		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		p1.getCategories().add(cat1);
		p2.getCategories().add(cat2);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat1);
		p5.getCategories().add(cat2);
		
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		User u1 = new User(null, "Pablo Rodrigues", "pablorodrigo1996@hotmail.com", 11970707070L, "Gajuel123", null, null, null, null, null, null, null, null, null);
		User u2 = new User(null, "Gabriel Tomaz", "gazinhogodi@outlook.com", 11960606060L, "Gabriel39234500gazinho", null, null, null, null, null, null, null, null, null);
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
		OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
		OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice());
		OrderItem oi3 = new OrderItem(o2, p3, 2, p3.getPrice());
		OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice());
		
		orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));
		
		Payment pay1 = new Payment(null, Instant.parse("2019-06-20T21:53:07Z"), o1);
		o1.setPayment(pay1);
		
		orderRepository.save(o1);
	}
}