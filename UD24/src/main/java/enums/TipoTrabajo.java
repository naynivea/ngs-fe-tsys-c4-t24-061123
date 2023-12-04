package enums;

public enum TipoTrabajo {
    DESARROLLADOR(50000),
    ADMINISTRATIVO(45000),
    GERENTE(70000),
    ANALISTA(55000);

    private double salario; 

    private TipoTrabajo(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
	
	
}
