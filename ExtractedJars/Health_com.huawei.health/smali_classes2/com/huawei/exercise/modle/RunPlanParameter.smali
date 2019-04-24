.class public Lcom/huawei/exercise/modle/RunPlanParameter;
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

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRun_plan_algorithm_type()I
    .locals 1

    .line 39
    iget v0, p0, Lcom/huawei/exercise/modle/RunPlanParameter;->run_plan_algorithm_type:I

    return v0
.end method

.method public getRun_plan_algorithm_version()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/exercise/modle/RunPlanParameter;->run_plan_algorithm_version:Ljava/lang/String;

    return-object v0
.end method

.method public getRun_plan_sign()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/exercise/modle/RunPlanParameter;->run_plan_sign:Ljava/lang/String;

    return-object v0
.end method

.method public getRun_plan_sync_size()I
    .locals 1

    .line 71
    iget v0, p0, Lcom/huawei/exercise/modle/RunPlanParameter;->run_plan_sync_size:I

    return v0
.end method

.method public getRun_plan_sync_size_pre()I
    .locals 1

    .line 55
    iget v0, p0, Lcom/huawei/exercise/modle/RunPlanParameter;->run_plan_sync_size_pre:I

    return v0
.end method

.method public getRun_plan_sync_size_sub()I
    .locals 1

    .line 63
    iget v0, p0, Lcom/huawei/exercise/modle/RunPlanParameter;->run_plan_sync_size_sub:I

    return v0
.end method

.method public getRun_plan_total_sign()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/exercise/modle/RunPlanParameter;->run_plan_total_sign:Ljava/lang/String;

    return-object v0
.end method

.method public setRun_plan_algorithm_type(I)V
    .locals 0

    .line 43
    iput p1, p0, Lcom/huawei/exercise/modle/RunPlanParameter;->run_plan_algorithm_type:I

    .line 44
    return-void
.end method

.method public setRun_plan_algorithm_version(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/exercise/modle/RunPlanParameter;->run_plan_algorithm_version:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public setRun_plan_sign(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/exercise/modle/RunPlanParameter;->run_plan_sign:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public setRun_plan_sync_size(I)V
    .locals 0

    .line 75
    iput p1, p0, Lcom/huawei/exercise/modle/RunPlanParameter;->run_plan_sync_size:I

    .line 76
    return-void
.end method

.method public setRun_plan_sync_size_pre(I)V
    .locals 0

    .line 59
    iput p1, p0, Lcom/huawei/exercise/modle/RunPlanParameter;->run_plan_sync_size_pre:I

    .line 60
    return-void
.end method

.method public setRun_plan_sync_size_sub(I)V
    .locals 0

    .line 67
    iput p1, p0, Lcom/huawei/exercise/modle/RunPlanParameter;->run_plan_sync_size_sub:I

    .line 68
    return-void
.end method

.method public setRun_plan_total_sign(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/exercise/modle/RunPlanParameter;->run_plan_total_sign:Ljava/lang/String;

    .line 28
    return-void
.end method
