.class public interface abstract Lcom/microblink/camera/util/IProcessingQueue;
.super Ljava/lang/Object;


# virtual methods
.method public abstract getHandler()Landroid/os/Handler;
.end method

.method public abstract postJob(Ljava/lang/Runnable;)V
.end method

.method public abstract postJobDelayed(Ljava/lang/Runnable;J)V
.end method

.method public abstract postShutdownJob()V
.end method

.method public abstract waitForShutdown(J)V
.end method
