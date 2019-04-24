.class public Lcom/ibotta/android/view/retailer/UnlockedRetailerModelFilter;
.super Ljava/lang/Object;
.source "UnlockedRetailerModelFilter.java"

# interfaces
.implements Lcom/ibotta/android/view/retailer/RetailerModelFilter;


# instance fields
.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private final offerModels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/api/helper/offer/OfferHelper;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/helper/offer/OfferHelper;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/OfferModel;",
            ">;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/view/retailer/UnlockedRetailerModelFilter;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/view/retailer/UnlockedRetailerModelFilter;->offerModels:Ljava/util/List;

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
    iget-object v0, p0, Lcom/ibotta/android/view/retailer/UnlockedRetailerModelFilter;->offerModels:Ljava/util/List;

    if-nez v0, :cond_0

    return-void

    .line 29
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 31
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/RetailerModel;

    .line 34
    iget-object v1, p0, Lcom/ibotta/android/view/retailer/UnlockedRetailerModelFilter;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v2, p0, Lcom/ibotta/android/view/retailer/UnlockedRetailerModelFilter;->offerModels:Ljava/util/List;

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v0

    invoke-interface {v1, v2, v0}, Lcom/ibotta/api/helper/offer/OfferHelper;->isAtLeastOneOfferUnlocked(Ljava/util/List;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 35
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    return-void
.end method
