.class public Lcom/huawei/hwcloudmodel/model/unite/SyncKey;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dataType:Ljava/lang/Integer;

.field private deviceCode:Ljava/lang/Long;

.field private type:Ljava/lang/Integer;

.field private version:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDataType()Ljava/lang/Integer;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->dataType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDeviceCode()Ljava/lang/Long;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->deviceCode:Ljava/lang/Long;

    return-object v0
.end method

.method public getType()Ljava/lang/Integer;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->type:Ljava/lang/Integer;

    return-object v0
.end method

.method public getVersion()Ljava/lang/Long;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->version:Ljava/lang/Long;

    return-object v0
.end method

.method public setDataType(Ljava/lang/Integer;)V
    .locals 0

    .line 18
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->dataType:Ljava/lang/Integer;

    .line 19
    return-void
.end method

.method public setDeviceCode(Ljava/lang/Long;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->deviceCode:Ljava/lang/Long;

    .line 35
    return-void
.end method

.method public setType(Ljava/lang/Integer;)V
    .locals 0

    .line 26
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->type:Ljava/lang/Integer;

    .line 27
    return-void
.end method

.method public setVersion(Ljava/lang/Long;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->version:Ljava/lang/Long;

    .line 43
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SyncKey{dataType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->dataType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->type:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->deviceCode:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/SyncKey;->version:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
