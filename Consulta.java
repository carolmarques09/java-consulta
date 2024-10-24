import java.time.LocalDate;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDate dataConsulta;
    private String consulta;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public void realizarConsulta(LocalDate dataConsulta) {
        this.consulta = consulta;
    }

    public void especialidadeMedico (Medico medico) {
        this.medico = medico;
    }

    public void realizarConsulta(Medico medico, Paciente paciente, LocalDate dataConsulta) {
    }
}
