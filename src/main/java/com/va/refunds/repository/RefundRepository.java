package com.va.refunds.repository;

import com.va.refunds.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefundRepository extends JpaRepository<Order, Long> {

    void updateOrder(Order order);
}
