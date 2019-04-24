.class public Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;
.super Ljava/lang/Object;
.source "OfferMetricGroup.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/metric/OfferMetricGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RewardMetric"
.end annotation


# instance fields
.field private duration:I

.field private engaged:I

.field private eventCount:I

.field private rewardId:I

.field private viewed:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 196
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDuration()I
    .locals 1

    .line 212
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->duration:I

    return v0
.end method

.method public getEngaged()I
    .locals 1

    .line 240
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->engaged:I

    return v0
.end method

.method public getEventCount()I
    .locals 1

    .line 236
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->eventCount:I

    return v0
.end method

.method public getRewardId()I
    .locals 1

    .line 204
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->rewardId:I

    return v0
.end method

.method public getViewed()I
    .locals 1

    .line 226
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->viewed:I

    return v0
.end method

.method public incrDuration(I)V
    .locals 5

    .line 220
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->eventCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->eventCount:I

    .line 221
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->duration:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->duration:I

    .line 222
    sget-object p1, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v0, "Reward duration updated: rewardId=%1$d, duration=%2$d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->rewardId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->duration:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-interface {p1, v0, v2}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public incrDuration(J)V
    .locals 2

    const-wide/16 v0, 0x3e8

    .line 216
    div-long/2addr p1, v0

    long-to-int p2, p1

    invoke-virtual {p0, p2}, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->incrDuration(I)V

    return-void
.end method

.method public incrEngaged(I)V
    .locals 5

    .line 244
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->eventCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->eventCount:I

    .line 245
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->engaged:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->engaged:I

    .line 246
    sget-object p1, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v0, "Reward engaged count updated: rewardId=%1$d, engaged=%2$d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->rewardId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->engaged:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-interface {p1, v0, v2}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public incrViewed(I)V
    .locals 5

    .line 230
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->eventCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->eventCount:I

    .line 231
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->viewed:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->viewed:I

    .line 232
    sget-object p1, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v0, "Reward view count updated: rewardId=%1$d, viewed=%2$d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->rewardId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->viewed:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-interface {p1, v0, v2}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public merge(Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;)V
    .locals 1

    .line 251
    invoke-virtual {p1}, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->getDuration()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->incrDuration(I)V

    .line 252
    invoke-virtual {p1}, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->getViewed()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->incrViewed(I)V

    .line 253
    invoke-virtual {p1}, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->getEngaged()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->incrEngaged(I)V

    return-void
.end method

.method public setRewardId(I)V
    .locals 0

    .line 208
    iput p1, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->rewardId:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 258
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Reward id                   : "

    .line 260
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    iget v1, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->rewardId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 262
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Duration                    : "

    .line 264
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    iget v1, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->duration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 266
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Viewed                      : "

    .line 268
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    iget v1, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->viewed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 270
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Engaged                     : "

    .line 272
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    iget v1, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->engaged:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 274
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Total reward event count    : "

    .line 276
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    invoke-virtual {p0}, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->getEventCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 278
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
