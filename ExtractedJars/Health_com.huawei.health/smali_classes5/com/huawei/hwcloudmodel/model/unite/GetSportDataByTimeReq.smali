.class public Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dataType:Ljava/lang/Integer;

.field private deviceCode:Ljava/lang/Long;

.field private endTime:Ljava/lang/Long;

.field private queryType:Ljava/lang/Integer;

.field private sportTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private startTime:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDataType()Ljava/lang/Integer;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->dataType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public getEndTime()Ljava/lang/Long;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->endTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getQueryType()Ljava/lang/Integer;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->queryType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSportTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->sportTypes:Ljava/util/Set;

    return-object v0
.end method

.method public getStartTime()Ljava/lang/Long;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->startTime:Ljava/lang/Long;

    return-object v0
.end method

.method public setDataType(Ljava/lang/Integer;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->dataType:Ljava/lang/Integer;

    .line 60
    return-void
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->deviceCode:Ljava/lang/Long;

    .line 28
    return-void
.end method

.method public setEndTime(Ljava/lang/Long;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->endTime:Ljava/lang/Long;

    .line 36
    return-void
.end method

.method public setQueryType(Ljava/lang/Integer;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->queryType:Ljava/lang/Integer;

    .line 20
    return-void
.end method

.method public setSportTypes(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 43
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->sportTypes:Ljava/util/Set;

    .line 44
    return-void
.end method

.method public setStartTime(Ljava/lang/Long;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->startTime:Ljava/lang/Long;

    .line 52
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 64
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetSportDataByTimeReq{queryType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->queryType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->startTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->endTime:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sportTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->sportTypes:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->dataType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDataByTimeReq;->deviceCode:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
