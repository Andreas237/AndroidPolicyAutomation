.class public Lcom/huawei/datatype/WorkoutRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private workoutRecordStructList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/WorkoutRecordStruct;>;"
        }
    .end annotation
.end field

.field private workout_record_count:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getWorkoutRecordStructList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/datatype/WorkoutRecordStruct;>;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/huawei/datatype/WorkoutRecord;->workoutRecordStructList:Ljava/util/List;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getWorkout_record_count()I
    .locals 1

    .line 21
    iget v0, p0, Lcom/huawei/datatype/WorkoutRecord;->workout_record_count:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public setWorkoutRecordStructList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/WorkoutRecordStruct;>;)V"
        }
    .end annotation

    .line 33
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/datatype/WorkoutRecord;->workoutRecordStructList:Ljava/util/List;

    .line 34
    return-void
.end method

.method public setWorkout_record_count(I)V
    .locals 1

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/WorkoutRecord;->workout_record_count:I

    .line 26
    return-void
.end method
