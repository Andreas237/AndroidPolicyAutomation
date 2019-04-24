.class public Lo/cbd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;


# static fields
.field private static b:Ljava/util/concurrent/Executor;


# instance fields
.field private d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 18
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/cbd;->b:Ljava/util/concurrent/Executor;

    .line 19
    sget-object v0, Lo/cbd;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lo/cbd$1;

    invoke-direct {v1}, Lo/cbd$1;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 25
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbd;->d:Ljava/lang/Object;

    .line 32
    iput-object p1, p0, Lo/cbd;->d:Ljava/lang/Object;

    .line 33
    return-void
.end method

.method private a(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 48
    const-string v0, "Step_ASyncInvocationHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "async method"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    sget-object v0, Lo/cbd;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lo/cbd$2;

    invoke-direct {v1, p0, p1, p2, p3}, Lo/cbd$2;-><init>(Lo/cbd;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 55
    const/4 v0, 0x0

    return-object v0
.end method

.method private b(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 36
    const/4 v0, 0x1

    new-array v4, v0, [Ljava/lang/Object;

    .line 38
    :try_start_0
    iget-object v0, p0, Lo/cbd;->d:Ljava/lang/Object;

    invoke-virtual {p2, v0, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1

    .line 43
    goto :goto_0

    .line 39
    :catch_0
    move-exception v5

    .line 40
    const-string v0, "Step_ASyncInvocationHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/IllegalAccessException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    goto :goto_0

    .line 41
    :catch_1
    move-exception v5

    .line 42
    const-string v0, "Step_ASyncInvocationHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/reflect/InvocationTargetException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    :goto_0
    const/4 v0, 0x0

    aget-object v0, v4, v0

    return-object v0
.end method

.method private c(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 59
    const-string v0, "Step_ASyncInvocationHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync method"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/Object;

    .line 61
    new-instance v8, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {v8, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 62
    sget-object v0, Lo/cbd;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lo/cbd$4;

    move-object v2, p0

    move-object v3, v7

    move-object v4, p2

    move-object v5, p3

    move-object v6, v8

    invoke-direct/range {v1 .. v6}, Lo/cbd$4;-><init>(Lo/cbd;[Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;Ljava/util/concurrent/CountDownLatch;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 80
    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1388

    invoke-virtual {v8, v1, v2, v0}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v9

    .line 81
    if-nez v9, :cond_0

    .line 82
    const-string v0, "Step_ASyncInvocationHandler"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "execute latch timeout class:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " method:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    :cond_0
    goto :goto_0

    .line 84
    :catch_0
    move-exception v9

    .line 85
    const-string v0, "Step_ASyncInvocationHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    :goto_0
    const/4 v0, 0x0

    aget-object v0, v7, v0

    return-object v0
.end method

.method static synthetic e(Lo/cbd;)Ljava/lang/Object;
    .locals 1

    .line 12
    iget-object v0, p0, Lo/cbd;->d:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic e(Lo/cbd;Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-direct {p0, p1, p2, p3}, Lo/cbd;->b(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 93
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Daemon_UIWorkThread"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    const-string v0, "Step_ASyncInvocationHandler"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "same method invoke"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    invoke-direct {p0, p1, p2, p3}, Lo/cbd;->b(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 98
    :cond_0
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_1

    .line 99
    invoke-direct {p0, p1, p2, p3}, Lo/cbd;->a(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 102
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lo/cbd;->c(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
