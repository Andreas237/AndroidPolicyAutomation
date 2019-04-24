.class public Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field activityId:Ljava/lang/String;

.field activityName:Ljava/lang/String;

.field activityStatus:I

.field lastModifyTime:Ljava/lang/String;

.field stepsStandard:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->activityName:Ljava/lang/String;

    .line 24
    iput p2, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->stepsStandard:I

    .line 25
    iput-object p3, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->activityId:Ljava/lang/String;

    .line 26
    iput p4, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->activityStatus:I

    .line 27
    iput-object p5, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->lastModifyTime:Ljava/lang/String;

    .line 28
    return-void
.end method


# virtual methods
.method public getActivityId()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->activityId:Ljava/lang/String;

    return-object v0
.end method

.method public getActivityName()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->activityName:Ljava/lang/String;

    return-object v0
.end method

.method public getActivityStatus()I
    .locals 1

    .line 55
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->activityStatus:I

    return v0
.end method

.method public getLastModifyTime()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->lastModifyTime:Ljava/lang/String;

    return-object v0
.end method

.method public getRemainSteps()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->stepsStandard:I

    return v0
.end method

.method public setActivityId(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->activityId:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public setActivityName(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->activityName:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public setActivityStatus(I)V
    .locals 0

    .line 59
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->activityStatus:I

    .line 60
    return-void
.end method

.method public setLastModifyTime(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->lastModifyTime:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setRemainSteps(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->stepsStandard:I

    .line 44
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ContentRemindSteps{activityName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->activityName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stepsStandard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->stepsStandard:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", activityId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->activityId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", activityStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->activityStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastModifyTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->lastModifyTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public uadpDC1()V
    .locals 0

    .line 84
    return-void
.end method

.method public uadpDC2()V
    .locals 0

    .line 88
    return-void
.end method

.method public uadpDC3()V
    .locals 0

    .line 92
    return-void
.end method

.method public uadpDC4()V
    .locals 0

    .line 96
    return-void
.end method

.method public uadpDC5()V
    .locals 0

    .line 100
    return-void
.end method
