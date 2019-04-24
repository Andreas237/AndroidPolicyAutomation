.class public Lcom/huawei/datatype/PeriodRRIEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;
    }
.end annotation


# instance fields
.field private bitmap:I

.field private failTime:J

.field private fileSize:I

.field private headerReserved:Ljava/lang/String;

.field private pressDataList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;"
        }
    .end annotation
.end field

.field private rriAndSqiList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;>;"
        }
    .end annotation
.end field

.field private size:I

.field private version:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/huawei/datatype/PeriodRRIEntity;->failTime:J

    return-void
.end method


# virtual methods
.method public configBitmap(I)V
    .locals 0

    .line 175
    iput p1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->bitmap:I

    .line 176
    return-void
.end method

.method public configFailTime(J)V
    .locals 0

    .line 146
    iput-wide p1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->failTime:J

    .line 147
    return-void
.end method

.method public configFileSize(I)V
    .locals 0

    .line 110
    iput p1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->fileSize:I

    .line 111
    return-void
.end method

.method public configHeaderReserved(Ljava/lang/String;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->headerReserved:Ljava/lang/String;

    .line 135
    return-void
.end method

.method public configPressDataList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;)V"
        }
    .end annotation

    .line 167
    iput-object p1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->pressDataList:Ljava/util/List;

    .line 168
    return-void
.end method

.method public configRriDataList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;>;)V"
        }
    .end annotation

    .line 142
    iput-object p1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->rriAndSqiList:Ljava/util/List;

    .line 143
    return-void
.end method

.method public configSize(I)V
    .locals 0

    .line 126
    iput p1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->size:I

    .line 127
    return-void
.end method

.method public configVersion(I)V
    .locals 0

    .line 118
    iput p1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->version:I

    .line 119
    return-void
.end method

.method public fetchBitmap()I
    .locals 1

    .line 179
    iget v0, p0, Lcom/huawei/datatype/PeriodRRIEntity;->bitmap:I

    return v0
.end method

.method public fetchFailTime()J
    .locals 2

    .line 150
    iget-wide v0, p0, Lcom/huawei/datatype/PeriodRRIEntity;->failTime:J

    return-wide v0
.end method

.method public fetchFileSize()I
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/datatype/PeriodRRIEntity;->fileSize:I

    return v0
.end method

.method public fetchHeaderReserved()Ljava/lang/String;
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/huawei/datatype/PeriodRRIEntity;->headerReserved:Ljava/lang/String;

    return-object v0
.end method

.method public fetchPressDataList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;"
        }
    .end annotation

    .line 171
    iget-object v0, p0, Lcom/huawei/datatype/PeriodRRIEntity;->pressDataList:Ljava/util/List;

    return-object v0
.end method

.method public fetchRriDataList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/datatype/PeriodRRIEntity$RRIDataEntity;>;"
        }
    .end annotation

    .line 138
    iget-object v0, p0, Lcom/huawei/datatype/PeriodRRIEntity;->rriAndSqiList:Ljava/util/List;

    return-object v0
.end method

.method public fetchSize()I
    .locals 1

    .line 122
    iget v0, p0, Lcom/huawei/datatype/PeriodRRIEntity;->size:I

    return v0
.end method

.method public fetchVersion()I
    .locals 1

    .line 114
    iget v0, p0, Lcom/huawei/datatype/PeriodRRIEntity;->version:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PeriodRRIEntity{fileSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->fileSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->version:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->size:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", headerReserved=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->headerReserved:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bitmap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->bitmap:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rriAndSqiList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->rriAndSqiList:Ljava/util/List;

    const/4 v2, 0x0

    if-ne v2, v1, :cond_0

    const-string v1, "null"

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->rriAndSqiList:Ljava/util/List;

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", pressDataList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->pressDataList:Ljava/util/List;

    const/4 v2, 0x0

    if-ne v2, v1, :cond_1

    const-string v1, "null"

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/huawei/datatype/PeriodRRIEntity;->pressDataList:Ljava/util/List;

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
