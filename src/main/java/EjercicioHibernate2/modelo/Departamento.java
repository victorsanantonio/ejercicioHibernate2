package EjercicioHibernate2.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Departamento")
public class Departamento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "cod_responsable", nullable = false)
	private int codResponsable;
	
	public Departamento(int codigo, String nombre, int codResponsable) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.codResponsable = codResponsable;
	}
	public Departamento() {
		super();
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodResponsable() {
		return codResponsable;
	}
	public void setCodResponsable(int codResponsable) {
		this.codResponsable = codResponsable;
	}
	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", nombre=" + nombre + ", codResponsable=" + codResponsable + "]";
	}
}
