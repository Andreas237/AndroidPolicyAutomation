.class public Lcom/ibotta/android/collection/OfferCategoryComparator;
.super Ljava/lang/Object;
.source "OfferCategoryComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/android/view/offer/category/OfferCategory;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/android/view/offer/category/OfferCategory;Lcom/ibotta/android/view/offer/category/OfferCategory;)I
    .locals 0

    .line 14
    invoke-static {p1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->toCategory(Lcom/ibotta/android/view/offer/category/OfferCategory;)Lcom/ibotta/api/model/offer/Category;

    move-result-object p1

    invoke-static {p2}, Lcom/ibotta/android/view/offer/category/OfferCategory;->toCategory(Lcom/ibotta/android/view/offer/category/OfferCategory;)Lcom/ibotta/api/model/offer/Category;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/ibotta/api/model/offer/Category;->compareTo(Lcom/ibotta/api/model/offer/Category;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/android/view/offer/category/OfferCategory;

    check-cast p2, Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/OfferCategoryComparator;->compare(Lcom/ibotta/android/view/offer/category/OfferCategory;Lcom/ibotta/android/view/offer/category/OfferCategory;)I

    move-result p1

    return p1
.end method
