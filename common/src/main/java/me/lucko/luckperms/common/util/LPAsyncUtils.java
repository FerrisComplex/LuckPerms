package me.lucko.luckperms.common.util;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LPAsyncUtils {
    public static final ExecutorService AsyncExecutorFutures = Executors.newCachedThreadPool(new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Luckperms-ThreadBuilder-%d").build());

}
