package org.deepak.persistence.service;

import java.util.List;
import java.util.Optional;

import org.deepak.persistence.model.Product;
import org.deepak.persistence.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService
{
   @Autowired
   private ProductRepository productDao;
   
   public List< Product > getAllProducts()
   {
      return productDao.findAll();
   }
   
   public Product saveProduct( Product product )
   {
      Product savedProduct =  productDao.save( product );
      savedProduct.setName( savedProduct.getName() + savedProduct.getId() );
      savedProduct = productDao.save( savedProduct );
      return savedProduct;
   }
   
   public Product findByProductId( Long id )
   {
      Optional< Product > product = productDao.findById( id );
      if( product.isPresent() )
      {
         return product.get();
      }
      else
      {
         return null;
      }
   }
   
   public List< Product > findAllProductsByName( String name )
   {
      return productDao.findAllByName( name );
   }
   
   public Product findByUniqueKey( String key )
   {
      return productDao.findByUniqueKey( key );
   }
   
   public List< Product > findMatchingProductsByContainingName( String name )
   {
      return productDao.findByNameContainingIgnoreCase( name );
   }
   
   public boolean checkIfProductExistsById( Long id )
   {
      return productDao.existsById( id );
   }
   
   public boolean checkIfProductExistsByUniqueKey( String key )
   {
      return productDao.existsByUniqueKey( key );
   }
}
