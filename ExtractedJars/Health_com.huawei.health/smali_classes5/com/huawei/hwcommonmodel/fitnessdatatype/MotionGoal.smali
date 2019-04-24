.class public Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final HW_FITNESS_CALORIE_GOAL:I = 0x2

.field public static final HW_FITNESS_DISTANCE_GOAL:I = 0x4

.field public static final HW_FITNESS_DURATION_GOAL:I = 0x8

.field public static final HW_FITNESS_GOAL_DAY:I = 0x1

.field public static final HW_FITNESS_GOAL_SINGLE:I = 0x3

.field public static final HW_FITNESS_GOAL_WEEK:I = 0x2

.field public static final HW_FITNESS_STEPS_GOAL:I = 0x1


# instance fields
.field private calorieGoal:I

.field private dataType:I

.field private distanceGoal:I

.field private dutationGoal:I

.field private goalType:I

.field private motionType:I

.field private stepGoal:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->goalType:I

    .line 60
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->motionType:I

    .line 61
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->dataType:I

    .line 62
    const/16 v0, 0x2710

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->stepGoal:I

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->calorieGoal:I

    .line 64
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->distanceGoal:I

    .line 65
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->dutationGoal:I

    .line 66
    return-void
.end method


# virtual methods
.method public getCalorieGoal()I
    .locals 1

    .line 128
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->calorieGoal:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getCurrValue()I
    .locals 2

    .line 171
    const/4 v1, -0x1

    .line 172
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->dataType:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 174
    :pswitch_0
    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->stepGoal:I

    .line 175
    goto :goto_1

    .line 177
    :pswitch_1
    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->calorieGoal:I

    .line 178
    goto :goto_1

    .line 180
    :pswitch_2
    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->distanceGoal:I

    .line 181
    goto :goto_1

    .line 183
    :pswitch_3
    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->dutationGoal:I

    .line 184
    goto :goto_1

    .line 186
    :goto_0
    :pswitch_4
    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->stepGoal:I

    .line 189
    :goto_1
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public getDataType()I
    .locals 1

    .line 107
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->dataType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDistanceGoal()I
    .locals 1

    .line 142
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->distanceGoal:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getDutationGoal()I
    .locals 1

    .line 156
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->dutationGoal:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getGoalType()I
    .locals 1

    .line 72
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->goalType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getMotionType()I
    .locals 1

    .line 86
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->motionType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getStepGoal()I
    .locals 1

    .line 114
    iget v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->stepGoal:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getValueByType(I)I
    .locals 2

    .line 197
    const/4 v1, -0x1

    .line 198
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 200
    :pswitch_0
    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->stepGoal:I

    .line 201
    goto :goto_1

    .line 203
    :pswitch_1
    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->calorieGoal:I

    .line 204
    goto :goto_1

    .line 206
    :pswitch_2
    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->distanceGoal:I

    .line 207
    goto :goto_1

    .line 209
    :pswitch_3
    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->dutationGoal:I

    .line 210
    goto :goto_1

    .line 212
    :goto_0
    :pswitch_4
    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->stepGoal:I

    .line 215
    :goto_1
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public setCalorieGoal(I)V
    .locals 1

    .line 135
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->calorieGoal:I

    .line 136
    return-void
.end method

.method public setDataType(I)V
    .locals 1

    .line 100
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->dataType:I

    .line 101
    return-void
.end method

.method public setDistanceGoal(I)V
    .locals 1

    .line 149
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->distanceGoal:I

    .line 150
    return-void
.end method

.method public setDutationGoal(I)V
    .locals 1

    .line 163
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->dutationGoal:I

    .line 164
    return-void
.end method

.method public setGoalType(I)V
    .locals 1

    .line 79
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->goalType:I

    .line 80
    return-void
.end method

.method public setMotionType(I)V
    .locals 1

    .line 93
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->motionType:I

    .line 94
    return-void
.end method

.method public setStepGoal(I)V
    .locals 1

    .line 121
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->stepGoal:I

    .line 122
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 220
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MotionGoal{goalType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->goalType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", motionType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->motionType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->dataType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stepGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->stepGoal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", calorieGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->calorieGoal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", distanceGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->distanceGoal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dutationGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->dutationGoal:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
