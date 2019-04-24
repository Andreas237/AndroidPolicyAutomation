.class public Lo/dsg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dsg$a;,
        Lo/dsg$d;,
        Lo/dsg$e;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/concurrent/Executor;

.field private static final b:I

.field private static final c:I

.field private static final d:I

.field private static e:Lo/dsg;

.field private static final g:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 22
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    sput v0, Lo/dsg;->c:I

    .line 23
    sget v0, Lo/dsg;->c:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lo/dsg;->b:I

    .line 24
    sget v0, Lo/dsg;->c:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x1

    sput v0, Lo/dsg;->d:I

    .line 26
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v1, Lo/dsg;->b:I

    sget v2, Lo/dsg;->d:I

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const-wide/16 v3, 0x5

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    sput-object v0, Lo/dsg;->a:Ljava/util/concurrent/Executor;

    .line 30
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dsg;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 141
    return-void
.end method

.method public static b()Lo/dsg;
    .locals 4

    .line 33
    sget-object v2, Lo/dsg;->g:Ljava/lang/Object;

    monitor-enter v2

    .line 34
    :try_start_0
    sget-object v0, Lo/dsg;->e:Lo/dsg;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 35
    new-instance v0, Lo/dsg;

    invoke-direct {v0}, Lo/dsg;-><init>()V

    sput-object v0, Lo/dsg;->e:Lo/dsg;

    .line 37
    :cond_0
    sget-object v0, Lo/dsg;->e:Lo/dsg;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 38
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V
    .locals 8

    .line 42
    new-instance v6, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 43
    new-instance v0, Lo/dsg$d;

    move-object v1, p0

    move-object v2, v6

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lo/dsg$d;-><init>(Lo/dsg;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V

    move-object v7, v0

    .line 44
    const-string v0, "AsyncHttpUtils"

    const-string v1, "threadPoolExecutor.execute"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    sget-object v0, Lo/dsg;->a:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 46
    return-void
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V
    .locals 9

    .line 49
    new-instance v7, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 50
    new-instance v0, Lo/dsg$a;

    move-object v1, p0

    move-object v2, p1

    move-object v3, v7

    move-object v4, p4

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lo/dsg$a;-><init>(Lo/dsg;Landroid/content/Context;Landroid/os/Handler;Lo/dsl;Ljava/lang/String;Ljava/lang/String;)V

    move-object v8, v0

    .line 51
    const-string v0, "AsyncHttpUtils"

    const-string v1, "threadPoolExecutor.execute"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    sget-object v0, Lo/dsg;->a:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 53
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V
    .locals 10

    .line 62
    new-instance v8, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v8, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 63
    new-instance v0, Lo/dsg$d;

    move-object v1, p0

    move-object v2, v8

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lo/dsg$d;-><init>(Lo/dsg;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V

    move-object v9, v0

    .line 64
    const-string v0, "AsyncHttpUtils"

    const-string v1, "threadPoolExecutor.execute"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 65
    sget-object v0, Lo/dsg;->a:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 66
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V
    .locals 9

    .line 56
    new-instance v7, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 57
    new-instance v0, Lo/dsg$d;

    move-object v1, p0

    move-object v2, v7

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lo/dsg$d;-><init>(Lo/dsg;Landroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dsl;)V

    move-object v8, v0

    .line 58
    const-string v0, "AsyncHttpUtils"

    const-string v1, "threadPoolExecutor.execute"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    sget-object v0, Lo/dsg;->a:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 60
    return-void
.end method
