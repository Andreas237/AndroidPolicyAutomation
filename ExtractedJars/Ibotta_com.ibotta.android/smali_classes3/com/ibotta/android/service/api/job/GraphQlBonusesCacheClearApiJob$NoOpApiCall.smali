.class Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$NoOpApiCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "GraphQlBonusesCacheClearApiJob.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "NoOpApiCall"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$NoOpApiResponse;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$1;)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$NoOpApiCall;-><init>()V

    return-void
.end method


# virtual methods
.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$NoOpApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 67
    new-instance p1, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$NoOpApiResponse;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$NoOpApiResponse;-><init>(Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$1;)V

    return-object p1
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 34
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$NoOpApiCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$NoOpApiResponse;

    move-result-object p1

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 57
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$NoOpApiResponse;",
            ">;"
        }
    .end annotation

    .line 52
    const-class v0, Lcom/ibotta/android/service/api/job/GraphQlBonusesCacheClearApiJob$NoOpApiResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
