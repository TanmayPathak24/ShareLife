package Controller;

import java.sql.Connection;

import model.Organization;
public class OrganizationController {
	public static boolean OganizationRegistrationSubmit(Organization O){
		try{
			Connection cn = DBHelper.openConnection();
			String query="insert into organization(organization_name,central_office_address,email,website,type,administrative_address,administrative_email,administrative_phone,administrative_fax,password,logo) values ('"+O.getOrganization_name()+"','"+O.getCentral_office_address()+"','"+O.getEmail()+"','"+O.getWebsite()+"','"+O.getType()+"','"+O.getAdministrative_address()+"','"+O.getAdministrative_email()+"','"+O.getAdministrative_phone()+"','"+O.getAdministrative_fax()+"','"+O.getPassword()+"','"+O.getLogo()+"')";
			boolean sn = DBHelper.executeUpdate(query, cn);
			if(sn){
				return true;
			}else{
				return false;
			}
			
		}catch(Exception e){
			System.out.println("OrganizationRegistrationSubmit "+e);
			return false;
		}
	}
}
