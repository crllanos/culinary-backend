package cl.crllanos.culinary.entity;

import javax.persistence.*;

@Entity
@Table(name="MESA")
public class MesaEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID")
    private Integer id;

    @Column(name="NOMBRE")
    private String nombre;

}
