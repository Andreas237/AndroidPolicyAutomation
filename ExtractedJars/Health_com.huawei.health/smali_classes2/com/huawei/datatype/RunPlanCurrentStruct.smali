.class public Lcom/huawei/datatype/RunPlanCurrentStruct;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private run_plan_calorie:I

.field private run_plan_distance:I

.field private run_plan_hr:I

.field private run_plan_id:Ljava/lang/String;

.field private run_plan_speed:I

.field private run_plan_time:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRun_plan_calorie()I
    .locals 1

    .line 66
    iget v0, p0, Lcom/huawei/datatype/RunPlanCurrentStruct;->run_plan_calorie:I

    return v0
.end method

.method public getRun_plan_distance()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/huawei/datatype/RunPlanCurrentStruct;->run_plan_distance:I

    return v0
.end method

.method public getRun_plan_hr()I
    .locals 1

    .line 50
    iget v0, p0, Lcom/huawei/datatype/RunPlanCurrentStruct;->run_plan_hr:I

    return v0
.end method

.method public getRun_plan_id()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/datatype/RunPlanCurrentStruct;->run_plan_id:Ljava/lang/String;

    return-object v0
.end method

.method public getRun_plan_speed()I
    .locals 1

    .line 42
    iget v0, p0, Lcom/huawei/datatype/RunPlanCurrentStruct;->run_plan_speed:I

    return v0
.end method

.method public getRun_plan_time()I
    .locals 1

    .line 58
    iget v0, p0, Lcom/huawei/datatype/RunPlanCurrentStruct;->run_plan_time:I

    return v0
.end method

.method public setRun_plan_calorie(I)V
    .locals 0

    .line 70
    iput p1, p0, Lcom/huawei/datatype/RunPlanCurrentStruct;->run_plan_calorie:I

    .line 71
    return-void
.end method

.method public setRun_plan_distance(I)V
    .locals 0

    .line 78
    iput p1, p0, Lcom/huawei/datatype/RunPlanCurrentStruct;->run_plan_distance:I

    .line 79
    return-void
.end method

.method public setRun_plan_hr(I)V
    .locals 0

    .line 54
    iput p1, p0, Lcom/huawei/datatype/RunPlanCurrentStruct;->run_plan_hr:I

    .line 55
    return-void
.end method

.method public setRun_plan_id(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/datatype/RunPlanCurrentStruct;->run_plan_id:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public setRun_plan_speed(I)V
    .locals 0

    .line 46
    iput p1, p0, Lcom/huawei/datatype/RunPlanCurrentStruct;->run_plan_speed:I

    .line 47
    return-void
.end method

.method public setRun_plan_time(I)V
    .locals 0

    .line 62
    iput p1, p0, Lcom/huawei/datatype/RunPlanCurrentStruct;->run_plan_time:I

    .line 63
    return-void
.end method
