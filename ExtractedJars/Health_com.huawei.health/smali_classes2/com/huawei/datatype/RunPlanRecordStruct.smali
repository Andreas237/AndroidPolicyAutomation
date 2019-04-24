.class public Lcom/huawei/datatype/RunPlanRecordStruct;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private paceIndexCount:I

.field private run_plan_index_count:I

.field private run_plan_record_id:I

.field private run_plan_workout_id:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordStruct;->paceIndexCount:I

    return-void
.end method


# virtual methods
.method public getPaceIndextCount()I
    .locals 1

    .line 54
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordStruct;->paceIndexCount:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_index_count()I
    .locals 1

    .line 46
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordStruct;->run_plan_index_count:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_record_id()I
    .locals 1

    .line 38
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordStruct;->run_plan_record_id:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_workout_id()I
    .locals 1

    .line 30
    iget v0, p0, Lcom/huawei/datatype/RunPlanRecordStruct;->run_plan_workout_id:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public procRunPlanRecordStruct1()V
    .locals 0

    .line 62
    return-void
.end method

.method public procRunPlanRecordStruct2()V
    .locals 0

    .line 63
    return-void
.end method

.method public procRunPlanRecordStruct3()V
    .locals 0

    .line 64
    return-void
.end method

.method public procRunPlanRecordStruct4()V
    .locals 0

    .line 65
    return-void
.end method

.method public procRunPlanRecordStruct5()V
    .locals 0

    .line 66
    return-void
.end method

.method public setPaceIndextCount(I)V
    .locals 1

    .line 58
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordStruct;->paceIndexCount:I

    .line 59
    return-void
.end method

.method public setRun_plan_index_count(I)V
    .locals 1

    .line 50
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordStruct;->run_plan_index_count:I

    .line 51
    return-void
.end method

.method public setRun_plan_record_id(I)V
    .locals 1

    .line 42
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordStruct;->run_plan_record_id:I

    .line 43
    return-void
.end method

.method public setRun_plan_workout_id(I)V
    .locals 1

    .line 34
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanRecordStruct;->run_plan_workout_id:I

    .line 35
    return-void
.end method
