.class public Lcom/ibotta/android/api/debug/DebugApiExecution;
.super Ljava/lang/Object;
.source "DebugApiExecution.java"

# interfaces
.implements Lcom/ibotta/api/execution/ApiExecution;


# instance fields
.field private final fakeLoadTime:J

.field private final fakeSuccess:Z


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-wide p1, p0, Lcom/ibotta/android/api/debug/DebugApiExecution;->fakeLoadTime:J

    .line 19
    iput-boolean p3, p0, Lcom/ibotta/android/api/debug/DebugApiExecution;->fakeSuccess:Z

    return-void
.end method


# virtual methods
.method public abort()V
    .locals 0

    return-void
.end method

.method public executeApiCall(Lcom/ibotta/api/ApiCall;)Lcom/ibotta/api/ApiResponse;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 25
    :try_start_0
    iget-wide v0, p0, Lcom/ibotta/android/api/debug/DebugApiExecution;->fakeLoadTime:J

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    :catch_0
    iget-boolean p1, p0, Lcom/ibotta/android/api/debug/DebugApiExecution;->fakeSuccess:Z

    if-eqz p1, :cond_0

    .line 34
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1

    .line 31
    :cond_0
    new-instance p1, Lcom/ibotta/api/ApiException;

    const-string v0, "Faking a failed API call."

    invoke-direct {p1, v0}, Lcom/ibotta/api/ApiException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getEndpoint(Lcom/ibotta/api/ApiCall;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public isAborted()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
