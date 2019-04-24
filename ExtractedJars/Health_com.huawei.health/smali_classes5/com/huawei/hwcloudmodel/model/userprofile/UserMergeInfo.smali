.class public Lcom/huawei/hwcloudmodel/model/userprofile/UserMergeInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private originalHuid:Ljava/lang/String;

.field private status:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getOriginalHuid()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserMergeInfo;->originalHuid:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/Integer;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserMergeInfo;->status:Ljava/lang/Integer;

    return-object v0
.end method

.method public setOriginalHuid(Ljava/lang/String;)V
    .locals 0

    .line 20
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserMergeInfo;->originalHuid:Ljava/lang/String;

    .line 21
    return-void
.end method

.method public setStatus(Ljava/lang/Integer;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserMergeInfo;->status:Ljava/lang/Integer;

    .line 13
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UserMergeInfo{originalHuid = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserMergeInfo;->originalHuid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",status = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/UserMergeInfo;->status:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
