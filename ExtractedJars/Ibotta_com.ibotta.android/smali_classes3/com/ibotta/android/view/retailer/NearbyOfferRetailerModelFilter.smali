.class public Lcom/ibotta/android/view/retailer/NearbyOfferRetailerModelFilter;
.super Ljava/lang/Object;
.source "NearbyOfferRetailerModelFilter.java"

# interfaces
.implements Lcom/ibotta/android/view/retailer/RetailerModelFilter;


# instance fields
.field private nearbyFilter:Lcom/ibotta/android/view/retailer/NearbyRetailerModelFilter;

.field private offerFilter:Lcom/ibotta/android/view/retailer/OfferRetailerModelFilter;


# direct methods
.method public constructor <init>(Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/model/OfferModel;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Lcom/ibotta/android/view/retailer/NearbyRetailerModelFilter;

    invoke-direct {v0}, Lcom/ibotta/android/view/retailer/NearbyRetailerModelFilter;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/view/retailer/NearbyOfferRetailerModelFilter;->nearbyFilter:Lcom/ibotta/android/view/retailer/NearbyRetailerModelFilter;

    .line 19
    new-instance v0, Lcom/ibotta/android/view/retailer/OfferRetailerModelFilter;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/view/retailer/OfferRetailerModelFilter;-><init>(Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/model/OfferModel;)V

    iput-object v0, p0, Lcom/ibotta/android/view/retailer/NearbyOfferRetailerModelFilter;->offerFilter:Lcom/ibotta/android/view/retailer/OfferRetailerModelFilter;

    return-void
.end method


# virtual methods
.method public filter(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/view/retailer/NearbyOfferRetailerModelFilter;->nearbyFilter:Lcom/ibotta/android/view/retailer/NearbyRetailerModelFilter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/retailer/NearbyRetailerModelFilter;->filter(Ljava/util/List;)V

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/view/retailer/NearbyOfferRetailerModelFilter;->offerFilter:Lcom/ibotta/android/view/retailer/OfferRetailerModelFilter;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/view/retailer/OfferRetailerModelFilter;->filter(Ljava/util/List;)V

    return-void
.end method
