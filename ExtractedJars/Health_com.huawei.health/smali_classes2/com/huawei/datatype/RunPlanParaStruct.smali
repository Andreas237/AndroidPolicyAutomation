.class public Lcom/huawei/datatype/RunPlanParaStruct;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private run_plan_altitude:I

.field private run_plan_distance:I

.field private run_plan_speed:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getRun_plan_altitude()I
    .locals 1

    .line 37
    iget v0, p0, Lcom/huawei/datatype/RunPlanParaStruct;->run_plan_altitude:I

    return v0
.end method

.method public getRun_plan_distance()I
    .locals 1

    .line 29
    iget v0, p0, Lcom/huawei/datatype/RunPlanParaStruct;->run_plan_distance:I

    return v0
.end method

.method public getRun_plan_speed()I
    .locals 1

    .line 21
    iget v0, p0, Lcom/huawei/datatype/RunPlanParaStruct;->run_plan_speed:I

    return v0
.end method

.method public setRun_plan_altitude(I)V
    .locals 0

    .line 41
    iput p1, p0, Lcom/huawei/datatype/RunPlanParaStruct;->run_plan_altitude:I

    .line 42
    return-void
.end method

.method public setRun_plan_distance(I)V
    .locals 0

    .line 33
    iput p1, p0, Lcom/huawei/datatype/RunPlanParaStruct;->run_plan_distance:I

    .line 34
    return-void
.end method

.method public setRun_plan_speed(I)V
    .locals 0

    .line 25
    iput p1, p0, Lcom/huawei/datatype/RunPlanParaStruct;->run_plan_speed:I

    .line 26
    return-void
.end method
