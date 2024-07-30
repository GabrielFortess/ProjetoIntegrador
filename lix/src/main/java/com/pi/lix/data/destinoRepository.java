
package com.pi.lix.data;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 

@Repository 
public interface destinoRepository extends JpaRepository<destinoEntity, Integer> { 

} 