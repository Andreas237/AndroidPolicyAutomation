.class public Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final STATUS_EXAMINE:I = 0x0


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

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getActivityId()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->activityId:Ljava/lang/String;

    return-object v0
.end method

.method public getActivityName()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->activityName:Ljava/lang/String;

    return-object v0
.end method

.method public getActivityStatus()I
    .locals 1

    .line 145
    iget v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->activityStatus:I

    return v0
.end method

.method public getActivityType()I
    .locals 1

    .line 81
    iget v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->activityType:I

    return v0
.end method

.method public getBeginTime()Ljava/lang/String;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->beginTime:Ljava/lang/String;

    return-object v0
.end method

.method public getDetails()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->details:Ljava/lang/String;

    return-object v0
.end method

.method public getEndTime()Ljava/lang/String;
    .locals 1

    .line 121
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->endTime:Ljava/lang/String;

    return-object v0
.end method

.method public getGoalValue()D
    .locals 2

    .line 89
    iget-wide v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->goalValue:D

    return-wide v0
.end method

.method public getImgUrl()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->imgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getLastTime()Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->lastTime:Ljava/lang/String;

    return-object v0
.end method

.method public getNumberOfPeople()I
    .locals 1

    .line 137
    iget v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->numberOfPeople:I

    return v0
.end method

.method public getStatus()I
    .locals 1

    .line 153
    iget v0, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->status:I

    return v0
.end method

.method public setActivityId(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->activityId:Ljava/lang/String;

    .line 70
    return-void
.end method

.method public setActivityName(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->activityName:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public setActivityStatus(I)V
    .locals 0

    .line 149
    iput p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->activityStatus:I

    .line 150
    return-void
.end method

.method public setActivityType(I)V
    .locals 0

    .line 85
    iput p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->activityType:I

    .line 86
    return-void
.end method

.method public setBeginTime(Ljava/lang/String;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->beginTime:Ljava/lang/String;

    .line 118
    return-void
.end method

.method public setDetails(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->details:Ljava/lang/String;

    .line 102
    return-void
.end method

.method public setEndTime(Ljava/lang/String;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->endTime:Ljava/lang/String;

    .line 126
    return-void
.end method

.method public setGoalValue(D)V
    .locals 0

    .line 93
    iput-wide p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->goalValue:D

    .line 94
    return-void
.end method

.method public setImgUrl(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->imgUrl:Ljava/lang/String;

    .line 110
    return-void
.end method

.method public setLastTime(Ljava/lang/String;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->lastTime:Ljava/lang/String;

    .line 134
    return-void
.end method

.method public setNumberOfPeople(I)V
    .locals 0

    .line 141
    iput p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->numberOfPeople:I

    .line 142
    return-void
.end method

.method public setStatus(I)V
    .locals 0

    .line 157
    iput p1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->status:I

    .line 158
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HealthServerGroupActivity{activityId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->activityId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", activityName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->activityName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", activityType=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->activityType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", goalValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->goalValue:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", details=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->details:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imgUrl=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->imgUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", beginTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->beginTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->endTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->lastTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", numberOfPeople="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->numberOfPeople:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", activityStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->activityStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/ui/group/healthbeans/HealthServerGroupActivity;->status:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
