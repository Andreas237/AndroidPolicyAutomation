.class public Lcom/huawei/hwcloudmodel/model/SportTotalData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dataSource:Ljava/lang/Integer;

.field private deviceCode:Ljava/lang/Long;

.field private recordDay:Ljava/lang/Integer;

.field private sportBasicInfo:Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

.field private sportType:Ljava/lang/Integer;

.field private timeZone:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDataSource()Ljava/lang/Integer;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->dataSource:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public getRecordDay()Ljava/lang/Integer;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->recordDay:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->sportBasicInfo:Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    return-object v0
.end method

.method public getSportType()Ljava/lang/Integer;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->sportType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->timeZone:Ljava/lang/String;

    return-object v0
.end method

.method public setDataSource(Ljava/lang/Integer;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->dataSource:Ljava/lang/Integer;

    .line 36
    return-void
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->deviceCode:Ljava/lang/Long;

    .line 52
    return-void
.end method

.method public setRecordDay(Ljava/lang/Integer;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->recordDay:Ljava/lang/Integer;

    .line 28
    return-void
.end method

.method public setSportBasicInfo(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->sportBasicInfo:Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    .line 60
    return-void
.end method

.method public setSportType(Ljava/lang/Integer;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->sportType:Ljava/lang/Integer;

    .line 44
    return-void
.end method

.method public setTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->timeZone:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SportTotalData{recordDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->recordDay:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->dataSource:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sportType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->sportType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->deviceCode:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sportBasicInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->sportBasicInfo:Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeZone=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/SportTotalData;->timeZone:Ljava/lang/String;

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
