.class public Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "Track_RecommendSchedule"


# instance fields
.field private mCurWorkout:I

.field private mLastWorkout:I

.field private mRecommendWorkouts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;>;"
        }
    .end annotation
.end field

.field private mRestWeight:I

.field private mWeightSum:I

.field private mWorkoutsNum:I


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;>;)V"
        }
    .end annotation

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mWeightSum:I

    .line 30
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRestWeight:I

    .line 32
    iput-object p2, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    .line 33
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    if-nez v0, :cond_0

    .line 34
    const-string v0, "Track_RecommendSchedule"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "works is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    return-void

    .line 38
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mCurWorkout:I

    .line 39
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mLastWorkout:I

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mWorkoutsNum:I

    .line 43
    return-void
.end method

.method private resetRecommendStatus()V
    .locals 5

    .line 50
    const-string v0, "Track_RecommendSchedule"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetRecommendStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mWeightSum:I

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRestWeight:I

    .line 52
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mCurWorkout:I

    .line 53
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 54
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_1

    .line 55
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    invoke-virtual {v0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->resetWeight()V

    .line 54
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 61
    :cond_1
    return-void
.end method


# virtual methods
.method public acquireCurWorkout()I
    .locals 1

    .line 100
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mCurWorkout:I

    return v0
.end method

.method public acquireLastRecommend()Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;
    .locals 2

    .line 116
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mLastWorkout:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 118
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mCurWorkout:I

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mCurWorkout:I

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 119
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mCurWorkout:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    return-object v0

    .line 121
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 124
    :cond_1
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mLastWorkout:I

    if-ltz v0, :cond_2

    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mLastWorkout:I

    iget-object v1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mLastWorkout:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    return-object v0

    .line 127
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public acquireRecommendWorkouts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;>;"
        }
    .end annotation

    .line 92
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    return-object v0
.end method

.method public acquireRestWeight()I
    .locals 1

    .line 84
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRestWeight:I

    return v0
.end method

.method public acquireWeightSum()I
    .locals 1

    .line 76
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mWeightSum:I

    return v0
.end method

.method public acquireWorkoutsNum()I
    .locals 1

    .line 108
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mWorkoutsNum:I

    return v0
.end method

.method public getRecommendWorkout()Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;
    .locals 7

    .line 133
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 134
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 137
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    iget v1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mCurWorkout:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    .line 139
    invoke-virtual {v2}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireRestWeight()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->saveRestWeight(I)V

    .line 140
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRestWeight:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRestWeight:I

    .line 141
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mCurWorkout:I

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mLastWorkout:I

    .line 144
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRestWeight:I

    if-nez v0, :cond_2

    .line 145
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->resetRecommendStatus()V

    .line 149
    :cond_2
    iget v3, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mLastWorkout:I

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    .line 151
    const/4 v5, 0x1

    :goto_0
    if-ge v5, v4, :cond_4

    .line 153
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    add-int v1, v3, v5

    rem-int/2addr v1, v4

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;

    .line 154
    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;->acquireRestWeight()I

    move-result v0

    if-lez v0, :cond_3

    .line 155
    add-int v0, v3, v5

    rem-int/2addr v0, v4

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mCurWorkout:I

    .line 156
    goto :goto_1

    .line 151
    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 161
    :cond_4
    :goto_1
    iget v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mCurWorkout:I

    if-ne v0, v3, :cond_5

    .line 162
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->resetRecommendStatus()V

    .line 165
    :cond_5
    return-object v2
.end method

.method public resetSchedule()V
    .locals 1

    .line 71
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mLastWorkout:I

    .line 72
    invoke-direct {p0}, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->resetRecommendStatus()V

    .line 73
    return-void
.end method

.method public saveCurWorkout(I)V
    .locals 0

    .line 104
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mCurWorkout:I

    .line 105
    return-void
.end method

.method public saveRecommendWorkouts(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendWorkout;>;)V"
        }
    .end annotation

    .line 96
    iput-object p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRecommendWorkouts:Ljava/util/List;

    .line 97
    return-void
.end method

.method public saveRestWeight(I)V
    .locals 0

    .line 88
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mRestWeight:I

    .line 89
    return-void
.end method

.method public saveWeightSum(I)V
    .locals 0

    .line 80
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mWeightSum:I

    .line 81
    return-void
.end method

.method public saveWorkoutsNum(I)V
    .locals 0

    .line 112
    iput p1, p0, Lcom/huawei/ui/homehealth/runCard/operation/recommendAlgo/model/RecommendSchedule;->mWorkoutsNum:I

    .line 113
    return-void
.end method
