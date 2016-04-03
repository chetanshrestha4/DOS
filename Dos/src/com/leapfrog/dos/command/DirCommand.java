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
public class DirCommand extends DosCommand{

    @Override
    public void execute(String[] param) {
        String path = "";
        if(param.length == 1){
            path = ".";
        }
        File file = new File(path);
        for(File f: file.listFiles()){
            System.out.println(f.getName() + " " + f.getAbsolutePath());
        }
            System.out.println("Total space:" + file.getTotalSpace());
            System.out.println("Available space:" + file.getFreeSpace());
            System.out.println("Usable space:" + file.getUsableSpace());
    }
        
    
}
