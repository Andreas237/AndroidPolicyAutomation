.class public final Lorg/androidannotations/api/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/androidannotations/api/a$b;,
        Lorg/androidannotations/api/a$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Lorg/androidannotations/api/a$b;

.field private static c:Ljava/util/concurrent/Executor;

.field private static d:Lorg/androidannotations/api/a$b;

.field private static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lorg/androidannotations/api/a$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lorg/androidannotations/api/a;->a:Ljava/util/concurrent/Executor;

    sget-object v0, Lorg/androidannotations/api/a;->a:Ljava/util/concurrent/Executor;

    sput-object v0, Lorg/androidannotations/api/a;->c:Ljava/util/concurrent/Executor;

    new-instance v0, Lorg/androidannotations/api/a$1;

    invoke-direct {v0}, Lorg/androidannotations/api/a$1;-><init>()V

    sput-object v0, Lorg/androidannotations/api/a;->b:Lorg/androidannotations/api/a$b;

    sget-object v0, Lorg/androidannotations/api/a;->b:Lorg/androidannotations/api/a$b;

    sput-object v0, Lorg/androidannotations/api/a;->d:Lorg/androidannotations/api/a$b;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lorg/androidannotations/api/a;->e:Ljava/util/List;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lorg/androidannotations/api/a;->f:Ljava/lang/ThreadLocal;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Ljava/lang/ThreadLocal;
    .locals 1

    sget-object v0, Lorg/androidannotations/api/a;->f:Ljava/lang/ThreadLocal;

    return-object v0
.end method

.method private static a(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Runnable;",
            "J)",
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    sget-object v0, Lorg/androidannotations/api/a;->c:Ljava/util/concurrent/Executor;

    instance-of v0, v0, Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The executor set does not support scheduling"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    sget-object v0, Lorg/androidannotations/api/a;->c:Ljava/util/concurrent/Executor;

    check-cast v0, Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, p0, p1, p2, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p1, Lorg/androidannotations/api/a;->c:Ljava/util/concurrent/Executor;

    instance-of p1, p1, Ljava/util/concurrent/ExecutorService;

    if-eqz p1, :cond_2

    sget-object p1, Lorg/androidannotations/api/a;->c:Ljava/util/concurrent/Executor;

    check-cast p1, Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p1, Lorg/androidannotations/api/a;->c:Ljava/util/concurrent/Executor;

    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method static synthetic a(Ljava/lang/String;)Lorg/androidannotations/api/a$a;
    .locals 0

    invoke-static {p0}, Lorg/androidannotations/api/a;->c(Ljava/lang/String;)Lorg/androidannotations/api/a$a;

    move-result-object p0

    return-object p0
.end method

.method public static declared-synchronized a(Ljava/lang/String;Z)V
    .locals 7

    const-class v0, Lorg/androidannotations/api/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lorg/androidannotations/api/a;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_3

    sget-object v3, Lorg/androidannotations/api/a;->e:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/androidannotations/api/a$a;

    invoke-static {v3}, Lorg/androidannotations/api/a$a;->a(Lorg/androidannotations/api/a$a;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v3}, Lorg/androidannotations/api/a$a;->d(Lorg/androidannotations/api/a$a;)Ljava/util/concurrent/Future;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-static {v3}, Lorg/androidannotations/api/a$a;->d(Lorg/androidannotations/api/a$a;)Ljava/util/concurrent/Future;

    move-result-object v4

    invoke-interface {v4, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    invoke-static {v3}, Lorg/androidannotations/api/a$a;->e(Lorg/androidannotations/api/a$a;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v3}, Lorg/androidannotations/api/a$a;->f(Lorg/androidannotations/api/a$a;)V

    goto :goto_1

    :cond_0
    invoke-static {v3}, Lorg/androidannotations/api/a$a;->g(Lorg/androidannotations/api/a$a;)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "BackgroundExecutor"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "A task with id "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lorg/androidannotations/api/a$a;->a(Lorg/androidannotations/api/a$a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " cannot be cancelled (the executor set does not support it)"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_1
    sget-object v3, Lorg/androidannotations/api/a;->e:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static a(Ljava/util/concurrent/Executor;)V
    .locals 0

    sput-object p0, Lorg/androidannotations/api/a;->c:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static declared-synchronized a(Lorg/androidannotations/api/a$a;)V
    .locals 3

    const-class v0, Lorg/androidannotations/api/a;

    monitor-enter v0

    :try_start_0
    invoke-static {p0}, Lorg/androidannotations/api/a$a;->a(Lorg/androidannotations/api/a$a;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {p0}, Lorg/androidannotations/api/a$a;->b(Lorg/androidannotations/api/a$a;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    :cond_0
    sget-object v1, Lorg/androidannotations/api/a;->e:Ljava/util/List;

    invoke-interface {v1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-static {p0}, Lorg/androidannotations/api/a$a;->b(Lorg/androidannotations/api/a$a;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {p0}, Lorg/androidannotations/api/a$a;->b(Lorg/androidannotations/api/a$a;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lorg/androidannotations/api/a;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    const/4 v1, 0x1

    invoke-static {p0, v1}, Lorg/androidannotations/api/a$a;->a(Lorg/androidannotations/api/a$a;Z)Z

    invoke-static {p0}, Lorg/androidannotations/api/a$a;->c(Lorg/androidannotations/api/a$a;)J

    move-result-wide v1

    invoke-static {p0, v1, v2}, Lorg/androidannotations/api/a;->a(Ljava/lang/Runnable;J)Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-static {p0, v1}, Lorg/androidannotations/api/a$a;->a(Lorg/androidannotations/api/a$a;Ljava/util/concurrent/Future;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method static synthetic b()Ljava/util/List;
    .locals 1

    sget-object v0, Lorg/androidannotations/api/a;->e:Ljava/util/List;

    return-object v0
.end method

.method private static b(Ljava/lang/String;)Z
    .locals 3

    sget-object v0, Lorg/androidannotations/api/a;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/androidannotations/api/a$a;

    invoke-static {v1}, Lorg/androidannotations/api/a$a;->g(Lorg/androidannotations/api/a$a;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lorg/androidannotations/api/a$a;->b(Lorg/androidannotations/api/a$a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static c(Ljava/lang/String;)Lorg/androidannotations/api/a$a;
    .locals 3

    sget-object v0, Lorg/androidannotations/api/a;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    sget-object v2, Lorg/androidannotations/api/a;->e:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/androidannotations/api/a$a;

    invoke-static {v2}, Lorg/androidannotations/api/a$a;->b(Lorg/androidannotations/api/a$a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object p0, Lorg/androidannotations/api/a;->e:Ljava/util/List;

    invoke-interface {p0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lorg/androidannotations/api/a$a;

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
