.class public Lcom/huawei/hihealthservice/old/db/dao/LogTable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final ADD:I = 0x1

.field public static final DELETE:I = 0x2

.field public static final UPDATE:I = 0x3

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private actionCode:I

.field private createTime:J

.field private dataType:I

.field private errorInfo:Ljava/lang/String;

.field private id:J

.field private lastModifyVersion:J

.field private localUserDeviceCode:I

.field private referData:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected clone()Lcom/huawei/hihealthservice/old/db/dao/LogTable;
    .locals 2

    .line 173
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 175
    :catch_0
    move-exception v1

    .line 177
    const/4 v0, 0x0

    return-object v0
.end method

.method protected bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 18
    invoke-virtual {p0}, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->clone()Lcom/huawei/hihealthservice/old/db/dao/LogTable;

    move-result-object v0

    return-object v0
.end method

.method public getActionCode()I
    .locals 1

    .line 122
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->actionCode:I

    return v0
.end method

.method public getCreateTime()J
    .locals 2

    .line 161
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->createTime:J

    return-wide v0
.end method

.method public getDataType()I
    .locals 1

    .line 148
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->dataType:I

    return v0
.end method

.method public getErrorInfo()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->errorInfo:Ljava/lang/String;

    return-object v0
.end method

.method public getId()J
    .locals 2

    .line 96
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->id:J

    return-wide v0
.end method

.method public getLastModifyVersion()J
    .locals 2

    .line 70
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->lastModifyVersion:J

    return-wide v0
.end method

.method public getLocalUserDeviceCode()I
    .locals 1

    .line 109
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->localUserDeviceCode:I

    return v0
.end method

.method public getReferData()Ljava/lang/String;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->referData:Ljava/lang/String;

    return-object v0
.end method

.method public initFunctionAv()V
    .locals 0

    .line 210
    return-void
.end method

.method public initFunctionBv()V
    .locals 0

    .line 214
    return-void
.end method

.method public setActionCode(I)V
    .locals 0

    .line 127
    iput p1, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->actionCode:I

    .line 128
    return-void
.end method

.method public setCreateTime(J)V
    .locals 0

    .line 166
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->createTime:J

    .line 167
    return-void
.end method

.method public setDataType(I)V
    .locals 0

    .line 153
    iput p1, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->dataType:I

    .line 154
    return-void
.end method

.method public setErrorInfo(Ljava/lang/String;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->errorInfo:Ljava/lang/String;

    .line 89
    return-void
.end method

.method public setId(J)V
    .locals 0

    .line 101
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->id:J

    .line 102
    return-void
.end method

.method public setLastModifyVersion(J)V
    .locals 0

    .line 75
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->lastModifyVersion:J

    .line 76
    return-void
.end method

.method public setLocalUserDeviceCode(I)V
    .locals 0

    .line 114
    iput p1, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->localUserDeviceCode:I

    .line 115
    return-void
.end method

.method public setReferData(Ljava/lang/String;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->referData:Ljava/lang/String;

    .line 141
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 184
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    const-string v0, "LogTable [id="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->id:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 187
    const-string v0, ", dataType="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->dataType:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 189
    const-string v0, ", localUserDeviceCode="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->localUserDeviceCode:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 191
    const-string v0, ", actionCode="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->actionCode:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 193
    const-string v0, ", referData="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->referData:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    const-string v0, ", createTime="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->createTime:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 197
    const-string v0, ", errorInfo="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->errorInfo:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    const-string v0, ", lastModifyVersion="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/LogTable;->lastModifyVersion:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 201
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
