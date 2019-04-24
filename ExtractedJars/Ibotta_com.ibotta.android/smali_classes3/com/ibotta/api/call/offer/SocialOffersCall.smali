.class public Lcom/ibotta/api/call/offer/SocialOffersCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "SocialOffersCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/api/call/offer/SocialOffersResponse;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

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

    .line 17
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/offer/SocialOffersCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/SocialOffersResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/SocialOffersResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 39
    new-instance p1, Lcom/ibotta/api/call/offer/SocialOffersResponse;

    invoke-direct {p1}, Lcom/ibotta/api/call/offer/SocialOffersResponse;-><init>()V

    return-object p1
.end method

.method public getApiExecution()Lcom/ibotta/api/execution/ApiExecution;
    .locals 1

    .line 53
    new-instance v0, Lcom/ibotta/api/call/offer/SocialOffersCall$1;

    invoke-direct {v0, p0}, Lcom/ibotta/api/call/offer/SocialOffersCall$1;-><init>(Lcom/ibotta/api/call/offer/SocialOffersCall;)V

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, "social_offers"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/SocialOffersCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/SocialOffersCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 29
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/offer/SocialOffersResponse;",
            ">;"
        }
    .end annotation

    .line 24
    const-class v0, Lcom/ibotta/api/call/offer/SocialOffersResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
