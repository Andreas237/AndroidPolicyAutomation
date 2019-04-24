.class public Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dataType:Ljava/lang/Integer;

.field private deviceCode:Ljava/lang/Long;

.field private version:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDataType()Ljava/lang/Integer;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->dataType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public getVersion()Ljava/lang/Long;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->version:Ljava/lang/Long;

    return-object v0
.end method

.method public setDataType(Ljava/lang/Integer;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->dataType:Ljava/lang/Integer;

    .line 38
    return-void
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->deviceCode:Ljava/lang/Long;

    .line 46
    return-void
.end method

.method public setVersion(I)V
    .locals 2

    .line 21
    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->version:Ljava/lang/Long;

    .line 22
    return-void
.end method

.method public setVersion(Ljava/lang/Long;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->version:Ljava/lang/Long;

    .line 18
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetSportDataByVersionReq{version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->version:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->dataType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByVersionReq;->deviceCode:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
