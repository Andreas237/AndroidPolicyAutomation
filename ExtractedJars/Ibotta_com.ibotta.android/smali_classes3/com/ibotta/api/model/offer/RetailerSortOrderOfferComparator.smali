.class public Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;
.super Lcom/ibotta/api/model/offer/SortOrderOfferComparator;
.source "RetailerSortOrderOfferComparator.java"


# instance fields
.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field protected final retailerId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Lcom/ibotta/api/helper/offer/OfferHelper;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/api/model/offer/SortOrderOfferComparator;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;->retailerId:Ljava/lang/Integer;

    .line 19
    iput-object p2, p0, Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

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

    .line 32
    :cond_2
    iget-object v3, p0, Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v4, p0, Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;->retailerId:Ljava/lang/Integer;

    invoke-interface {v3, p1, v4}, Lcom/ibotta/api/helper/offer/OfferHelper;->getOfferSortDataForRetailer(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object v3

    .line 33
    iget-object v4, p0, Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v5, p0, Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;->retailerId:Ljava/lang/Integer;

    invoke-interface {v4, p2, v5}, Lcom/ibotta/api/helper/offer/OfferHelper;->getOfferSortDataForRetailer(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object v4

    if-eqz v3, :cond_3

    if-eqz v4, :cond_3

    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_4

    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    if-eqz v4, :cond_5

    const/4 v0, -0x1

    :cond_5
    :goto_0
    if-nez v0, :cond_6

    .line 46
    invoke-super {p0, p1, p2}, Lcom/ibotta/api/model/offer/SortOrderOfferComparator;->compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I

    move-result v0

    :cond_6
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    check-cast p2, Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/model/offer/RetailerSortOrderOfferComparator;->compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I

    move-result p1

    return p1
.end method
