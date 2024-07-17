package Ex4;

import java.util.ArrayList;

public class Turma {
    ArrayList<Aluno> alunos = new ArrayList<>();
    ArrayList<Nota> notas = new ArrayList<>();

    public void setAlunoNome(Aluno aluno){
        alunos.add(aluno);
    }

    public void getAlunoNome(int i){
        alunos.get(i);
    }

    public void setAlunoNota(Nota nota){
    notas.add(nota);
    }

    public void getAlunoNota(int i){
        notas.get(i);
    }

    public void imprimirAlunoNota(){
        for (int i=0; i < alunos.size(); i++) {
            System.out.println("Nome: " + alunos.get(i).nome + ", Nota: " + notas.get(i).nota);          
        }
    }


    public static void main(String[] args) {
        
        Turma portugues = new Turma();
        Aluno felipe = new Aluno("Felipe");
        Nota nota1 = new Nota(9);

        portugues.setAlunoNome(felipe);
        portugues.setAlunoNota(nota1);

        portugues.imprimirAlunoNota();

       
    }

}

