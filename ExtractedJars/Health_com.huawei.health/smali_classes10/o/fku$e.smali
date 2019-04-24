.class Lo/fku$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fku;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# static fields
.field static final synthetic b:Z


# instance fields
.field private final a:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<Ljava/lang/Runnable;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lo/fku;

.field private final d:Ljava/lang/Object;

.field private e:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 408
    const-class v0, Lo/fku;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lo/fku$e;->b:Z

    return-void
.end method

.method private constructor <init>(Lo/fku;Ljava/lang/Object;)V
    .locals 3

    .line 428
    iput-object p1, p0, Lo/fku$e;->c:Lo/fku;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 412
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lo/fku$e;->a:Ljava/util/concurrent/BlockingQueue;

    .line 429
    iput-object p2, p0, Lo/fku$e;->d:Ljava/lang/Object;

    .line 430
    invoke-static {}, Lo/fku;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 431
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SerialExecutor created "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 433
    :cond_0
    return-void
.end method

.method synthetic constructor <init>(Lo/fku;Ljava/lang/Object;Lo/fku$4;)V
    .locals 0

    .line 408
    invoke-direct {p0, p1, p2}, Lo/fku$e;-><init>(Lo/fku;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic a(Lo/fku$e;)Ljava/util/concurrent/BlockingQueue;
    .locals 1

    .line 408
    iget-object v0, p0, Lo/fku$e;->a:Ljava/util/concurrent/BlockingQueue;

    return-object v0
.end method

.method private b()V
    .locals 3

    .line 480
    iget-object v0, p0, Lo/fku$e;->c:Lo/fku;

    invoke-static {v0}, Lo/fku;->e(Lo/fku;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 482
    :try_start_0
    iget-object v0, p0, Lo/fku$e;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    iput-object v0, p0, Lo/fku$e;->e:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 483
    iget-object v0, p0, Lo/fku$e;->c:Lo/fku;

    invoke-static {v0}, Lo/fku;->a(Lo/fku;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iget-object v1, p0, Lo/fku$e;->e:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 484
    iget-object v0, p0, Lo/fku$e;->c:Lo/fku;

    invoke-static {v0}, Lo/fku;->c(Lo/fku;)Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->signalAll()V

    goto :goto_0

    .line 486
    :cond_0
    iget-object v0, p0, Lo/fku$e;->c:Lo/fku;

    iget-object v1, p0, Lo/fku$e;->d:Ljava/lang/Object;

    invoke-static {v0, v1, p0}, Lo/fku;->a(Lo/fku;Ljava/lang/Object;Lo/fku$e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 489
    :goto_0
    iget-object v0, p0, Lo/fku$e;->c:Lo/fku;

    invoke-static {v0}, Lo/fku;->e(Lo/fku;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 490
    goto :goto_1

    .line 489
    :catchall_0
    move-exception v2

    iget-object v0, p0, Lo/fku$e;->c:Lo/fku;

    invoke-static {v0}, Lo/fku;->e(Lo/fku;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v2

    .line 491
    :goto_1
    return-void
.end method

.method static synthetic b(Lo/fku$e;)V
    .locals 0

    .line 408
    invoke-direct {p0}, Lo/fku$e;->b()V

    return-void
.end method


# virtual methods
.method public d()Z
    .locals 3

    .line 498
    iget-object v0, p0, Lo/fku$e;->c:Lo/fku;

    invoke-static {v0}, Lo/fku;->e(Lo/fku;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 500
    :try_start_0
    iget-object v0, p0, Lo/fku$e;->e:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fku$e;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 502
    :goto_0
    iget-object v0, p0, Lo/fku$e;->c:Lo/fku;

    invoke-static {v0}, Lo/fku;->e(Lo/fku;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return v1

    :catchall_0
    move-exception v2

    iget-object v0, p0, Lo/fku$e;->c:Lo/fku;

    invoke-static {v0}, Lo/fku;->e(Lo/fku;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v2
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 3

    .line 455
    iget-object v0, p0, Lo/fku$e;->c:Lo/fku;

    invoke-static {v0}, Lo/fku;->e(Lo/fku;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 457
    :try_start_0
    iget-object v0, p0, Lo/fku$e;->a:Ljava/util/concurrent/BlockingQueue;

    new-instance v1, Lo/fku$e$3;

    invoke-direct {v1, p0, p1}, Lo/fku$e$3;-><init>(Lo/fku$e;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/BlockingQueue;->add(Ljava/lang/Object;)Z

    .line 466
    iget-object v0, p0, Lo/fku$e;->e:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 467
    invoke-direct {p0}, Lo/fku$e;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 470
    :cond_0
    iget-object v0, p0, Lo/fku$e;->c:Lo/fku;

    invoke-static {v0}, Lo/fku;->e(Lo/fku;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 471
    goto :goto_0

    .line 470
    :catchall_0
    move-exception v2

    iget-object v0, p0, Lo/fku$e;->c:Lo/fku;

    invoke-static {v0}, Lo/fku;->e(Lo/fku;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v2

    .line 472
    :goto_0
    return-void
.end method

.method protected finalize()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 443
    invoke-static {}, Lo/fku;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 444
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SerialExecutor finalized "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/fku$e;->d:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 445
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 447
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 507
    sget-boolean v0, Lo/fku$e;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lo/fku$e;->c:Lo/fku;

    invoke-static {v0}, Lo/fku;->e(Lo/fku;)Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->isHeldByCurrentThread()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 508
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SerialExecutor: active="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fku$e;->e:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "tasks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fku$e;->a:Ljava/util/concurrent/BlockingQueue;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
