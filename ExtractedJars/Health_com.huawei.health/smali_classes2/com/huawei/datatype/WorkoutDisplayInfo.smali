.class public Lcom/huawei/datatype/WorkoutDisplayInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private chiefSportDataType:I

.field private hasTrackPoint:Z

.field private isFreeMotion:Z

.field private sportDataSource:I

.field private workoutType:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/datatype/WorkoutDisplayInfo;->isFreeMotion:Z

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/datatype/WorkoutDisplayInfo;->sportDataSource:I

    .line 23
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/datatype/WorkoutDisplayInfo;->chiefSportDataType:I

    .line 28
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/datatype/WorkoutDisplayInfo;->hasTrackPoint:Z

    .line 33
    const/16 v0, 0x102

    iput v0, p0, Lcom/huawei/datatype/WorkoutDisplayInfo;->workoutType:I

    return-void
.end method


# virtual methods
.method public getChiefSportDataType()I
    .locals 1

    .line 56
    iget v0, p0, Lcom/huawei/datatype/WorkoutDisplayInfo;->chiefSportDataType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getFreeMotion()Z
    .locals 1

    .line 40
    iget-boolean v0, p0, Lcom/huawei/datatype/WorkoutDisplayInfo;->isFreeMotion:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getSportDataSource()I
    .locals 1

    .line 48
    iget v0, p0, Lcom/huawei/datatype/WorkoutDisplayInfo;->sportDataSource:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getWorkoutType()I
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/datatype/WorkoutDisplayInfo;->workoutType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public isHasTrackPoint()Z
    .locals 1

    .line 64
    iget-boolean v0, p0, Lcom/huawei/datatype/WorkoutDisplayInfo;->hasTrackPoint:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public procWorkoutDisplayInfo1()V
    .locals 0

    .line 76
    return-void
.end method

.method public procWorkoutDisplayInfo2()V
    .locals 0

    .line 77
    return-void
.end method

.method public procWorkoutDisplayInfo3()V
    .locals 0

    .line 78
    return-void
.end method

.method public procWorkoutDisplayInfo4()V
    .locals 0

    .line 79
    return-void
.end method

.method public procWorkoutDisplayInfo5()V
    .locals 0

    .line 80
    return-void
.end method

.method public procWorkoutDisplayInfo6()V
    .locals 0

    .line 81
    return-void
.end method

.method public setChiefSportDataType(I)V
    .locals 1

    .line 52
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/WorkoutDisplayInfo;->chiefSportDataType:I

    .line 53
    return-void
.end method

.method public setFreeMotion(Z)V
    .locals 1

    .line 36
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/datatype/WorkoutDisplayInfo;->isFreeMotion:Z

    .line 37
    return-void
.end method

.method public setHasTrackPoint(Z)V
    .locals 1

    .line 60
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/datatype/WorkoutDisplayInfo;->hasTrackPoint:Z

    .line 61
    return-void
.end method

.method public setSportDataSource(I)V
    .locals 1

    .line 44
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/WorkoutDisplayInfo;->sportDataSource:I

    .line 45
    return-void
.end method

.method public setWorkoutType(I)V
    .locals 1

    .line 68
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/WorkoutDisplayInfo;->workoutType:I

    .line 69
    return-void
.end method
