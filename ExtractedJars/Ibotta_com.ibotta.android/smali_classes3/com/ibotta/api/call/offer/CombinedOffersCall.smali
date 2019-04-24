.class public Lcom/ibotta/api/call/offer/CombinedOffersCall;
.super Lcom/ibotta/api/BaseCacheableApiCall;
.source "CombinedOffersCall.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/api/BaseCacheableApiCall<",
        "Lcom/ibotta/api/call/offer/CombinedOffersResponse;",
        ">;"
    }
.end annotation


# static fields
.field public static final API_FUNCTION:Ljava/lang/String; = "customers/%1$d/offers.json"


# instance fields
.field private customerId:I

.field private nearZip:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 23
    invoke-direct {p0, p1, v0}, Lcom/ibotta/api/call/offer/CombinedOffersCall;-><init>(ILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/ibotta/api/BaseCacheableApiCall;-><init>()V

    const/4 v0, 0x1

    .line 27
    invoke-virtual {p0, v0}, Lcom/ibotta/api/call/offer/CombinedOffersCall;->setRequiresAuthToken(Z)V

    .line 28
    iput p1, p0, Lcom/ibotta/api/call/offer/CombinedOffersCall;->customerId:I

    .line 29
    iput-object p2, p0, Lcom/ibotta/api/call/offer/CombinedOffersCall;->nearZip:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public buildParams()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 53
    invoke-super {p0}, Lcom/ibotta/api/BaseCacheableApiCall;->buildParams()V

    .line 55
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CombinedOffersCall;->nearZip:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CombinedOffersCall;->params:Ljava/util/Map;

    const-string v1, "near_zip"

    iget-object v2, p0, Lcom/ibotta/api/call/offer/CombinedOffersCall;->nearZip:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    :cond_0
    sget-object v0, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v0}, Lcom/ibotta/api/ApiContext;->getOfferRecommScoreName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 60
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CombinedOffersCall;->params:Ljava/util/Map;

    const-string v1, "sort_param"

    sget-object v2, Lcom/ibotta/api/ApiContext;->INSTANCE:Lcom/ibotta/api/ApiContext;

    invoke-virtual {v2}, Lcom/ibotta/api/ApiContext;->getOfferRecommScoreName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    :cond_1
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CombinedOffersCall;->params:Ljava/util/Map;

    const-string v1, "combined"

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/ApiResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/call/offer/CombinedOffersCall;->buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/CombinedOffersResponse;

    move-result-object p1

    return-object p1
.end method

.method public buildResponse(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;)Lcom/ibotta/api/call/offer/CombinedOffersResponse;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 67
    const-class v0, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-static {p1, p2, v0}, Lcom/ibotta/api/call/offer/CombinedOffersCall;->fromJson(Lcom/ibotta/android/json/IbottaJson;Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/fasterxml/jackson/databind/JsonNode;

    .line 69
    new-instance p2, Lcom/ibotta/api/call/offer/CombinedOffersResponse;

    invoke-direct {p2}, Lcom/ibotta/api/call/offer/CombinedOffersResponse;-><init>()V

    const-string v0, "categories"

    .line 70
    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "categories"

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/NullNode;->getInstance()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object v0

    :goto_0
    const-string v1, "promos"

    .line 71
    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "promos"

    invoke-virtual {p1, v1}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/NullNode;->getInstance()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object v1

    :goto_1
    const-string v2, "customer_offers"

    .line 72
    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "customer_offers"

    .line 73
    invoke-virtual {p1, v2}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v2

    goto :goto_2

    :cond_2
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/NullNode;->getInstance()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object v2

    :goto_2
    const-string v3, "offers"

    .line 74
    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "offers"

    invoke-virtual {p1, v3}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object v3

    goto :goto_3

    :cond_3
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/NullNode;->getInstance()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object v3

    :goto_3
    const-string v4, "category_settings"

    .line 75
    invoke-virtual {p1, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    const-string v4, "category_settings"

    .line 76
    invoke-virtual {p1, v4}, Lcom/fasterxml/jackson/databind/JsonNode;->get(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;

    move-result-object p1

    goto :goto_4

    :cond_4
    invoke-static {}, Lcom/fasterxml/jackson/databind/node/NullNode;->getInstance()Lcom/fasterxml/jackson/databind/node/NullNode;

    move-result-object p1

    .line 78
    :goto_4
    invoke-virtual {p2, v0}, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->setCategories(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 79
    invoke-virtual {p2, v1}, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->setPromos(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 80
    invoke-virtual {p2, v2}, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->setCustomerOffers(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 81
    invoke-virtual {p2, v3}, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->setOffers(Lcom/fasterxml/jackson/databind/JsonNode;)V

    .line 82
    invoke-virtual {p2, p1}, Lcom/ibotta/api/call/offer/CombinedOffersResponse;->setCategorySettings(Lcom/fasterxml/jackson/databind/JsonNode;)V

    return-object p2
.end method

.method public getApiFunction()Ljava/lang/String;
    .locals 5

    .line 48
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CombinedOffersCall;->getFormatting()Lcom/ibotta/api/ApiFormatting;

    move-result-object v0

    const-string v1, "customers/%1$d/offers.json"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/call/offer/CombinedOffersCall;->customerId:I

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

    const-string v0, "combined_offers"

    return-object v0
.end method

.method public getCacheKey()Ljava/lang/String;
    .locals 2

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CombinedOffersCall;->getApiFunction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    invoke-virtual {p0}, Lcom/ibotta/api/call/offer/CombinedOffersCall;->getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    invoke-static {v0}, Lcom/ibotta/api/CacheKeyHelper;->buildCacheKey(Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getHttpMethod()Lcom/ibotta/api/ApiCall$HttpMethod;
    .locals 1

    .line 43
    sget-object v0, Lcom/ibotta/api/ApiCall$HttpMethod;->GET:Lcom/ibotta/api/ApiCall$HttpMethod;

    return-object v0
.end method

.method public getResponseType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/ibotta/api/call/offer/CombinedOffersResponse;",
            ">;"
        }
    .end annotation

    .line 38
    const-class v0, Lcom/ibotta/api/call/offer/CombinedOffersResponse;

    return-object v0
.end method

.method public isInvalidatesCacheFamily()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public setNearZip(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CombinedOffersCall;->nearZip:Ljava/lang/String;

    return-void
.end method
