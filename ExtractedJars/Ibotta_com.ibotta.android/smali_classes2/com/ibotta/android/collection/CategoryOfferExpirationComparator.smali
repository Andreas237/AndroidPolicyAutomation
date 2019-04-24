.class public Lcom/ibotta/android/collection/CategoryOfferExpirationComparator;
.super Ljava/lang/Object;
.source "CategoryOfferExpirationComparator.java"

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

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/collection/CategoryOfferExpirationComparator;->retailerId:Ljava/lang/Integer;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/collection/CategoryOfferExpirationComparator;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/android/view/common/CategoryOfferPair;Lcom/ibotta/android/view/common/CategoryOfferPair;)I
    .locals 3

    .line 28
    invoke-virtual {p1}, Lcom/ibotta/android/view/common/CategoryOfferPair;->getCategory()Lcom/ibotta/api/model/offer/Category;

    move-result-object v0

    .line 29
    invoke-virtual {p2}, Lcom/ibotta/android/view/common/CategoryOfferPair;->getCategory()Lcom/ibotta/api/model/offer/Category;

    move-result-object v1

    .line 30
    invoke-virtual {p1}, Lcom/ibotta/android/view/common/CategoryOfferPair;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object p1

    .line 31
    invoke-virtual {p2}, Lcom/ibotta/android/view/common/CategoryOfferPair;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object p2

    .line 33
    invoke-virtual {v0}, Lcom/ibotta/api/model/offer/Category;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/ibotta/api/model/offer/Category;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    .line 36
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getExpiration()Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getExpiration()Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 37
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getExpiration()Ljava/util/Date;

    move-result-object v0

    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getExpiration()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v0

    :cond_0
    if-nez v0, :cond_1

    .line 42
    new-instance v0, Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;

    iget-object v1, p0, Lcom/ibotta/android/collection/CategoryOfferExpirationComparator;->retailerId:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/ibotta/android/collection/CategoryOfferExpirationComparator;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;-><init>(Ljava/lang/Integer;Lcom/ibotta/api/helper/offer/OfferHelper;)V

    .line 44
    invoke-virtual {v0, p1, p2}, Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;->compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I

    move-result v0

    :cond_1
    if-nez v0, :cond_2

    .line 49
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result p1

    mul-int/lit8 v0, p1, -0x1

    :cond_2
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 17
    check-cast p1, Lcom/ibotta/android/view/common/CategoryOfferPair;

    check-cast p2, Lcom/ibotta/android/view/common/CategoryOfferPair;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/CategoryOfferExpirationComparator;->compare(Lcom/ibotta/android/view/common/CategoryOfferPair;Lcom/ibotta/android/view/common/CategoryOfferPair;)I

    move-result p1

    return p1
.end method
