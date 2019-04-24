.class public Lcom/ibotta/api/model/offer/SortOrderOfferComparator;
.super Ljava/lang/Object;
.source "SortOrderOfferComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/api/model/OfferModel;",
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
.method public compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-nez p1, :cond_1

    return v1

    :cond_1
    const/4 v2, -0x1

    if-nez p2, :cond_2

    return v2

    .line 23
    :cond_2
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getSortOrder()Ljava/lang/String;

    move-result-object v3

    .line 24
    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getSortOrder()Ljava/lang/String;

    move-result-object v4

    if-eqz v3, :cond_3

    if-eqz v4, :cond_3

    .line 27
    invoke-virtual {v3, v4}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_4

    const/4 v0, -0x1

    goto :goto_0

    :cond_4
    if-eqz v4, :cond_5

    const/4 v0, 0x1

    :cond_5
    :goto_0
    if-nez v0, :cond_6

    .line 36
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2}, Lcom/ibotta/api/model/OfferModel;->getId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result p1

    mul-int/lit8 v0, p1, -0x1

    :cond_6
    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/api/model/OfferModel;

    check-cast p2, Lcom/ibotta/api/model/OfferModel;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/api/model/offer/SortOrderOfferComparator;->compare(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/OfferModel;)I

    move-result p1

    return p1
.end method
