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
public class MDCommand extends DosCommand{

    @Override
    public void execute(String[] param) {
        if(param.length>=2){
            String fileName = param[1];
            File file = new File(fileName);
            if(!file.isDirectory()){
                file.mkdir();
            }
            else{
                System.out.println(fileName + " already exists");
            }
        }
        else{
            System.out.println("Invalid command");
        }
    }
    
}
