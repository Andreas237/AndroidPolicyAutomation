.class public Lcom/huawei/health/suggestion/model/FitnessPlanCourse;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field private static final ALPHA:D = 1.0E-6


# instance fields
.field private burnedCalorie:D

.field private calorie:I

.field private finish:Z

.field private name:Ljava/lang/String;

.field private restTime:I

.field private workoutId:Ljava/lang/String;

.field private workoutRealCal:D


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireBurnedCalorie()D
    .locals 4

    .line 27
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->burnedCalorie:D

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 28
    iget v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->calorie:I

    int-to-double v0, v0

    return-wide v0

    .line 30
    :cond_0
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->burnedCalorie:D

    return-wide v0
.end method

.method public acquireCalorie()I
    .locals 1

    .line 19
    iget v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->calorie:I

    return v0
.end method

.method public acquireCourseId()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->workoutId:Ljava/lang/String;

    return-object v0
.end method

.method public acquireFinishStatus()Z
    .locals 1

    .line 57
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->finish:Z

    return v0
.end method

.method public acquireName()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->name:Ljava/lang/String;

    return-object v0
.end method

.method public acquireWorkoutRealCal()D
    .locals 4

    .line 38
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->workoutRealCal:D

    const-wide v2, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    cmpg-double v0, v0, v2

    if-gez v0, :cond_0

    .line 39
    iget v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->calorie:I

    int-to-double v0, v0

    return-wide v0

    .line 41
    :cond_0
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->workoutRealCal:D

    return-wide v0
.end method

.method public acquireWorkoutTime()I
    .locals 1

    .line 65
    iget v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->restTime:I

    return v0
.end method

.method protected clone()Ljava/lang/Object;
    .locals 3

    .line 83
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    .line 84
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->finish:Z

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveFinishStatus(Z)V

    .line 85
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->workoutId:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveCourseId(Ljava/lang/String;)V

    .line 86
    iget v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->restTime:I

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveWorkoutTime(I)V

    .line 87
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->name:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveName(Ljava/lang/String;)V

    .line 88
    iget v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->calorie:I

    invoke-virtual {v2, v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveCalorie(I)V

    .line 89
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->burnedCalorie:D

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveBurnedCalorie(D)V

    .line 90
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->workoutRealCal:D

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->saveWorkoutRealCal(D)V
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    return-object v2

    .line 94
    :catch_0
    move-exception v2

    .line 95
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public saveBurnedCalorie(D)V
    .locals 0

    .line 34
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->burnedCalorie:D

    .line 35
    return-void
.end method

.method public saveCalorie(I)V
    .locals 0

    .line 23
    iput p1, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->calorie:I

    .line 24
    return-void
.end method

.method public saveCourseId(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->workoutId:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public saveFinishStatus(Z)V
    .locals 0

    .line 61
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->finish:Z

    .line 62
    return-void
.end method

.method public saveName(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->name:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public saveWorkoutRealCal(D)V
    .locals 0

    .line 45
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->workoutRealCal:D

    .line 46
    return-void
.end method

.method public saveWorkoutTime(I)V
    .locals 0

    .line 69
    iput p1, p0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->restTime:I

    .line 70
    return-void
.end method
