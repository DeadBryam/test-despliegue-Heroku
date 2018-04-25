/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testpm;

import java.io.Serializable;
import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author bryan
 */

@Path("re")
public class Rest implements Serializable{
  
    @GET
    public String hora(){
        return String.valueOf(new Date());
    }
    
    }
