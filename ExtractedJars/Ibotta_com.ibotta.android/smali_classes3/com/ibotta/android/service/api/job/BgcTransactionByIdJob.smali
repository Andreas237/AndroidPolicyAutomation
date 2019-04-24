.class public Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;
.super Lcom/ibotta/android/service/api/job/SingleApiJob;
.source "BgcTransactionByIdJob.java"


# static fields
.field private static final MAX_RUN_TIME:J

.field private static final POLL_INTERVAL:J

.field private static final failedStatus:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/api/execution/PwiApiExecution$Status;",
            ">;"
        }
    .end annotation
.end field

.field private static final incompleteStatus:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/ibotta/api/execution/PwiApiExecution$Status;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final isPolling:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 23
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x23

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->MAX_RUN_TIME:J

    .line 24
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5dc

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->POLL_INTERVAL:J

    .line 25
    sget-object v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;->STARTED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    sget-object v1, Lcom/ibotta/api/execution/PwiApiExecution$Status;->AUTHORIZED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    sget-object v2, Lcom/ibotta/api/execution/PwiApiExecution$Status;->ORDERED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    invoke-static {v0, v1, v2}, Ljava9/util/Sets;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->incompleteStatus:Ljava/util/Set;

    .line 26
    sget-object v0, Lcom/ibotta/api/execution/PwiApiExecution$Status;->FAILED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    sget-object v1, Lcom/ibotta/api/execution/PwiApiExecution$Status;->REVERSED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    sget-object v2, Lcom/ibotta/api/execution/PwiApiExecution$Status;->REVERSAL_FAILED:Lcom/ibotta/api/execution/PwiApiExecution$Status;

    invoke-static {v0, v1, v2}, Ljava9/util/Sets;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->failedStatus:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/api/ApiCall;)V
    .locals 1

    const/4 v0, 0x0

    .line 30
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/api/ApiCall;I)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    const/4 p1, 0x0

    .line 35
    iput-boolean p1, p0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->isPolling:Z

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/api/ApiCall;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 39
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;I)V

    .line 40
    iput-boolean p2, p0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->isPolling:Z

    return-void
.end method

.method public static isFailedTransaction(Ljava/lang/String;)Z
    .locals 1

    .line 75
    sget-object v0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->failedStatus:Ljava/util/Set;

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/execution/PwiApiExecution$Status;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/execution/PwiApiExecution$Status;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static isTransactionComplete(Ljava/lang/String;)Z
    .locals 1

    .line 79
    sget-object v0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->incompleteStatus:Ljava/util/Set;

    invoke-virtual {p0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/api/execution/PwiApiExecution$Status;->valueOf(Ljava/lang/String;)Lcom/ibotta/api/execution/PwiApiExecution$Status;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method


# virtual methods
.method protected onExecuteApiCall()V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v0}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v0

    .line 48
    iget-boolean v2, p0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->isPolling:Z

    if-eqz v2, :cond_2

    .line 50
    :goto_0
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v2

    invoke-interface {v2}, Lcom/ibotta/api/ApiCall;->execute()Lcom/ibotta/api/ApiResponse;

    move-result-object v2

    iput-object v2, p0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->apiResponse:Lcom/ibotta/api/ApiResponse;

    .line 51
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->apiResponse:Lcom/ibotta/api/ApiResponse;

    check-cast v2, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;

    invoke-virtual {v2}, Lcom/ibotta/api/call/pwi/BgcTransactionResponse;->getBgcTransaction()Lcom/ibotta/api/model/pwi/BgcTransaction;

    move-result-object v2

    .line 53
    invoke-virtual {v2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getStatus()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->isTransactionComplete(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 57
    :cond_0
    iget-object v2, p0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->apiJobEnvironment:Lcom/ibotta/android/service/api/job/ApiJobEnvironment;

    invoke-interface {v2}, Lcom/ibotta/android/service/api/job/ApiJobEnvironment;->getCurrentTime()J

    move-result-wide v2

    sub-long/2addr v2, v0

    .line 59
    sget-wide v4, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->MAX_RUN_TIME:J

    cmp-long v6, v2, v4

    if-gtz v6, :cond_1

    .line 64
    :try_start_0
    sget-wide v2, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->POLL_INTERVAL:J

    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "InterruptedException while polling api job!"

    const/4 v4, 0x0

    .line 66
    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 60
    :cond_1
    new-instance v0, Lcom/ibotta/api/ApiException;

    const-string v1, "Max Run Time Exceeded: Timeout."

    invoke-direct {v0, v1}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :cond_2
    invoke-virtual {p0}, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/api/ApiCall;->execute()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/service/api/job/BgcTransactionByIdJob;->apiResponse:Lcom/ibotta/api/ApiResponse;

    :goto_1
    return-void
.end method
