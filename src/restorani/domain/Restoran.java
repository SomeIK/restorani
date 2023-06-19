package restorani.domain;

import java.util.Objects;

/**
 *
 * @author something
 */
public class Restoran {
    
    
    private Long id;
    private String ime;
    private String adresa;

    public Restoran() {
    }

    public Restoran(Long id, String ime, String adresa) {
        this.id = id;
        this.ime = ime;
        this.adresa = adresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.ime);
        hash = 37 * hash + Objects.hashCode(this.adresa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Restoran other = (Restoran) obj;
        if (!Objects.equals(this.ime, other.ime)) {
            return false;
        }
        if (!Objects.equals(this.adresa, other.adresa)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Restoran{" + "id=" + id + ", ime=" + ime + ", adresa=" + adresa + '}';
    }
    
    
    
}
