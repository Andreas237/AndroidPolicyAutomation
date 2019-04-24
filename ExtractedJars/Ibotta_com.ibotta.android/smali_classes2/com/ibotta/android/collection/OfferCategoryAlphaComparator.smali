.class public Lcom/ibotta/android/collection/OfferCategoryAlphaComparator;
.super Ljava/lang/Object;
.source "OfferCategoryAlphaComparator.java"

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
    .locals 1

    .line 16
    invoke-virtual {p1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->isAll()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lcom/ibotta/android/view/offer/category/OfferCategory;->isAll()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/ibotta/android/view/offer/category/OfferCategory;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    goto :goto_1

    .line 17
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->isAll()Z

    move-result v0

    invoke-virtual {p2}, Lcom/ibotta/android/view/offer/category/OfferCategory;->isAll()Z

    move-result p2

    if-ne v0, p2, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    .line 20
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/view/offer/category/OfferCategory;->isAll()Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, -0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/android/view/offer/category/OfferCategory;

    check-cast p2, Lcom/ibotta/android/view/offer/category/OfferCategory;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/OfferCategoryAlphaComparator;->compare(Lcom/ibotta/android/view/offer/category/OfferCategory;Lcom/ibotta/android/view/offer/category/OfferCategory;)I

    move-result p1

    return p1
.end method
