.class public Lfi/firstbeat/coach/modle/CoachParams;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private age:I

.field private daysOfPlan:I

.field private gender:I

.field private height:I

.field private startDate:Ljava/util/Calendar;

.field private trainingGoal:I

.field private weight:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAge()I
    .locals 1

    .line 20
    iget v0, p0, Lfi/firstbeat/coach/modle/CoachParams;->age:I

    return v0
.end method

.method public getDaysOfPlan()I
    .locals 1

    .line 68
    iget v0, p0, Lfi/firstbeat/coach/modle/CoachParams;->daysOfPlan:I

    return v0
.end method

.method public getGender()I
    .locals 1

    .line 44
    iget v0, p0, Lfi/firstbeat/coach/modle/CoachParams;->gender:I

    return v0
.end method

.method public getHeight()I
    .locals 1

    .line 28
    iget v0, p0, Lfi/firstbeat/coach/modle/CoachParams;->height:I

    return v0
.end method

.method public getStartDate()Ljava/util/Calendar;
    .locals 1

    .line 60
    iget-object v0, p0, Lfi/firstbeat/coach/modle/CoachParams;->startDate:Ljava/util/Calendar;

    return-object v0
.end method

.method public getTrainingGoal()I
    .locals 1

    .line 52
    iget v0, p0, Lfi/firstbeat/coach/modle/CoachParams;->trainingGoal:I

    return v0
.end method

.method public getWeight()I
    .locals 1

    .line 36
    iget v0, p0, Lfi/firstbeat/coach/modle/CoachParams;->weight:I

    return v0
.end method

.method public setAge(I)V
    .locals 0

    .line 24
    iput p1, p0, Lfi/firstbeat/coach/modle/CoachParams;->age:I

    .line 25
    return-void
.end method

.method public setDaysOfPlan(I)V
    .locals 0

    .line 72
    iput p1, p0, Lfi/firstbeat/coach/modle/CoachParams;->daysOfPlan:I

    .line 73
    return-void
.end method

.method public setGender(I)V
    .locals 0

    .line 48
    iput p1, p0, Lfi/firstbeat/coach/modle/CoachParams;->gender:I

    .line 49
    return-void
.end method

.method public setHeight(I)V
    .locals 0

    .line 32
    iput p1, p0, Lfi/firstbeat/coach/modle/CoachParams;->height:I

    .line 33
    return-void
.end method

.method public setStartDate(Ljava/util/Calendar;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lfi/firstbeat/coach/modle/CoachParams;->startDate:Ljava/util/Calendar;

    .line 65
    return-void
.end method

.method public setTrainingGoal(I)V
    .locals 0

    .line 56
    iput p1, p0, Lfi/firstbeat/coach/modle/CoachParams;->trainingGoal:I

    .line 57
    return-void
.end method

.method public setWeight(I)V
    .locals 0

    .line 40
    iput p1, p0, Lfi/firstbeat/coach/modle/CoachParams;->weight:I

    .line 41
    return-void
.end method
