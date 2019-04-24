.class public interface abstract Lnet/toddm/comm/Work;
.super Ljava/lang/Object;
.source "Work.java"

# interfaces
.implements Lnet/toddm/comm/SubmittableWork;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/toddm/comm/Work$Status;
    }
.end annotation


# virtual methods
.method public abstract get()Lnet/toddm/comm/Response;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation
.end method

.method public abstract get(JLjava/util/concurrent/TimeUnit;)Lnet/toddm/comm/Response;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation
.end method

.method public abstract getException()Ljava/lang/Exception;
.end method

.method public abstract getState()Lnet/toddm/comm/Work$Status;
.end method

.method public abstract isCancelled()Z
.end method

.method public abstract isDone()Z
.end method
