.class public Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dataSource:I

.field private deviceCode:J

.field private endTime:I

.field private startTime:I

.field private types:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDataSource()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->dataSource:I

    return v0
.end method

.method public getDeviceCode()J
    .locals 2

    .line 37
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->deviceCode:J

    return-wide v0
.end method

.method public getEndTime()I
    .locals 1

    .line 29
    iget v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->endTime:I

    return v0
.end method

.method public getStartTime()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->startTime:I

    return v0
.end method

.method public getTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->types:Ljava/util/Set;

    return-object v0
.end method

.method public setDataSource(I)V
    .locals 0

    .line 53
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->dataSource:I

    .line 54
    return-void
.end method

.method public setDeviceCode(J)V
    .locals 0

    .line 57
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->deviceCode:J

    .line 58
    return-void
.end method

.method public setEndTime(I)V
    .locals 0

    .line 49
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->endTime:I

    .line 50
    return-void
.end method

.method public setStartTime(I)V
    .locals 0

    .line 45
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->startTime:I

    .line 46
    return-void
.end method

.method public setTypes(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 61
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->types:Ljava/util/Set;

    .line 62
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetHealthStatReq{startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->startTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->endTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->dataSource:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->deviceCode:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", types="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthStatReq;->types:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
