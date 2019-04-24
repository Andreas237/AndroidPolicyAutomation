.class public Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;
.super Ljava/lang/Object;
.source "BonusMetricGroup.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/metric/BonusMetricGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BonusMetric"
.end annotation


# instance fields
.field private bonusId:I

.field private eventCount:I

.field private gameViewed:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBonusId()I
    .locals 1

    .line 84
    iget v0, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->bonusId:I

    return v0
.end method

.method public getEventCount()I
    .locals 1

    .line 102
    iget v0, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->eventCount:I

    return v0
.end method

.method public getGameViewed()I
    .locals 1

    .line 92
    iget v0, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->gameViewed:I

    return v0
.end method

.method public incrGameViewed(I)V
    .locals 5

    .line 96
    iget v0, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->eventCount:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->eventCount:I

    .line 97
    iget v0, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->gameViewed:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->gameViewed:I

    .line 98
    sget-object p1, Lcom/ibotta/android/logging/IbottaLogger;->Log:Lcom/ibotta/android/logging/Logger;

    const-string v0, "Bonus game view count updated: bonusId=%1$d, gameViewed=%2$d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->bonusId:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->gameViewed:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v1

    invoke-interface {p1, v0, v2}, Lcom/ibotta/android/logging/Logger;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public merge(Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;)V
    .locals 0

    .line 106
    invoke-virtual {p1}, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->getGameViewed()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->incrGameViewed(I)V

    return-void
.end method

.method public setBonusId(I)V
    .locals 0

    .line 88
    iput p1, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->bonusId:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bonus id                    : "

    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    iget v1, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->bonusId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Game viewed                 : "

    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    iget v1, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->gameViewed:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 119
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "Total bonus event count     : "

    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    invoke-virtual {p0}, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->getEventCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 123
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
