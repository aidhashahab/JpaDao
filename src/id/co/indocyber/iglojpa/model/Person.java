/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.iglojpa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author zulfahmi
 */
@Entity
@Table(name="TBL_ORANG")
@NamedQuery(name = "findByAge",query = "Select p from Person p where p.age = :age")
public class Person implements Serializable {

    private static long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private String name;
    private Integer age;
    @Column(name = "gaji")
    private Double salary;    
    private Character gender;
    private Boolean married;
    private Byte theByte;
    private Float bonus;
    private boolean winner;
    @Transient
    private String specialMessage;
    private BigInteger bulatBesar;
    private BigDecimal desimalBesar;
    @Temporal(TemporalType.DATE)
    private Date birthOfDate;
    @Temporal(TemporalType.TIME)
    private Date sleepTime;
    private char[] vocal;
    private byte[] image;

    public Person() {
    }

    public Person(Long id, String name, Integer age, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id.co.indocyber.iglojpa.Person[ id=" + getId() + " ]";
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return the salary
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * @return the gender
     */
    public Character getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Character gender) {
        this.gender = gender;
    }

    /**
     * @return the married
     */
    public Boolean getMarried() {
        return married;
    }

    /**
     * @param married the married to set
     */
    public void setMarried(Boolean married) {
        this.married = married;
    }



    /**
     * @return the bonus
     */
    public Float getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(Float bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the theByte
     */
    public Byte getTheByte() {
        return theByte;
    }

    /**
     * @param theByte the theByte to set
     */
    public void setTheByte(Byte theByte) {
        this.theByte = theByte;
    }

    /**
     * @return the winner
     */
    public boolean isWinner() {
        return winner;
    }

    /**
     * @param winner the winner to set
     */
    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    /**
     * @return the specialMessage
     */
    public String getSpecialMessage() {
        return specialMessage;
    }

    /**
     * @param specialMessage the specialMessage to set
     */
    public void setSpecialMessage(String specialMessage) {
        this.specialMessage = specialMessage;
    }

    /**
     * @return the bulatBesar
     */
    public BigInteger getBulatBesar() {
        return bulatBesar;
    }

    /**
     * @param bulatBesar the bulatBesar to set
     */
    public void setBulatBesar(BigInteger bulatBesar) {
        this.bulatBesar = bulatBesar;
    }

    /**
     * @return the desimalBesar
     */
    public BigDecimal getDesimalBesar() {
        return desimalBesar;
    }

    /**
     * @param desimalBesar the desimalBesar to set
     */
    public void setDesimalBesar(BigDecimal desimalBesar) {
        this.desimalBesar = desimalBesar;
    }

    /**
     * @return the birthOfDate
     */
    public Date getBirthOfDate() {
        return birthOfDate;
    }

    /**
     * @param birthOfDate the birthOfDate to set
     */
    public void setBirthOfDate(Date birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    /**
     * @return the sleepTime
     */
    public Date getSleepTime() {
        return sleepTime;
    }

    /**
     * @param sleepTime the sleepTime to set
     */
    public void setSleepTime(Date sleepTime) {
        this.sleepTime = sleepTime;
    }


    
}
