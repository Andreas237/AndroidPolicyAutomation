.class public Lcom/huawei/hihealthservice/old/db/dao/DataTable;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private createTime:J

.field private data:Ljava/lang/String;

.field private lastModifyVersion:J

.field private recordDay:I

.field private timeZone:Ljava/lang/Integer;


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

    .line 39
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->createTime:J

    return-wide v0
.end method

.method public getData()Ljava/lang/String;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->data:Ljava/lang/String;

    return-object v0
.end method

.method public getLastModifyVersion()J
    .locals 2

    .line 49
    iget-wide v0, p0, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->lastModifyVersion:J

    return-wide v0
.end method

.method public getRecordDay()I
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->recordDay:I

    return v0
.end method

.method public getTimeZone()Ljava/lang/Integer;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->timeZone:Ljava/lang/Integer;

    return-object v0
.end method

.method public initFunctionAb()V
    .locals 0

    .line 106
    return-void
.end method

.method public initFunctionBb()V
    .locals 0

    .line 110
    return-void
.end method

.method public initFunctionCb()V
    .locals 0

    .line 114
    return-void
.end method

.method public setCreateTime(J)V
    .locals 0

    .line 44
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->createTime:J

    .line 45
    return-void
.end method

.method public setData(Ljava/lang/String;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->data:Ljava/lang/String;

    .line 91
    return-void
.end method

.method public setLastModifyVersion(J)V
    .locals 0

    .line 54
    iput-wide p1, p0, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->lastModifyVersion:J

    .line 55
    return-void
.end method

.method public setRecordDay(I)V
    .locals 0

    .line 77
    iput p1, p0, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->recordDay:I

    .line 78
    return-void
.end method

.method public setTimeZone(Ljava/lang/Integer;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->timeZone:Ljava/lang/Integer;

    .line 65
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DataTable [recordDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->recordDay:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hihealthservice/old/db/dao/DataTable;->data:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
