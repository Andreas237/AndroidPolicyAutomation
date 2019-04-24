.class public Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;
.super Ljava/lang/Object;
.source "CustomerOfferPutCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/offer/CustomerOfferPutCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private currentValue:Ljava/lang/String;

.field private customerId:I

.field private engagementDuration:F

.field private galleryViewed:I

.field private gameViewed:I

.field private offerId:I

.field private offerSegmentId:I

.field private pendingRetailerVerification:Ljava/lang/Integer;

.field private retailerId:Ljava/lang/Integer;

.field private rewards:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;",
            ">;"
        }
    .end annotation
.end field

.field private segmentId:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->rewards:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getCurrentValue()Ljava/lang/String;
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->currentValue:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomerId()I
    .locals 1

    .line 149
    iget v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->customerId:I

    return v0
.end method

.method public getEngagementDuration()F
    .locals 1

    .line 210
    iget v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->engagementDuration:F

    return v0
.end method

.method public getGalleryViewed()I
    .locals 1

    .line 157
    iget v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->galleryViewed:I

    return v0
.end method

.method public getGameViewed()I
    .locals 1

    .line 165
    iget v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->gameViewed:I

    return v0
.end method

.method public getOfferId()I
    .locals 1

    .line 136
    iget v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->offerId:I

    return v0
.end method

.method public getOfferSegmentId()I
    .locals 1

    .line 181
    iget v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->offerSegmentId:I

    return v0
.end method

.method public getPendingRetailerVerification()Ljava/lang/Integer;
    .locals 1

    .line 223
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->pendingRetailerVerification:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRetailerId()Ljava/lang/Integer;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->retailerId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRewards()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;",
            ">;"
        }
    .end annotation

    .line 231
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->rewards:Ljava/util/Map;

    return-object v0
.end method

.method public getSegmentId()I
    .locals 1

    .line 173
    iget v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->segmentId:I

    return v0
.end method

.method public setCurrentValue(Ljava/lang/String;)V
    .locals 0

    .line 193
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->currentValue:Ljava/lang/String;

    return-void
.end method

.method public setCustomerId(I)V
    .locals 0

    .line 153
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->customerId:I

    return-void
.end method

.method public setEngagementDuration(F)V
    .locals 0

    .line 219
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->engagementDuration:F

    return-void
.end method

.method public setGalleryViewed(I)V
    .locals 0

    .line 161
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->galleryViewed:I

    return-void
.end method

.method public setGameViewed(I)V
    .locals 0

    .line 169
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->gameViewed:I

    return-void
.end method

.method public setOfferId(I)V
    .locals 0

    .line 145
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->offerId:I

    return-void
.end method

.method public setOfferSegmentId(I)V
    .locals 0

    .line 185
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->offerSegmentId:I

    return-void
.end method

.method public setPendingRetailerVerification(Ljava/lang/Integer;)V
    .locals 0

    .line 227
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->pendingRetailerVerification:Ljava/lang/Integer;

    return-void
.end method

.method public setRetailerId(Ljava/lang/Integer;)V
    .locals 0

    .line 201
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->retailerId:Ljava/lang/Integer;

    return-void
.end method

.method public setRewards(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;",
            ">;)V"
        }
    .end annotation

    .line 235
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->rewards:Ljava/util/Map;

    return-void
.end method

.method public setSegmentId(I)V
    .locals 0

    .line 177
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$CallParams;->segmentId:I

    return-void
.end method
