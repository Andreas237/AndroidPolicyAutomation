.class public Lcom/huawei/hihealthservice/old/db/dao/StatTable;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private createTime:J

.field private lastModifyVersion:J

.field private statData:Ljava/lang/String;

.field private timespan:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCreateTime()J
    .locals 2

    .line 73
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->createTime:J

    return-wide v0
.end method

.method public getLastModifyVersion()J
    .locals 2

    .line 79
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->lastModifyVersion:J

    return-wide v0
.end method

.method public getStatData()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->statData:Ljava/lang/String;

    return-object v0
.end method

.method public getTimespan()I
    .locals 1

    .line 90
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->timespan:I

    return v0
.end method

.method public initFunctionA()V
    .locals 0

    .line 124
    return-void
.end method

.method public initFunctionB()V
    .locals 0

    .line 128
    return-void
.end method

.method public initFunctionC()V
    .locals 0

    .line 132
    return-void
.end method

.method public setCreateTime(J)V
    .locals 0

    .line 76
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->createTime:J

    .line 77
    return-void
.end method

.method public setLastModifyVersion(J)V
    .locals 0

    .line 82
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->lastModifyVersion:J

    .line 83
    return-void
.end method

.method public setStatData(Ljava/lang/String;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->statData:Ljava/lang/String;

    .line 109
    return-void
.end method

.method public setTimespan(I)V
    .locals 0

    .line 95
    iput p1, p0, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->timespan:I

    .line 96
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StatTable [timespan="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->timespan:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", statData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/StatTable;->statData:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
