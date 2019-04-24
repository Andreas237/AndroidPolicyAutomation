.class public Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final ACTIVITY_STATUS_COMPLETE:I = 0x1

.field public static final ACTIVITY_STATUS_NO_COMPLETE:I = 0x0

.field public static final ACTIVITY_STATUS_NO_JOIN:I = -0x1


# instance fields
.field private activityId:Ljava/lang/String;

.field private activityName:Ljava/lang/String;

.field private activityStatus:I

.field private activityType:I

.field private beginTime:Ljava/lang/String;

.field private details:Ljava/lang/String;

.field private endTime:Ljava/lang/String;

.field private goalValue:D

.field private imgUrl:Ljava/lang/String;

.field private lastTime:Ljava/lang/String;

.field private numberOfPeople:I

.field private status:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getActivityId()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->activityId:Ljava/lang/String;

    return-object v0
.end method

.method public getActivityName()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->activityName:Ljava/lang/String;

    return-object v0
.end method

.method public getActivityStatus()I
    .locals 1

    .line 159
    iget v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->activityStatus:I

    return v0
.end method

.method public getActivityType()I
    .locals 1

    .line 95
    iget v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->activityType:I

    return v0
.end method

.method public getBeginTime()Ljava/lang/String;
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->beginTime:Ljava/lang/String;

    return-object v0
.end method

.method public getDetails()Ljava/lang/String;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->details:Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime()Ljava/lang/String;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public getGoalValue()D
    .locals 2

    .line 103
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->goalValue:D

    return-wide v0
.end method

.method public getImgUrl()Ljava/lang/String;
    .locals 1

    .line 119
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->imgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLastTime()Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->lastTime:Ljava/lang/String;

    return-object v0
.end method

.method public getNumberOfPeople()I
    .locals 1

    .line 151
    iget v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->numberOfPeople:I

    return v0
.end method

.method public getStatus()I
    .locals 1

    .line 167
    iget v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->status:I

    return v0
.end method

.method public setActivityId(Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->activityId:Ljava/lang/String;

    .line 84
    return-void
.end method

.method public setActivityName(Ljava/lang/String;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->activityName:Ljava/lang/String;

    .line 92
    return-void
.end method

.method public setActivityStatus(I)V
    .locals 0

    .line 163
    iput p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->activityStatus:I

    .line 164
    return-void
.end method

.method public setActivityType(I)V
    .locals 0

    .line 99
    iput p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->activityType:I

    .line 100
    return-void
.end method

.method public setBeginTime(Ljava/lang/String;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->beginTime:Ljava/lang/String;

    .line 132
    return-void
.end method

.method public setDetails(Ljava/lang/String;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->details:Ljava/lang/String;

    .line 116
    return-void
.end method

.method public setEndTime(Ljava/lang/String;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->endTime:Ljava/lang/String;

    .line 140
    return-void
.end method

.method public setGoalValue(D)V
    .locals 0

    .line 107
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->goalValue:D

    .line 108
    return-void
.end method

.method public setImgUrl(Ljava/lang/String;)V
    .locals 0

    .line 123
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->imgUrl:Ljava/lang/String;

    .line 124
    return-void
.end method

.method public setLastTime(Ljava/lang/String;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->lastTime:Ljava/lang/String;

    .line 148
    return-void
.end method

.method public setNumberOfPeople(I)V
    .locals 0

    .line 155
    iput p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->numberOfPeople:I

    .line 156
    return-void
.end method

.method public setStatus(I)V
    .locals 0

    .line 171
    iput p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->status:I

    .line 172
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HealthGroupActivityBean{activityId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->activityId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", activityName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->activityName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", activityType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->activityType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", goalValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->goalValue:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", details=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->details:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imgUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->imgUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", beginTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->beginTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->endTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->lastTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", numberOfPeople="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->numberOfPeople:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", activityStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->activityStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->status:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
