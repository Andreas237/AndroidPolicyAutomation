.class public Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/datatype/PeriodRRIEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RRIDataEntity"
.end annotation


# instance fields
.field private intensity:I

.field private reserved:Ljava/lang/String;

.field private rriList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private sqiList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private startTime:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public addRri(I)V
    .locals 2

    .line 40
    iget-object v0, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->rriList:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 41
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->rriList:Ljava/util/List;

    .line 43
    :cond_0
    iget-object v0, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->rriList:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    return-void
.end method

.method public addSqi(I)V
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->rriList:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->sqiList:Ljava/util/List;

    .line 50
    :cond_0
    iget-object v0, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->sqiList:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 51
    return-void
.end method

.method public configIntensity(I)V
    .locals 0

    .line 82
    iput p1, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->intensity:I

    .line 83
    return-void
.end method

.method public configReserved(Ljava/lang/String;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->reserved:Ljava/lang/String;

    .line 91
    return-void
.end method

.method public configRriList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 58
    iput-object p1, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->rriList:Ljava/util/List;

    .line 59
    return-void
.end method

.method public configSqiList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 66
    iput-object p1, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->sqiList:Ljava/util/List;

    .line 67
    return-void
.end method

.method public configStartTime(J)V
    .locals 0

    .line 74
    iput-wide p1, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->startTime:J

    .line 75
    return-void
.end method

.method public fetchIntensity()I
    .locals 1

    .line 78
    iget v0, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->intensity:I

    return v0
.end method

.method public fetchReserved()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->reserved:Ljava/lang/String;

    return-object v0
.end method

.method public fetchRriList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->rriList:Ljava/util/List;

    return-object v0
.end method

.method public fetchSqiList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 62
    iget-object v0, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->sqiList:Ljava/util/List;

    return-object v0
.end method

.method public fetchStartTime()J
    .locals 2

    .line 70
    iget-wide v0, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->startTime:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RRIDataEntity{rriList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->rriList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sqiList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->sqiList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->startTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", intensity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->intensity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reserved=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;->reserved:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
