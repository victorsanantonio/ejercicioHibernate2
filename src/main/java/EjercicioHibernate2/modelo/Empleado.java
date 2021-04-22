package EjercicioHibernate2.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Empleado")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "apellido1", nullable = false)
	private String apellido1;
	
	@Column(name = "apellido2", nullable = false)
	private String apellido2;
	
	@Column(name = "lugar_nacimiento", nullable = false)
	private String lugarNacimiento;
	
	@Column(name = "fecha_nacimiento", nullable = false)
	private String fechaNacimiento;
	
	@Column(name = "direccion", nullable = false)
	private String direccion;
	
	@Column(name = "telefono", nullable = false)
	private String telefono;
	
	@Column(name = "puesto", nullable = false)
	private String puesto;
	
	@Column(name = "cod_departamento", nullable = false)
	private int codDepartamento;
	
	public Empleado() {}

	public Empleado(int codigo, String nombre, String apellido1, String apellido2, String lugarNacimiento,
			String fechaNacimiento, String direccion, String telefono, String puesto, int codDepartamento) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.lugarNacimiento = lugarNacimiento;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.puesto = puesto;
		this.codDepartamento = codDepartamento;
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

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getCodDepartamento() {
		return codDepartamento;
	}

	public void setCodDepartamento(int codDepartamento) {
		this.codDepartamento = codDepartamento;
	}

	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", lugarNacimiento=" + lugarNacimiento + ", fechaNacimiento=" + fechaNacimiento
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", puesto=" + puesto + ", codDepartamento="
				+ codDepartamento + "]";
	}
}
