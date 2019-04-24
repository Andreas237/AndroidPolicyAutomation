.class public Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;
.super Ljava/lang/Object;
.source "CustomerOfferPutCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/offer/CustomerOfferPutCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Reward"
.end annotation


# instance fields
.field private duration:F

.field private engaged:I

.field private engagementId:J

.field private finished:Z

.field private id:J

.field private response:Ljava/lang/Object;

.field private viewed:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 239
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDuration()F
    .locals 1

    .line 274
    iget v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->duration:F

    return v0
.end method

.method public getEngaged()I
    .locals 1

    .line 295
    iget v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->engaged:I

    return v0
.end method

.method public getEngagementId()J
    .locals 2

    .line 316
    iget-wide v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->engagementId:J

    return-wide v0
.end method

.method public getId()J
    .locals 2

    .line 256
    iget-wide v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->id:J

    return-wide v0
.end method

.method public getResponse()Ljava/lang/Object;
    .locals 1

    .line 329
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->response:Ljava/lang/Object;

    return-object v0
.end method

.method public getViewed()I
    .locals 1

    .line 287
    iget v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->viewed:I

    return v0
.end method

.method public isFinished()Z
    .locals 1

    .line 303
    iget-boolean v0, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->finished:Z

    return v0
.end method

.method public setDuration(F)V
    .locals 0

    .line 283
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->duration:F

    return-void
.end method

.method public setEngaged(I)V
    .locals 0

    .line 299
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->engaged:I

    return-void
.end method

.method public setEngagementId(J)V
    .locals 0

    .line 325
    iput-wide p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->engagementId:J

    return-void
.end method

.method public setFinished(Z)V
    .locals 0

    .line 307
    iput-boolean p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->finished:Z

    return-void
.end method

.method public setId(J)V
    .locals 0

    .line 265
    iput-wide p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->id:J

    return-void
.end method

.method public setResponse(Ljava/lang/Object;)V
    .locals 0

    .line 333
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->response:Ljava/lang/Object;

    return-void
.end method

.method public setViewed(I)V
    .locals 0

    .line 291
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOfferPutCall$Reward;->viewed:I

    return-void
.end method
