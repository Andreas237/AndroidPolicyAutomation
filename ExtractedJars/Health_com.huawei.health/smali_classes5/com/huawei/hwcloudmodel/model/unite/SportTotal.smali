.class public Lcom/huawei/hwcloudmodel/model/unite/SportTotal;
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

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDataSource()Ljava/lang/Integer;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->dataSource:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public getRecordDay()Ljava/lang/Integer;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->recordDay:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSportBasicInfo()Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->sportBasicInfo:Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    return-object v0
.end method

.method public getSportType()Ljava/lang/Integer;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->sportType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getTimeZone()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->timeZone:Ljava/lang/String;

    return-object v0
.end method

.method public setDataSource(Ljava/lang/Integer;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->dataSource:Ljava/lang/Integer;

    .line 21
    return-void
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->deviceCode:Ljava/lang/Long;

    .line 61
    return-void
.end method

.method public setRecordDay(Ljava/lang/Integer;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->recordDay:Ljava/lang/Integer;

    .line 29
    return-void
.end method

.method public setSportBasicInfo(Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->sportBasicInfo:Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    .line 53
    return-void
.end method

.method public setSportType(Ljava/lang/Integer;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->sportType:Ljava/lang/Integer;

    .line 37
    return-void
.end method

.method public setTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->timeZone:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SportTotal{recordDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->recordDay:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->dataSource:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sportType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->sportType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->deviceCode:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sportBasicInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->sportBasicInfo:Lcom/huawei/hwcloudmodel/model/unite/SportBasicInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeZone=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SportTotal;->timeZone:Ljava/lang/String;

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
