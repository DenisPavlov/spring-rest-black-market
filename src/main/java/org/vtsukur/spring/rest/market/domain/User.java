package org.vtsukur.spring.rest.market.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * @author volodymyr.tsukur
 */
@Entity
@Getter
@Setter
public class User extends BaseEntity {

    private String phoneNumber;

    @OneToMany
    private Set<Offer> offers = new HashSet<>();

}
