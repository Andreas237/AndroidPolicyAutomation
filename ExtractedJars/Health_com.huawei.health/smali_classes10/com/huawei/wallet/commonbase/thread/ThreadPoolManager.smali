.class public final Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[B

.field private static volatile e:Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;


# instance fields
.field private final c:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;->a:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const-string v0, "commonbase:ThreadPoolManager"

    const-string v1, "ThreadPool init!"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 50
    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;->c:Ljava/util/concurrent/ExecutorService;

    .line 51
    return-void
.end method

.method public static c()Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;
    .locals 4

    .line 55
    sget-object v0, Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;->e:Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 57
    sget-object v2, Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;->a:[B

    monitor-enter v2

    .line 59
    :try_start_0
    sget-object v0, Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;->e:Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 61
    new-instance v0, Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;

    invoke-direct {v0}, Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;-><init>()V

    sput-object v0, Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;->e:Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 66
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;->e:Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;->c:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public e(Ljava/lang/Runnable;)V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/wallet/commonbase/thread/ThreadPoolManager;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 78
    return-void
.end method
