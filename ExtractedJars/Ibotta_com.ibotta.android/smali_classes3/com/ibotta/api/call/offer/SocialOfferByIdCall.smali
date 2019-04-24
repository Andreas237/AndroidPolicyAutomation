.class public Lcom/ibotta/api/call/offer/SocialOfferByIdCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "SocialOfferByIdCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final API_FUNCTION:Ljava/lang/String; = "customers/%1$d/offers/%2$d/social.json"


# instance fields
.field private final customerId:I

.field private final offerId:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 17
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    const/4 v0, 0x1

    .line 18
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;->setRequiresAuthToken(Z)V

    .line 19
    iput p1, p0, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;->customerId:I

    .line 20
    iput p2, p0, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;->offerId:I

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

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 40
    const-class v0, Lcom/ibotta/api/model/offer/SocialOffer;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/offer/SocialOffer;

    .line 42
    new-instance p2, Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;-><init>()V

    .line 43
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;->setSocialOffer(Lcom/ibotta/api/model/offer/SocialOffer;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 35
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/offers/%2$d/social.json"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;->offerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, "social_offers"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    iget v1, p0, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;->customerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    iget v1, p0, Lcom/ibotta/api/call/offer/SocialOfferByIdCall;->offerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 30
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;",
            ">;"
        }
    .end annotation

    .line 25
    const-class v0, Lcom/ibotta/api/call/offer/SocialOfferByIdResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
