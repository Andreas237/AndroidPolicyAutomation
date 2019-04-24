.class Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;
.super Ljava/lang/Object;
.source "AudioThreadController.java"

# interfaces
.implements Ljava/util/concurrent/Future;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/presence/AudioThreadController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SettableFuture"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Future<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private cancelled:Z

.field private done:Z

.field private monitor:Ljava/lang/Object;

.field final synthetic this$0:Lcom/shopkick/app/presence/AudioThreadController;

.field private value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/presence/AudioThreadController;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->this$0:Lcom/shopkick/app/presence/AudioThreadController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 166
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->monitor:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public cancel(Z)Z
    .locals 0

    .line 171
    iget-boolean p1, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->cancelled:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    .line 174
    iput-boolean p1, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->cancelled:Z

    .line 175
    iput-boolean p1, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->done:Z

    .line 176
    iget-boolean p1, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->cancelled:Z

    return p1
.end method

.method public get()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    const-wide/16 v0, 0x0

    .line 192
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0, v1, v2}, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;,
            Ljava/util/concurrent/TimeoutException;
        }
    .end annotation

    .line 200
    iget-boolean p3, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->done:Z

    if-nez p3, :cond_0

    .line 201
    iget-object p3, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->monitor:Ljava/lang/Object;

    monitor-enter p3

    .line 202
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->monitor:Ljava/lang/Object;

    invoke-virtual {v0, p1, p2}, Ljava/lang/Object;->wait(J)V

    .line 203
    monitor-exit p3

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 205
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->value:Ljava/lang/Object;

    return-object p1
.end method

.method public isCancelled()Z
    .locals 1

    .line 181
    iget-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->cancelled:Z

    return v0
.end method

.method public isDone()Z
    .locals 1

    .line 186
    iget-boolean v0, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->done:Z

    return v0
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 209
    iput-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->value:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 210
    iput-boolean p1, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->done:Z

    .line 211
    iget-object p1, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->monitor:Ljava/lang/Object;

    monitor-enter p1

    .line 212
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/presence/AudioThreadController$SettableFuture;->monitor:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 213
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
