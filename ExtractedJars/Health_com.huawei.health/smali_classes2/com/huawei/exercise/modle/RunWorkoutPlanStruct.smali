.class public Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mDate:J

.field private mRunWorkout:Lcom/huawei/health/suggestion/model/RunWorkout;

.field private mWorkoutName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDate()J
    .locals 2

    .line 12
    iget-wide v0, p0, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->mDate:J

    return-wide v0
.end method

.method public getRunWorkout()Lcom/huawei/health/suggestion/model/RunWorkout;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->mRunWorkout:Lcom/huawei/health/suggestion/model/RunWorkout;

    return-object v0
.end method

.method public getWorkoutName()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->mWorkoutName:Ljava/lang/String;

    return-object v0
.end method

.method public setDate(J)V
    .locals 0

    .line 16
    iput-wide p1, p0, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->mDate:J

    .line 17
    return-void
.end method

.method public setRunWorkout(Lcom/huawei/health/suggestion/model/RunWorkout;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->mRunWorkout:Lcom/huawei/health/suggestion/model/RunWorkout;

    .line 25
    return-void
.end method

.method public setWorkoutName(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/exercise/modle/RunWorkoutPlanStruct;->mWorkoutName:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public uadpRunWorkoutPlanStruct1()V
    .locals 0

    .line 37
    return-void
.end method

.method public uadpRunWorkoutPlanStruct2()V
    .locals 0

    .line 42
    return-void
.end method

.method public uadpRunWorkoutPlanStruct3()V
    .locals 0

    .line 47
    return-void
.end method

.method public uadpRunWorkoutPlanStruct4adefinuv()V
    .locals 0

    .line 52
    return-void
.end method
