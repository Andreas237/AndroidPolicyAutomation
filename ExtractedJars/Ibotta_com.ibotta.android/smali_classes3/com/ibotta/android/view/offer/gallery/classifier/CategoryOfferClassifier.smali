.class public Lcom/ibotta/android/view/offer/gallery/classifier/CategoryOfferClassifier;
.super Ljava/lang/Object;
.source "CategoryOfferClassifier.java"

# interfaces
.implements Lcom/ibotta/android/view/offer/gallery/classifier/OfferClassifier;


# instance fields
.field private final offerCategory:Lcom/ibotta/android/view/offer/category/OfferCategory;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/view/offer/category/OfferCategory;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/ibotta/android/view/offer/gallery/classifier/CategoryOfferClassifier;->offerCategory:Lcom/ibotta/android/view/offer/category/OfferCategory;

    return-void
.end method


# virtual methods
.method public matches(Lcom/ibotta/api/model/OfferModel;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 23
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getCategories()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/ibotta/android/view/offer/gallery/classifier/CategoryOfferClassifier;->offerCategory:Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-static {v0}, Lcom/ibotta/android/view/offer/category/OfferCategory;->toCategory(Lcom/ibotta/android/view/offer/category/OfferCategory;)Lcom/ibotta/api/model/offer/Category;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
