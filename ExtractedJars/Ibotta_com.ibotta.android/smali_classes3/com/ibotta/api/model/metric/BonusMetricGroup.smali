.class public Lcom/ibotta/api/model/metric/BonusMetricGroup;
.super Ljava/lang/Object;
.source "BonusMetricGroup.java"

# interfaces
.implements Lcom/ibotta/api/model/metric/MetricGroup;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;
    }
.end annotation


# instance fields
.field private bonusMetrics:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;",
            ">;"
        }
    .end annotation
.end field

.field private sendAttempts:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup;->bonusMetrics:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public getBonusMetric(I)Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;
    .locals 2

    .line 36
    iget-object v0, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup;->bonusMetrics:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;

    invoke-direct {v0}, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;-><init>()V

    .line 40
    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->setBonusId(I)V

    .line 41
    iget-object v1, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup;->bonusMetrics:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public getBonusMetrics()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;",
            ">;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup;->bonusMetrics:Ljava/util/Map;

    return-object v0
.end method

.method public getEventCount()I
    .locals 3

    .line 49
    iget-object v0, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup;->bonusMetrics:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;

    .line 50
    invoke-virtual {v2}, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->getEventCount()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public getSendAttempts()I
    .locals 1

    .line 56
    iget v0, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup;->sendAttempts:I

    return v0
.end method

.method public merge(Lcom/ibotta/api/model/metric/MetricGroup;)V
    .locals 2

    .line 22
    instance-of v0, p1, Lcom/ibotta/api/model/metric/BonusMetricGroup;

    if-nez v0, :cond_0

    return-void

    .line 26
    :cond_0
    check-cast p1, Lcom/ibotta/api/model/metric/BonusMetricGroup;

    .line 28
    iget v0, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup;->sendAttempts:I

    invoke-virtual {p1}, Lcom/ibotta/api/model/metric/BonusMetricGroup;->getSendAttempts()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup;->sendAttempts:I

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/api/model/metric/BonusMetricGroup;->getBonusMetrics()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 30
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/ibotta/api/model/metric/BonusMetricGroup;->getBonusMetric(I)Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;

    move-result-object v1

    .line 31
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;

    invoke-virtual {v1, v0}, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->merge(Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setBonusMetrics(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;",
            ">;)V"
        }
    .end annotation

    .line 18
    iput-object p1, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup;->bonusMetrics:Ljava/util/Map;

    return-void
.end method

.method public setSendAttempts(I)V
    .locals 0

    .line 60
    iput p1, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup;->sendAttempts:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    iget-object v1, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup;->bonusMetrics:Ljava/util/Map;

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

    check-cast v2, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;

    .line 67
    invoke-virtual {v2}, Lcom/ibotta/api/model/metric/BonusMetricGroup$BonusMetric;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, "Total event count           : "

    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    invoke-virtual {p0}, Lcom/ibotta/api/model/metric/BonusMetricGroup;->getEventCount()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Total BonusMetric instances : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup;->bonusMetrics:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    iget-object v1, p0, Lcom/ibotta/api/model/metric/BonusMetricGroup;->bonusMetrics:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
