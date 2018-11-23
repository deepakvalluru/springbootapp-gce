package org.deepak.persistence.repo;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.deepak.persistence.model.Product;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ProductRepository extends CrudRepository< Product, Long >
{
   Optional< Product > findById( Long id );
   Product findByUniqueKey( String key );
   List< Product > findAll();
   Product save( Product product );
   List< Product > findAllByName( String name );
   List< Product > findByNameContainingIgnoreCase( String name );
   boolean existsById( Long id );
   boolean existsByUniqueKey( String key );
}
