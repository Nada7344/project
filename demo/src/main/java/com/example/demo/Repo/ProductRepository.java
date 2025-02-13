package com.example.demo.Repo;
import com.example.demo.model.Products;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository extends JpaRepository<Products,Integer>, JpaSpecificationExecutor<Products> {
}
