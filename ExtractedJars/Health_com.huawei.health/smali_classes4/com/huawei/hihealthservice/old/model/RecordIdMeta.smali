.class public Lcom/huawei/hihealthservice/old/model/RecordIdMeta;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private startTime:J

.field private subType:I

.field private userDeviceCode:J


# direct methods
.method public constructor <init>(JIJ)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->userDeviceCode:J

    .line 36
    iput p3, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->subType:I

    .line 37
    iput-wide p4, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->startTime:J

    .line 38
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-static {p1}, Lcom/huawei/hihealthservice/old/util/EncodeUtil;->base642bin(Ljava/lang/String;)[B

    move-result-object v2

    .line 44
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->bytesToLong([BI)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->userDeviceCode:J

    .line 45
    const/16 v0, 0x8

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->bytesToInt([BI)I

    move-result v0

    iput v0, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->subType:I

    .line 46
    const/16 v0, 0xc

    invoke-static {v2, v0}, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->bytesToLong([BI)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->startTime:J

    .line 47
    return-void
.end method


# virtual methods
.method public getDataType()I
    .locals 1

    .line 89
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->subType:I

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/model/HealthData;->getDataTypeBySubType(I)I

    move-result v0

    return v0
.end method

.method public getRecordId()Ljava/lang/String;
    .locals 4

    .line 51
    const/16 v0, 0x14

    new-array v3, v0, [B

    .line 52
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->userDeviceCode:J

    const/4 v2, 0x0

    invoke-static {v0, v1, v3, v2}, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->longToBytes(J[BI)V

    .line 53
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->subType:I

    const/16 v1, 0x8

    invoke-static {v0, v3, v1}, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->intToBytes(I[BI)V

    .line 54
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->startTime:J

    const/16 v2, 0xc

    invoke-static {v0, v1, v3, v2}, Lcom/huawei/hihealthservice/old/util/DataConvertUtil;->longToBytes(J[BI)V

    .line 55
    invoke-static {v3}, Lcom/huawei/hihealthservice/old/util/EncodeUtil;->bin2base64([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getStartTime()J
    .locals 2

    .line 96
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->startTime:J

    return-wide v0
.end method

.method public getSubType()I
    .locals 1

    .line 79
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->subType:I

    return v0
.end method

.method public getUserDeviceCode()J
    .locals 2

    .line 66
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->userDeviceCode:J

    return-wide v0
.end method

.method public setStartTime(J)V
    .locals 0

    .line 101
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->startTime:J

    .line 102
    return-void
.end method

.method public setSubType(I)V
    .locals 0

    .line 84
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->subType:I

    .line 85
    return-void
.end method

.method public setUserDeviceCode(J)V
    .locals 0

    .line 71
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->userDeviceCode:J

    .line 72
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 109
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    const-string v0, "RecordIdMeta [userDeviceCode="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->userDeviceCode:J

    .line 111
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataType="

    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->subType:I

    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startTime="

    .line 114
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hihealthservice/old/model/RecordIdMeta;->startTime:J

    .line 115
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
