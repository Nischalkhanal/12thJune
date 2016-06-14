/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.mathcalculator.command;
import java.util.HashMap;

/**
 *
 * @author nick
 */
public class MathFactory {
      public static MathCommand get(String key) {
          HashMap<String,MathCommand> cmds=new HashMap<>();
          cmds.put("+",new AddCommand());
          cmds.put("-",new SubCommand());
          cmds.put("*",new MulCommand());
          cmds.put("/",new DivCommand());
          cmds.put("^",new PowerCommand());
          cmds.put("e",new ExitCommand());
          return (cmds.containsKey(key))?cmds.get(key):null;
          
          
       
    }
}
    

