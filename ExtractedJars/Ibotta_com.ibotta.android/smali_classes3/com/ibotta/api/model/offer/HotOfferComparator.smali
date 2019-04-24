.class public Lcom/ibotta/api/model/offer/HotOfferComparator;
.super Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;
.source "HotOfferComparator.java"


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Lcom/ibotta/api/helper/offer/OfferHelper;)V
    .locals 0

    .line 11
    invoke-direct {p0, p1, p2}, Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;-><init>(Ljava/lang/Integer;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I
    .locals 5

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

    .line 26
    :cond_2
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getHotness()Ljava/lang/Float;

    move-result-object v3

    .line 27
    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getHotness()Ljava/lang/Float;

    move-result-object v4

    if-eqz v3, :cond_3

    if-eqz v4, :cond_3

    .line 30
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

    .line 39
    invoke-super {p0, p1, p2}, Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;->compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I

    move-result v0

    :cond_6
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 9
    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    check-cast p2, Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/model/offer/HotOfferComparator;->compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I

    move-result p1

    return p1
.end method
