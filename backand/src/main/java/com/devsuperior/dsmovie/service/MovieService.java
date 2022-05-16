package com.devsuperior.dsmovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie.dto.MovieDto;
import com.devsuperior.dsmovie.entitis.Movie;
import com.devsuperior.dsmovie.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	MovieRepository repository;
	
	@Transactional(readOnly = true)
	public Page<MovieDto> findAll(Pageable pageble){
		Page<Movie> result = repository.findAll(pageble); 
		Page<MovieDto> page = result.map(ele -> new MovieDto(ele));
		
		return page;
	}
	
	@Transactional(readOnly = true)
	public MovieDto findById(Long id){
		Movie result = repository.findById(id).get(); 
		MovieDto page =  new MovieDto(result);
		
		return page;
	}
}
