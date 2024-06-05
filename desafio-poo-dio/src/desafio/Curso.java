package desafio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public String toString(){
        return "Mentoria: " + "\nTitulo: " + getTitulo() + "\nDescricao: " + getDescricao() + "\nCarga horária: " + getCargaHoraria(); 
    }
}