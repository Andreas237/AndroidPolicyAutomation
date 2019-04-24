.class public Lo/brb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/brb$c;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/concurrent/ThreadFactory;

.field private static d:Lo/brb;

.field public static final e:Ljava/util/concurrent/Executor;


# instance fields
.field private final c:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 52
    new-instance v0, Lo/brb$1;

    invoke-direct {v0}, Lo/brb$1;-><init>()V

    sput-object v0, Lo/brb;->a:Ljava/util/concurrent/ThreadFactory;

    .line 65
    sget-object v0, Lo/brb;->a:Ljava/util/concurrent/ThreadFactory;

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/brb;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private constructor <init>()V
    .locals 8

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Lo/bre;

    const-string v1, "thread-pool"

    const/16 v2, 0xa

    invoke-direct {v7, v1, v2}, Lo/bre;-><init>(Ljava/lang/String;I)V

    const/16 v1, 0xc

    const/16 v2, 0x10

    const-wide/16 v3, 0x1e

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lo/brb;->c:Ljava/util/concurrent/Executor;

    .line 75
    return-void
.end method

.method public static declared-synchronized d()Lo/brb;
    .locals 3

    const-class v1, Lo/brb;

    monitor-enter v1

    .line 84
    :try_start_0
    sget-object v0, Lo/brb;->d:Lo/brb;

    if-nez v0, :cond_0

    .line 86
    new-instance v0, Lo/brb;

    invoke-direct {v0}, Lo/brb;-><init>()V

    sput-object v0, Lo/brb;->d:Lo/brb;

    .line 88
    :cond_0
    sget-object v0, Lo/brb;->d:Lo/brb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public b(Lo/brd;Lo/brc;)Lo/bqy;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Lo/brd<TT;>;Lo/brc<TT;>;)Lo/bqy<TT;>;"
        }
    .end annotation

    .line 130
    new-instance v1, Lo/brb$c;

    invoke-direct {v1, p1, p2}, Lo/brb$c;-><init>(Lo/brd;Lo/brc;)V

    .line 131
    invoke-static {}, Lo/brf;->c()Lo/brf;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/brf;->a(Lo/bqy;)V

    .line 132
    iget-object v0, p0, Lo/brb;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 133
    return-object v1
.end method

.method public c(Ljava/util/concurrent/Executor;Lo/brd;Lo/brc;)Lo/bqy;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/util/concurrent/Executor;Lo/brd<TT;>;Lo/brc<TT;>;)Lo/bqy<TT;>;"
        }
    .end annotation

    .line 115
    new-instance v1, Lo/brb$c;

    invoke-direct {v1, p2, p3}, Lo/brb$c;-><init>(Lo/brd;Lo/brc;)V

    .line 116
    invoke-static {}, Lo/brf;->c()Lo/brf;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/brf;->a(Lo/bqy;)V

    .line 117
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 118
    return-object v1
.end method

.method public c(Lo/brd;)Lo/bqy;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Lo/brd<TT;>;)Lo/bqy<TT;>;"
        }
    .end annotation

    .line 143
    new-instance v1, Lo/brb$c;

    const/4 v0, 0x0

    invoke-direct {v1, p1, v0}, Lo/brb$c;-><init>(Lo/brd;Lo/brc;)V

    .line 144
    invoke-static {}, Lo/brf;->c()Lo/brf;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/brf;->a(Lo/bqy;)V

    .line 145
    iget-object v0, p0, Lo/brb;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 146
    return-object v1
.end method

.method public d(Ljava/lang/Runnable;)V
    .locals 1

    .line 154
    if-eqz p1, :cond_0

    .line 156
    iget-object v0, p0, Lo/brb;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 158
    :cond_0
    return-void
.end method

.method public e(Lo/brd;Lo/brc;)Lo/bqy;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Lo/brd<TT;>;Lo/brc<TT;>;)Lo/bqy<TT;>;"
        }
    .end annotation

    .line 100
    new-instance v1, Lo/brb$c;

    invoke-direct {v1, p1, p2}, Lo/brb$c;-><init>(Lo/brd;Lo/brc;)V

    .line 101
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 102
    return-object v1
.end method
