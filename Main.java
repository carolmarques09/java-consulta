import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consulta consulta = new Consulta();
        Medico medico = new Medico();
        Paciente paciente = new Paciente();

        System.out.print("Digite a data da consulta (formato AAAA-MM-DD): ");
        String data = scanner.next();

        LocalDate dataConsulta = LocalDate.parse(data);
        consulta.realizarConsulta(medico, paciente, dataConsulta);

        // Cadastro do médico

        System.out.println("Qual o nome do médico? ");
        medico.setNomeMedico(scanner.next());

        System.out.println("Qual a especialidade do médico? ");
        medico.setEspecialidade(scanner.next());

        // Cadastro do paciente

        System.out.println("Qual o nome do paciente? ");
        paciente.setNomePaciente(scanner.next());

        System.out.println("Qual(is) o(s) sintoma(s) do paciente? ");
        paciente.setSintomaPac(scanner.next());

        System.out.println("O paciente possui alguma alergia? ");
        paciente.setAlergia(scanner.next());

        System.out.println("O paciente pratica exercício físico regularmente? ");
        paciente.setExercicioFisico(scanner.next());

        System.out.println("Consulta realizada com sucesso!");

        // Exibição das informações da consulta pelo toString

        System.out.println("Informações do médico: ");
        System.out.println(medico);

        System.out.println("Informações do paciente: ");
        System.out.println(paciente);

        System.out.println("Informações da consulta: ");
        System.out.println(consulta);
    }
}