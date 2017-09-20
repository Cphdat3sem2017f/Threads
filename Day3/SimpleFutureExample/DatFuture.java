/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datfuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author bladt
 */
public class DatFuture {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<String> c1 = () -> "lol";
        
        Callable<String> c2 = () -> {
            String s="";
            for(int i=0; i<10;i++){
                s += i;
            }
            return s;
        };
        
        ExecutorService ex = Executors.newCachedThreadPool();
        Future<String> f1 = ex.submit(c1);
        Future<String> f2 = ex.submit(c2);
        
        System.out.println(f1.get());
        System.out.println(f2.get());
    }
    
}
