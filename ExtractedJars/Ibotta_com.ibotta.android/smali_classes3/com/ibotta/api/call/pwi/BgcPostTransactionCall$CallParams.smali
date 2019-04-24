.class public Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;
.super Ljava/lang/Object;
.source "BgcPostTransactionCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/pwi/BgcPostTransactionCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams$StripePaymentType;
    }
.end annotation


# instance fields
.field private faceValue:D

.field private giftCardId:Ljava/lang/String;

.field private paymentSourceId:Ljava/lang/String;

.field private paymentTokenId:Ljava/lang/String;

.field private retailerId:I

.field private retailerName:Ljava/lang/String;

.field private rewardAmount:Ljava/lang/String;

.field private sku:Ljava/lang/String;

.field private uuid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFaceValue()D
    .locals 2

    .line 89
    iget-wide v0, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->faceValue:D

    return-wide v0
.end method

.method public getGiftCardId()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->giftCardId:Ljava/lang/String;

    return-object v0
.end method

.method public getPaymentSourceId()Ljava/lang/String;
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->paymentSourceId:Ljava/lang/String;

    return-object v0
.end method

.method public getPaymentTokenId()Ljava/lang/String;
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->paymentTokenId:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 129
    iget v0, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->retailerId:I

    return v0
.end method

.method public getRetailerName()Ljava/lang/String;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->retailerName:Ljava/lang/String;

    return-object v0
.end method

.method public getRewardAmount()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->rewardAmount:Ljava/lang/String;

    return-object v0
.end method

.method public getSku()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->sku:Ljava/lang/String;

    return-object v0
.end method

.method public getUuid()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->uuid:Ljava/lang/String;

    return-object v0
.end method

.method public setFaceValue(D)V
    .locals 0

    .line 93
    iput-wide p1, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->faceValue:D

    return-void
.end method

.method public setGiftCardId(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->giftCardId:Ljava/lang/String;

    return-void
.end method

.method public setPaymentSourceId(Ljava/lang/String;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->paymentSourceId:Ljava/lang/String;

    return-void
.end method

.method public setPaymentTokenId(Ljava/lang/String;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->paymentTokenId:Ljava/lang/String;

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 133
    iput p1, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->retailerId:I

    return-void
.end method

.method public setRetailerName(Ljava/lang/String;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->retailerName:Ljava/lang/String;

    return-void
.end method

.method public setRewardAmount(Ljava/lang/String;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->rewardAmount:Ljava/lang/String;

    return-void
.end method

.method public setSku(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->sku:Ljava/lang/String;

    return-void
.end method

.method public setUuid(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/BgcPostTransactionCall$CallParams;->uuid:Ljava/lang/String;

    return-void
.end method
