package cn.zkserver.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.У����ύ�ĺϷ���
		
		
		
		
		//2.���У��ʧ�ܣ����ر�ҳ�棬����У��ʧ����Ϣ��
		
		//3.���У��ɹ����õ�service����ע������
		
		//4.���service �����ɹ���ע���û��Ѵ��ڣ�������ע��ҳ�棬��ʾע���û��Ѵ���
		
		
		//5.���service �����ɹ����������⣩������ȫ����Ϣ��ʾҳ�棬��ʾ������Ϣ
		
		//6.���service ����ɹ�������ȫ����Ϣ��ʾҳ�棬Ϊע��ɹ���

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
