.class public Lo/xw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:I

.field private static b:I

.field private static c:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<Ljava/lang/Runnable;>;"
        }
    .end annotation
.end field

.field private static d:Ljava/util/concurrent/ThreadFactory;

.field private static e:I

.field private static h:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 33
    const/4 v0, 0x5

    sput v0, Lo/xw;->e:I

    .line 38
    const/16 v0, 0x32

    sput v0, Lo/xw;->b:I

    .line 43
    const/16 v0, 0x1e

    sput v0, Lo/xw;->a:I

    .line 48
    new-instance v0, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v0}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    sput-object v0, Lo/xw;->c:Ljava/util/concurrent/BlockingQueue;

    .line 53
    new-instance v0, Lo/xw$5;

    invoke-direct {v0}, Lo/xw$5;-><init>()V

    sput-object v0, Lo/xw;->d:Ljava/util/concurrent/ThreadFactory;

    .line 68
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v1, Lo/xw;->e:I

    sget v2, Lo/xw;->b:I

    sget v3, Lo/xw;->a:I

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v6, Lo/xw;->c:Ljava/util/concurrent/BlockingQueue;

    sget-object v7, Lo/xw;->d:Ljava/util/concurrent/ThreadFactory;

    new-instance v8, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;

    invoke-direct {v8}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;-><init>()V

    invoke-direct/range {v0 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;Ljava/util/concurrent/RejectedExecutionHandler;)V

    sput-object v0, Lo/xw;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 79
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 1

    .line 82
    sget-object v0, Lo/xw;->h:Ljava/util/concurrent/ThreadPoolExecutor;

    return-object v0
.end method
