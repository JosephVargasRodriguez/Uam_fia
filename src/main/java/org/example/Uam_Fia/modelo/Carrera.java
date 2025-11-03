package org.example.Uam_Fia.modelo;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Getter 
@Setter
public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "nombre_carrera", length = 100, nullable = false)
    private String Nombre;

    @Column(name = "precio_carrera", length = 6, nullable = false)
    private double precio;
}
