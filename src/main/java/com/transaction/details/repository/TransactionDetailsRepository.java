package com.transaction.details.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transaction.details.entity.TransactionDetails;

@Repository
public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails, Long> {

}
