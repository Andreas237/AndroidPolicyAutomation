.class public Lcom/huawei/hwcloudmodel/model/unite/ServiceInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public sid:Ljava/lang/String;

.field public st:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSid()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ServiceInfo;->sid:Ljava/lang/String;

    return-object v0
.end method

.method public getSt()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/ServiceInfo;->st:Ljava/lang/String;

    return-object v0
.end method

.method public setSid(Ljava/lang/String;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ServiceInfo;->sid:Ljava/lang/String;

    .line 17
    return-void
.end method

.method public setSt(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/ServiceInfo;->st:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServiceInfo{sid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/ServiceInfo;->sid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", st=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/ServiceInfo;->st:Ljava/lang/String;

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
