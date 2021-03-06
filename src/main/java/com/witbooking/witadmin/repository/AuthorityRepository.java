package com.witbooking.witadmin.repository;

import com.witbooking.witadmin.domain.Authority;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority,String> {

    @Query("select authority from Authority authority left join fetch authority.permissions where authority.name =:name")
    Authority findOneWithEagerRelationships(@Param("name") String name);

}
