.class public Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private createTime:J

.field private huid:J

.field private lastModifyTime:J

.field private userCode:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCreateTime()J
    .locals 2

    .line 70
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->createTime:J

    return-wide v0
.end method

.method public getHuid()J
    .locals 2

    .line 57
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->huid:J

    return-wide v0
.end method

.method public getLastModifyTime()J
    .locals 2

    .line 82
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->lastModifyTime:J

    return-wide v0
.end method

.method public getUserCode()J
    .locals 2

    .line 44
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->userCode:J

    return-wide v0
.end method

.method public initFunctionA()V
    .locals 0

    .line 111
    return-void
.end method

.method public initFunctionB()V
    .locals 0

    .line 115
    return-void
.end method

.method public initFunctionC()V
    .locals 0

    .line 119
    return-void
.end method

.method public setCreateTime(J)V
    .locals 0

    .line 74
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->createTime:J

    .line 75
    return-void
.end method

.method public setHuid(J)V
    .locals 0

    .line 62
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->huid:J

    .line 63
    return-void
.end method

.method public setLastModifyTime(J)V
    .locals 0

    .line 87
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->lastModifyTime:J

    .line 88
    return-void
.end method

.method public setUserCode(J)V
    .locals 0

    .line 49
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->userCode:J

    .line 50
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    const-string v0, "InfoUserCodeTable [userCode="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->userCode:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 96
    const-string v0, ", huid="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->huid:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 98
    const-string v0, ", createTime="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->createTime:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 100
    const-string v0, ", lastModifyTime="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoUserCodeTable;->lastModifyTime:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 102
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
