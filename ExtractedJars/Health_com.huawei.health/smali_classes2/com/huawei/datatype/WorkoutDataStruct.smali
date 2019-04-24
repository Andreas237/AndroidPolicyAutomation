.class public Lcom/huawei/datatype/WorkoutDataStruct;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dataHeader:Lcom/huawei/datatype/DataHeader;

.field private workout_data_index:I

.field private workout_record_id:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDataHeader()Lcom/huawei/datatype/DataHeader;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/datatype/WorkoutDataStruct;->dataHeader:Lcom/huawei/datatype/DataHeader;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/DataHeader;

    return-object v0
.end method

.method public getWorkout_data_index()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/datatype/WorkoutDataStruct;->workout_data_index:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getWorkout_record_id()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/huawei/datatype/WorkoutDataStruct;->workout_record_id:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public setDataHeader(Lcom/huawei/datatype/DataHeader;)V
    .locals 1

    .line 45
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/datatype/DataHeader;

    iput-object v0, p0, Lcom/huawei/datatype/WorkoutDataStruct;->dataHeader:Lcom/huawei/datatype/DataHeader;

    .line 46
    return-void
.end method

.method public setWorkout_data_index(I)V
    .locals 1

    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/WorkoutDataStruct;->workout_data_index:I

    .line 38
    return-void
.end method

.method public setWorkout_record_id(I)V
    .locals 1

    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/WorkoutDataStruct;->workout_record_id:I

    .line 30
    return-void
.end method
