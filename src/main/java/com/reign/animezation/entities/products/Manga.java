package com.reign.animezation.entities.products;

import javax.persistence.Entity;

import com.reign.animezation.entities.Product;

@Entity
public class Manga extends Product {

	private static final long serialVersionUID = 1L;

	private String author;
	private Integer numberPages;
	private Integer volume;
	private String ageRating;
	private String publishingCompany;
	private Long iSBN;
	
	public Manga() {}

	public Manga(Long id, String name, String description, Double price, String imgUrl, String author, Integer numberPages, Integer volume, String ageRating, String publishingCompany,
			Long iSBN) {
		super(id, name, description, price, imgUrl);
		this.author = author;
		this.numberPages = numberPages;
		this.volume = volume;
		this.ageRating = ageRating;
		this.publishingCompany = publishingCompany;
		this.iSBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(Integer numberPages) {
		this.numberPages = numberPages;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public String getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(String ageRating) {
		this.ageRating = ageRating;
	}

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	public Long getiSBN() {
		return iSBN;
	}

	public void setiSBN(Long iSBN) {
		this.iSBN = iSBN;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manga other = (Manga) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		return true;
	}
}