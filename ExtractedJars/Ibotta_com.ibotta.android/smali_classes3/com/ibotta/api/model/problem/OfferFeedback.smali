.class public Lcom/ibotta/api/model/problem/OfferFeedback;
.super Ljava/lang/Object;
.source "OfferFeedback.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/ibotta/api/model/problem/OfferFeedback;",
        ">;"
    }
.end annotation


# instance fields
.field private displayOrder:I

.field private id:I

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compareTo(Lcom/ibotta/api/model/problem/OfferFeedback;)I
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 41
    :cond_0
    iget v0, p0, Lcom/ibotta/api/model/problem/OfferFeedback;->displayOrder:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/api/model/problem/OfferFeedback;->getDisplayOrder()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    if-nez v0, :cond_1

    .line 45
    iget v0, p0, Lcom/ibotta/api/model/problem/OfferFeedback;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/api/model/problem/OfferFeedback;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result v0

    :cond_1
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 7
    check-cast p1, Lcom/ibotta/api/model/problem/OfferFeedback;

    invoke-virtual {p0, p1}, Lcom/ibotta/api/model/problem/OfferFeedback;->compareTo(Lcom/ibotta/api/model/problem/OfferFeedback;)I

    move-result p1

    return p1
.end method

.method public getDisplayOrder()I
    .locals 1

    .line 29
    iget v0, p0, Lcom/ibotta/api/model/problem/OfferFeedback;->displayOrder:I

    return v0
.end method

.method public getId()I
    .locals 1

    .line 13
    iget v0, p0, Lcom/ibotta/api/model/problem/OfferFeedback;->id:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/api/model/problem/OfferFeedback;->name:Ljava/lang/String;

    return-object v0
.end method

.method public setDisplayOrder(I)V
    .locals 0

    .line 33
    iput p1, p0, Lcom/ibotta/api/model/problem/OfferFeedback;->displayOrder:I

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 17
    iput p1, p0, Lcom/ibotta/api/model/problem/OfferFeedback;->id:I

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/ibotta/api/model/problem/OfferFeedback;->name:Ljava/lang/String;

    return-void
.end method
