.class public Lcom/huawei/health/suggestion/model/BestRecordFitStat;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private bestRecords:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private completeTime:J

.field private id:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireBestRecords()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/BestRecordFitStat;->bestRecords:Ljava/util/Map;

    return-object v0
.end method

.method public acquireCompleteTime()J
    .locals 2

    .line 28
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/BestRecordFitStat;->completeTime:J

    return-wide v0
.end method

.method public acquireId()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/BestRecordFitStat;->id:Ljava/lang/String;

    return-object v0
.end method

.method public setValue(Ljava/lang/String;ILjava/lang/String;J)V
    .locals 3

    .line 15
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/BestRecordFitStat;->id:Ljava/lang/String;

    .line 16
    iput-wide p4, p0, Lcom/huawei/health/suggestion/model/BestRecordFitStat;->completeTime:J

    .line 17
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/BestRecordFitStat;->bestRecords:Ljava/util/Map;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 18
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/BestRecordFitStat;->bestRecords:Ljava/util/Map;

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/BestRecordFitStat;->bestRecords:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    return-void
.end method
