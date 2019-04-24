.class public Lcom/ibotta/android/verification/OfferQuantity;
.super Ljava/lang/Object;
.source "OfferQuantity.java"


# instance fields
.field private offerId:I

.field private quantity:I

.field private saveTime:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getOfferId()I
    .locals 1

    .line 13
    iget v0, p0, Lcom/ibotta/android/verification/OfferQuantity;->offerId:I

    return v0
.end method

.method public getQuantity()I
    .locals 1

    .line 21
    iget v0, p0, Lcom/ibotta/android/verification/OfferQuantity;->quantity:I

    return v0
.end method

.method public getSaveTime()J
    .locals 2

    .line 29
    iget-wide v0, p0, Lcom/ibotta/android/verification/OfferQuantity;->saveTime:J

    return-wide v0
.end method

.method public setOfferId(I)V
    .locals 0

    .line 17
    iput p1, p0, Lcom/ibotta/android/verification/OfferQuantity;->offerId:I

    return-void
.end method

.method public setQuantity(I)V
    .locals 0

    .line 25
    iput p1, p0, Lcom/ibotta/android/verification/OfferQuantity;->quantity:I

    return-void
.end method

.method public setSaveTime(J)V
    .locals 0

    .line 33
    iput-wide p1, p0, Lcom/ibotta/android/verification/OfferQuantity;->saveTime:J

    return-void
.end method
