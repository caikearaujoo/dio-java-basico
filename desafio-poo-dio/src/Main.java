import desafio.Bootcamp;
import desafio.Curso;
import desafio.Dev;
import desafio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("É um curso da linguagem de programação Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Python");
        curso2.setDescricao("É um curso da linguagem de programação Python");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso de C");
        curso3.setDescricao("É um curso da linguagem de programação C");
        curso3.setCargaHoraria(6);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Um bootcamp com o intuito de ensinar Java e POO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCaike = new Dev();
        devCaike.setNome("Caike");
        devCaike.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devCaike.getConteudosInscritos());
        devCaike.progredir();
        devCaike.progredir();
        devCaike.progredir();
        System.out.println("Conteúdos inscritos: " + devCaike.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devCaike.getConteudosConcluidos());
        System.out.println("XP TOTAL: " + devCaike.calcularXp());

        System.out.println("----------------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP TOTAL: " + devJoao.calcularXp());
    }
}
