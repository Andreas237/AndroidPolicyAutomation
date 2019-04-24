.class public final Lcom/tencent/open/utils/ThreadManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/open/utils/ThreadManager$1;,
        Lcom/tencent/open/utils/ThreadManager$SerialExecutor;
    }
.end annotation


# static fields
.field public static final NETWORK_EXECUTOR:Ljava/util/concurrent/Executor;

.field private static a:Landroid/os/Handler;

.field private static b:Ljava/lang/Object;

.field private static c:Landroid/os/Handler;

.field private static d:Landroid/os/HandlerThread;

.field private static e:Landroid/os/Handler;

.field private static f:Landroid/os/HandlerThread;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/tencent/open/utils/ThreadManager;->b:Ljava/lang/Object;

    .line 48
    invoke-static {}, Lcom/tencent/open/utils/ThreadManager;->a()Ljava/util/concurrent/Executor;

    move-result-object v0

    sput-object v0, Lcom/tencent/open/utils/ThreadManager;->NETWORK_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 49
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 193
    return-void
.end method

.method private static a()Ljava/util/concurrent/Executor;
    .locals 10

    .line 52
    const/4 v7, 0x0

    .line 54
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 55
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    move-object v7, v0

    goto :goto_1

    .line 59
    :cond_0
    const/4 v8, 0x0

    .line 61
    :try_start_0
    const-class v0, Landroid/os/AsyncTask;

    const-string v1, "sExecutor"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v9

    .line 62
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 63
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/concurrent/Executor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    goto :goto_0

    .line 64
    :catch_0
    move-exception v9

    .line 65
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    invoke-direct/range {v0 .. v6}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    move-object v8, v0

    .line 68
    :goto_0
    move-object v7, v8

    .line 71
    :goto_1
    instance-of v0, v7, Ljava/util/concurrent/ThreadPoolExecutor;

    if-eqz v0, :cond_1

    .line 73
    move-object v0, v7

    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->setCorePoolSize(I)V

    .line 76
    :cond_1
    return-object v7
.end method

.method public static executeOnFileThread(Ljava/lang/Runnable;)V
    .locals 1

    .line 178
    invoke-static {}, Lcom/tencent/open/utils/ThreadManager;->getFileThreadHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 179
    return-void
.end method

.method public static executeOnNetWorkThread(Ljava/lang/Runnable;)V
    .locals 2

    .line 89
    :try_start_0
    sget-object v0, Lcom/tencent/open/utils/ThreadManager;->NETWORK_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    goto :goto_0

    .line 90
    :catch_0
    move-exception v1

    .line 92
    :goto_0
    return-void
.end method

.method public static executeOnSubThread(Ljava/lang/Runnable;)V
    .locals 1

    .line 170
    invoke-static {}, Lcom/tencent/open/utils/ThreadManager;->getSubThreadHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 171
    return-void
.end method

.method public static getFileThreadHandler()Landroid/os/Handler;
    .locals 4

    .line 118
    sget-object v0, Lcom/tencent/open/utils/ThreadManager;->e:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 119
    const-class v2, Lcom/tencent/open/utils/ThreadManager;

    monitor-enter v2

    .line 120
    :try_start_0
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "SDK_FILE_RW"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/tencent/open/utils/ThreadManager;->f:Landroid/os/HandlerThread;

    .line 121
    sget-object v0, Lcom/tencent/open/utils/ThreadManager;->f:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 122
    new-instance v0, Landroid/os/Handler;

    sget-object v1, Lcom/tencent/open/utils/ThreadManager;->f:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/tencent/open/utils/ThreadManager;->e:Landroid/os/Handler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 125
    :cond_0
    :goto_0
    sget-object v0, Lcom/tencent/open/utils/ThreadManager;->e:Landroid/os/Handler;

    return-object v0
.end method

.method public static getFileThreadLooper()Landroid/os/Looper;
    .locals 1

    .line 129
    invoke-static {}, Lcom/tencent/open/utils/ThreadManager;->getFileThreadHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method

.method public static getMainHandler()Landroid/os/Handler;
    .locals 4

    .line 100
    sget-object v0, Lcom/tencent/open/utils/ThreadManager;->a:Landroid/os/Handler;

    if-nez v0, :cond_1

    .line 101
    sget-object v2, Lcom/tencent/open/utils/ThreadManager;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 102
    :try_start_0
    sget-object v0, Lcom/tencent/open/utils/ThreadManager;->a:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 103
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/tencent/open/utils/ThreadManager;->a:Landroid/os/Handler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 107
    :cond_1
    :goto_0
    sget-object v0, Lcom/tencent/open/utils/ThreadManager;->a:Landroid/os/Handler;

    return-object v0
.end method

.method public static getSubThread()Ljava/lang/Thread;
    .locals 1

    .line 133
    sget-object v0, Lcom/tencent/open/utils/ThreadManager;->d:Landroid/os/HandlerThread;

    if-nez v0, :cond_0

    .line 134
    invoke-static {}, Lcom/tencent/open/utils/ThreadManager;->getSubThreadHandler()Landroid/os/Handler;

    .line 136
    :cond_0
    sget-object v0, Lcom/tencent/open/utils/ThreadManager;->d:Landroid/os/HandlerThread;

    return-object v0
.end method

.method public static getSubThreadHandler()Landroid/os/Handler;
    .locals 4

    .line 148
    sget-object v0, Lcom/tencent/open/utils/ThreadManager;->c:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 149
    const-class v2, Lcom/tencent/open/utils/ThreadManager;

    monitor-enter v2

    .line 150
    :try_start_0
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "SDK_SUB"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/tencent/open/utils/ThreadManager;->d:Landroid/os/HandlerThread;

    .line 151
    sget-object v0, Lcom/tencent/open/utils/ThreadManager;->d:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 152
    new-instance v0, Landroid/os/Handler;

    sget-object v1, Lcom/tencent/open/utils/ThreadManager;->d:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lcom/tencent/open/utils/ThreadManager;->c:Landroid/os/Handler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 155
    :cond_0
    :goto_0
    sget-object v0, Lcom/tencent/open/utils/ThreadManager;->c:Landroid/os/Handler;

    return-object v0
.end method

.method public static getSubThreadLooper()Landroid/os/Looper;
    .locals 1

    .line 159
    invoke-static {}, Lcom/tencent/open/utils/ThreadManager;->getSubThreadHandler()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method

.method public static init()V
    .locals 0

    .line 80
    return-void
.end method

.method public static newSerialExecutor()Ljava/util/concurrent/Executor;
    .locals 2

    .line 190
    new-instance v0, Lcom/tencent/open/utils/ThreadManager$SerialExecutor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tencent/open/utils/ThreadManager$SerialExecutor;-><init>(Lcom/tencent/open/utils/ThreadManager$1;)V

    return-object v0
.end method
