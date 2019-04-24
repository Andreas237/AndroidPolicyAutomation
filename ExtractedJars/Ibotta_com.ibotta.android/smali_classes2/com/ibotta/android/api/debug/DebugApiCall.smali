.class public Lcom/ibotta/android/api/debug/DebugApiCall;
.super Lcom/ibotta/api/BaseApiCall;
.source "DebugApiCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseApiCall<",
        "Lcom/ibotta/api/EmptyResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private final fakeLoadTime:J

.field private final fakeSuccess:Z


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/ibotta/api/BaseApiCall;-><init>()V

    .line 20
    iput-wide p1, p0, Lcom/ibotta/android/api/debug/DebugApiCall;->fakeLoadTime:J

    .line 21
    iput-boolean p3, p0, Lcom/ibotta/android/api/debug/DebugApiCall;->fakeSuccess:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/api/debug/DebugApiCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/EmptyResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 41
    new-instance p1, Lcom/ibotta/api/EmptyResponse;

    invoke-direct {p1}, Lcom/ibotta/api/EmptyResponse;-><init>()V

    return-object p1
.end method

.method public getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
    .locals 4

    .line 46
    new-instance v0, Lcom/ibotta/android/api/debug/DebugApiExecution;

    iget-wide v1, p0, Lcom/ibotta/android/api/debug/DebugApiCall;->fakeLoadTime:J

    iget-boolean v3, p0, Lcom/ibotta/android/api/debug/DebugApiCall;->fakeSuccess:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/api/debug/DebugApiExecution;-><init>(JZ)V

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/debug"

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/EmptyResponse;",
            ">;"
        }
    .end annotation

    .line 26
    const-class v0, Lcom/ibotta/api/EmptyResponse;

    return-object v0
.end method
