.class public Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;
.super Ljava/lang/Object;
.source "LaunchInfoOffer.java"


# instance fields
.field private offerId:I

.field private value:F


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

    .line 12
    iget v0, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;->offerId:I

    return v0
.end method

.method public getValue()F
    .locals 1

    .line 20
    iget v0, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;->value:F

    return v0
.end method

.method public setOfferId(I)V
    .locals 0

    .line 16
    iput p1, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;->offerId:I

    return-void
.end method

.method public setValue(F)V
    .locals 0

    .line 24
    iput p1, p0, Lcom/ibotta/api/call/customer/buttonsdk/LaunchInfoOffer;->value:F

    return-void
.end method
