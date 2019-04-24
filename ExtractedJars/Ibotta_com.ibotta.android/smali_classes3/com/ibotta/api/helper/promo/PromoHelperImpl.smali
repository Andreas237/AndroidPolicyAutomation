.class public Lcom/ibotta/api/helper/promo/PromoHelperImpl;
.super Ljava/lang/Object;
.source "PromoHelperImpl.java"

# interfaces
.implements Lcom/ibotta/api/helper/promo/PromoHelper;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected findPromoById(Ljava/util/List;I)Lcom/ibotta/api/model/promo/Promo;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/promo/Promo;",
            ">;I)",
            "Lcom/ibotta/api/model/promo/Promo;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 33
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/promo/Promo;

    .line 34
    invoke-virtual {v1}, Lcom/ibotta/api/model/promo/Promo;->getId()I

    move-result v2

    if-ne v2, p2, :cond_1

    move-object v0, v1

    :cond_2
    return-object v0
.end method

.method public findPromoInOffersById(Ljava/util/List;I)Lcom/ibotta/api/model/promo/Promo;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Offer;",
            ">;I)",
            "Lcom/ibotta/api/model/promo/Promo;"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 22
    :cond_0
    invoke-virtual {p0, p1}, Lcom/ibotta/api/helper/promo/PromoHelperImpl;->findUniquePromos(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 23
    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/helper/promo/PromoHelperImpl;->findPromoById(Ljava/util/List;I)Lcom/ibotta/api/model/promo/Promo;

    move-result-object p1

    return-object p1
.end method

.method protected findUniquePromos(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Offer;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/promo/Promo;",
            ">;"
        }
    .end annotation

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-nez p1, :cond_0

    return-object v0

    .line 49
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 50
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/offer/Offer;

    .line 51
    invoke-virtual {v2}, Lcom/ibotta/api/model/offer/Offer;->getPromos()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 53
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/api/model/promo/Promo;

    .line 54
    invoke-virtual {v3}, Lcom/ibotta/api/model/promo/Promo;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 59
    :cond_2
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-object v0
.end method
