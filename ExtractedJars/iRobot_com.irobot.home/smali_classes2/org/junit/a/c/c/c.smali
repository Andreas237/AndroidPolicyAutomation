.class public Lorg/junit/a/c/c/c;
.super Lorg/junit/c/a/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/junit/a/c/c/c$b;,
        Lorg/junit/a/c/c/c$a;
    }
.end annotation


# instance fields
.field private final a:Lorg/junit/c/a/i;

.field private final b:Ljava/util/concurrent/TimeUnit;

.field private final c:J

.field private final d:Z

.field private volatile e:Ljava/lang/ThreadGroup;


# direct methods
.method private constructor <init>(Lorg/junit/a/c/c/c$a;Lorg/junit/c/a/i;)V
    .locals 2

    invoke-direct {p0}, Lorg/junit/c/a/i;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/junit/a/c/c/c;->e:Ljava/lang/ThreadGroup;

    iput-object p2, p0, Lorg/junit/a/c/c/c;->a:Lorg/junit/c/a/i;

    invoke-static {p1}, Lorg/junit/a/c/c/c$a;->a(Lorg/junit/a/c/c/c$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lorg/junit/a/c/c/c;->c:J

    invoke-static {p1}, Lorg/junit/a/c/c/c$a;->b(Lorg/junit/a/c/c/c$a;)Ljava/util/concurrent/TimeUnit;

    move-result-object p2

    iput-object p2, p0, Lorg/junit/a/c/c/c;->b:Ljava/util/concurrent/TimeUnit;

    invoke-static {p1}, Lorg/junit/a/c/c/c$a;->c(Lorg/junit/a/c/c/c$a;)Z

    move-result p1

    iput-boolean p1, p0, Lorg/junit/a/c/c/c;->d:Z

    return-void
.end method

.method synthetic constructor <init>(Lorg/junit/a/c/c/c$a;Lorg/junit/c/a/i;Lorg/junit/a/c/c/c$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/junit/a/c/c/c;-><init>(Lorg/junit/a/c/c/c$a;Lorg/junit/c/a/i;)V

    return-void
.end method

.method private a(Ljava/lang/Thread;)Ljava/lang/Exception;
    .locals 6

    invoke-virtual {p1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    iget-boolean v1, p0, Lorg/junit/a/c/c/c;->d:Z

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, Lorg/junit/a/c/c/c;->c(Ljava/lang/Thread;)Ljava/lang/Thread;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Lorg/junit/c/a/k;

    iget-wide v3, p0, Lorg/junit/a/c/c/c;->c:J

    iget-object v5, p0, Lorg/junit/a/c/c/c;->b:Ljava/util/concurrent/TimeUnit;

    invoke-direct {v2, v3, v4, v5}, Lorg/junit/c/a/k;-><init>(JLjava/util/concurrent/TimeUnit;)V

    if-eqz v0, :cond_1

    invoke-virtual {v2, v0}, Ljava/lang/Exception;->setStackTrace([Ljava/lang/StackTraceElement;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    if-eqz v1, :cond_2

    new-instance p1, Ljava/lang/Exception;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Appears to be stuck in thread "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lorg/junit/a/c/c/c;->b(Ljava/lang/Thread;)[Ljava/lang/StackTraceElement;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Exception;->setStackTrace([Ljava/lang/StackTraceElement;)V

    new-instance v0, Lorg/junit/c/a/f;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Throwable;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/junit/c/a/f;-><init>(Ljava/util/List;)V

    return-object v0

    :cond_2
    return-object v2
.end method

.method private a(Ljava/util/concurrent/FutureTask;Ljava/lang/Thread;)Ljava/lang/Throwable;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/FutureTask<",
            "Ljava/lang/Throwable;",
            ">;",
            "Ljava/lang/Thread;",
            ")",
            "Ljava/lang/Throwable;"
        }
    .end annotation

    :try_start_0
    iget-wide v0, p0, Lorg/junit/a/c/c/c;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p0, Lorg/junit/a/c/c/c;->c:J

    iget-object v2, p0, Lorg/junit/a/c/c/c;->b:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    invoke-direct {p0, p2}, Lorg/junit/a/c/c/c;->a(Ljava/lang/Thread;)Ljava/lang/Exception;

    move-result-object p1

    return-object p1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    return-object p1

    :catch_2
    move-exception p1

    return-object p1
.end method

.method static synthetic a(Lorg/junit/a/c/c/c;)Lorg/junit/c/a/i;
    .locals 0

    iget-object p0, p0, Lorg/junit/a/c/c/c;->a:Lorg/junit/c/a/i;

    return-object p0
.end method

.method private a(Ljava/lang/ThreadGroup;)[Ljava/lang/Thread;
    .locals 4

    invoke-virtual {p1}, Ljava/lang/ThreadGroup;->activeCount()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    const/16 v1, 0x64

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v1, 0x0

    :cond_0
    new-array v2, v0, [Ljava/lang/Thread;

    invoke-virtual {p1, v2}, Ljava/lang/ThreadGroup;->enumerate([Ljava/lang/Thread;)I

    move-result v3

    if-ge v3, v0, :cond_1

    invoke-direct {p0, v2, v3}, Lorg/junit/a/c/c/c;->a([Ljava/lang/Thread;I)[Ljava/lang/Thread;

    move-result-object p1

    return-object p1

    :cond_1
    add-int/lit8 v0, v0, 0x64

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x5

    if-lt v1, v2, :cond_0

    const/4 p1, 0x0

    return-object p1
.end method

.method private a([Ljava/lang/Thread;I)[Ljava/lang/Thread;
    .locals 3

    array-length v0, p1

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    new-array v0, p2, [Ljava/lang/Thread;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    aget-object v2, p1, v1

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static b()Lorg/junit/a/c/c/c$a;
    .locals 2

    new-instance v0, Lorg/junit/a/c/c/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/junit/a/c/c/c$a;-><init>(Lorg/junit/a/c/c/c$1;)V

    return-object v0
.end method

.method private b(Ljava/lang/Thread;)[Ljava/lang/StackTraceElement;
    .locals 0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/StackTraceElement;

    return-object p1
.end method

.method private c(Ljava/lang/Thread;)Ljava/lang/Thread;
    .locals 11

    iget-object v0, p0, Lorg/junit/a/c/c/c;->e:Ljava/lang/ThreadGroup;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lorg/junit/a/c/c/c;->e:Ljava/lang/ThreadGroup;

    invoke-direct {p0, v0}, Lorg/junit/a/c/c/c;->a(Ljava/lang/ThreadGroup;)[Ljava/lang/Thread;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    const-wide/16 v2, 0x0

    array-length v4, v0

    const/4 v5, 0x0

    move-wide v6, v2

    move-object v2, v1

    :goto_0
    if-ge v5, v4, :cond_4

    aget-object v3, v0, v5

    invoke-virtual {v3}, Ljava/lang/Thread;->getState()Ljava/lang/Thread$State;

    move-result-object v8

    sget-object v9, Ljava/lang/Thread$State;->RUNNABLE:Ljava/lang/Thread$State;

    if-ne v8, v9, :cond_3

    invoke-direct {p0, v3}, Lorg/junit/a/c/c/c;->d(Ljava/lang/Thread;)J

    move-result-wide v8

    if-eqz v2, :cond_2

    cmp-long v10, v8, v6

    if-lez v10, :cond_3

    :cond_2
    move-object v2, v3

    move-wide v6, v8

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    if-ne v2, p1, :cond_5

    return-object v1

    :cond_5
    move-object v1, v2

    return-object v1
.end method

.method private d(Ljava/lang/Thread;)J
    .locals 3

    invoke-static {}, Ljava/lang/management/ManagementFactory;->getThreadMXBean()Ljava/lang/management/ThreadMXBean;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/management/ThreadMXBean;->isThreadCpuTimeSupported()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Ljava/lang/management/ThreadMXBean;->getThreadCpuTime(J)J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method


# virtual methods
.method public a()V
    .locals 5

    new-instance v0, Lorg/junit/a/c/c/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/junit/a/c/c/c$b;-><init>(Lorg/junit/a/c/c/c;Lorg/junit/a/c/c/c$1;)V

    new-instance v1, Ljava/util/concurrent/FutureTask;

    invoke-direct {v1, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    new-instance v2, Ljava/lang/ThreadGroup;

    const-string v3, "FailOnTimeoutGroup"

    invoke-direct {v2, v3}, Ljava/lang/ThreadGroup;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lorg/junit/a/c/c/c;->e:Ljava/lang/ThreadGroup;

    new-instance v2, Ljava/lang/Thread;

    iget-object v3, p0, Lorg/junit/a/c/c/c;->e:Ljava/lang/ThreadGroup;

    const-string v4, "Time-limited test"

    invoke-direct {v2, v3, v1, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/ThreadGroup;Ljava/lang/Runnable;Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/Thread;->setDaemon(Z)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    invoke-virtual {v0}, Lorg/junit/a/c/c/c$b;->b()V

    invoke-direct {p0, v1, v2}, Lorg/junit/a/c/c/c;->a(Ljava/util/concurrent/FutureTask;Ljava/lang/Thread;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    throw v0

    :cond_0
    return-void
.end method
