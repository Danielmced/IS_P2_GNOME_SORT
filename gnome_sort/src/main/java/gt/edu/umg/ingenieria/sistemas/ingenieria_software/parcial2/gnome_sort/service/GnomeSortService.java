/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.gnome_sort.service;

import java.nio.charset.StandardCharsets;
import org.springframework.stereotype.Service;

/**
 *
 * @author Danielmced
 */
@Service
public class GnomeSortService {
    
    public String[] gnomeSort(String args[]){
        int index = 0;
        int argslen = args.length;
        
        while (index < argslen){                      
            
            if(index == 0){
                index++;                
            }
            
            byte[] argActual = args[index].getBytes(StandardCharsets.US_ASCII);
            byte[] argPrev = args[index-1].getBytes(StandardCharsets.US_ASCII);
            
            if(argActual[0] >= argPrev[0] ){
                index++;
            }
            else{
                String tempString = "";                
                tempString = args[index];                
                args[index] = args[index-1];                
                args[index-1] = tempString;
                
                index--;
            }
        }
        return args;
    }
    
}
