package com.gussalves.mvc.mudi.repository;

import com.gussalves.mvc.mudi.model.ProductOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOrderRepository extends CrudRepository<ProductOrder, Long> {
}
