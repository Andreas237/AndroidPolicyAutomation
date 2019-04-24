.class public Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;
.super Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
.source "SourceFile"


# instance fields
.field private currentVersion:Ljava/lang/Long;

.field private detailInfos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getCurrentVersion()Ljava/lang/Long;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->currentVersion:Ljava/lang/Long;

    return-object v0
.end method

.method public getDetailInfos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;>;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->detailInfos:Ljava/util/List;

    return-object v0
.end method

.method public setCurrentVersion(Ljava/lang/Long;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->currentVersion:Ljava/lang/Long;

    .line 24
    return-void
.end method

.method public setDetailInfos(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;>;)V"
        }
    .end annotation

    .line 15
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->detailInfos:Ljava/util/List;

    .line 16
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetHealthDataByVersionRsp{detailInfos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->detailInfos:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", currentVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByVersionRsp;->currentVersion:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
