.class public Lcom/ibotta/api/model/offer/RetailerHotnessOfferComparator;
.super Lcom/ibotta/api/model/offer/HotOfferComparator;
.source "RetailerHotnessOfferComparator.java"


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Lcom/ibotta/api/helper/offer/OfferHelper;)V
    .locals 0

    .line 14
    invoke-direct {p0, p1, p2}, Lcom/ibotta/api/model/offer/HotOfferComparator;-><init>(Ljava/lang/Integer;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-nez p1, :cond_1

    return v1

    :cond_1
    const/4 v2, -0x1

    if-nez p2, :cond_2

    return v2

    .line 31
    :cond_2
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getContextSortData()Lcom/ibotta/api/model/offer/ContextSortData;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/api/model/offer/ContextSortData;->getRetailerHotness()Ljava/util/Map;

    move-result-object v3

    iget-object v4, p0, Lcom/ibotta/api/model/offer/RetailerHotnessOfferComparator;->retailerId:Ljava/lang/Integer;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    .line 32
    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getContextSortData()Lcom/ibotta/api/model/offer/ContextSortData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/ibotta/api/model/offer/ContextSortData;->getRetailerHotness()Ljava/util/Map;

    move-result-object v4

    iget-object v5, p0, Lcom/ibotta/api/model/offer/RetailerHotnessOfferComparator;->retailerId:Ljava/lang/Integer;

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    if-eqz v3, :cond_3

    if-eqz v4, :cond_3

    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/Float;->compareTo(Ljava/lang/Float;)I

    move-result v0

    mul-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_4

    const/4 v0, -0x1

    goto :goto_0

    :cond_4
    if-eqz v4, :cond_5

    const/4 v0, 0x1

    :cond_5
    :goto_0
    if-nez v0, :cond_6

    .line 44
    invoke-super {p0, p1, p2}, Lcom/ibotta/api/model/offer/HotOfferComparator;->compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I

    move-result v0

    :cond_6
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    check-cast p2, Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/model/offer/RetailerHotnessOfferComparator;->compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I

    move-result p1

    return p1
.end method
