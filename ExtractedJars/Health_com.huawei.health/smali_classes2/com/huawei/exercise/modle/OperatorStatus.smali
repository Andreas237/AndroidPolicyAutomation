.class public Lcom/huawei/exercise/modle/OperatorStatus;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private operation_time:J

.field private operator_type:I

.field private run_plan_date:J

.field private sport_exist:I

.field private sport_startTime:J

.field private sport_type:I

.field private train_monitor_state:I

.field private workout_type:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/exercise/modle/OperatorStatus;->sport_exist:I

    return-void
.end method


# virtual methods
.method public getOperation_time()J
    .locals 2

    .line 116
    iget-wide v0, p0, Lcom/huawei/exercise/modle/OperatorStatus;->operation_time:J

    return-wide v0
.end method

.method public getOperator_type()I
    .locals 1

    .line 96
    iget v0, p0, Lcom/huawei/exercise/modle/OperatorStatus;->operator_type:I

    return v0
.end method

.method public getRun_plan_date()J
    .locals 2

    .line 88
    iget-wide v0, p0, Lcom/huawei/exercise/modle/OperatorStatus;->run_plan_date:J

    return-wide v0
.end method

.method public getSport_exist()I
    .locals 1

    .line 56
    iget v0, p0, Lcom/huawei/exercise/modle/OperatorStatus;->sport_exist:I

    return v0
.end method

.method public getSport_startTime()J
    .locals 2

    .line 72
    iget-wide v0, p0, Lcom/huawei/exercise/modle/OperatorStatus;->sport_startTime:J

    return-wide v0
.end method

.method public getSport_type()I
    .locals 1

    .line 64
    iget v0, p0, Lcom/huawei/exercise/modle/OperatorStatus;->sport_type:I

    return v0
.end method

.method public getTrain_monitor_state()I
    .locals 1

    .line 108
    iget v0, p0, Lcom/huawei/exercise/modle/OperatorStatus;->train_monitor_state:I

    return v0
.end method

.method public getWorkout_type()I
    .locals 1

    .line 80
    iget v0, p0, Lcom/huawei/exercise/modle/OperatorStatus;->workout_type:I

    return v0
.end method

.method public setOperation_time(J)V
    .locals 0

    .line 112
    iput-wide p1, p0, Lcom/huawei/exercise/modle/OperatorStatus;->operation_time:J

    .line 113
    return-void
.end method

.method public setOperator_type(I)V
    .locals 0

    .line 100
    iput p1, p0, Lcom/huawei/exercise/modle/OperatorStatus;->operator_type:I

    .line 101
    return-void
.end method

.method public setRun_plan_date(J)V
    .locals 0

    .line 92
    iput-wide p1, p0, Lcom/huawei/exercise/modle/OperatorStatus;->run_plan_date:J

    .line 93
    return-void
.end method

.method public setSport_exist(I)V
    .locals 0

    .line 60
    iput p1, p0, Lcom/huawei/exercise/modle/OperatorStatus;->sport_exist:I

    .line 61
    return-void
.end method

.method public setSport_startTime(J)V
    .locals 0

    .line 76
    iput-wide p1, p0, Lcom/huawei/exercise/modle/OperatorStatus;->sport_startTime:J

    .line 77
    return-void
.end method

.method public setSport_type(I)V
    .locals 0

    .line 68
    iput p1, p0, Lcom/huawei/exercise/modle/OperatorStatus;->sport_type:I

    .line 69
    return-void
.end method

.method public setTrain_monitor_state(I)V
    .locals 0

    .line 104
    iput p1, p0, Lcom/huawei/exercise/modle/OperatorStatus;->train_monitor_state:I

    .line 105
    return-void
.end method

.method public setWorkout_type(I)V
    .locals 0

    .line 84
    iput p1, p0, Lcom/huawei/exercise/modle/OperatorStatus;->workout_type:I

    .line 85
    return-void
.end method
