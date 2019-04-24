.class public Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;
.super Ljava/lang/Object;
.source "OfferMetricGroup.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/metric/OfferMetricGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OfferMetric"
.end annotation


# instance fields
.field private engagementDuration:I

.field private eventCount:I

.field private galleryViewed:I

.field private gameViewed:I

.field private offerId:I

.field private rewardMetrics:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->rewardMetrics:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getEngagementDuration()I
    .locals 1

    .line 115
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->engagementDuration:I

    return v0
.end method

.method public getEventCount()I
    .locals 3

    .line 145
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->eventCount:I

    .line 146
    iget-object v1, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->rewardMetrics:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;

    .line 147
    invoke-virtual {v2}, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->getEventCount()I

    move-result v2

    add-int/2addr v0, v2

    goto :goto_0

    :cond_0
    return v0
.end method

.method public getGalleryViewed()I
    .locals 1

    .line 105
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->galleryViewed:I

    return v0
.end method

.method public getGameViewed()I
    .locals 1

    .line 95
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->gameViewed:I

    return v0
.end method

.method public getOfferId()I
    .locals 1

    .line 87
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->offerId:I

    return v0
.end method

.method public getRewardMetric(I)Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->rewardMetrics:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;

    if-nez v0, :cond_0

    .line 136
    new-instance v0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;

    invoke-direct {v0}, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;-><init>()V

    .line 137
    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->setRewardId(I)V

    .line 138
    iget-object v1, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->rewardMetrics:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public getRewardMetrics()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;",
            ">;"
        }
    .end annotation

    .line 129
    iget-object v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->rewardMetrics:Ljava/util/Map;

    return-object v0
.end method

.method public incrEngagementDuration(I)V
    .locals 5

    .line 123
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->eventCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->eventCount:I

    .line 124
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->engagementDuration:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->engagementDuration:I

    .line 125
    sget-object p1, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v0, "Offer duration updated: offerId=%1$d, duration=%2$d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->offerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->engagementDuration:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-interface {p1, v0, v2}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public incrEngagementDuration(J)V
    .locals 2

    const-wide/16 v0, 0x3e8

    .line 119
    div-long/2addr p1, v0

    long-to-int p2, p1

    invoke-virtual {p0, p2}, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->incrEngagementDuration(I)V

    return-void
.end method

.method public incrGalleryViewed(I)V
    .locals 5

    .line 109
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->eventCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->eventCount:I

    .line 110
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->galleryViewed:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->galleryViewed:I

    .line 111
    sget-object p1, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v0, "Offer gallery view count updated: offerId=%1$d, galleryViewed=%2$d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->offerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->galleryViewed:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-interface {p1, v0, v2}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public incrGameViewed(I)V
    .locals 5

    .line 99
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->eventCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->eventCount:I

    .line 100
    iget v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->gameViewed:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->gameViewed:I

    .line 101
    sget-object p1, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v0, "Offer game view count updated: offerId=%1$d, gameViewed=%2$d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->offerId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->gameViewed:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-interface {p1, v0, v2}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public merge(Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;)V
    .locals 2

    .line 153
    invoke-virtual {p1}, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->getGameViewed()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->incrGameViewed(I)V

    .line 154
    invoke-virtual {p1}, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->getGalleryViewed()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->incrGalleryViewed(I)V

    .line 155
    invoke-virtual {p1}, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->getEngagementDuration()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->incrEngagementDuration(I)V

    .line 157
    invoke-virtual {p1}, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->getRewardMetrics()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 158
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->getRewardMetric(I)Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;

    move-result-object v1

    .line 159
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;

    invoke-virtual {v1, v0}, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->merge(Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setOfferId(I)V
    .locals 0

    .line 91
    iput p1, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->offerId:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 165
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Offer id                    : "

    .line 167
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    iget v1, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->offerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 169
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Game viewed                 : "

    .line 171
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    iget v1, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->gameViewed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 173
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Gallery viewed              : "

    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    iget v1, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->galleryViewed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 177
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Engagement duration         : "

    .line 179
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    iget v1, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->engagementDuration:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    iget-object v1, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->rewardMetrics:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;

    .line 184
    invoke-virtual {v2}, Lcom/ibotta/api/model/metric/OfferMetricGroup$RewardMetric;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, "Total offer event count     : "

    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    invoke-virtual {p0}, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->getEventCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 188
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Total RewardMetric instances: "

    .line 189
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    iget-object v1, p0, Lcom/ibotta/api/model/metric/OfferMetricGroup$OfferMetric;->rewardMetrics:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 191
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
