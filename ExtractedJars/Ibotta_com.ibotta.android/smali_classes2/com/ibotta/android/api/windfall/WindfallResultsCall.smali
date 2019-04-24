.class public Lcom/ibotta/android/api/windfall/WindfallResultsCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "WindfallResultsCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/android/api/windfall/WindfallResultsResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private windfallResultsJson:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    const/4 v0, 0x0

    .line 19
    invoke-virtual {p0, v0}, Lcom/ibotta/android/api/windfall/WindfallResultsCall;->setRequiresAuthToken(Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/ibotta/android/api/windfall/WindfallResultsCall;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/api/windfall/WindfallResultsCall;->windfallResultsJson:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/api/windfall/WindfallResultsCall;)Ljava/lang/String;
    .locals 0

    .line 15
    iget-object p0, p0, Lcom/ibotta/android/api/windfall/WindfallResultsCall;->windfallResultsJson:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/api/windfall/WindfallResultsResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 44
    const-class v0, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;

    invoke-static {p1, p2, v0}, Lcom/ibotta/android/api/windfall/WindfallResultsCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;

    return-object p1
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/api/windfall/WindfallResultsCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/api/windfall/WindfallResultsResponse;

    move-result-object p1

    return-object p1
.end method

.method public getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
    .locals 1

    .line 64
    new-instance v0, Lcom/ibotta/android/api/windfall/WindfallResultsCall$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/api/windfall/WindfallResultsCall$1;-><init>(Lcom/ibotta/android/api/windfall/WindfallResultsCall;)V

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "/local/windfall_results"

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, "windfall_results"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 1

    .line 49
    invoke-virtual {p0}, Lcom/ibotta/android/api/windfall/WindfallResultsCall;->getApiFunction()Ljava/lang/String;

    move-result-object v0

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
            "Lcom/ibotta/android/api/windfall/WindfallResultsResponse;",
            ">;"
        }
    .end annotation

    .line 29
    const-class v0, Lcom/ibotta/android/api/windfall/WindfallResultsResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
