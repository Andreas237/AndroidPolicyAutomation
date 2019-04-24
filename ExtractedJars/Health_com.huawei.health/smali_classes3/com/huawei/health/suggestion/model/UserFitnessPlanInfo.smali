.class public Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private cardImage:Ljava/lang/String;

.field private completeRate:Ljava/lang/String;

.field private createTime:J

.field private description:Ljava/lang/String;

.field private finishTime:J

.field private modifyTime:J

.field private name:Ljava/lang/String;

.field private picture:Ljava/lang/String;

.field private planId:Ljava/lang/String;

.field private planTempId:Ljava/lang/String;

.field private remindTime:I

.field private status:I

.field private totalCalorie:Ljava/lang/String;

.field private weekPlanList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessWeekPlan;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireCardPicture()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->cardImage:Ljava/lang/String;

    return-object v0
.end method

.method public acquireCompleteRate()Ljava/lang/String;
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->completeRate:Ljava/lang/String;

    return-object v0
.end method

.method public acquireCreateTime()J
    .locals 2

    .line 115
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->createTime:J

    return-wide v0
.end method

.method public acquireDescription()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->description:Ljava/lang/String;

    return-object v0
.end method

.method public acquireFinishTime()J
    .locals 2

    .line 131
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->finishTime:J

    return-wide v0
.end method

.method public acquireModifyTime()J
    .locals 2

    .line 123
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->modifyTime:J

    return-wide v0
.end method

.method public acquireName()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePicture()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->picture:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePlanId()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->planId:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePlanStatus()I
    .locals 1

    .line 91
    iget v0, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->status:I

    return v0
.end method

.method public acquirePlanTempId()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->planTempId:Ljava/lang/String;

    return-object v0
.end method

.method public acquireRemindTime()I
    .locals 1

    .line 139
    iget v0, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->remindTime:I

    return v0
.end method

.method public acquireTotalCalorie()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->totalCalorie:Ljava/lang/String;

    return-object v0
.end method

.method public acquireWeekPlanList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessWeekPlan;>;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->weekPlanList:Ljava/util/List;

    return-object v0
.end method

.method public saveCardPicture(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->cardImage:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public saveCompleteRate(Ljava/lang/String;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->completeRate:Ljava/lang/String;

    .line 88
    return-void
.end method

.method public saveCreateTime(J)V
    .locals 0

    .line 119
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->createTime:J

    .line 120
    return-void
.end method

.method public saveDescription(Ljava/lang/String;)V
    .locals 0

    .line 111
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->description:Ljava/lang/String;

    .line 112
    return-void
.end method

.method public saveFinishTime(J)V
    .locals 0

    .line 135
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->finishTime:J

    .line 136
    return-void
.end method

.method public saveModifyTime(J)V
    .locals 0

    .line 127
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->modifyTime:J

    .line 128
    return-void
.end method

.method public saveName(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->name:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public savePicture(Ljava/lang/String;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->picture:Ljava/lang/String;

    .line 104
    return-void
.end method

.method public savePlanId(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->planId:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public savePlanStatus(I)V
    .locals 0

    .line 95
    iput p1, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->status:I

    .line 96
    return-void
.end method

.method public savePlanTempId(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->planTempId:Ljava/lang/String;

    .line 72
    return-void
.end method

.method public saveRemindTime(I)V
    .locals 0

    .line 143
    iput p1, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->remindTime:I

    .line 144
    return-void
.end method

.method public saveTotalCalorie(Ljava/lang/String;)V
    .locals 2

    .line 38
    invoke-static {p1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v1

    .line 39
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->totalCalorie:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public saveWeekPlanList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessWeekPlan;>;)V"
        }
    .end annotation

    .line 47
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->weekPlanList:Ljava/util/List;

    .line 48
    return-void
.end method
