package desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public String toString(){
        return "Mentoria: " + "\nTitulo: " + getTitulo() + "\nDescricao: " + getDescricao() + "\nData: " + getData(); 
    }
}