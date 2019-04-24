.class public Lcom/huawei/datatype/RunWorkoutPlanStruct;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field date:J

.field workoutName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDate()J
    .locals 2

    .line 22
    iget-wide v0, p0, Lcom/huawei/datatype/RunWorkoutPlanStruct;->date:J

    return-wide v0
.end method

.method public getWorkoutName()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/datatype/RunWorkoutPlanStruct;->workoutName:Ljava/lang/String;

    return-object v0
.end method

.method public setDate(J)V
    .locals 0

    .line 14
    iput-wide p1, p0, Lcom/huawei/datatype/RunWorkoutPlanStruct;->date:J

    .line 15
    return-void
.end method

.method public setWorkoutName(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/datatype/RunWorkoutPlanStruct;->workoutName:Ljava/lang/String;

    .line 31
    return-void
.end method
