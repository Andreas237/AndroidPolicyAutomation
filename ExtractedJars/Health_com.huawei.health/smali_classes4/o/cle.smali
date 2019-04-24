.class public Lo/cle;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cle$d;
    }
.end annotation


# static fields
.field private static a:Lo/cle;

.field private static b:Lo/cle;


# instance fields
.field private e:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo/cle;

    invoke-direct {v0}, Lo/cle;-><init>()V

    sput-object v0, Lo/cle;->a:Lo/cle;

    new-instance v0, Lo/cle;

    invoke-direct {v0}, Lo/cle;-><init>()V

    sput-object v0, Lo/cle;->b:Lo/cle;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v0, 0x1388

    invoke-direct {v7, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-wide/32 v3, 0xea60

    move-object v6, v7

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v0, p0, Lo/cle;->e:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public static a()Lo/cle;
    .locals 1

    sget-object v0, Lo/cle;->b:Lo/cle;

    return-object v0
.end method

.method public static c()Lo/cle;
    .locals 1

    sget-object v0, Lo/cle;->a:Lo/cle;

    return-object v0
.end method


# virtual methods
.method public e(Lo/ckx;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lo/cle;->e:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lo/cle$d;

    invoke-direct {v1, p1}, Lo/cle$d;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v0, "TaskThread"

    const-string v1, "addToQueue(): RejectedExecutionException: queue is full"

    invoke-static {v0, v1}, Lo/ciy;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method
