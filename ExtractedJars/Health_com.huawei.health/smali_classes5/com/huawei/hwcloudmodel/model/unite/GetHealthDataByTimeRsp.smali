.class public Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;
.super Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
.source "SourceFile"


# instance fields
.field private data:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;>;>;"
        }
    .end annotation
.end field

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

    .line 8
    invoke-direct {p0}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;>;>;"
        }
    .end annotation

    .line 22
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;->data:Ljava/util/Map;

    return-object v0
.end method

.method public getDetailInfos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;>;"
        }
    .end annotation

    .line 14
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;->detailInfos:Ljava/util/List;

    return-object v0
.end method

.method public setData(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;>;>;)V"
        }
    .end annotation

    .line 26
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;->data:Ljava/util/Map;

    .line 27
    return-void
.end method

.method public setDetailInfos(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/HealthDetail;>;)V"
        }
    .end annotation

    .line 18
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;->detailInfos:Ljava/util/List;

    .line 19
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetHealthDataByTimeRsp{detailInfos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;->detailInfos:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetHealthDataByTimeRsp;->data:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
