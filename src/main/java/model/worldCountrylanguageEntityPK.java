package model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Dragonis on 16.08.2015.
 */
public class worldCountrylanguageEntityPK implements Serializable {
    private String countryCode;
    private String language;

    @Column(name = "CountryCode", nullable = false, insertable = true, updatable = true, length = 3)
    @Id
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Column(name = "Language", nullable = false, insertable = true, updatable = true, length = 30)
    @Id
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        worldCountrylanguageEntityPK that = (worldCountrylanguageEntityPK) o;

        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryCode != null ? countryCode.hashCode() : 0;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
