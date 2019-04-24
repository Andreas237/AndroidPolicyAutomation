.class public Lcom/huawei/health/suggestion/model/PlanWorkout;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Cloneable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private dayInfo:Lcom/huawei/health/suggestion/model/DayInfo;

.field private description:Ljava/lang/String;

.field private extendParams:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private version:Ljava/lang/String;

.field private weekInfo:Lcom/huawei/health/suggestion/model/WeekInfo;

.field private workoutId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 2

    .line 106
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/suggestion/model/PlanWorkout;

    .line 108
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->dayInfo:Lcom/huawei/health/suggestion/model/DayInfo;

    if-eqz v0, :cond_0

    .line 109
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->dayInfo:Lcom/huawei/health/suggestion/model/DayInfo;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/DayInfo;

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putDayInfo(Lcom/huawei/health/suggestion/model/DayInfo;)V

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->weekInfo:Lcom/huawei/health/suggestion/model/WeekInfo;

    if-eqz v0, :cond_1

    .line 113
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->weekInfo:Lcom/huawei/health/suggestion/model/WeekInfo;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/WeekInfo;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/WeekInfo;

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putWeekInfo(Lcom/huawei/health/suggestion/model/WeekInfo;)V
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    :cond_1
    return-object v1

    .line 117
    :catch_0
    move-exception v1

    .line 118
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public copy()Lcom/huawei/health/suggestion/model/PlanWorkout;
    .locals 2

    .line 93
    new-instance v1, Lcom/huawei/health/suggestion/model/PlanWorkout;

    invoke-direct {v1}, Lcom/huawei/health/suggestion/model/PlanWorkout;-><init>()V

    .line 94
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->description:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putDescription(Ljava/lang/String;)V

    .line 95
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->name:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putName(Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->version:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putVersion(Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->workoutId:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putWorkoutId(Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->dayInfo:Lcom/huawei/health/suggestion/model/DayInfo;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/DayInfo;->copy()Lcom/huawei/health/suggestion/model/DayInfo;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putDayInfo(Lcom/huawei/health/suggestion/model/DayInfo;)V

    .line 99
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->weekInfo:Lcom/huawei/health/suggestion/model/WeekInfo;

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/PlanWorkout;->putWeekInfo(Lcom/huawei/health/suggestion/model/WeekInfo;)V

    .line 100
    return-object v1
.end method

.method public popDayInfo()Lcom/huawei/health/suggestion/model/DayInfo;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->dayInfo:Lcom/huawei/health/suggestion/model/DayInfo;

    return-object v0
.end method

.method public popDescription()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->description:Ljava/lang/String;

    return-object v0
.end method

.method public popExtendParams()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->extendParams:Ljava/lang/String;

    return-object v0
.end method

.method public popName()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->name:Ljava/lang/String;

    return-object v0
.end method

.method public popVersion()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->version:Ljava/lang/String;

    return-object v0
.end method

.method public popWeekInfo()Lcom/huawei/health/suggestion/model/WeekInfo;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->weekInfo:Lcom/huawei/health/suggestion/model/WeekInfo;

    return-object v0
.end method

.method public popWorkoutId()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->workoutId:Ljava/lang/String;

    return-object v0
.end method

.method public final putDayInfo(Lcom/huawei/health/suggestion/model/DayInfo;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->dayInfo:Lcom/huawei/health/suggestion/model/DayInfo;

    .line 69
    return-void
.end method

.method public putDescription(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->description:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public putExtendParams(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->extendParams:Ljava/lang/String;

    .line 77
    return-void
.end method

.method public putName(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->name:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public putVersion(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->version:Ljava/lang/String;

    .line 85
    return-void
.end method

.method public final putWeekInfo(Lcom/huawei/health/suggestion/model/WeekInfo;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->weekInfo:Lcom/huawei/health/suggestion/model/WeekInfo;

    .line 61
    return-void
.end method

.method public putWorkoutId(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/PlanWorkout;->workoutId:Ljava/lang/String;

    .line 53
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 89
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
