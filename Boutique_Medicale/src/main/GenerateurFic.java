/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author btssio
 */
public class GenerateurFic {
    
    	public void archiverLocation(String nomFic, Location location) throws IOException{
		
		DataOutputStream fluxEcriture = new DataOutputStream(new FileOutputStream(nomFic));
		try{
                    fluxEcriture.writeChars(location.toString());
		}finally{
			fluxEcriture.close();
		}
	
	}
}
