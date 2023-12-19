package de.almaphil.insights.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A Patient.
 */
@Entity
@Table(name = "patient")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "health")
    private String health;

    @Column(name = "geo")
    private String geo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
    @JsonIgnoreProperties(value = { "patient" }, allowSetters = true)
    private Set<Bloodpressure> bloodpressures = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Patient id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Patient name(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public Patient age(Integer age) {
        this.setAge(age);
        return this;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return this.gender;
    }

    public Patient gender(String gender) {
        this.setGender(gender);
        return this;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHealth() {
        return this.health;
    }

    public Patient health(String health) {
        this.setHealth(health);
        return this;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getGeo() {
        return this.geo;
    }

    public Patient geo(String geo) {
        this.setGeo(geo);
        return this;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public Set<Bloodpressure> getBloodpressures() {
        return this.bloodpressures;
    }

    public void setBloodpressures(Set<Bloodpressure> bloodpressures) {
        if (this.bloodpressures != null) {
            this.bloodpressures.forEach(i -> i.setPatient(null));
        }
        if (bloodpressures != null) {
            bloodpressures.forEach(i -> i.setPatient(this));
        }
        this.bloodpressures = bloodpressures;
    }

    public Patient bloodpressures(Set<Bloodpressure> bloodpressures) {
        this.setBloodpressures(bloodpressures);
        return this;
    }

    public Patient addBloodpressure(Bloodpressure bloodpressure) {
        this.bloodpressures.add(bloodpressure);
        bloodpressure.setPatient(this);
        return this;
    }

    public Patient removeBloodpressure(Bloodpressure bloodpressure) {
        this.bloodpressures.remove(bloodpressure);
        bloodpressure.setPatient(null);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Patient)) {
            return false;
        }
        return getId() != null && getId().equals(((Patient) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Patient{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", age=" + getAge() +
            ", gender='" + getGender() + "'" +
            ", health='" + getHealth() + "'" +
            ", geo='" + getGeo() + "'" +
            "}";
    }
}
