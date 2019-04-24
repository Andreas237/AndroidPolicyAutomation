.class public Lcom/huawei/datatype/RunPlanParameter;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private run_plan_algorithm_type:I

.field private run_plan_algorithm_version:Ljava/lang/String;

.field private run_plan_sign:Ljava/lang/String;

.field private run_plan_sync_size:I

.field private run_plan_sync_size_pre:I

.field private run_plan_sync_size_sub:I

.field private run_plan_total_sign:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRun_plan_algorithm_type()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/huawei/datatype/RunPlanParameter;->run_plan_algorithm_type:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_algorithm_version()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/huawei/datatype/RunPlanParameter;->run_plan_algorithm_version:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRun_plan_sign()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/huawei/datatype/RunPlanParameter;->run_plan_sign:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRun_plan_sync_size()I
    .locals 1

    .line 90
    iget v0, p0, Lcom/huawei/datatype/RunPlanParameter;->run_plan_sync_size:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_sync_size_pre()I
    .locals 1

    .line 50
    iget v0, p0, Lcom/huawei/datatype/RunPlanParameter;->run_plan_sync_size_pre:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_sync_size_sub()I
    .locals 1

    .line 42
    iget v0, p0, Lcom/huawei/datatype/RunPlanParameter;->run_plan_sync_size_sub:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getRun_plan_total_sign()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/datatype/RunPlanParameter;->run_plan_total_sign:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setRun_plan_algorithm_type(I)V
    .locals 1

    .line 78
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanParameter;->run_plan_algorithm_type:I

    .line 79
    return-void
.end method

.method public setRun_plan_algorithm_version(Ljava/lang/String;)V
    .locals 1

    .line 86
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/datatype/RunPlanParameter;->run_plan_algorithm_version:Ljava/lang/String;

    .line 87
    return-void
.end method

.method public setRun_plan_sign(Ljava/lang/String;)V
    .locals 1

    .line 70
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/datatype/RunPlanParameter;->run_plan_sign:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public setRun_plan_sync_size(I)V
    .locals 1

    .line 94
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanParameter;->run_plan_sync_size:I

    .line 95
    return-void
.end method

.method public setRun_plan_sync_size_pre(I)V
    .locals 1

    .line 54
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanParameter;->run_plan_sync_size_pre:I

    .line 55
    return-void
.end method

.method public setRun_plan_sync_size_sub(I)V
    .locals 1

    .line 46
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/datatype/RunPlanParameter;->run_plan_sync_size_sub:I

    .line 47
    return-void
.end method

.method public setRun_plan_total_sign(Ljava/lang/String;)V
    .locals 1

    .line 62
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/datatype/RunPlanParameter;->run_plan_total_sign:Ljava/lang/String;

    .line 63
    return-void
.end method
