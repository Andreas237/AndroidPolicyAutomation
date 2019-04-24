.class public Lo/eeq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static c:Lo/eeq;

.field private static e:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    const/4 v0, 0x0

    sput-object v0, Lo/eeq;->e:Ljava/util/concurrent/ExecutorService;

    .line 22
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lo/eeq;->e:Ljava/util/concurrent/ExecutorService;

    .line 23
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    return-void
.end method

.method public static declared-synchronized b()Lo/eeq;
    .locals 4

    const-class v2, Lo/eeq;

    monitor-enter v2

    .line 38
    :try_start_0
    sget-object v0, Lo/eeq;->c:Lo/eeq;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 39
    new-instance v0, Lo/eeq;

    invoke-direct {v0}, Lo/eeq;-><init>()V

    sput-object v0, Lo/eeq;->c:Lo/eeq;

    .line 41
    :cond_0
    sget-object v0, Lo/eeq;->c:Lo/eeq;
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

    .line 51
    const-string v0, "ThreadPoolManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ececute the task"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    sget-object v0, Lo/eeq;->e:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 53
    return-void
.end method
