.class public Lcom/ibotta/api/call/offer/OffersCall;
.super Lcom/ibotta/api/call/offer/BaseOffersV2Call;
.source "OffersCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/call/offer/BaseOffersV2Call<",
        "Lcom/ibotta/api/call/offer/OffersResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final API_FUNCTION:Ljava/lang/String; = "offers.json"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Lcom/ibotta/api/call/offer/BaseOffersV2Call;-><init>()V

    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/offer/OffersCall;->setRequiresAuthToken(Z)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic createResponse()Lcom/ibotta/api/StraightToDiskCacheablekApiResponse;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/OffersCall;->createResponse()Lcom/ibotta/api/call/offer/OffersResponse;

    move-result-object v0

    return-object v0
.end method

.method protected createResponse()Lcom/ibotta/api/call/offer/OffersResponse;
    .locals 1

    .line 40
    new-instance v0, Lcom/ibotta/api/call/offer/OffersResponse;

    invoke-direct {v0}, Lcom/ibotta/api/call/offer/OffersResponse;-><init>()V

    return-object v0
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 1

    const-string v0, "offers.json"

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, "offers"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/OffersCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/OffersCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 20
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/offer/OffersResponse;",
            ">;"
        }
    .end annotation

    .line 15
    const-class v0, Lcom/ibotta/api/call/offer/OffersResponse;

    return-object v0
.end method

.method public getWorkDirName()Ljava/lang/String;
    .locals 1

    const-string v0, "offers"

    return-object v0
.end method

.method public getWorkFileName()Ljava/lang/String;
    .locals 1

    const-string v0, "offers.json"

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
