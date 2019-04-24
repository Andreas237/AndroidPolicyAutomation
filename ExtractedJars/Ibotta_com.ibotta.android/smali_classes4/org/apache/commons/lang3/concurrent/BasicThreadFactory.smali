.class public Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;
.super Ljava/lang/Object;
.source "BasicThreadFactory.java"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;
    }
.end annotation


# instance fields
.field private final daemon:Ljava/lang/Boolean;

.field private final namingPattern:Ljava/lang/String;

.field private final priority:Ljava/lang/Integer;

.field private final threadCounter:Ljava/util/concurrent/atomic/AtomicLong;

.field private final uncaughtExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private final wrappedFactory:Ljava/util/concurrent/ThreadFactory;


# direct methods
.method private constructor <init>(Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;)V
    .locals 1

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    invoke-static {p1}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;->access$000(Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    if-nez v0, :cond_0

    .line 118
    invoke-static {}, Ljava/util/concurrent/Executors;->defaultThreadFactory()Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->wrappedFactory:Ljava/util/concurrent/ThreadFactory;

    goto :goto_0

    .line 120
    :cond_0
    invoke-static {p1}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;->access$000(Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;)Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->wrappedFactory:Ljava/util/concurrent/ThreadFactory;

    .line 123
    :goto_0
    invoke-static {p1}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;->access$100(Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->namingPattern:Ljava/lang/String;

    .line 124
    invoke-static {p1}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;->access$200(Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->priority:Ljava/lang/Integer;

    .line 125
    invoke-static {p1}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;->access$300(Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->daemon:Ljava/lang/Boolean;

    .line 126
    invoke-static {p1}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;->access$400(Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;)Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->uncaughtExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 128
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->threadCounter:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method synthetic constructor <init>(Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$1;)V
    .locals 0

    .line 91
    invoke-direct {p0, p1}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;-><init>(Lorg/apache/commons/lang3/concurrent/BasicThreadFactory$Builder;)V

    return-void
.end method

.method private initializeThread(Ljava/lang/Thread;)V
    .locals 4

    .line 222
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->getNamingPattern()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 223
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->threadCounter:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 224
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->getNamingPattern()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 227
    :cond_0
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 228
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 231
    :cond_1
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->getPriority()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 232
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->getPriority()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/Thread;->setPriority(I)V

    .line 235
    :cond_2
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->getDaemonFlag()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 236
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->getDaemonFlag()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/Thread;->setDaemon(Z)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final getDaemonFlag()Ljava/lang/Boolean;
    .locals 1

    .line 162
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->daemon:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getNamingPattern()Ljava/lang/String;
    .locals 1

    .line 150
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->namingPattern:Ljava/lang/String;

    return-object v0
.end method

.method public final getPriority()Ljava/lang/Integer;
    .locals 1

    .line 172
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->priority:Ljava/lang/Integer;

    return-object v0
.end method

.method public getThreadCount()J
    .locals 2

    .line 193
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->threadCounter:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;
    .locals 1

    .line 182
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->uncaughtExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-object v0
.end method

.method public final getWrappedFactory()Ljava/util/concurrent/ThreadFactory;
    .locals 1

    .line 140
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->wrappedFactory:Ljava/util/concurrent/ThreadFactory;

    return-object v0
.end method

.method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 1

    .line 206
    invoke-virtual {p0}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->getWrappedFactory()Ljava/util/concurrent/ThreadFactory;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/concurrent/ThreadFactory;->newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p1

    .line 207
    invoke-direct {p0, p1}, Lorg/apache/commons/lang3/concurrent/BasicThreadFactory;->initializeThread(Ljava/lang/Thread;)V

    return-object p1
.end method
