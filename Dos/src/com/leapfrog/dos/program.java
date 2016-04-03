/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dos;

import com.leapfrog.dos.command.DosCommand;
import com.leapfrog.dos.command.DosFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Chetan
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String param = "";
        Scanner input = new Scanner(System.in);
        while (!param.equalsIgnoreCase("exit")) {
            System.out.print(">");
            param = input.nextLine();

            String[] tokens = param.split(" ");

            DosCommand cmd = DosFactory.get(tokens[0]);
            if (cmd != null) {
                cmd.execute(tokens);
            }
        }

    }

}
