package com.reign.animezation.entities;

import java.io.Serializable;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import javax.persistence.Entity;
=======
>>>>>>> dc306c8... 		--- Test profile, dependencias H2 ---
=======
import javax.persistence.Entity;
>>>>>>> 1a9c38e... 		--- JPA repository, Dependency injection, database seeding ---
=======
import javax.persistence.Entity;
>>>>>>> f7ca8d8... Verificando erros
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
@Entity
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
=======
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

>>>>>>> 9aee6a2... 		--- User e UserResource ---
=======
=======
@Entity
>>>>>>> 1a9c38e... 		--- JPA repository, Dependency injection, database seeding ---
=======
@Entity
>>>>>>> f7ca8d8... Verificando erros
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> dc306c8... 		--- Test profile, dependencias H2 ---
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
<<<<<<< HEAD
	private Long cpf;
	private Long birthDate;
	private Long cep;
	private String addres;
	private Integer number;
	private String complement;
	private String neighborhood;
	private String city;
	private String state;

	public User() {}
	
	public User(Long id, String name, String email, String phone, String password, Long cpf, Long birthDate, Long cep,
			String addres, Integer number, String complement, String neighborhood, String city, String state) {
=======
	
	// DADOS NECESSARIOS PARA COMPLETAR PEDIDOS
	private Long cpf;
	private Long birthDate;
	private Long cep;
	private String addres;
	private Integer number;
	private String complement;
	private String neighborhood;
	private String city;
	private String state;
	
	public User() {}
	
<<<<<<< HEAD
<<<<<<< HEAD
	public User(Long id, String name, String email, String phone, String password) {
>>>>>>> 9aee6a2... 		--- User e UserResource ---
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
<<<<<<< HEAD
		this.cpf = cpf;
		this.birthDate = birthDate;
		this.cep = cep;
		this.addres = addres;
		this.number = number;
		this.complement = complement;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
	}
	
=======
	}
	
=======
>>>>>>> 1a9c38e... 		--- JPA repository, Dependency injection, database seeding ---
=======
>>>>>>> f7ca8d8... Verificando erros
	public User(Long id, String name, String email, String phone, String password, Long cpf, Long birthDate, Long cep,
			String addres, Integer number, String complement, String neighborhood, String city, String state) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.cpf = cpf;
		this.birthDate = birthDate;
		this.cep = cep;
		this.addres = addres;
		this.number = number;
		this.complement = complement;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
	}

>>>>>>> 9aee6a2... 		--- User e UserResource ---
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
<<<<<<< HEAD
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public Long getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Long birthDate) {
		this.birthDate = birthDate;
	}
	public Long getCep() {
		return cep;
	}
	public void setCep(Long cep) {
		this.cep = cep;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
=======
>>>>>>> 9aee6a2... 		--- User e UserResource ---

	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public Long getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Long birthDate) {
		this.birthDate = birthDate;
	}
	public Long getCep() {
		return cep;
	}
	public void setCep(Long cep) {
		this.cep = cep;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}