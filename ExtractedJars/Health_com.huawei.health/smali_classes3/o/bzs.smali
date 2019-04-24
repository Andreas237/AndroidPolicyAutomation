.class public Lo/bzs;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lo/bzs;


# instance fields
.field private b:Ljava/util/concurrent/ExecutorService;


# direct methods
.method private constructor <init>()V
    .locals 7

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v1, 0x3

    const/4 v2, 0x6

    const-wide/16 v3, 0x3c

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v0, p0, Lo/bzs;->b:Ljava/util/concurrent/ExecutorService;

    .line 23
    return-void
.end method

.method public static a()Lo/bzs;
    .locals 4

    .line 28
    sget-object v0, Lo/bzs;->a:Lo/bzs;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 29
    const-class v2, Lo/bzs;

    monitor-enter v2

    .line 30
    :try_start_0
    sget-object v0, Lo/bzs;->a:Lo/bzs;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 31
    new-instance v0, Lo/bzs;

    invoke-direct {v0}, Lo/bzs;-><init>()V

    sput-object v0, Lo/bzs;->a:Lo/bzs;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 35
    :cond_1
    :goto_0
    sget-object v0, Lo/bzs;->a:Lo/bzs;

    return-object v0
.end method


# virtual methods
.method public c(Ljava/lang/Runnable;)V
    .locals 1

    .line 39
    iget-object v0, p0, Lo/bzs;->b:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    .line 40
    iget-object v0, p0, Lo/bzs;->b:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 41
    :cond_0
    return-void
.end method
