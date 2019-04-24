.class public Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "BuyableGiftCardEarningByIdCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse;",
        ">;"
    }
.end annotation


# static fields
.field private static final API_FUNCTION:Ljava/lang/String; = "customers/%1$d/buyable_gift_cards/%2$d.json"

.field private static final CACHE_FAMILY:Ljava/lang/String; = "bgc_earnings"


# instance fields
.field private final customerId:I

.field private final earningId:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    .line 21
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    const/4 v0, 0x1

    .line 22
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;->setRequiresAuthToken(Z)V

    .line 23
    iput p1, p0, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;->customerId:I

    .line 24
    iput p2, p0, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;->earningId:I

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

    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 44
    const-class v0, Lcom/ibotta/api/model/earnings/Earning;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/model/earnings/Earning;

    .line 46
    invoke-static {}, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse;->builder()Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse$Builder;

    move-result-object p2

    .line 47
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse$Builder;->earning(Lcom/ibotta/api/model/earnings/Earning;)Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse$Builder;

    move-result-object p1

    .line 48
    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse$Builder;->build()Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse;

    move-result-object p1

    return-object p1
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/buyable_gift_cards/%2$d.json"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;->customerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;->earningId:I

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

    const-string v0, "bgc_earnings"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    invoke-virtual {p0}, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    iget v1, p0, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;->customerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    iget v1, p0, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdCall;->earningId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 34
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse;",
            ">;"
        }
    .end annotation

    .line 29
    const-class v0, Lcom/ibotta/api/call/customer/earnings/BuyableGiftCardEarningByIdResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
