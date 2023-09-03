package com.example.demo.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Projection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long idProjection ;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateProjection; 
	private String tarifProjection ;
	private String timeProjection;

	
    @ManyToOne()
	    @JoinColumn(name = "id_salle")
	    private Salle salle;
	 
	 
	 @ManyToOne
	    @JoinColumn(name = "id_film")
	    private Film film;
}

