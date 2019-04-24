.class public Lcom/ibotta/android/collection/GiftCardComparator;
.super Ljava/lang/Object;
.source "GiftCardComparator.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/ibotta/api/model/card/GiftCard;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/ibotta/api/model/card/GiftCard;Lcom/ibotta/api/model/card/GiftCard;)I
    .locals 3

    .line 18
    invoke-virtual {p1}, Lcom/ibotta/api/model/card/GiftCard;->getSortOrder()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, -0x1

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p2}, Lcom/ibotta/api/model/card/GiftCard;->getSortOrder()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/api/model/card/GiftCard;->getSortOrder()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p2}, Lcom/ibotta/api/model/card/GiftCard;->getSortOrder()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v1, 0x0

    goto :goto_0

    .line 25
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/api/model/card/GiftCard;->getSortOrder()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p2}, Lcom/ibotta/api/model/card/GiftCard;->getSortOrder()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    mul-int/lit8 v1, v0, -0x1

    :goto_0
    if-nez v1, :cond_3

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/api/model/card/GiftCard;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/ibotta/api/model/card/GiftCard;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v1

    :cond_3
    return v1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/api/model/card/GiftCard;

    check-cast p2, Lcom/ibotta/api/model/card/GiftCard;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/android/collection/GiftCardComparator;->compare(Lcom/ibotta/api/model/card/GiftCard;Lcom/ibotta/api/model/card/GiftCard;)I

    move-result p1

    return p1
.end method
