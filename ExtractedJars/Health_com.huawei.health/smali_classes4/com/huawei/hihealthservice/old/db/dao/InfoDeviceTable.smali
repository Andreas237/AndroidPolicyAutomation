.class public Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private cloudUserDeviceCode:J

.field private createTime:J

.field private deviceId:Ljava/lang/String;

.field private deviceName:Ljava/lang/String;

.field private deviceTypes:Ljava/lang/String;

.field private deviceVersion:Ljava/lang/String;

.field private lastModifyVersion:J

.field private localUserCode:J

.field private localUserDeviceCode:I

.field private productId:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCloudUserDeviceCode()J
    .locals 2

    .line 92
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->cloudUserDeviceCode:J

    return-wide v0
.end method

.method public getCreateTime()J
    .locals 2

    .line 182
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->createTime:J

    return-wide v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->deviceId:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceName()Ljava/lang/String;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->deviceName:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceTypes()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->deviceTypes:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceVersion()Ljava/lang/String;
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->deviceVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getLastModifyVersion()J
    .locals 2

    .line 195
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->lastModifyVersion:J

    return-wide v0
.end method

.method public getLocalUserCode()J
    .locals 2

    .line 118
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->localUserCode:J

    return-wide v0
.end method

.method public getLocalUserDeviceCode()I
    .locals 1

    .line 79
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->localUserDeviceCode:I

    return v0
.end method

.method public getProductId()I
    .locals 1

    .line 208
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->productId:I

    return v0
.end method

.method public initFunctionAb()V
    .locals 0

    .line 253
    return-void
.end method

.method public initFunctionBb()V
    .locals 0

    .line 257
    return-void
.end method

.method public initFunctionCb()V
    .locals 0

    .line 261
    return-void
.end method

.method public setCloudUserDeviceCode(J)V
    .locals 0

    .line 97
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->cloudUserDeviceCode:J

    .line 98
    return-void
.end method

.method public setCreateTime(J)V
    .locals 0

    .line 187
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->createTime:J

    .line 188
    return-void
.end method

.method public setDeviceId(Ljava/lang/String;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->deviceId:Ljava/lang/String;

    .line 136
    return-void
.end method

.method public setDeviceName(Ljava/lang/String;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->deviceName:Ljava/lang/String;

    .line 162
    return-void
.end method

.method public setDeviceTypes(Ljava/lang/String;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->deviceTypes:Ljava/lang/String;

    .line 149
    return-void
.end method

.method public setDeviceVersion(Ljava/lang/String;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->deviceVersion:Ljava/lang/String;

    .line 175
    return-void
.end method

.method public setLastModifyVersion(J)V
    .locals 0

    .line 200
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->lastModifyVersion:J

    .line 201
    return-void
.end method

.method public setLocalUserCode(J)V
    .locals 0

    .line 123
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->localUserCode:J

    .line 124
    return-void
.end method

.method public setLocalUserDeviceCode(I)V
    .locals 0

    .line 84
    iput p1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->localUserDeviceCode:I

    .line 85
    return-void
.end method

.method public setProductId(I)V
    .locals 0

    .line 213
    iput p1, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->productId:I

    .line 214
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 221
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 222
    const-string v0, "InfoDeviceTable [localUserDeviceCode="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->localUserDeviceCode:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 224
    const-string v0, ", cloudUserDeviceCode="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->cloudUserDeviceCode:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 228
    const-string v0, ", localUserCode="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->localUserCode:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 230
    const-string v0, ", deviceId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->deviceId:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    const-string v0, ", productId="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->productId:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 234
    const-string v0, ", deviceTypes="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->deviceTypes:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    const-string v0, ", deviceName="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->deviceName:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    const-string v0, ", deviceVersion="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->deviceVersion:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    const-string v0, ", createTime="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->createTime:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 242
    const-string v0, ", lastModifyVersion="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/InfoDeviceTable;->lastModifyVersion:J

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 244
    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
