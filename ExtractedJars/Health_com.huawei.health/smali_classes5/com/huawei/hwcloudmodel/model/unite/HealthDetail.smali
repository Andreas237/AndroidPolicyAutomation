.class public Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private deviceCode:Ljava/lang/Long;

.field private endTime:Ljava/lang/Long;

.field private metadata:Ljava/lang/String;

.field private recordId:Ljava/lang/String;

.field private samplePoints:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;>;"
        }
    .end annotation
.end field

.field private startTime:Ljava/lang/Long;

.field private timeZone:Ljava/lang/String;

.field private type:Ljava/lang/Integer;

.field private version:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public getEndTime()Ljava/lang/Long;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->endTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getMetadata()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->metadata:Ljava/lang/String;

    return-object v0
.end method

.method public getRecordId()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->recordId:Ljava/lang/String;

    return-object v0
.end method

.method public getSamplePoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;>;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->samplePoints:Ljava/util/List;

    return-object v0
.end method

.method public getStartTime()Ljava/lang/Long;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->startTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->timeZone:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/Integer;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->type:Ljava/lang/Integer;

    return-object v0
.end method

.method public getVersion()Ljava/lang/Long;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->version:Ljava/lang/Long;

    return-object v0
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->deviceCode:Ljava/lang/Long;

    .line 40
    return-void
.end method

.method public setEndTime(Ljava/lang/Long;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->endTime:Ljava/lang/Long;

    .line 64
    return-void
.end method

.method public setMetadata(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->metadata:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public setRecordId(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->recordId:Ljava/lang/String;

    .line 24
    return-void
.end method

.method public setSamplePoints(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;>;)V"
        }
    .end annotation

    .line 31
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->samplePoints:Ljava/util/List;

    .line 32
    return-void
.end method

.method public setStartTime(Ljava/lang/Long;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->startTime:Ljava/lang/Long;

    .line 80
    return-void
.end method

.method public setTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->timeZone:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setType(Ljava/lang/Integer;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->type:Ljava/lang/Integer;

    .line 72
    return-void
.end method

.method public setVersion(Ljava/lang/Long;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->version:Ljava/lang/Long;

    .line 88
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HealthDetail{startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->startTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->endTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->type:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", recordId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->recordId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->deviceCode:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", samplePoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->samplePoints:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", metadata=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->metadata:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeZone=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->timeZone:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;->version:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
