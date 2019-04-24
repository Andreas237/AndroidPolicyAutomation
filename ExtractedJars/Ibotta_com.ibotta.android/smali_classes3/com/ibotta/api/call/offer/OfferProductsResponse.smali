.class public Lcom/ibotta/api/call/offer/OfferProductsResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "OfferProductsResponse.java"


# instance fields
.field private offerProducts:Ljava/util/Map;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "offers"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/offer/OfferProducts;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    .line 11
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/offer/OfferProductsResponse;->offerProducts:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 27
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 28
    instance-of v0, p1, Lcom/ibotta/api/call/offer/OfferProductsResponse;

    if-eqz v0, :cond_1

    .line 29
    check-cast p1, Lcom/ibotta/api/call/offer/OfferProductsResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/offer/OfferProductsResponse;->offerProducts:Ljava/util/Map;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/offer/OfferProductsResponse;->setOfferProducts(Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method public getOfferProducts()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/offer/OfferProducts;",
            ">;"
        }
    .end annotation

    .line 15
    iget-object v0, p0, Lcom/ibotta/api/call/offer/OfferProductsResponse;->offerProducts:Ljava/util/Map;

    return-object v0
.end method

.method public setOfferProducts(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/offer/OfferProducts;",
            ">;)V"
        }
    .end annotation

    .line 19
    iput-object p1, p0, Lcom/ibotta/api/call/offer/OfferProductsResponse;->offerProducts:Ljava/util/Map;

    return-void
.end method
