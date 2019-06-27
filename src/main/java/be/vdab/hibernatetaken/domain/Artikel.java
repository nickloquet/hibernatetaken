package be.vdab.hibernatetaken.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "artikels")
public class Artikel implements Serializable {
    private final long serialVersionUID = 1L;
    @Id private long id;
    private String naam;
    private BigDecimal aankoopprijs;
    private BigDecimal verkoopprijs;

    public long getId() {
        return id;
    }
    public String getNaam() {
        return naam;
    }
    public BigDecimal getAankoopprijs() {
        return aankoopprijs;
    }
    public BigDecimal getVerkoopprijs() {
        return verkoopprijs;
    }
}
