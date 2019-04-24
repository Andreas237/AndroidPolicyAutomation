.class public Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private createTime:J

.field private data:Ljava/lang/String;

.field private huid:J

.field private lastModifyTime:J

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCreateTime()J
    .locals 2

    .line 68
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->createTime:J

    return-wide v0
.end method

.method public getData()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->data:Ljava/lang/String;

    return-object v0
.end method

.method public getHuid()J
    .locals 2

    .line 46
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->huid:J

    return-wide v0
.end method

.method public getLastModifyTime()J
    .locals 2

    .line 76
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->lastModifyTime:J

    return-wide v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->type:Ljava/lang/String;

    return-object v0
.end method

.method public initFunctionA()V
    .locals 0

    .line 116
    return-void
.end method

.method public initFunctionB()V
    .locals 0

    .line 120
    return-void
.end method

.method public initFunctionC()V
    .locals 0

    .line 124
    return-void
.end method

.method public setCreateTime(J)V
    .locals 0

    .line 72
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->createTime:J

    .line 73
    return-void
.end method

.method public setData(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->data:Ljava/lang/String;

    .line 92
    return-void
.end method

.method public setHuid(J)V
    .locals 0

    .line 51
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->huid:J

    .line 52
    return-void
.end method

.method public setLastModifyTime(J)V
    .locals 0

    .line 80
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->lastModifyTime:J

    .line 81
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->type:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 96
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    const-string v0, "PreferenceDataTable [huid ="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->huid:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 99
    const-string v0, ", type ="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->type:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    const-string v0, ", data ="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->data:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    const-string v0, ", createTime ="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->createTime:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 105
    const-string v0, ", lastModifyTime ="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/UserPreferenceDataTable;->lastModifyTime:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 107
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
