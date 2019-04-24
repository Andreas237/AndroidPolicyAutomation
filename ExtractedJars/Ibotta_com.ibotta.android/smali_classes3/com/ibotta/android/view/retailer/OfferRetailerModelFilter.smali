.class public Lcom/ibotta/android/view/retailer/OfferRetailerModelFilter;
.super Ljava/lang/Object;
.source "OfferRetailerModelFilter.java"

# interfaces
.implements Lcom/ibotta/android/view/retailer/RetailerModelFilter;


# instance fields
.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private final offerModel:Lcom/ibotta/api/model/OfferModel;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/view/retailer/OfferRetailerModelFilter;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/view/retailer/OfferRetailerModelFilter;->offerModel:Lcom/ibotta/api/model/OfferModel;

    return-void
.end method


# virtual methods
.method public filter(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 27
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/RetailerModel;

    .line 30
    iget-object v1, p0, Lcom/ibotta/android/view/retailer/OfferRetailerModelFilter;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v2, p0, Lcom/ibotta/android/view/retailer/OfferRetailerModelFilter;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v0

    invoke-interface {v1, v2, v0}, Lcom/ibotta/api/helper/offer/OfferHelper;->isAvailableAt(Lcom/ibotta/api/model/OfferModel;I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method
