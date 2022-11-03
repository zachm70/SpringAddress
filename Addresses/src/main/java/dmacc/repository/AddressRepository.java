package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Addresses;

@Repository
public interface AddressRepository extends JpaRepository<Addresses, Long>{

}
