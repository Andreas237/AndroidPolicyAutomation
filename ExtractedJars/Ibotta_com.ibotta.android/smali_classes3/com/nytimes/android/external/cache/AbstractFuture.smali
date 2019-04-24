.class public abstract Lcom/nytimes/android/external/cache/AbstractFuture;
.super Ljava/lang/Object;
.source "AbstractFuture.java"

# interfaces
.implements Lcom/nytimes/android/external/cache/ListenableFuture;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/nytimes/android/external/cache/AbstractFuture$SynchronizedHelper;,
        Lcom/nytimes/android/external/cache/AbstractFuture$SafeAtomicHelper;,
        Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;,
        Lcom/nytimes/android/external/cache/AbstractFuture$SetFuture;,
        Lcom/nytimes/android/external/cache/AbstractFuture$Cancellation;,
        Lcom/nytimes/android/external/cache/AbstractFuture$Failure;,
        Lcom/nytimes/android/external/cache/AbstractFuture$Listener;,
        Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;,
        Lcom/nytimes/android/external/cache/AbstractFuture$TrustedFuture;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/nytimes/android/external/cache/ListenableFuture<",
        "TV;>;"
    }
.end annotation


# static fields
.field private static final ATOMIC_HELPER:Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;

.field private static final GENERATE_CANCELLATION_CAUSES:Z

.field private static final NULL:Ljava/lang/Object;

.field private static final log:Ljava/util/logging/Logger;


# instance fields
.field private volatile listeners:Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

.field private volatile value:Ljava/lang/Object;

.field private volatile waiters:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const-string v0, "guava.concurrent.generate_cancellation_cause"

    const-string v1, "false"

    .line 24
    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 23
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lcom/nytimes/android/external/cache/AbstractFuture;->GENERATE_CANCELLATION_CAUSES:Z

    .line 61
    const-class v0, Lcom/nytimes/android/external/cache/AbstractFuture;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/nytimes/android/external/cache/AbstractFuture;->log:Ljava/util/logging/Logger;

    .line 77
    :try_start_0
    new-instance v0, Lcom/nytimes/android/external/cache/AbstractFuture$SafeAtomicHelper;

    const-class v1, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    const-class v2, Ljava/lang/Thread;

    const-string v3, "thread"

    .line 78
    invoke-static {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v2

    const-class v1, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    const-class v3, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    const-string v4, "next"

    .line 79
    invoke-static {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v3

    const-class v1, Lcom/nytimes/android/external/cache/AbstractFuture;

    const-class v4, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    const-string v5, "waiters"

    .line 80
    invoke-static {v1, v4, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v4

    const-class v1, Lcom/nytimes/android/external/cache/AbstractFuture;

    const-class v5, Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    const-string v6, "listeners"

    .line 81
    invoke-static {v1, v5, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v5

    const-class v1, Lcom/nytimes/android/external/cache/AbstractFuture;

    const-class v6, Ljava/lang/Object;

    const-string v7, "value"

    .line 82
    invoke-static {v1, v6, v7}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v6

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/nytimes/android/external/cache/AbstractFuture$SafeAtomicHelper;-><init>(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 88
    sget-object v1, Lcom/nytimes/android/external/cache/AbstractFuture;->log:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v3, "UnsafeAtomicHelper is broken!"

    invoke-virtual {v1, v2, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 89
    sget-object v1, Lcom/nytimes/android/external/cache/AbstractFuture;->log:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v3, "SafeAtomicHelper is broken!"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    new-instance v0, Lcom/nytimes/android/external/cache/AbstractFuture$SynchronizedHelper;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/nytimes/android/external/cache/AbstractFuture$SynchronizedHelper;-><init>(Lcom/nytimes/android/external/cache/AbstractFuture$1;)V

    .line 93
    :goto_0
    sput-object v0, Lcom/nytimes/android/external/cache/AbstractFuture;->ATOMIC_HELPER:Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;

    .line 98
    const-class v0, Ljava/util/concurrent/locks/LockSupport;

    .line 194
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/nytimes/android/external/cache/AbstractFuture;->NULL:Ljava/lang/Object;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$100()Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;
    .locals 1

    .line 21
    sget-object v0, Lcom/nytimes/android/external/cache/AbstractFuture;->ATOMIC_HELPER:Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;

    return-object v0
.end method

.method static synthetic access$200(Lcom/nytimes/android/external/cache/AbstractFuture;)Ljava/lang/Object;
    .locals 0

    .line 21
    iget-object p0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->value:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic access$202(Lcom/nytimes/android/external/cache/AbstractFuture;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->value:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic access$300(Lcom/nytimes/android/external/cache/AbstractFuture;Lcom/nytimes/android/external/cache/ListenableFuture;Ljava/lang/Object;)Z
    .locals 0

    .line 21
    invoke-direct {p0, p1, p2}, Lcom/nytimes/android/external/cache/AbstractFuture;->completeWithFuture(Lcom/nytimes/android/external/cache/ListenableFuture;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method static synthetic access$500(Lcom/nytimes/android/external/cache/AbstractFuture;)Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;
    .locals 0

    .line 21
    iget-object p0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->waiters:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    return-object p0
.end method

.method static synthetic access$502(Lcom/nytimes/android/external/cache/AbstractFuture;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->waiters:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    return-object p1
.end method

.method static synthetic access$600(Lcom/nytimes/android/external/cache/AbstractFuture;)Lcom/nytimes/android/external/cache/AbstractFuture$Listener;
    .locals 0

    .line 21
    iget-object p0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->listeners:Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    return-object p0
.end method

.method static synthetic access$602(Lcom/nytimes/android/external/cache/AbstractFuture;Lcom/nytimes/android/external/cache/AbstractFuture$Listener;)Lcom/nytimes/android/external/cache/AbstractFuture$Listener;
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->listeners:Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    return-object p1
.end method

.method static final cancellationExceptionWithCause(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 795
    new-instance v0, Ljava/util/concurrent/CancellationException;

    invoke-direct {v0, p0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 796
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CancellationException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object v0
.end method

.method private clearListeners()Lcom/nytimes/android/external/cache/AbstractFuture$Listener;
    .locals 3

    .line 771
    :cond_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->listeners:Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    .line 772
    sget-object v1, Lcom/nytimes/android/external/cache/AbstractFuture;->ATOMIC_HELPER:Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;

    sget-object v2, Lcom/nytimes/android/external/cache/AbstractFuture$Listener;->TOMBSTONE:Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    invoke-virtual {v1, p0, v0, v2}, Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;->casListeners(Lcom/nytimes/android/external/cache/AbstractFuture;Lcom/nytimes/android/external/cache/AbstractFuture$Listener;Lcom/nytimes/android/external/cache/AbstractFuture$Listener;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0
.end method

.method private clearWaiters()Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;
    .locals 3

    .line 762
    :cond_0
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->waiters:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    .line 763
    sget-object v1, Lcom/nytimes/android/external/cache/AbstractFuture;->ATOMIC_HELPER:Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;

    sget-object v2, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->TOMBSTONE:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    invoke-virtual {v1, p0, v0, v2}, Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;->casWaiters(Lcom/nytimes/android/external/cache/AbstractFuture;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0
.end method

.method private complete()V
    .locals 4

    .line 705
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/AbstractFuture;->clearWaiters()Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    .line 708
    invoke-virtual {v0}, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->unpark()V

    .line 707
    iget-object v0, v0, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->next:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    goto :goto_0

    .line 711
    :cond_0
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/AbstractFuture;->clearListeners()Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    move-result-object v0

    const/4 v1, 0x0

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    :goto_1
    if-eqz v1, :cond_1

    .line 715
    iget-object v2, v1, Lcom/nytimes/android/external/cache/AbstractFuture$Listener;->next:Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    .line 716
    iput-object v0, v1, Lcom/nytimes/android/external/cache/AbstractFuture$Listener;->next:Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    move-object v0, v1

    move-object v1, v2

    goto :goto_1

    :cond_1
    :goto_2
    if-eqz v0, :cond_2

    .line 720
    iget-object v1, v0, Lcom/nytimes/android/external/cache/AbstractFuture$Listener;->task:Ljava/lang/Runnable;

    iget-object v2, v0, Lcom/nytimes/android/external/cache/AbstractFuture$Listener;->executor:Ljava/util/concurrent/Executor;

    invoke-static {v1, v2}, Lcom/nytimes/android/external/cache/AbstractFuture;->executeListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 719
    iget-object v0, v0, Lcom/nytimes/android/external/cache/AbstractFuture$Listener;->next:Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    goto :goto_2

    .line 727
    :cond_2
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/AbstractFuture;->done()V

    return-void
.end method

.method private completeWithFuture(Lcom/nytimes/android/external/cache/ListenableFuture;Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/nytimes/android/external/cache/ListenableFuture<",
            "+TV;>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    .line 675
    instance-of v0, p1, Lcom/nytimes/android/external/cache/AbstractFuture$TrustedFuture;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 680
    check-cast p1, Lcom/nytimes/android/external/cache/AbstractFuture;

    iget-object p1, p1, Lcom/nytimes/android/external/cache/AbstractFuture;->value:Ljava/lang/Object;

    move-object v0, p1

    goto :goto_0

    .line 684
    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/nytimes/android/external/cache/Uninterruptibles;->getUninterruptibly(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    .line 685
    sget-object p1, Lcom/nytimes/android/external/cache/AbstractFuture;->NULL:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    move-object v0, p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 691
    new-instance v0, Lcom/nytimes/android/external/cache/AbstractFuture$Failure;

    invoke-direct {v0, p1}, Lcom/nytimes/android/external/cache/AbstractFuture$Failure;-><init>(Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception p1

    .line 689
    new-instance v0, Lcom/nytimes/android/external/cache/AbstractFuture$Cancellation;

    invoke-direct {v0, v1, p1}, Lcom/nytimes/android/external/cache/AbstractFuture$Cancellation;-><init>(ZLjava/lang/Throwable;)V

    goto :goto_0

    :catch_2
    move-exception p1

    .line 687
    new-instance v0, Lcom/nytimes/android/external/cache/AbstractFuture$Failure;

    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/nytimes/android/external/cache/AbstractFuture$Failure;-><init>(Ljava/lang/Throwable;)V

    .line 696
    :goto_0
    sget-object p1, Lcom/nytimes/android/external/cache/AbstractFuture;->ATOMIC_HELPER:Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;

    invoke-virtual {p1, p0, p2, v0}, Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;->casValue(Lcom/nytimes/android/external/cache/AbstractFuture;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 697
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/AbstractFuture;->complete()V

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method private static executeListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 5
    .param p0    # Ljava/lang/Runnable;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    .line 782
    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 787
    sget-object v1, Lcom/nytimes/android/external/cache/AbstractFuture;->log:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "RuntimeException while executing runnable "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " with executor "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, v2, p0, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method private getDoneValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .line 439
    instance-of v0, p1, Lcom/nytimes/android/external/cache/AbstractFuture$Cancellation;

    if-nez v0, :cond_2

    .line 441
    instance-of v0, p1, Lcom/nytimes/android/external/cache/AbstractFuture$Failure;

    if-nez v0, :cond_1

    .line 443
    sget-object v0, Lcom/nytimes/android/external/cache/AbstractFuture;->NULL:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    return-object p1

    .line 442
    :cond_1
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    check-cast p1, Lcom/nytimes/android/external/cache/AbstractFuture$Failure;

    iget-object p1, p1, Lcom/nytimes/android/external/cache/AbstractFuture$Failure;->exception:Ljava/lang/Throwable;

    invoke-direct {v0, p1}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 440
    :cond_2
    check-cast p1, Lcom/nytimes/android/external/cache/AbstractFuture$Cancellation;

    iget-object p1, p1, Lcom/nytimes/android/external/cache/AbstractFuture$Cancellation;->cause:Ljava/lang/Throwable;

    const-string v0, "Task was cancelled."

    invoke-static {v0, p1}, Lcom/nytimes/android/external/cache/AbstractFuture;->cancellationExceptionWithCause(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object p1

    throw p1
.end method

.method private newCancellationCause()Ljava/lang/Throwable;
    .locals 2
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 514
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Future.cancel() was called."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method private removeWaiter(Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)V
    .locals 4
    .param p1    # Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 150
    iput-object v0, p1, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->thread:Ljava/lang/Thread;

    .line 153
    :goto_0
    iget-object p1, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->waiters:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    .line 154
    sget-object v1, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->TOMBSTONE:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    if-ne p1, v1, :cond_0

    return-void

    :cond_0
    move-object v1, v0

    :goto_1
    if-eqz p1, :cond_4

    .line 159
    iget-object v2, p1, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->next:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    .line 160
    iget-object v3, p1, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->thread:Ljava/lang/Thread;

    if-eqz v3, :cond_1

    move-object v1, p1

    goto :goto_2

    :cond_1
    if-eqz v1, :cond_2

    .line 163
    iput-object v2, v1, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->next:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    .line 164
    iget-object p1, v1, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->thread:Ljava/lang/Thread;

    if-nez p1, :cond_3

    goto :goto_0

    .line 167
    :cond_2
    sget-object v3, Lcom/nytimes/android/external/cache/AbstractFuture;->ATOMIC_HELPER:Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;

    invoke-virtual {v3, p0, p1, v2}, Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;->casWaiters(Lcom/nytimes/android/external/cache/AbstractFuture;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    :goto_2
    move-object p1, v2

    goto :goto_1

    :cond_4
    return-void
.end method


# virtual methods
.method public addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 3
    .param p1    # Ljava/lang/Runnable;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param

    const-string v0, "Runnable was null."

    .line 547
    invoke-static {p1, v0}, Lcom/nytimes/android/external/cache/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "Executor was null."

    .line 548
    invoke-static {p2, v0}, Lcom/nytimes/android/external/cache/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 549
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->listeners:Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    .line 550
    sget-object v1, Lcom/nytimes/android/external/cache/AbstractFuture$Listener;->TOMBSTONE:Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    if-eq v0, v1, :cond_2

    .line 551
    new-instance v1, Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    invoke-direct {v1, p1, p2}, Lcom/nytimes/android/external/cache/AbstractFuture$Listener;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 553
    :cond_0
    iput-object v0, v1, Lcom/nytimes/android/external/cache/AbstractFuture$Listener;->next:Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    .line 554
    sget-object v2, Lcom/nytimes/android/external/cache/AbstractFuture;->ATOMIC_HELPER:Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;

    invoke-virtual {v2, p0, v0, v1}, Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;->casListeners(Lcom/nytimes/android/external/cache/AbstractFuture;Lcom/nytimes/android/external/cache/AbstractFuture$Listener;Lcom/nytimes/android/external/cache/AbstractFuture$Listener;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 557
    :cond_1
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->listeners:Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    .line 558
    sget-object v2, Lcom/nytimes/android/external/cache/AbstractFuture$Listener;->TOMBSTONE:Lcom/nytimes/android/external/cache/AbstractFuture$Listener;

    if-ne v0, v2, :cond_0

    .line 562
    :cond_2
    invoke-static {p1, p2}, Lcom/nytimes/android/external/cache/AbstractFuture;->executeListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public cancel(Z)Z
    .locals 5

    .line 473
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->value:Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 474
    :goto_0
    instance-of v4, v0, Lcom/nytimes/android/external/cache/AbstractFuture$SetFuture;

    or-int/2addr v3, v4

    if-eqz v3, :cond_6

    .line 479
    sget-boolean v3, Lcom/nytimes/android/external/cache/AbstractFuture;->GENERATE_CANCELLATION_CAUSES:Z

    if-eqz v3, :cond_1

    invoke-direct {p0}, Lcom/nytimes/android/external/cache/AbstractFuture;->newCancellationCause()Ljava/lang/Throwable;

    move-result-object v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 480
    :goto_1
    new-instance v4, Lcom/nytimes/android/external/cache/AbstractFuture$Cancellation;

    invoke-direct {v4, p1, v3}, Lcom/nytimes/android/external/cache/AbstractFuture$Cancellation;-><init>(ZLjava/lang/Throwable;)V

    .line 482
    :cond_2
    sget-object v3, Lcom/nytimes/android/external/cache/AbstractFuture;->ATOMIC_HELPER:Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;

    invoke-virtual {v3, p0, v0, v4}, Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;->casValue(Lcom/nytimes/android/external/cache/AbstractFuture;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    if-eqz p1, :cond_3

    .line 486
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/AbstractFuture;->interruptTask()V

    .line 488
    :cond_3
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/AbstractFuture;->complete()V

    .line 489
    instance-of v2, v0, Lcom/nytimes/android/external/cache/AbstractFuture$SetFuture;

    if-eqz v2, :cond_4

    .line 492
    check-cast v0, Lcom/nytimes/android/external/cache/AbstractFuture$SetFuture;

    iget-object v0, v0, Lcom/nytimes/android/external/cache/AbstractFuture$SetFuture;->future:Lcom/nytimes/android/external/cache/ListenableFuture;

    invoke-interface {v0, p1}, Lcom/nytimes/android/external/cache/ListenableFuture;->cancel(Z)Z

    :cond_4
    return v1

    .line 497
    :cond_5
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->value:Ljava/lang/Object;

    .line 500
    instance-of v3, v0, Lcom/nytimes/android/external/cache/AbstractFuture$SetFuture;

    if-nez v3, :cond_2

    :cond_6
    return v2
.end method

.method done()V
    .locals 0

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 396
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_a

    .line 399
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->value:Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 400
    :goto_0
    instance-of v4, v0, Lcom/nytimes/android/external/cache/AbstractFuture$SetFuture;

    if-nez v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    and-int/2addr v3, v4

    if-eqz v3, :cond_2

    .line 401
    invoke-direct {p0, v0}, Lcom/nytimes/android/external/cache/AbstractFuture;->getDoneValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 403
    :cond_2
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->waiters:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    .line 404
    sget-object v3, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->TOMBSTONE:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    if-eq v0, v3, :cond_9

    .line 405
    new-instance v3, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    invoke-direct {v3}, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;-><init>()V

    .line 407
    :cond_3
    invoke-virtual {v3, v0}, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->setNext(Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)V

    .line 408
    sget-object v4, Lcom/nytimes/android/external/cache/AbstractFuture;->ATOMIC_HELPER:Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;

    invoke-virtual {v4, p0, v0, v3}, Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;->casWaiters(Lcom/nytimes/android/external/cache/AbstractFuture;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 411
    :cond_4
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->park(Ljava/lang/Object;)V

    .line 413
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_7

    .line 419
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->value:Ljava/lang/Object;

    if-eqz v0, :cond_5

    const/4 v4, 0x1

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    .line 420
    :goto_2
    instance-of v5, v0, Lcom/nytimes/android/external/cache/AbstractFuture$SetFuture;

    if-nez v5, :cond_6

    const/4 v5, 0x1

    goto :goto_3

    :cond_6
    const/4 v5, 0x0

    :goto_3
    and-int/2addr v4, v5

    if-eqz v4, :cond_4

    .line 421
    invoke-direct {p0, v0}, Lcom/nytimes/android/external/cache/AbstractFuture;->getDoneValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 414
    :cond_7
    invoke-direct {p0, v3}, Lcom/nytimes/android/external/cache/AbstractFuture;->removeWaiter(Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)V

    .line 415
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0

    .line 425
    :cond_8
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->waiters:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    .line 426
    sget-object v4, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->TOMBSTONE:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    if-ne v0, v4, :cond_3

    .line 430
    :cond_9
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->value:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lcom/nytimes/android/external/cache/AbstractFuture;->getDoneValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 397
    :cond_a
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 10
    .param p3    # Ljava/util/concurrent/TimeUnit;
        .annotation runtime Ljavax/annotation/Nonnull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TV;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/TimeoutException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 316
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    .line 317
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result p3

    if-nez p3, :cond_12

    .line 320
    iget-object p3, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->value:Ljava/lang/Object;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 321
    :goto_0
    instance-of v3, p3, Lcom/nytimes/android/external/cache/AbstractFuture$SetFuture;

    if-nez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    and-int/2addr v2, v3

    if-eqz v2, :cond_2

    .line 322
    invoke-direct {p0, p3}, Lcom/nytimes/android/external/cache/AbstractFuture;->getDoneValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    const-wide/16 v2, 0x0

    cmp-long p3, p1, v2

    if-lez p3, :cond_3

    .line 325
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    add-long/2addr v4, p1

    goto :goto_2

    :cond_3
    move-wide v4, v2

    :goto_2
    const-wide/16 v6, 0x3e8

    cmp-long p3, p1, v6

    if-ltz p3, :cond_c

    .line 327
    iget-object p3, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->waiters:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    .line 328
    sget-object v8, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->TOMBSTONE:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    if-eq p3, v8, :cond_b

    .line 329
    new-instance v8, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    invoke-direct {v8}, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;-><init>()V

    .line 331
    :cond_4
    invoke-virtual {v8, p3}, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->setNext(Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)V

    .line 332
    sget-object v9, Lcom/nytimes/android/external/cache/AbstractFuture;->ATOMIC_HELPER:Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;

    invoke-virtual {v9, p0, p3, v8}, Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;->casWaiters(Lcom/nytimes/android/external/cache/AbstractFuture;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)Z

    move-result p3

    if-eqz p3, :cond_a

    .line 334
    :cond_5
    invoke-static {p0, p1, p2}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V

    .line 336
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result p1

    if-nez p1, :cond_9

    .line 343
    iget-object p1, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->value:Ljava/lang/Object;

    if-eqz p1, :cond_6

    const/4 p2, 0x1

    goto :goto_3

    :cond_6
    const/4 p2, 0x0

    .line 344
    :goto_3
    instance-of p3, p1, Lcom/nytimes/android/external/cache/AbstractFuture$SetFuture;

    if-nez p3, :cond_7

    const/4 p3, 0x1

    goto :goto_4

    :cond_7
    const/4 p3, 0x0

    :goto_4
    and-int/2addr p2, p3

    if-eqz p2, :cond_8

    .line 345
    invoke-direct {p0, p1}, Lcom/nytimes/android/external/cache/AbstractFuture;->getDoneValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 349
    :cond_8
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    sub-long p1, v4, p1

    cmp-long p3, p1, v6

    if-gez p3, :cond_5

    .line 352
    invoke-direct {p0, v8}, Lcom/nytimes/android/external/cache/AbstractFuture;->removeWaiter(Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)V

    goto :goto_5

    .line 337
    :cond_9
    invoke-direct {p0, v8}, Lcom/nytimes/android/external/cache/AbstractFuture;->removeWaiter(Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;)V

    .line 338
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1

    .line 357
    :cond_a
    iget-object p3, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->waiters:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    .line 358
    sget-object v9, Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;->TOMBSTONE:Lcom/nytimes/android/external/cache/AbstractFuture$Waiter;

    if-ne p3, v9, :cond_4

    .line 362
    :cond_b
    iget-object p1, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->value:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lcom/nytimes/android/external/cache/AbstractFuture;->getDoneValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_c
    :goto_5
    cmp-long p3, p1, v2

    if-lez p3, :cond_11

    .line 367
    iget-object p1, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->value:Ljava/lang/Object;

    if-eqz p1, :cond_d

    const/4 p2, 0x1

    goto :goto_6

    :cond_d
    const/4 p2, 0x0

    .line 368
    :goto_6
    instance-of p3, p1, Lcom/nytimes/android/external/cache/AbstractFuture$SetFuture;

    if-nez p3, :cond_e

    const/4 p3, 0x1

    goto :goto_7

    :cond_e
    const/4 p3, 0x0

    :goto_7
    and-int/2addr p2, p3

    if-eqz p2, :cond_f

    .line 369
    invoke-direct {p0, p1}, Lcom/nytimes/android/external/cache/AbstractFuture;->getDoneValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 371
    :cond_f
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result p1

    if-nez p1, :cond_10

    .line 374
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide p1

    sub-long p1, v4, p1

    goto :goto_5

    .line 372
    :cond_10
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1

    .line 376
    :cond_11
    new-instance p1, Ljava/util/concurrent/TimeoutException;

    invoke-direct {p1}, Ljava/util/concurrent/TimeoutException;-><init>()V

    throw p1

    .line 318
    :cond_12
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1
.end method

.method protected interruptTask()V
    .locals 0

    return-void
.end method

.method public isCancelled()Z
    .locals 1

    .line 460
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->value:Ljava/lang/Object;

    .line 461
    instance-of v0, v0, Lcom/nytimes/android/external/cache/AbstractFuture$Cancellation;

    return v0
.end method

.method public isDone()Z
    .locals 4

    .line 454
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->value:Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 455
    :goto_0
    instance-of v0, v0, Lcom/nytimes/android/external/cache/AbstractFuture$SetFuture;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    and-int v0, v3, v1

    return v0
.end method

.method final maybePropagateCancellation(Ljava/util/concurrent/Future;)V
    .locals 2
    .param p1    # Ljava/util/concurrent/Future;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "*>;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 753
    :goto_0
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/AbstractFuture;->isCancelled()Z

    move-result v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_1

    .line 754
    invoke-virtual {p0}, Lcom/nytimes/android/external/cache/AbstractFuture;->wasInterrupted()Z

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_1
    return-void
.end method

.method protected set(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 578
    sget-object p1, Lcom/nytimes/android/external/cache/AbstractFuture;->NULL:Ljava/lang/Object;

    .line 579
    :cond_0
    sget-object v0, Lcom/nytimes/android/external/cache/AbstractFuture;->ATOMIC_HELPER:Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;->casValue(Lcom/nytimes/android/external/cache/AbstractFuture;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 580
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/AbstractFuture;->complete()V

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method protected setException(Ljava/lang/Throwable;)Z
    .locals 2

    .line 599
    new-instance v0, Lcom/nytimes/android/external/cache/AbstractFuture$Failure;

    invoke-static {p1}, Lcom/nytimes/android/external/cache/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {v0, p1}, Lcom/nytimes/android/external/cache/AbstractFuture$Failure;-><init>(Ljava/lang/Throwable;)V

    .line 600
    sget-object p1, Lcom/nytimes/android/external/cache/AbstractFuture;->ATOMIC_HELPER:Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;

    const/4 v1, 0x0

    invoke-virtual {p1, p0, v1, v0}, Lcom/nytimes/android/external/cache/AbstractFuture$AtomicHelper;->casValue(Lcom/nytimes/android/external/cache/AbstractFuture;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 601
    invoke-direct {p0}, Lcom/nytimes/android/external/cache/AbstractFuture;->complete()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected final wasInterrupted()Z
    .locals 2

    .line 536
    iget-object v0, p0, Lcom/nytimes/android/external/cache/AbstractFuture;->value:Ljava/lang/Object;

    .line 537
    instance-of v1, v0, Lcom/nytimes/android/external/cache/AbstractFuture$Cancellation;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/nytimes/android/external/cache/AbstractFuture$Cancellation;

    iget-boolean v0, v0, Lcom/nytimes/android/external/cache/AbstractFuture$Cancellation;->wasInterrupted:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
