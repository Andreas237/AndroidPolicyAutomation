.class final Lo/aze;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aze$b;,
        Lo/aze$e;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private b:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Lo/aze$e;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lo/aze;->b:Ljava/util/Queue;

    .line 48
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Lo/aze$b;

    const-string v1, "SnsApp_ReceiveThread:"

    invoke-direct {v7, v1}, Lo/aze$b;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x1

    const-wide/16 v3, 0x12c

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lo/aze;->e:Ljava/util/concurrent/Executor;

    .line 51
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Lo/aze$b;

    const-string v1, "SnsApp_SendThread:"

    invoke-direct {v7, v1}, Lo/aze$b;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v2, 0x1

    const-wide/16 v3, 0x12c

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lo/aze;->a:Ljava/util/concurrent/Executor;

    .line 53
    return-void
.end method

.method static synthetic b(Lo/aze;)Ljava/util/Queue;
    .locals 1

    .line 21
    iget-object v0, p0, Lo/aze;->b:Ljava/util/Queue;

    return-object v0
.end method


# virtual methods
.method a()V
    .locals 3

    .line 92
    iget-object v0, p0, Lo/aze;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/aze$e;

    .line 94
    if-eqz v2, :cond_0

    .line 96
    invoke-static {v2}, Lo/aze$e;->d(Lo/aze$e;)V

    .line 98
    :cond_0
    goto :goto_0

    .line 99
    :cond_1
    return-void
.end method

.method b(Ljava/lang/Runnable;)V
    .locals 2

    .line 78
    if-nez p1, :cond_0

    .line 80
    return-void

    .line 82
    :cond_0
    new-instance v1, Lo/aze$e;

    const/4 v0, 0x0

    invoke-direct {v1, p0, p1, v0}, Lo/aze$e;-><init>(Lo/aze;Ljava/lang/Runnable;Lo/aze$5;)V

    .line 83
    iget-object v0, p0, Lo/aze;->b:Ljava/util/Queue;

    invoke-interface {v0, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 84
    iget-object v0, p0, Lo/aze;->a:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 85
    return-void
.end method

.method e(Ljava/lang/Runnable;)V
    .locals 2

    .line 62
    if-nez p1, :cond_0

    .line 64
    return-void

    .line 66
    :cond_0
    new-instance v1, Lo/aze$e;

    const/4 v0, 0x0

    invoke-direct {v1, p0, p1, v0}, Lo/aze$e;-><init>(Lo/aze;Ljava/lang/Runnable;Lo/aze$5;)V

    .line 67
    iget-object v0, p0, Lo/aze;->b:Ljava/util/Queue;

    invoke-interface {v0, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 68
    iget-object v0, p0, Lo/aze;->e:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 69
    return-void
.end method
