package com.ebix.test;

import com.ebix.controller.AlunoController;
import com.ebix.entity.Aluno;

public class test {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Danilo Polastri");
		a1.setIdade(20);
		a1.setMatricula("5404636");
		
		AlunoController com = new AlunoController();
		
		//com.salvar(a1);

	}

}
