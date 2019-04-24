.class public Lo/eer;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/concurrent/ExecutorService;

.field private static e:Lo/eer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    const/4 v0, 0x0

    sput-object v0, Lo/eer;->a:Ljava/util/concurrent/ExecutorService;

    .line 23
    const/16 v0, 0x14

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/eer;->a:Ljava/util/concurrent/ExecutorService;

    .line 24
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    return-void
.end method

.method public static declared-synchronized d()Lo/eer;
    .locals 4

    const-class v2, Lo/eer;

    monitor-enter v2

    .line 39
    :try_start_0
    sget-object v0, Lo/eer;->e:Lo/eer;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 40
    new-instance v0, Lo/eer;

    invoke-direct {v0}, Lo/eer;-><init>()V

    sput-object v0, Lo/eer;->e:Lo/eer;

    .line 42
    :cond_0
    sget-object v0, Lo/eer;->e:Lo/eer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public e(Ljava/lang/Runnable;)V
    .locals 4

    .line 52
    const-string v0, "ThreadPoolManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ececute the task"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    sget-object v0, Lo/eer;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 54
    return-void
.end method
