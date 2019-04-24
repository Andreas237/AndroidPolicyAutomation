.class public Lcom/ibotta/api/call/customer/CustomerOfferCategoriesResponse;
.super Lcom/ibotta/api/CacheableApiResponse;
.source "CustomerOfferCategoriesResponse.java"


# instance fields
.field private customerOfferCategoriesMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/customer/CustomerOfferCategory;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Lcom/ibotta/api/CacheableApiResponse;-><init>()V

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesResponse;->customerOfferCategoriesMap:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public copy(Lcom/ibotta/api/CacheableApiResponse;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 31
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/api/CacheableApiResponse;->copy(Lcom/ibotta/api/CacheableApiResponse;)V

    .line 32
    instance-of v0, p1, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesResponse;

    if-eqz v0, :cond_1

    .line 33
    check-cast p1, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesResponse;

    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesResponse;->customerOfferCategoriesMap:Ljava/util/Map;

    invoke-virtual {p1, v0}, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesResponse;->setCustomerOfferCategoriesMap(Ljava/util/Map;)V

    :cond_1
    return-void
.end method

.method public getCustomerOfferCategoriesMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/customer/CustomerOfferCategory;",
            ">;>;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesResponse;->customerOfferCategoriesMap:Ljava/util/Map;

    return-object v0
.end method

.method public setCustomerOfferCategoriesMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/customer/CustomerOfferCategory;",
            ">;>;)V"
        }
    .end annotation

    .line 23
    iput-object p1, p0, Lcom/ibotta/api/call/customer/CustomerOfferCategoriesResponse;->customerOfferCategoriesMap:Ljava/util/Map;

    return-void
.end method
