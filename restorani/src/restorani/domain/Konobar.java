package restorani.domain;

import java.util.Objects;

/**
 *
 * @author something
 */
public class Konobar {
    
    private Long id;
    private String ime;
    private String prezime;
    private Long restoranId;

    public Konobar() {
    }

    public Konobar(Long id, String ime, String prezime, Long restoranId) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.restoranId = restoranId;
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

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Long getRestoranId() {
        return restoranId;
    }

    public void setRestoranId(Long restoranId) {
        this.restoranId = restoranId;
    }

    @Override
    public String toString() {
        return "Konobar{" + "id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", restoranId=" + restoranId + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.ime);
        hash = 29 * hash + Objects.hashCode(this.prezime);
        hash = 29 * hash + Objects.hashCode(this.restoranId);
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
        final Konobar other = (Konobar) obj;
        if (!Objects.equals(this.ime, other.ime)) {
            return false;
        }
        if (!Objects.equals(this.prezime, other.prezime)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.restoranId, other.restoranId);
    }
    
    
}
