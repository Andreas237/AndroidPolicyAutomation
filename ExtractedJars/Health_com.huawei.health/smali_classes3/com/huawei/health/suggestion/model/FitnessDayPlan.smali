.class public Lcom/huawei/health/suggestion/model/FitnessDayPlan;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private date:J

.field private dayStatus:I

.field private description:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private recommendCourses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPlanCourse;>;"
        }
    .end annotation
.end field

.field private workoutPlanList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPlanCourse;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireDate()J
    .locals 2

    .line 37
    iget-wide v0, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->date:J

    return-wide v0
.end method

.method public acquireDayPlanCourses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPlanCourse;>;"
        }
    .end annotation

    .line 55
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->workoutPlanList:Ljava/util/List;

    return-object v0
.end method

.method public acquireDayStatus()I
    .locals 1

    .line 63
    iget v0, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->dayStatus:I

    return v0
.end method

.method public acquireDescription()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->description:Ljava/lang/String;

    return-object v0
.end method

.method public acquireName()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->name:Ljava/lang/String;

    return-object v0
.end method

.method public acquireRecommendCourses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPlanCourse;>;"
        }
    .end annotation

    .line 45
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->recommendCourses:Ljava/util/List;

    return-object v0
.end method

.method public clone()Ljava/lang/Object;
    .locals 5

    .line 73
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/suggestion/model/FitnessDayPlan;

    .line 74
    iget v0, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->dayStatus:I

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->saveDayStatus(I)V

    .line 75
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->name:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->saveName(Ljava/lang/String;)V

    .line 76
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->description:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->saveDescription(Ljava/lang/String;)V

    .line 77
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 78
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 80
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->workoutPlanList:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 81
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->workoutPlanList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->workoutPlanList:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual {v1, v2}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->saveDayPlanCourses(Ljava/util/List;)V

    .line 88
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->recommendCourses:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 89
    const/4 v4, 0x0

    :goto_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->recommendCourses:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 90
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->recommendCourses:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/suggestion/model/FitnessPlanCourse;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 93
    :cond_2
    invoke-virtual {v1, v3}, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->saveRecommendCourses(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    :cond_3
    return-object v1

    .line 99
    :catch_0
    move-exception v1

    .line 100
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public final saveDayPlanCourses(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPlanCourse;>;)V"
        }
    .end annotation

    .line 59
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->workoutPlanList:Ljava/util/List;

    .line 60
    return-void
.end method

.method public final saveDayStatus(I)V
    .locals 0

    .line 67
    iput p1, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->dayStatus:I

    .line 68
    return-void
.end method

.method public final saveDescription(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->description:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public final saveName(Ljava/lang/String;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->name:Ljava/lang/String;

    .line 26
    return-void
.end method

.method public final saveRecommendCourses(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPlanCourse;>;)V"
        }
    .end annotation

    .line 49
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->recommendCourses:Ljava/util/List;

    .line 50
    return-void
.end method

.method public saveStartTime(J)V
    .locals 0

    .line 41
    iput-wide p1, p0, Lcom/huawei/health/suggestion/model/FitnessDayPlan;->date:J

    .line 42
    return-void
.end method
