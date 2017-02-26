/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Menja
 */
@Entity
public class Student extends Person implements Serializable {

    private static final long serialVersionUID = 1L;
    //variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int matNumber;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date matDate;

    //getter and setters
    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

}
