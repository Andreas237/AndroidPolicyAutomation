.class public Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dataSource:Ljava/lang/Integer;

.field private endTime:Ljava/lang/Integer;

.field sportTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private startTime:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;->dataSource:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public getDataSource()Ljava/lang/Integer;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;->dataSource:Ljava/lang/Integer;

    return-object v0
.end method

.method public getEndTime()Ljava/lang/Integer;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;->endTime:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSportTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;->sportTypes:Ljava/util/Set;

    return-object v0
.end method

.method public getStartTime()Ljava/lang/Integer;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;->startTime:Ljava/lang/Integer;

    return-object v0
.end method

.method public setDataSource(Ljava/lang/Integer;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;->dataSource:Ljava/lang/Integer;

    .line 39
    return-void
.end method

.method public setEndTime(Ljava/lang/Integer;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;->endTime:Ljava/lang/Integer;

    .line 27
    return-void
.end method

.method public setSportTypes(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 42
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;->sportTypes:Ljava/util/Set;

    .line 43
    return-void
.end method

.method public setStartTime(Ljava/lang/Integer;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;->startTime:Ljava/lang/Integer;

    .line 19
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetSportDimenStatReq{startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;->startTime:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;->endTime:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;->dataSource:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sportTypes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetSportDimenStatReq;->sportTypes:Ljava/util/Set;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpGetSportDimenStatReq1()V
    .locals 0

    .line 58
    return-void
.end method

.method public uadpGetSportDimenStatReq2()V
    .locals 0

    .line 63
    return-void
.end method

.method public uadpGetSportDimenStatReq3()V
    .locals 0

    .line 68
    return-void
.end method
