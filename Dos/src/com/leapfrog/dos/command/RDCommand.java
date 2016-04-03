/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dos.command;

import java.io.File;

/**
 *
 * @author Chetan
 */
public class RDCommand extends DosCommand{

    @Override
    public void execute(String[] param) {
       if(param.length>=2){
           new File(param[1]).delete();
       }
    }
    
}
