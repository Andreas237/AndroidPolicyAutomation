.class public Lcom/huawei/health/suggestion/model/PlanRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private actualCalorie:F

.field private actualDistance:F

.field private calorie:F

.field private difficulty:I

.field private distance:F

.field private endDate:Ljava/lang/String;

.field private excludedDates:Ljava/util/TreeSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeSet<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private finishDate:J

.field private finishRate:F

.field private goal:I

.field private planId:Ljava/lang/String;

.field private planName:Ljava/lang/String;

.field private planTempId:Ljava/lang/String;

.field private planType:I

.field private startDate:Ljava/lang/String;

.field private version:Ljava/lang/String;

.field private weekCount:I

.field private weekTimes:I

.field private workoutDays:I

.field private workoutTimes:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireActualCalorie()F
    .locals 1

    .line 88
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->actualCalorie:F

    return v0
.end method

.method public acquireActualDistance()F
    .locals 1

    .line 96
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->actualDistance:F

    return v0
.end method

.method public acquireCalorie()F
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->calorie:F

    return v0
.end method

.method public acquireDifficulty()I
    .locals 1

    .line 192
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->difficulty:I

    return v0
.end method

.method public acquireDistance()F
    .locals 1

    .line 80
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->distance:F

    return v0
.end method

.method public acquireEndDate()Ljava/lang/String;
    .locals 1

    .line 144
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->endDate:Ljava/lang/String;

    return-object v0
.end method

.method public acquireExcludedDates()Ljava/util/TreeSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/TreeSet<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 176
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->excludedDates:Ljava/util/TreeSet;

    return-object v0
.end method

.method public acquireFinishDate()J
    .locals 2

    .line 168
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->finishDate:J

    return-wide v0
.end method

.method public acquireFinishRate()F
    .locals 1

    .line 152
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->finishRate:F

    invoke-static {v0}, Lo/bya;->c(F)F

    move-result v0

    return v0
.end method

.method public acquireGoal()I
    .locals 1

    .line 200
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->goal:I

    return v0
.end method

.method public acquirePlanId()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->planId:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePlanName()Ljava/lang/String;
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->planName:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePlanTempId()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->planTempId:Ljava/lang/String;

    return-object v0
.end method

.method public acquirePlanType()I
    .locals 1

    .line 128
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->planType:I

    return v0
.end method

.method public acquireStartDate()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->startDate:Ljava/lang/String;

    return-object v0
.end method

.method public acquireVersion()Ljava/lang/String;
    .locals 1

    .line 208
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->version:Ljava/lang/String;

    return-object v0
.end method

.method public acquireWeekCount()I
    .locals 1

    .line 160
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->weekCount:I

    return v0
.end method

.method public acquireWeekTimes()I
    .locals 1

    .line 184
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->weekTimes:I

    return v0
.end method

.method public acquireWorkoutDays()I
    .locals 1

    .line 104
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->workoutDays:I

    return v0
.end method

.method public acquireWorkoutTimes()I
    .locals 1

    .line 112
    iget v0, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->workoutTimes:I

    return v0
.end method

.method public saveActualCalorie(F)V
    .locals 0

    .line 92
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->actualCalorie:F

    .line 93
    return-void
.end method

.method public saveActualDistance(F)V
    .locals 0

    .line 100
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->actualDistance:F

    .line 101
    return-void
.end method

.method public saveCalorie(F)V
    .locals 0

    .line 76
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->calorie:F

    .line 77
    return-void
.end method

.method public saveDifficulty(I)V
    .locals 0

    .line 196
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->difficulty:I

    .line 197
    return-void
.end method

.method public saveDistance(F)V
    .locals 0

    .line 84
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->distance:F

    .line 85
    return-void
.end method

.method public saveEndDate(Ljava/lang/String;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->endDate:Ljava/lang/String;

    .line 149
    return-void
.end method

.method public saveExcludedDates(Ljava/util/TreeSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/TreeSet<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 180
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->excludedDates:Ljava/util/TreeSet;

    .line 181
    return-void
.end method

.method public saveFinishDate(J)V
    .locals 0

    .line 172
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->finishDate:J

    .line 173
    return-void
.end method

.method public saveFinishRate(F)V
    .locals 0

    .line 156
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->finishRate:F

    .line 157
    return-void
.end method

.method public saveGoal(I)V
    .locals 0

    .line 204
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->goal:I

    .line 205
    return-void
.end method

.method public savePlanId(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->planId:Ljava/lang/String;

    .line 69
    return-void
.end method

.method public savePlanName(Ljava/lang/String;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->planName:Ljava/lang/String;

    .line 125
    return-void
.end method

.method public savePlanTempId(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->planTempId:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public savePlanType(I)V
    .locals 0

    .line 132
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->planType:I

    .line 133
    return-void
.end method

.method public saveStartDate(Ljava/lang/String;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->startDate:Ljava/lang/String;

    .line 141
    return-void
.end method

.method public saveVersion(Ljava/lang/String;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->version:Ljava/lang/String;

    .line 213
    return-void
.end method

.method public saveWeekCount(I)V
    .locals 0

    .line 164
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->weekCount:I

    .line 165
    return-void
.end method

.method public saveWeekTimes(I)V
    .locals 0

    .line 188
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->weekTimes:I

    .line 189
    return-void
.end method

.method public saveWorkoutDays(I)V
    .locals 0

    .line 108
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->workoutDays:I

    .line 109
    return-void
.end method

.method public saveWorkoutTimes(I)V
    .locals 0

    .line 116
    iput p1, p0, Lcom/huawei/health/suggestion/model/PlanRecord;->workoutTimes:I

    .line 117
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 217
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
