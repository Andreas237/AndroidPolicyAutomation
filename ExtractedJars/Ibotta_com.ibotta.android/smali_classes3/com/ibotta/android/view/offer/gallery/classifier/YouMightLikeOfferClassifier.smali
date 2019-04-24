.class public Lcom/ibotta/android/view/offer/gallery/classifier/YouMightLikeOfferClassifier;
.super Lcom/ibotta/android/view/offer/gallery/classifier/NonNullOfferClassifier;
.source "YouMightLikeOfferClassifier.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Lcom/ibotta/android/view/offer/gallery/classifier/NonNullOfferClassifier;-><init>()V

    return-void
.end method


# virtual methods
.method public matches(Lcom/ibotta/api/model/OfferModel;)Z
    .locals 1

    .line 12
    invoke-super {p0, p1}, Lcom/ibotta/android/view/offer/gallery/classifier/NonNullOfferClassifier;->matches(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getRecommendationScore()F

    move-result p1

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
