.class public Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private isForce:I

.field private timeZone:Ljava/lang/String;

.field private totalInfo:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getTimeZone()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;->timeZone:Ljava/lang/String;

    return-object v0
.end method

.method public getTotalInfo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;"
        }
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;->totalInfo:Ljava/util/List;

    return-object v0
.end method

.method public setIsForce(I)V
    .locals 0

    .line 20
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;->isForce:I

    .line 21
    return-void
.end method

.method public setTimeZone(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;->timeZone:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public setTotalInfo(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/SportTotal;>;)V"
        }
    .end annotation

    .line 16
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;->totalInfo:Ljava/util/List;

    .line 17
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AddSportTotalReq{totalInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;->totalInfo:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeZone=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;->timeZone:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isForce="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddSportTotalReq;->isForce:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

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

.method public uadpAddSportTotalReq1()V
    .locals 0

    .line 43
    return-void
.end method

.method public uadpAddSportTotalReq2()V
    .locals 0

    .line 48
    return-void
.end method

.method public uadpAddSportTotalReq3()V
    .locals 0

    .line 53
    return-void
.end method
