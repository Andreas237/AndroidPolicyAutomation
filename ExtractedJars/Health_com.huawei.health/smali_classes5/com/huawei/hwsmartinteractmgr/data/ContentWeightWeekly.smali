.class public Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field changeData:D

.field people:J

.field timeperiod:[J

.field upDown:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x2

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->timeperiod:[J

    .line 27
    return-void
.end method

.method public constructor <init>(IDJ)V
    .locals 1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x2

    new-array v0, v0, [J

    iput-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->timeperiod:[J

    .line 30
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->upDown:I

    .line 31
    iput-wide p2, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->changeData:D

    .line 32
    iput-wide p4, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->people:J

    .line 33
    return-void
.end method


# virtual methods
.method public getChangeData()D
    .locals 2

    .line 53
    iget-wide v0, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->changeData:D

    return-wide v0
.end method

.method public getPeople()J
    .locals 2

    .line 61
    iget-wide v0, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->people:J

    return-wide v0
.end method

.method public getTimeperiod(I)J
    .locals 2

    .line 37
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->timeperiod:[J

    aget-wide v0, v0, p1

    return-wide v0
.end method

.method public getUpDown()I
    .locals 1

    .line 45
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->upDown:I

    return v0
.end method

.method public setChangeData(D)V
    .locals 0

    .line 57
    iput-wide p1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->changeData:D

    .line 58
    return-void
.end method

.method public setPeople(I)V
    .locals 2

    .line 65
    int-to-long v0, p1

    iput-wide v0, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->people:J

    .line 66
    return-void
.end method

.method public setTimeperiod(IJ)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->timeperiod:[J

    aput-wide p2, v0, p1

    .line 42
    return-void
.end method

.method public setUpDown(I)V
    .locals 0

    .line 49
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->upDown:I

    .line 50
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContentWeightWeekly{timeperiod=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->timeperiod:[J

    .line 72
    invoke-static {v1}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", upDown="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->upDown:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", changeData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->changeData:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", people="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentWeightWeekly;->people:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 71
    return-object v0
.end method
