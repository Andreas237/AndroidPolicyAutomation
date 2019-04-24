.class public Lcom/huawei/health/suggestion/model/RunPlanParams;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private mCoachParamsMapings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/CoachParamsMaping;>;"
        }
    .end annotation
.end field

.field private mCoachVars:Lfi/firstbeat/coach/CoachVars;

.field private mEventDate:Ljava/util/Calendar;

.field private mExcludedDates:Ljava/util/TreeSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/TreeSet<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private mGoal:I

.field private mMaxMet:I

.field private mPlanDays:I

.field private mWeeklyTrainingDays:I

.field private nowDate:Ljava/util/Calendar;

.field private startDate:Ljava/util/Calendar;

.field private userChosenTime:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public acquireCoachVars()Lfi/firstbeat/coach/CoachVars;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mCoachVars:Lfi/firstbeat/coach/CoachVars;

    return-object v0
.end method

.method public acquireEventDate()Ljava/util/Calendar;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mEventDate:Ljava/util/Calendar;

    return-object v0
.end method

.method public getCoachParamsMapings()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/CoachParamsMaping;>;"
        }
    .end annotation

    .line 123
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mCoachParamsMapings:Ljava/util/List;

    return-object v0
.end method

.method public getExcludedDates()Ljava/util/TreeSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/TreeSet<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 107
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mExcludedDates:Ljava/util/TreeSet;

    return-object v0
.end method

.method public getGoal()I
    .locals 1

    .line 59
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mGoal:I

    return v0
.end method

.method public getMaxMet()I
    .locals 1

    .line 83
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mMaxMet:I

    return v0
.end method

.method public getNowDate()Ljava/util/Calendar;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->nowDate:Ljava/util/Calendar;

    return-object v0
.end method

.method public getPlanDays()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mPlanDays:I

    return v0
.end method

.method public getStartDate()Ljava/util/Calendar;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->startDate:Ljava/util/Calendar;

    return-object v0
.end method

.method public getUserChosenTime()I
    .locals 1

    .line 91
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->userChosenTime:I

    return v0
.end method

.method public getWeeklyTrainingDays()I
    .locals 1

    .line 99
    iget v0, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mWeeklyTrainingDays:I

    return v0
.end method

.method public init1()V
    .locals 0

    .line 131
    return-void
.end method

.method public init10()V
    .locals 0

    .line 140
    return-void
.end method

.method public init11()V
    .locals 0

    .line 141
    return-void
.end method

.method public init12()V
    .locals 0

    .line 142
    return-void
.end method

.method public init13()V
    .locals 0

    .line 143
    return-void
.end method

.method public init14()V
    .locals 0

    .line 144
    return-void
.end method

.method public init2()V
    .locals 0

    .line 132
    return-void
.end method

.method public init3()V
    .locals 0

    .line 133
    return-void
.end method

.method public init4()V
    .locals 0

    .line 134
    return-void
.end method

.method public init5()V
    .locals 0

    .line 135
    return-void
.end method

.method public init6()V
    .locals 0

    .line 136
    return-void
.end method

.method public init7()V
    .locals 0

    .line 137
    return-void
.end method

.method public init8()V
    .locals 0

    .line 138
    return-void
.end method

.method public init9()V
    .locals 0

    .line 139
    return-void
.end method

.method public setCoachParamsMapings(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/CoachParamsMaping;>;)V"
        }
    .end annotation

    .line 127
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mCoachParamsMapings:Ljava/util/List;

    .line 128
    return-void
.end method

.method public setCoachVars(Lfi/firstbeat/coach/CoachVars;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mCoachVars:Lfi/firstbeat/coach/CoachVars;

    .line 120
    return-void
.end method

.method public setEventDate(Ljava/util/Calendar;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mEventDate:Ljava/util/Calendar;

    .line 80
    return-void
.end method

.method public setExcludedDates(Ljava/util/TreeSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/TreeSet<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 111
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mExcludedDates:Ljava/util/TreeSet;

    .line 112
    return-void
.end method

.method public setGoal(I)V
    .locals 0

    .line 63
    iput p1, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mGoal:I

    .line 64
    return-void
.end method

.method public setMaxMet(I)V
    .locals 0

    .line 87
    iput p1, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mMaxMet:I

    .line 88
    return-void
.end method

.method public setNowDate(Ljava/util/Calendar;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->nowDate:Ljava/util/Calendar;

    .line 56
    return-void
.end method

.method public setPlanDays(I)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mPlanDays:I

    .line 72
    return-void
.end method

.method public setStartDate(Ljava/util/Calendar;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->startDate:Ljava/util/Calendar;

    .line 48
    return-void
.end method

.method public setUserChosenTime(I)V
    .locals 0

    .line 95
    iput p1, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->userChosenTime:I

    .line 96
    return-void
.end method

.method public setWeeklyTrainingDays(I)V
    .locals 0

    .line 103
    iput p1, p0, Lcom/huawei/health/suggestion/model/RunPlanParams;->mWeeklyTrainingDays:I

    .line 104
    return-void
.end method
