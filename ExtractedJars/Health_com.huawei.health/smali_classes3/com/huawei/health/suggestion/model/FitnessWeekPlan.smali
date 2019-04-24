.class public Lcom/huawei/health/suggestion/model/FitnessWeekPlan;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dayPlanList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessDayPlan;>;"
        }
    .end annotation
.end field

.field private weekDesc:Ljava/lang/String;

.field private weekOrder:I

.field private weekPeriod:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireWeekDesc()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->weekDesc:Ljava/lang/String;

    return-object v0
.end method

.method public acquireWeekList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessDayPlan;>;"
        }
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->dayPlanList:Ljava/util/List;

    return-object v0
.end method

.method public acquireWeekOrder()I
    .locals 1

    .line 17
    iget v0, p0, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->weekOrder:I

    return v0
.end method

.method public acquireWeekPeriod()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->weekPeriod:Ljava/lang/String;

    return-object v0
.end method

.method public saveWeekDesc(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->weekDesc:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public saveWeekList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessDayPlan;>;)V"
        }
    .end annotation

    .line 45
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->dayPlanList:Ljava/util/List;

    .line 46
    return-void
.end method

.method public saveWeekOrder(I)V
    .locals 0

    .line 21
    iput p1, p0, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->weekOrder:I

    .line 22
    return-void
.end method

.method public saveWeekPeriod(Ljava/lang/String;)V
    .locals 0

    .line 29
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/FitnessWeekPlan;->weekPeriod:Ljava/lang/String;

    .line 30
    return-void
.end method
