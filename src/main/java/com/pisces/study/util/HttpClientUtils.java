package com.pisces.study.util;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

/**
 * 
 * @author cielleech
 *
 */
public class HttpClientUtils {
    public static void main(String[] args) {
        ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(5));
        List<ListenableFuture<Boolean>> futures = Lists.newArrayList();
        
        for (int i = 0; i < 100; i++) {
            futures.add(service.submit(new Callable<Boolean>() {
                public Boolean call() throws Exception {
                    
                    return null;
                }
            }));
        }
    }
}