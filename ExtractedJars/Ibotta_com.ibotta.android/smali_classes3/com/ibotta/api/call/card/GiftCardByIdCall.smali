.class public Lcom/ibotta/api/call/card/GiftCardByIdCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "GiftCardByIdCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/api/call/card/GiftCardByIdResponse;",
        ">;"
    }
.end annotation


# instance fields
.field private giftCardId:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    .line 21
    iput p1, p0, Lcom/ibotta/api/call/card/GiftCardByIdCall;->giftCardId:I

    const/4 p1, 0x1

    .line 22
    invoke-virtual {p0, p1}, Lcom/ibotta/api/call/card/GiftCardByIdCall;->setRequiresAuthToken(Z)V

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

    .line 16
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/card/GiftCardByIdCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/card/GiftCardByIdResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/card/GiftCardByIdResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 42
    const-class v0, Lcom/ibotta/api/model/card/GiftCard;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/card/GiftCardByIdCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/card/GiftCard;

    .line 44
    new-instance p2, Lcom/ibotta/api/call/card/GiftCardByIdResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/card/GiftCardByIdResponse;-><init>()V

    .line 45
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/card/GiftCardByIdResponse;->setGiftCard(Lcom/ibotta/api/model/card/GiftCard;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 37
    invoke-virtual {p0}, Lcom/ibotta/api/call/card/GiftCardByIdCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "gift_cards/%1$s.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/card/GiftCardByIdCall;->giftCardId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v0, v1, v2}, Lcom/ibotta/api/ApiFormatting;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCacheFamily()Ljava/lang/String;
    .locals 1

    const-string v0, "gift_cards"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/api/call/card/GiftCardByIdCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    invoke-virtual {p0}, Lcom/ibotta/api/call/card/GiftCardByIdCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    iget v1, p0, Lcom/ibotta/api/call/card/GiftCardByIdCall;->giftCardId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 32
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/card/GiftCardByIdResponse;",
            ">;"
        }
    .end annotation

    .line 27
    const-class v0, Lcom/ibotta/api/call/card/GiftCardByIdResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
