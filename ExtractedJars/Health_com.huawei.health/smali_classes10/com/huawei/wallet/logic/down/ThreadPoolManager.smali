.class public final Lcom/huawei/wallet/logic/down/ThreadPoolManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lcom/huawei/wallet/logic/down/ThreadPoolManager;

.field private static final e:[B


# instance fields
.field private c:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/wallet/logic/down/ThreadPoolManager;->d:Lcom/huawei/wallet/logic/down/ThreadPoolManager;

    .line 33
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/wallet/logic/down/ThreadPoolManager;->e:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/ThreadPoolManager;->c:Ljava/util/concurrent/ExecutorService;

    .line 42
    const-string v0, "ThreadPoolManager"

    const-string v1, "ThreadPool init!"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 46
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/logic/down/ThreadPoolManager;->c:Ljava/util/concurrent/ExecutorService;

    .line 47
    return-void
.end method

.method public static d()Lcom/huawei/wallet/logic/down/ThreadPoolManager;
    .locals 4

    .line 50
    sget-object v2, Lcom/huawei/wallet/logic/down/ThreadPoolManager;->e:[B

    monitor-enter v2

    .line 52
    :try_start_0
    sget-object v0, Lcom/huawei/wallet/logic/down/ThreadPoolManager;->d:Lcom/huawei/wallet/logic/down/ThreadPoolManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 53
    new-instance v0, Lcom/huawei/wallet/logic/down/ThreadPoolManager;

    invoke-direct {v0}, Lcom/huawei/wallet/logic/down/ThreadPoolManager;-><init>()V

    sput-object v0, Lcom/huawei/wallet/logic/down/ThreadPoolManager;->d:Lcom/huawei/wallet/logic/down/ThreadPoolManager;

    .line 56
    :cond_0
    sget-object v0, Lcom/huawei/wallet/logic/down/ThreadPoolManager;->d:Lcom/huawei/wallet/logic/down/ThreadPoolManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 57
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public c(Ljava/lang/Runnable;)V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/huawei/wallet/logic/down/ThreadPoolManager;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 69
    return-void
.end method
