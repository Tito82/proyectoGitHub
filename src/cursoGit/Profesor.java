package cursoGit;

public class Profesor extends Persona{
	
		private double salario;
		private String especialidad;
		private String asignatura;
	
		
		public Profesor(String nombre, int edad, String Salario, String especialidad, String asignatura) {
			super(nombre, edad);
			this.salario=salario;
			this.especialidad=especialidad;
			this.asignatura=asignatura;
					
		}

		public double getSalario() {
			return salario;
		}
		
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		public String getEspecialidad() {
			return especialidad;
		}
		
		public void setEspecialidad(String especialidad) {
			this.especialidad = especialidad;
		}
		
		public String getAsignatura() {
			return asignatura;
		}
		
		public void setAsignatura(String asignatura) {
			this.asignatura = asignatura;
		}
		
		@Override
		public String toString() {
			return "Profesor [salario=" + salario + ", especialidad=" + especialidad + ", asignatura=" + asignatura + "]";
		}
		
		
	
	
	}
