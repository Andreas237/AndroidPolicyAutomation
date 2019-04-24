.class public Lcom/ibotta/android/view/offer/gallery/classifier/OfferClassifierFactory;
.super Ljava/lang/Object;
.source "OfferClassifierFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lcom/ibotta/android/view/offer/category/OfferCategory;)Lcom/ibotta/android/view/offer/gallery/classifier/OfferClassifier;
    .locals 1

    if-nez p1, :cond_0

    .line 12
    new-instance p1, Lcom/ibotta/android/view/offer/gallery/classifier/NonNullOfferClassifier;

    invoke-direct {p1}, Lcom/ibotta/android/view/offer/gallery/classifier/NonNullOfferClassifier;-><init>()V

    return-object p1

    .line 17
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->isWhatsHot()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->isAll()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->isYouMightLike()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 20
    new-instance p1, Lcom/ibotta/android/view/offer/gallery/classifier/YouMightLikeOfferClassifier;

    invoke-direct {p1}, Lcom/ibotta/android/view/offer/gallery/classifier/YouMightLikeOfferClassifier;-><init>()V

    goto :goto_1

    .line 21
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->isWhatsNew()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 22
    new-instance p1, Lcom/ibotta/android/view/offer/gallery/classifier/NewOfferClassifier;

    invoke-direct {p1}, Lcom/ibotta/android/view/offer/gallery/classifier/NewOfferClassifier;-><init>()V

    goto :goto_1

    .line 24
    :cond_3
    new-instance v0, Lcom/ibotta/android/view/offer/gallery/classifier/CategoryOfferClassifier;

    invoke-direct {v0, p1}, Lcom/ibotta/android/view/offer/gallery/classifier/CategoryOfferClassifier;-><init>(Lcom/ibotta/android/view/offer/category/OfferCategory;)V

    move-object p1, v0

    goto :goto_1

    .line 18
    :cond_4
    :goto_0
    new-instance p1, Lcom/ibotta/android/view/offer/gallery/classifier/NonNullOfferClassifier;

    invoke-direct {p1}, Lcom/ibotta/android/view/offer/gallery/classifier/NonNullOfferClassifier;-><init>()V

    :goto_1
    return-object p1
.end method
