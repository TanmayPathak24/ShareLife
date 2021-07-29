package Controller;

import java.sql.Connection;
import java.sql.ResultSet;

import model.Certification;

public class CertificationController {
	public static boolean addCertificate(Certification C){
		try{
			Connection cn  = DBHelper.openConnection();
			String query = "insert into certificate values("+C.getOrganization_id()+",'"+C.getCertificate()+"')";
			boolean sn = DBHelper.executeUpdate(query, cn);
			if(sn){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			System.out.println("addCertification "+e);
			return false;
		}
	}
	
	public static int getorganizationid(String name){
		try{
			Connection cn= DBHelper.openConnection();
			String query = "select organization_id from organization where organization_name = '"+name+"'";
			ResultSet rs = DBHelper.executeQuery(query, cn);
			rs.next();
			int id = rs.getInt(1);
			return id;
		}catch(Exception e){
			System.out.println("getorganizationid "+e);
			return 0;
		}
	}
}
