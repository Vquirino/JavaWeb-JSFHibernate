package entity;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="idcliente")
    private Integer idcliente;
    
    @Column(name="nome", length=35, nullable=false)
    private String nome;
    
    @Column(name="email", length=35, nullable=false, unique=true)
    private String email;

    public Cliente() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
