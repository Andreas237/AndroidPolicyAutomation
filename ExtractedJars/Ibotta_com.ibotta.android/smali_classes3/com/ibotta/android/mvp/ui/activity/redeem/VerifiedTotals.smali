.class public Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;
.super Ljava/lang/Object;
.source "VerifiedTotals.java"


# instance fields
.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private verifiedAmount:F

.field private verifiedCount:I


# direct methods
.method public constructor <init>(Lcom/ibotta/api/helper/offer/OfferHelper;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    return-void
.end method


# virtual methods
.method public getVerifiedAmount()F
    .locals 1

    .line 25
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;->verifiedAmount:F

    return v0
.end method

.method public getVerifiedCount()I
    .locals 1

    .line 29
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;->verifiedCount:I

    return v0
.end method

.method public setVerifiedTotals(Ljava/util/List;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/OfferVerification;",
            ">;",
            "Lcom/ibotta/android/fragment/retailer/RetailerParcel;",
            ")V"
        }
    .end annotation

    .line 33
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/verification/OfferVerification;

    if-nez v0, :cond_1

    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {v0}, Lcom/ibotta/android/verification/OfferVerification;->getOfferModel()Lcom/ibotta/api/model/OfferModel;

    move-result-object v1

    .line 39
    invoke-virtual {p2}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getId()I

    move-result v2

    .line 41
    invoke-virtual {v0, p2}, Lcom/ibotta/android/verification/OfferVerification;->isVerified(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 42
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v1, v2}, Lcom/ibotta/api/helper/offer/OfferHelper;->getUnlockedTotal(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Integer;)F

    move-result v1

    .line 45
    invoke-virtual {v0}, Lcom/ibotta/android/verification/OfferVerification;->getQuantity()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_2

    .line 46
    invoke-virtual {v0}, Lcom/ibotta/android/verification/OfferVerification;->getQuantity()I

    move-result v2

    int-to-float v2, v2

    mul-float v1, v1, v2

    .line 47
    invoke-virtual {v0}, Lcom/ibotta/android/verification/OfferVerification;->getQuantity()I

    move-result v0

    mul-int/lit8 v3, v0, 0x1

    .line 50
    :cond_2
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;->verifiedAmount:F

    add-float/2addr v0, v1

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;->verifiedAmount:F

    .line 51
    iget v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;->verifiedCount:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/VerifiedTotals;->verifiedCount:I

    goto :goto_0

    :cond_3
    return-void
.end method
