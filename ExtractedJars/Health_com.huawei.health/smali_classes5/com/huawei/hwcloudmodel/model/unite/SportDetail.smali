.class public Lcom/huawei/hwcloudmodel/model/unite/SportDetail;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appType:Ljava/lang/Integer;

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

.field private sportBasicInfos:[Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

.field private sportType:Ljava/lang/Integer;

.field private startTime:Ljava/lang/Long;

.field private timeZone:Ljava/lang/String;

.field private version:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppType()Ljava/lang/Integer;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->appType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public getEndTime()Ljava/lang/Long;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->endTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getMetadata()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->metadata:Ljava/lang/String;

    return-object v0
.end method

.method public getRecordId()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->recordId:Ljava/lang/String;

    return-object v0
.end method

.method public getSamplePoints()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;>;"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->samplePoints:Ljava/util/List;

    return-object v0
.end method

.method public getSportBasicInfos()[Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->sportBasicInfos:[Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    invoke-virtual {v0}, [Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    return-object v0
.end method

.method public getSportType()Ljava/lang/Integer;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->sportType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getStartTime()Ljava/lang/Long;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->startTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->timeZone:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion()Ljava/lang/Long;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->version:Ljava/lang/Long;

    return-object v0
.end method

.method public setAppType(Ljava/lang/Integer;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->appType:Ljava/lang/Integer;

    .line 44
    return-void
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->deviceCode:Ljava/lang/Long;

    .line 52
    return-void
.end method

.method public setEndTime(Ljava/lang/Long;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->endTime:Ljava/lang/Long;

    .line 100
    return-void
.end method

.method public setMetadata(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->metadata:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setRecordId(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->recordId:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public setSamplePoints(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/samplepoint/SamplePoint;>;)V"
        }
    .end annotation

    .line 67
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->samplePoints:Ljava/util/List;

    .line 68
    return-void
.end method

.method public setSportBasicInfos([Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;)V
    .locals 1

    .line 59
    invoke-virtual {p1}, [Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->sportBasicInfos:[Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    .line 60
    return-void
.end method

.method public setSportType(Ljava/lang/Integer;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->sportType:Ljava/lang/Integer;

    .line 36
    return-void
.end method

.method public setStartTime(Ljava/lang/Long;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->startTime:Ljava/lang/Long;

    .line 108
    return-void
.end method

.method public setTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->timeZone:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public setVersion(Ljava/lang/Long;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->version:Ljava/lang/Long;

    .line 92
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SportDetail{startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->startTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->endTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", recordId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->recordId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sportType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->sportType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", appType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->appType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->deviceCode:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sportBasicInfos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->sportBasicInfos:[Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    .line 119
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", samplePoints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->samplePoints:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", metadata=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->metadata:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeZone=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->timeZone:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportDetail;->version:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 112
    return-object v0
.end method
