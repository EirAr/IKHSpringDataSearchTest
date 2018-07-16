package com.iknowhow.springboot.util;

import com.iknowhow.springboot.model.User;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;


public class UserSpecification {
	
	 public static <T extends User>Specification<T> search(String term) {
		    return new Specification<T>() {
		       @Override
	     public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		        return cb.equal(root.get("name"), term);
		      }
		    };
	 }
	 
	 
	 
	/* public static <T>Specification<T> containsText(String text) {
	        return new Specification<T>() {
	         @Override
	           public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
	                Predicate p = cb.conjunction();
	                String finalText = text;
	                if(text != null ) {
	                        if(!text.trim().isEmpty()) {
	                    
	                            if (!text.contains(“%”)) {
	                                finalText = “%” + text + “%”;
	                            }
	        
	                            p.getExpressions().add(cb.or(
	                                    
	                                    cb.like(cb.lower(root.get(“userEmail”)), finalText.toLowerCase()),
	                                    cb.like(cb.lower(root.get(“firstName”)), finalText.toLowerCase()),
	                                    cb.like(cb.lower(root.get(“lastName”)), finalText.toLowerCase()),
	                                    cb.like(cb.lower(root.get(“barcode”)), finalText.toLowerCase()),
	                                    cb.like(cb.lower(root.get(“passportNumber”)), finalText.toLowerCase())
	                                    ));
	                            
	                        }
	                }
	    
	                
	            return p;
	           }
	         };
	    }*/
}