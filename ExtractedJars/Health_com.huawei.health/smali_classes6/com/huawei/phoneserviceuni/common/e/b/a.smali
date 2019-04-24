.class public final Lcom/huawei/phoneserviceuni/common/e/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "ThreadPoolManager"

.field private static final b:Ljava/util/concurrent/TimeUnit;

.field private static c:I = 0x0

.field private static d:I = 0x0

.field private static e:I = 0x0

.field private static f:I = 0x0

.field private static j:Lcom/huawei/phoneserviceuni/common/e/b/a; = null


# instance fields
.field private volatile g:Ljava/util/concurrent/ThreadPoolExecutor;

.field private h:Ljava/util/concurrent/RejectedExecutionHandler;

.field private i:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<Ljava/lang/Runnable;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 26
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sput-object v0, Lcom/huawei/phoneserviceuni/common/e/b/a;->b:Ljava/util/concurrent/TimeUnit;

    .line 31
    const/4 v0, 0x2

    sput v0, Lcom/huawei/phoneserviceuni/common/e/b/a;->c:I

    .line 36
    const/4 v0, 0x5

    sput v0, Lcom/huawei/phoneserviceuni/common/e/b/a;->d:I

    .line 43
    const/16 v0, 0xe10

    sput v0, Lcom/huawei/phoneserviceuni/common/e/b/a;->e:I

    .line 48
    sget v0, Lcom/huawei/phoneserviceuni/common/e/b/a;->c:I

    sget v1, Lcom/huawei/phoneserviceuni/common/e/b/a;->d:I

    add-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    sput v0, Lcom/huawei/phoneserviceuni/common/e/b/a;->f:I

    .line 70
    new-instance v0, Lcom/huawei/phoneserviceuni/common/e/b/a;

    invoke-direct {v0}, Lcom/huawei/phoneserviceuni/common/e/b/a;-><init>()V

    sput-object v0, Lcom/huawei/phoneserviceuni/common/e/b/a;->j:Lcom/huawei/phoneserviceuni/common/e/b/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/phoneserviceuni/common/e/b/a;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 58
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;

    invoke-direct {v0}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardOldestPolicy;-><init>()V

    iput-object v0, p0, Lcom/huawei/phoneserviceuni/common/e/b/a;->h:Ljava/util/concurrent/RejectedExecutionHandler;

    .line 65
    new-instance v0, Ljava/util/concurrent/ArrayBlockingQueue;

    sget v1, Lcom/huawei/phoneserviceuni/common/e/b/a;->f:I

    invoke-direct {v0, v1}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/phoneserviceuni/common/e/b/a;->i:Ljava/util/concurrent/BlockingQueue;

    .line 76
    return-void
.end method

.method public static a()Lcom/huawei/phoneserviceuni/common/e/b/a;
    .locals 12

    .line 84
    sget-object v9, Lcom/huawei/phoneserviceuni/common/e/b/a;->j:Lcom/huawei/phoneserviceuni/common/e/b/a;

    monitor-enter v9

    .line 85
    :try_start_0
    sget-object v0, Lcom/huawei/phoneserviceuni/common/e/b/a;->j:Lcom/huawei/phoneserviceuni/common/e/b/a;

    iget-object v0, v0, Lcom/huawei/phoneserviceuni/common/e/b/a;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/phoneserviceuni/common/e/b/a;->j:Lcom/huawei/phoneserviceuni/common/e/b/a;

    iget-object v0, v0, Lcom/huawei/phoneserviceuni/common/e/b/a;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->isShutdown()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 87
    :cond_0
    :try_start_1
    sget-object v0, Lcom/huawei/phoneserviceuni/common/e/b/a;->j:Lcom/huawei/phoneserviceuni/common/e/b/a;

    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget v2, Lcom/huawei/phoneserviceuni/common/e/b/a;->c:I

    sget v3, Lcom/huawei/phoneserviceuni/common/e/b/a;->d:I

    sget v4, Lcom/huawei/phoneserviceuni/common/e/b/a;->e:I

    int-to-long v4, v4

    sget-object v6, Lcom/huawei/phoneserviceuni/common/e/b/a;->b:Ljava/util/concurrent/TimeUnit;

    sget-object v7, Lcom/huawei/phoneserviceuni/common/e/b/a;->j:Lcom/huawei/phoneserviceuni/common/e/b/a;

    iget-object v7, v7, Lcom/huawei/phoneserviceuni/common/e/b/a;->i:Ljava/util/concurrent/BlockingQueue;

    sget-object v8, Lcom/huawei/phoneserviceuni/common/e/b/a;->j:Lcom/huawei/phoneserviceuni/common/e/b/a;

    iget-object v8, v8, Lcom/huawei/phoneserviceuni/common/e/b/a;->h:Ljava/util/concurrent/RejectedExecutionHandler;

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/RejectedExecutionHandler;)V

    iput-object v1, v0, Lcom/huawei/phoneserviceuni/common/e/b/a;->g:Ljava/util/concurrent/ThreadPoolExecutor;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    goto :goto_0

    .line 89
    :catch_0
    move-exception v10

    .line 90
    const-string v0, "ThreadPoolManager"

    :try_start_2
    invoke-static {v10, v0}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 93
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/phoneserviceuni/common/e/b/a;->j:Lcom/huawei/phoneserviceuni/common/e/b/a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v9

    return-object v0

    .line 94
    :catchall_0
    move-exception v11

    monitor-exit v9

    throw v11
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 2

    .line 104
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/e/b/a;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 106
    :try_start_0
    iget-object v0, p0, Lcom/huawei/phoneserviceuni/common/e/b/a;->g:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    goto :goto_0

    .line 107
    :catch_0
    move-exception v1

    .line 108
    const-string v0, "ThreadPoolManager"

    invoke-static {v1, v0}, Lcom/huawei/phoneserviceuni/common/e/c;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 111
    :cond_0
    :goto_0
    return-void
.end method
