.class public Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field downloadUrl:Ljava/lang/String;

.field fileId:Ljava/lang/String;

.field ver:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDownloadUrl()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->downloadUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getFileId()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->fileId:Ljava/lang/String;

    return-object v0
.end method

.method public getVer()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->ver:Ljava/lang/String;

    return-object v0
.end method

.method public setDownloadUrl(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->downloadUrl:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public setFileId(Ljava/lang/String;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->fileId:Ljava/lang/String;

    .line 23
    return-void
.end method

.method public setVer(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->ver:Ljava/lang/String;

    .line 31
    return-void
.end method

.method public solveSAIMethod1()V
    .locals 0

    .line 50
    return-void
.end method

.method public solveSAIMethod2()V
    .locals 0

    .line 51
    return-void
.end method

.method public solveSAIMethod3()V
    .locals 0

    .line 52
    return-void
.end method

.method public solveSAIMethod4()V
    .locals 0

    .line 53
    return-void
.end method

.method public solveSAIMethod5()V
    .locals 0

    .line 54
    return-void
.end method

.method public solveSAIMethod6()V
    .locals 0

    .line 55
    return-void
.end method

.method public solveSAIMethod7()V
    .locals 0

    .line 56
    return-void
.end method

.method public solveSAIMethod8()V
    .locals 0

    .line 57
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RecommendCloudObject{fileId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->fileId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", ver=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->ver:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", downloadUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/recommendcloud/data/RecommendCloudObject;->downloadUrl:Ljava/lang/String;

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
