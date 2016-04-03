/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dos.command;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Chetan
 */
public class FileCommand extends DosCommand{

    @Override
    public void execute(String[] param) {
       if(param.length>=2){
           try{
           new File(param[1]).createNewFile();
           }catch(IOException ioe){
               System.out.println(ioe.getMessage());
           }
       }
    }
    
}