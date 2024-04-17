package com.Bardolog.service.common;

import java.io.Serializable;
import java.util.Set;

public interface SimpleService<E extends Serializable> {
	
	public Set<E> getAll();
	public E save(E entity);

}
