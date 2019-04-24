.class Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static TIMEOUT:J

.field private static mExecutor:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 9
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;->mExecutor:Ljava/util/concurrent/ExecutorService;

    .line 10
    const-wide/16 v0, 0x5

    sput-wide v0, Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;->TIMEOUT:J

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized execute(Ljava/lang/Runnable;)V
    .locals 2

    const-class v1, Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;

    monitor-enter v1

    .line 13
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;->mExecutor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 14
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;->mExecutor:Ljava/util/concurrent/ExecutorService;

    .line 17
    :cond_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;->mExecutor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    monitor-exit v1

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0
.end method

.method public static declared-synchronized shutDownExecutor()V
    .locals 6

    const-class v5, Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;

    monitor-enter v5

    .line 22
    :try_start_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;->mExecutor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 23
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;->mExecutor:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 25
    :cond_0
    sget-object v0, Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;->mExecutor:Ljava/util/concurrent/ExecutorService;

    sget-wide v1, Lcom/sina/weibo/sdk/statistic/WBAgentExecutor;->TIMEOUT:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    goto :goto_0

    .line 26
    :catch_0
    move-exception v4

    .line 28
    :goto_0
    monitor-exit v5

    return-void

    :catchall_0
    move-exception v4

    monitor-exit v5

    throw v4
.end method
