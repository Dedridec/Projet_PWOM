//package fr.esiea.models;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "form")
//public class Form {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//
//	@Enumerated(EnumType.STRING)
//	@Column(length = 20)
//	private ERole name;
//
//	public Form() {
//
//	}
//
//	public Form(ERole name) {
//		this.name = name;
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public ERole getName() {
//		return name;
//	}
//
//	public void setName(ERole name) {
//		this.name = name;
//	}
//}