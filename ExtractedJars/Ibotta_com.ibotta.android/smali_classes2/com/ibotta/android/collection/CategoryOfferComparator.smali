.class public Lcom/ibotta/android/collection/CategoryOfferComparator;
.super Ljava/lang/Object;
.source "CategoryOfferComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/android/view/common/CategoryOfferPair;",
        ">;"
    }
.end annotation


# instance fields
.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private final retailerId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Lcom/ibotta/api/helper/offer/OfferHelper;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/collection/CategoryOfferComparator;->retailerId:Ljava/lang/Integer;

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/collection/CategoryOfferComparator;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/android/view/common/CategoryOfferPair;Lcom/ibotta/android/view/common/CategoryOfferPair;)I
    .locals 4

    .line 25
    invoke-virtual {p1}, Lcom/ibotta/android/view/common/CategoryOfferPair;->getCategory()Lcom/ibotta/api/model/offer/Category;

    move-result-object v0

    .line 26
    invoke-virtual {p2}, Lcom/ibotta/android/view/common/CategoryOfferPair;->getCategory()Lcom/ibotta/api/model/offer/Category;

    move-result-object v1

    .line 27
    invoke-virtual {p1}, Lcom/ibotta/android/view/common/CategoryOfferPair;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object p1

    .line 28
    invoke-virtual {p2}, Lcom/ibotta/android/view/common/CategoryOfferPair;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object p2

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    .line 33
    invoke-virtual {v0}, Lcom/ibotta/api/model/offer/Category;->getSortData()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/ibotta/api/model/offer/Category;->getSortData()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    .line 38
    invoke-virtual {v0}, Lcom/ibotta/api/model/offer/Category;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/ibotta/api/model/offer/Category;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    :cond_1
    if-nez v2, :cond_2

    .line 43
    new-instance v0, Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;

    iget-object v1, p0, Lcom/ibotta/android/collection/CategoryOfferComparator;->retailerId:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/ibotta/android/collection/CategoryOfferComparator;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;-><init>(Ljava/lang/Integer;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    .line 45
    invoke-virtual {v0, p1, p2}, Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;->compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I

    move-result v2

    :cond_2
    return v2
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/view/common/CategoryOfferPair;

    check-cast p2, Lcom/ibotta/android/view/common/CategoryOfferPair;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/CategoryOfferComparator;->compare(Lcom/ibotta/android/view/common/CategoryOfferPair;Lcom/ibotta/android/view/common/CategoryOfferPair;)I

    move-result p1

    return p1
.end method
