/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dos.command;

import java.util.HashMap;

/**
 *
 * @author Chetan
 */
public class DosFactory {
    private static HashMap<String,DosCommand> commands = initCommands();
    
    private static HashMap<String, DosCommand> initCommands(){
        HashMap<String,DosCommand> cmds= new HashMap<>();
        cmds.put("md", new MDCommand());
        cmds.put("dir", new DirCommand());
        cmds.put("ren", new RenameCommand());
        cmds.put("file", new FileCommand());
        cmds.put("rd", new RDCommand());
        return cmds;
    }
    
    public static DosCommand get(String key){
        if(isExists(key)){
            return commands.get(key);
        }
        return null; 
    }
    
    public static Boolean isExists(String key){
        return commands.containsKey(key);
    }
}
