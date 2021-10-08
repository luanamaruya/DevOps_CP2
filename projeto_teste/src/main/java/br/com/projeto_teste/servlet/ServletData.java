package br.com.projeto_teste.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletData
 */
@WebServlet("/servletdata")
public class ServletData extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Teste/msg - o formulário foi preenchido e o relatório foi gerado");
		System.out.println("Teste/msg - a página gerada pelo formulário rodou no servidor (TomCat9)");
		
		String nomePessoa = request.getParameter("nome");
		String sobreNome = request.getParameter("sobrenome");
		String dataNasc = request.getParameter("datanasc");
		String CPF = request.getParameter("cpf");
		String Convenio = request.getParameter("convenio");
		String Descricao1 = request.getParameter("descricao1");
		String Descricao2 = request.getParameter("descricao2");
		String Cronic = request.getParameter("cronic");
		String Recado = request.getParameter("recado");
		
		
		PrintWriter out = response.getWriter();
		out.println("<html><body></br>Muito obrigado!</br></br></br>" + nomePessoa + " " +sobreNome+ " seu relatório de Anamnese foi cadastrado com sucesso!</body></html></br></br>");
		
		PrintWriter out1 = response.getWriter();
		out1.println("<html><body>Por favor, confira seus dados principais: data de nascimento "+dataNasc+ " e CPF:" +CPF+"</body></html></br></br>");
	
		PrintWriter out2 = response.getWriter();
		out2.println("<html><body>Seu convenio: "+Convenio+"</body></html></br></br>");
		
		PrintWriter out3 = response.getWriter();
		out3.println("<html><body>Sobre qualidade de vida, hoje você nos contou que "+Descricao1+"</body></html></br></br>");
		
		PrintWriter out4 = response.getWriter();
		out4.println("<html><body>Sobre a importância da saúde mental em sua vida: "+Descricao2+"</body></html></br></br>");
		
		PrintWriter out5 = response.getWriter();
		out5.println("<html><body>Sobre seu histórico de saúde: "+Cronic+". Para nossa equipe você deixa o seguinte recado: "+Recado+"</body></html></br>");
		
	}

}
