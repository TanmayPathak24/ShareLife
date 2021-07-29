package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.softech.FileUpload;

import Controller.CertificationController;
import Controller.OrganizationController;
import model.Certification;
import model.Organization;
/**
 * Servlet implementation class organization_view
 */
@WebServlet("/organization_view")
@MultipartConfig(fileSizeThreshold=1024*1024*2,//2MB
maxFileSize=1024*1024*10,//10MB
maxRequestSize=1024*1024*50)
public class organization_view extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
    */
    public organization_view() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		Organization O = new Organization();
		O.setOrganization_name(request.getParameter("organization_name"));
		O.setCentral_office_address(request.getParameter("central_office_address"));
		O.setEmail(request.getParameter("email"));
		O.setWebsite(request.getParameter("website"));
		O.setType(request.getParameter("type"));
		O.setAdministrative_address(request.getParameter("administrative_address"));
		O.setAdministrative_email(request.getParameter("administrative_email"));
		O.setAdministrative_phone(request.getParameter("administrative_phoneno"));
		O.setAdministrative_fax(request.getParameter("administrative_fax"));
		O.setPassword(request.getParameter("password"));
		
		String savepath = "C:/Users/tanmay/workspace/ShareLife/WebContent/orgranization_logo";
		Part part = request.getPart("organization_logo");
		FileUpload F  =  new FileUpload(part, savepath);
		O.setLogo(F.filename);
		boolean sn = OrganizationController.OganizationRegistrationSubmit(O);
		
		String[] add = {"add[0]","add[1]","add[2]","add[3]","add[4]"};
		int count = Integer.parseInt(request.getParameter("certificateno"));
		Certification C=new Certification();
		C.setOrganization_id(String.valueOf(CertificationController.getorganizationid(request.getParameter("organization_name"))));
		String path = "C:/Users/tanmay/workspace/ShareLife/WebContent/certificate";
		for(int i=0;i<=count-1;i++){
			part = request.getPart(""+add[i]+"");
			F=new FileUpload(part, path);
			C.setCertificate(F.filename);
			sn = CertificationController.addCertificate(C);
		}
		
		
		if(sn){
			out.println("Record submitted");
		}else{
			out.println("Not submitted");
		}
		out.println("</html>");
		out.flush();
	}

}
