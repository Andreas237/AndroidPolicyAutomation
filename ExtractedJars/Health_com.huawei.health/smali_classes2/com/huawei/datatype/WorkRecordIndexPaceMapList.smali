.class public Lcom/huawei/datatype/WorkRecordIndexPaceMapList;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private paceIndex:I

.field paceMapList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/WorkoutRecordPaceMap;>;"
        }
    .end annotation
.end field

.field private workout_record_id:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;->paceIndex:I

    return-void
.end method


# virtual methods
.method public getPaceIndex()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;->paceIndex:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getPaceMapList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/datatype/WorkoutRecordPaceMap;>;"
        }
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;->paceMapList:Ljava/util/List;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public getWorkout_record_id()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;->workout_record_id:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public procWorkRecordIndexPace1()V
    .locals 0

    .line 52
    return-void
.end method

.method public procWorkRecordIndexPace2()V
    .locals 0

    .line 55
    return-void
.end method

.method public procWorkRecordIndexPace3()V
    .locals 0

    .line 58
    return-void
.end method

.method public procWorkRecordIndexPace4()V
    .locals 0

    .line 61
    return-void
.end method

.method public setPaceIndex(I)V
    .locals 1

    .line 35
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;->paceIndex:I

    .line 36
    return-void
.end method

.method public setPaceMapList(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/WorkoutRecordPaceMap;>;)V"
        }
    .end annotation

    .line 43
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;->paceMapList:Ljava/util/List;

    .line 44
    return-void
.end method

.method public setWorkout_record_id(I)V
    .locals 1

    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/WorkRecordIndexPaceMapList;->workout_record_id:I

    .line 28
    return-void
.end method
