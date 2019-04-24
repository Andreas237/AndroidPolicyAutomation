.class public Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private originalHuid:Ljava/lang/String;

.field private originalST:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getOriginalHuid()Ljava/lang/String;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->originalHuid:Ljava/lang/String;

    return-object v0
.end method

.method public getOriginalST()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->originalST:Ljava/lang/String;

    return-object v0
.end method

.method public setOriginalHuid(Ljava/lang/String;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->originalHuid:Ljava/lang/String;

    .line 14
    return-void
.end method

.method public setOriginalST(Ljava/lang/String;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->originalST:Ljava/lang/String;

    .line 22
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MergeUserAllDataReq{originalHuid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->originalHuid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", originalST="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/MergeUserAllDataReq;->originalST:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
