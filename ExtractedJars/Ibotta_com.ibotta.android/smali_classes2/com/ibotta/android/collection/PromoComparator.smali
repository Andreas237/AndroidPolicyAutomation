.class public Lcom/ibotta/android/collection/PromoComparator;
.super Ljava/lang/Object;
.source "PromoComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/api/model/promo/Promo;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/promo/Promo;Lcom/ibotta/api/model/promo/Promo;)I
    .locals 3

    const/4 v0, -0x1

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    if-nez p2, :cond_2

    goto :goto_0

    .line 23
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/api/model/promo/Promo;->getSortOrder()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p2}, Lcom/ibotta/api/model/promo/Promo;->getSortOrder()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Float;->compareTo(Ljava/lang/Float;)I

    move-result v1

    mul-int/lit8 v1, v1, -0x1

    if-nez v1, :cond_3

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/api/model/promo/Promo;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p2}, Lcom/ibotta/api/model/promo/Promo;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result p1

    mul-int/lit8 v0, p1, -0x1

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 12
    check-cast p1, Lcom/ibotta/api/model/promo/Promo;

    check-cast p2, Lcom/ibotta/api/model/promo/Promo;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/PromoComparator;->compare(Lcom/ibotta/api/model/promo/Promo;Lcom/ibotta/api/model/promo/Promo;)I

    move-result p1

    return p1
.end method
