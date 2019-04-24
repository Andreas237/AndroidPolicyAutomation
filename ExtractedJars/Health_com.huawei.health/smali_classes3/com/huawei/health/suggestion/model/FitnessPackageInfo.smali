.class public Lcom/huawei/health/suggestion/model/FitnessPackageInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private cardImage:Ljava/lang/String;

.field private description:Ljava/lang/String;

.field private displayOrder:I

.field private fitnessWeekPlanList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessWeekPlan;>;"
        }
    .end annotation
.end field

.field private name:Ljava/lang/String;

.field private picture:Ljava/lang/String;

.field private planTempId:Ljava/lang/String;

.field private stage:I

.field private totalCalorie:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->planTempId:Ljava/lang/String;

    .line 53
    return-void
.end method


# virtual methods
.method public acquireCardPicture()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->cardImage:Ljava/lang/String;

    return-object v0
.end method

.method public acquireDescription()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->description:Ljava/lang/String;

    return-object v0
.end method

.method public acquireDisplayOrder()I
    .locals 1

    .line 92
    iget v0, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->displayOrder:I

    return v0
.end method

.method public acquireFitnessWeekPlanList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessWeekPlan;>;"
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->fitnessWeekPlanList:Ljava/util/List;

    return-object v0
.end method

.method public acquireName()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePicture()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->picture:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePlanTempId()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->planTempId:Ljava/lang/String;

    return-object v0
.end method

.method public acquireStage()I
    .locals 1

    .line 116
    iget v0, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->stage:I

    return v0
.end method

.method public acquireTotalCalorie()I
    .locals 1

    .line 60
    iget v0, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->totalCalorie:I

    return v0
.end method

.method public acquireTotalCourse()I
    .locals 9

    .line 23
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->fitnessWeekPlanList:Ljava/util/List;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 24
    const/4 v0, 0x0

    return v0

    .line 27
    :cond_0
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->fitnessWeekPlanList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_4

    .line 30
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->fitnessWeekPlanList:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;

    .line 31
    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->acquireWeekList()Ljava/util/List;

    move-result-object v5

    .line 32
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 33
    goto :goto_3

    .line 36
    :cond_1
    const/4 v6, 0x0

    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_3

    .line 37
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 38
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->acquireDayPlanCourses()Ljava/util/List;

    move-result-object v8

    .line 39
    const/4 v0, 0x0

    if-ne v0, v8, :cond_2

    .line 40
    goto :goto_2

    .line 43
    :cond_2
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v2, v0

    .line 36
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 29
    :cond_3
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 47
    :cond_4
    return v2
.end method

.method public saveCardPicture(Ljava/lang/String;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->cardImage:Ljava/lang/String;

    .line 81
    return-void
.end method

.method public saveDescription(Ljava/lang/String;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->description:Ljava/lang/String;

    .line 89
    return-void
.end method

.method public saveDisplayOrder(I)V
    .locals 0

    .line 96
    iput p1, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->displayOrder:I

    .line 97
    return-void
.end method

.method public saveFitnessWeekPlanList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessWeekPlan;>;)V"
        }
    .end annotation

    .line 72
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->fitnessWeekPlanList:Ljava/util/List;

    .line 73
    return-void
.end method

.method public saveName(Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->name:Ljava/lang/String;

    .line 105
    return-void
.end method

.method public savePicture(Ljava/lang/String;)V
    .locals 0

    .line 112
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->picture:Ljava/lang/String;

    .line 113
    return-void
.end method

.method public saveStage(I)V
    .locals 0

    .line 120
    iput p1, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->stage:I

    .line 121
    return-void
.end method

.method public saveTotalCalorie(I)V
    .locals 0

    .line 64
    iput p1, p0, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->totalCalorie:I

    .line 65
    return-void
.end method
