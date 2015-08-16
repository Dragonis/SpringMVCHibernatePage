package model;

import javax.persistence.*;

/**
 * Created by Dragonis on 16.08.2015.
 */
@Entity
@Table(name = "countrylanguage", schema = "", catalog = "world")
@IdClass(worldCountrylanguageEntityPK.class)
public class worldCountrylanguageEntity {
    private String countryCode;
    private String language;
    private String isOfficial;
    private float percentage;

    @Id
    @Column(name = "CountryCode", nullable = false, insertable = true, updatable = true, length = 3)
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Id
    @Column(name = "Language", nullable = false, insertable = true, updatable = true, length = 30)
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "IsOfficial", nullable = false, insertable = true, updatable = true, length = 2)
    public String getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial;
    }

    @Basic
    @Column(name = "Percentage", nullable = false, insertable = true, updatable = true, precision = 1)
    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        worldCountrylanguageEntity that = (worldCountrylanguageEntity) o;

        if (Float.compare(that.percentage, percentage) != 0) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (isOfficial != null ? !isOfficial.equals(that.isOfficial) : that.isOfficial != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryCode != null ? countryCode.hashCode() : 0;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (isOfficial != null ? isOfficial.hashCode() : 0);
        result = 31 * result + (percentage != +0.0f ? Float.floatToIntBits(percentage) : 0);
        return result;
    }
}
