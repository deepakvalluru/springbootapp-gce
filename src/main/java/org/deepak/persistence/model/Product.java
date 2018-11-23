package org.deepak.persistence.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table ( name = "product" )
public class Product
{
   @Id
   @GeneratedValue ( strategy = GenerationType.AUTO )
   @Column ( name = "id", unique = true, nullable = false )
   private long   id;

   @Column ( name = "unique_key", unique = true, nullable = false )
   private String uniqueKey;

   @Column ( name = "name", unique = false, nullable = false )
   private String name;

   @Column ( name = "price", unique = false, nullable = true )
   private float  price;

   public Product( String name, float price )
   {
      this.uniqueKey = UUID.randomUUID().toString();
      this.name = name;
      this.price = price;
   }

   public Product()
   {

   }

   /**
    * @return the id
    */
   public long getId()
   {
      return id;
   }

   /**
    * @param id the id to set
    */
   public void setId( long id )
   {
      this.id = id;
   }

   /**
    * @return the uniqueKey
    */
   public String getUniqueKey()
   {
      return uniqueKey;
   }

   /**
    * @param uniqueKey the uniqueKey to set
    */
   public void setUniqueKey( String uniqueKey )
   {
      this.uniqueKey = uniqueKey;
   }

   /**
    * @return the name
    */
   public String getName()
   {
      return name;
   }

   /**
    * @param name the name to set
    */
   public void setName( String name )
   {
      this.name = name;
   }

   /**
    * @return the price
    */
   public float getPrice()
   {
      return price;
   }

   /**
    * @param price the price to set
    */
   public void setPrice( float price )
   {
      this.price = price;
   }
   
   @Override
   public String toString()
   {
      return new ToStringBuilder( this ).append( "id", id )
                                        .append( "key", uniqueKey )
                                        .append( "name", name )
                                        .append( "price", price )
                                        .build();
      
   }

}
